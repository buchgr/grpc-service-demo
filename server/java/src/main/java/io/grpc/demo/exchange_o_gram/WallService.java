package io.grpc.demo.exchange_o_gram;

import static io.grpc.demo.exchange_o_gram.Utils.DATABASE_ID;
import static io.grpc.demo.exchange_o_gram.Utils.INSTANCE_ID;
import static io.grpc.demo.exchange_o_gram.Utils.newId;
import static java.util.Collections.singletonList;

import com.google.cloud.spanner.DatabaseClient;
import com.google.cloud.spanner.DatabaseId;
import com.google.cloud.spanner.Mutation;
import com.google.cloud.spanner.ResultSet;
import com.google.cloud.spanner.Spanner;
import com.google.cloud.spanner.SpannerOptions;
import com.google.cloud.spanner.Statement;
import io.grpc.demo.exchange_o_gram.ExchangeOGramProto.GetWallPostsRequest;
import io.grpc.demo.exchange_o_gram.ExchangeOGramProto.GetWallPostsResponse;
import io.grpc.demo.exchange_o_gram.ExchangeOGramProto.MediaId;
import io.grpc.demo.exchange_o_gram.ExchangeOGramProto.PostToWallRequest;
import io.grpc.demo.exchange_o_gram.ExchangeOGramProto.PostToWallResponse;
import io.grpc.demo.exchange_o_gram.ExchangeOGramProto.WallPost;
import io.grpc.demo.exchange_o_gram.ExchangeOGramProto.WallPostId;
import io.grpc.demo.exchange_o_gram.WallServiceGrpc.WallServiceImplBase;
import io.grpc.stub.StreamObserver;
import java.time.Instant;
import java.util.function.Consumer;

public class WallService extends WallServiceImplBase {

  private final Spanner spanner;
  private final DatabaseId databaseId;

  public WallService() {
    SpannerOptions options = SpannerOptions.newBuilder().build();
    this.spanner = options.getService();
    this.databaseId = DatabaseId.of(options.getProjectId(), INSTANCE_ID, DATABASE_ID);
  }

  @Override
  public void postToWall(PostToWallRequest request,
      StreamObserver<PostToWallResponse> responseObserver) {
    WallPost post = request.getPost();

    long postId = storeInSpanner(post);

    // Respond to the gRPC client with the wall post identifier.
    WallPostId wallPostId = WallPostId.newBuilder().setValue(postId).build();
    PostToWallResponse response = PostToWallResponse.newBuilder().setId(wallPostId).build();
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getWallPosts(GetWallPostsRequest request,
      StreamObserver<GetWallPostsResponse> responseObserver) {

    String username = request.getUsername();

    loadFromSpanner(username, (WallPost wallPost) -> {
      GetWallPostsResponse response = GetWallPostsResponse.newBuilder().setPost(wallPost).build();
      // Stream each result immediately to the gRPC client as it is fetched from Spanner.
      responseObserver.onNext(response);
    });

    responseObserver.onCompleted();
  }

  private void loadFromSpanner(String username, Consumer<WallPost> wallPostConsumer) {
    DatabaseClient dbClient = spanner.getDatabaseClient(databaseId);

    // Fetch all posts made by username from Spanner.
    Statement stmt = Statement.newBuilder(
            "SELECT id, username, caption, media_id, timestamp_created "
                    + "FROM wall_post "
                    + "WHERE username = @username "
                    + "ORDER BY timestamp_created DESC")
            .bind("username").to(username)
            .build();

    try(ResultSet resultSet = dbClient.singleUse().executeQuery(stmt)) {
      while (resultSet.next()) {
        WallPost.Builder postBuilder = WallPost.newBuilder();
        long id = resultSet.getLong("id");
        String caption = resultSet.getString("caption");
        long timestamp = resultSet.getLong("timestamp_created");

        postBuilder.setId(WallPostId.newBuilder().setValue(id).build());
        postBuilder.setUsername(username);
        postBuilder.setCaption(caption);
        postBuilder.setTimestampCreated(timestamp);

        // The media is optional.
        if (!resultSet.isNull("media_id")) {
          MediaId mediaId = MediaId.newBuilder().setValue(resultSet.getLong("media_id")).build();
          postBuilder.setMediaId(mediaId);
        }

        WallPost wallPost = postBuilder.build();
        wallPostConsumer.accept(wallPost);
      }
    }
  }

  private long storeInSpanner(WallPost post) {
    long postId = newId();
    Mutation.WriteBuilder wallPostBuilder = Mutation
            .newInsertBuilder("wall_post")
            .set("id")
            .to(postId)
            .set("username")
            .to(post.getUsername())
            .set("caption")
            .to(post.getCaption())
            .set("timestamp_created")
            .to(Instant.now().getEpochSecond());

    // The image is optional.
    if (post.hasMediaId()) {
      wallPostBuilder.set("media_id").to(post.getMediaId().getValue());
    }

    Mutation wallPost = wallPostBuilder.build();

    DatabaseClient dbClient = spanner.getDatabaseClient(databaseId);
    dbClient.write(singletonList(wallPost));
    return postId;
  }
}

