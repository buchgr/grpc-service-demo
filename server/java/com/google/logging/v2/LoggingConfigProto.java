// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

public final class LoggingConfigProto {
  private LoggingConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_LogSink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_LogSink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_ListSinksRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListSinksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_ListSinksResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListSinksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_GetSinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_GetSinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_CreateSinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_CreateSinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_UpdateSinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_UpdateSinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_DeleteSinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_DeleteSinkRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/logging/v2/logging_config.proto" +
      "\022\021google.logging.v2\032\034google/api/annotati" +
      "ons.proto\032\033google/protobuf/empty.proto\032\037" +
      "google/protobuf/timestamp.proto\"\275\002\n\007LogS" +
      "ink\022\014\n\004name\030\001 \001(\t\022\023\n\013destination\030\003 \001(\t\022\016" +
      "\n\006filter\030\005 \001(\t\022G\n\025output_version_format\030" +
      "\006 \001(\0162(.google.logging.v2.LogSink.Versio" +
      "nFormat\022\027\n\017writer_identity\030\010 \001(\t\022.\n\nstar" +
      "t_time\030\n \001(\0132\032.google.protobuf.Timestamp" +
      "\022,\n\010end_time\030\013 \001(\0132\032.google.protobuf.Tim",
      "estamp\"?\n\rVersionFormat\022\036\n\032VERSION_FORMA" +
      "T_UNSPECIFIED\020\000\022\006\n\002V2\020\001\022\006\n\002V1\020\002\"I\n\020ListS" +
      "inksRequest\022\016\n\006parent\030\001 \001(\t\022\022\n\npage_toke" +
      "n\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\"W\n\021ListSinksR" +
      "esponse\022)\n\005sinks\030\001 \003(\0132\032.google.logging." +
      "v2.LogSink\022\027\n\017next_page_token\030\002 \001(\t\"#\n\016G" +
      "etSinkRequest\022\021\n\tsink_name\030\001 \001(\t\"m\n\021Crea" +
      "teSinkRequest\022\016\n\006parent\030\001 \001(\t\022(\n\004sink\030\002 " +
      "\001(\0132\032.google.logging.v2.LogSink\022\036\n\026uniqu" +
      "e_writer_identity\030\003 \001(\010\"p\n\021UpdateSinkReq",
      "uest\022\021\n\tsink_name\030\001 \001(\t\022(\n\004sink\030\002 \001(\0132\032." +
      "google.logging.v2.LogSink\022\036\n\026unique_writ" +
      "er_identity\030\003 \001(\010\"&\n\021DeleteSinkRequest\022\021" +
      "\n\tsink_name\030\001 \001(\t2\376\004\n\017ConfigServiceV2\022}\n" +
      "\tListSinks\022#.google.logging.v2.ListSinks" +
      "Request\032$.google.logging.v2.ListSinksRes" +
      "ponse\"%\202\323\344\223\002\037\022\035/v2/{parent=projects/*}/s" +
      "inks\022t\n\007GetSink\022!.google.logging.v2.GetS" +
      "inkRequest\032\032.google.logging.v2.LogSink\"*" +
      "\202\323\344\223\002$\022\"/v2/{sink_name=projects/*/sinks/",
      "*}\022{\n\nCreateSink\022$.google.logging.v2.Cre" +
      "ateSinkRequest\032\032.google.logging.v2.LogSi" +
      "nk\"+\202\323\344\223\002%\"\035/v2/{parent=projects/*}/sink" +
      "s:\004sink\022\200\001\n\nUpdateSink\022$.google.logging." +
      "v2.UpdateSinkRequest\032\032.google.logging.v2" +
      ".LogSink\"0\202\323\344\223\002*\032\"/v2/{sink_name=project" +
      "s/*/sinks/*}:\004sink\022v\n\nDeleteSink\022$.googl" +
      "e.logging.v2.DeleteSinkRequest\032\026.google." +
      "protobuf.Empty\"*\202\323\344\223\002$*\"/v2/{sink_name=p" +
      "rojects/*/sinks/*}B\201\001\n\025com.google.loggin",
      "g.v2B\022LoggingConfigProtoP\001Z8google.golan" +
      "g.org/genproto/googleapis/logging/v2;log" +
      "ging\252\002\027Google.Cloud.Logging.V2b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_logging_v2_LogSink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_logging_v2_LogSink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_LogSink_descriptor,
        new java.lang.String[] { "Name", "Destination", "Filter", "OutputVersionFormat", "WriterIdentity", "StartTime", "EndTime", });
    internal_static_google_logging_v2_ListSinksRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_logging_v2_ListSinksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_ListSinksRequest_descriptor,
        new java.lang.String[] { "Parent", "PageToken", "PageSize", });
    internal_static_google_logging_v2_ListSinksResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_logging_v2_ListSinksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_ListSinksResponse_descriptor,
        new java.lang.String[] { "Sinks", "NextPageToken", });
    internal_static_google_logging_v2_GetSinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_logging_v2_GetSinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_GetSinkRequest_descriptor,
        new java.lang.String[] { "SinkName", });
    internal_static_google_logging_v2_CreateSinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_logging_v2_CreateSinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_CreateSinkRequest_descriptor,
        new java.lang.String[] { "Parent", "Sink", "UniqueWriterIdentity", });
    internal_static_google_logging_v2_UpdateSinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_logging_v2_UpdateSinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_UpdateSinkRequest_descriptor,
        new java.lang.String[] { "SinkName", "Sink", "UniqueWriterIdentity", });
    internal_static_google_logging_v2_DeleteSinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_logging_v2_DeleteSinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_DeleteSinkRequest_descriptor,
        new java.lang.String[] { "SinkName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
