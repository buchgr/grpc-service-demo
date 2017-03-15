// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/table/v1/bigtable_table_service.proto

package com.google.bigtable.admin.table.v1;

public final class BigtableTableServicesProto {
  private BigtableTableServicesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/bigtable/admin/table/v1/bigtabl" +
      "e_table_service.proto\022\036google.bigtable.a" +
      "dmin.table.v1\032\034google/api/annotations.pr" +
      "oto\0328google/bigtable/admin/table/v1/bigt" +
      "able_table_data.proto\032Dgoogle/bigtable/a" +
      "dmin/table/v1/bigtable_table_service_mes" +
      "sages.proto\032\033google/protobuf/empty.proto" +
      "2\276\014\n\024BigtableTableService\022\244\001\n\013CreateTabl" +
      "e\0222.google.bigtable.admin.table.v1.Creat" +
      "eTableRequest\032%.google.bigtable.admin.ta",
      "ble.v1.Table\":\202\323\344\223\0024\"//v1/{name=projects" +
      "/*/zones/*/clusters/*}/tables:\001*\022\254\001\n\nLis" +
      "tTables\0221.google.bigtable.admin.table.v1" +
      ".ListTablesRequest\0322.google.bigtable.adm" +
      "in.table.v1.ListTablesResponse\"7\202\323\344\223\0021\022/" +
      "/v1/{name=projects/*/zones/*/clusters/*}" +
      "/tables\022\235\001\n\010GetTable\022/.google.bigtable.a" +
      "dmin.table.v1.GetTableRequest\032%.google.b" +
      "igtable.admin.table.v1.Table\"9\202\323\344\223\0023\0221/v" +
      "1/{name=projects/*/zones/*/clusters/*/ta",
      "bles/*}\022\224\001\n\013DeleteTable\0222.google.bigtabl" +
      "e.admin.table.v1.DeleteTableRequest\032\026.go" +
      "ogle.protobuf.Empty\"9\202\323\344\223\0023*1/v1/{name=p" +
      "rojects/*/zones/*/clusters/*/tables/*}\022\236" +
      "\001\n\013RenameTable\0222.google.bigtable.admin.t" +
      "able.v1.RenameTableRequest\032\026.google.prot" +
      "obuf.Empty\"C\202\323\344\223\002=\"8/v1/{name=projects/*" +
      "/zones/*/clusters/*/tables/*}:rename:\001*\022" +
      "\312\001\n\022CreateColumnFamily\0229.google.bigtable" +
      ".admin.table.v1.CreateColumnFamilyReques",
      "t\032,.google.bigtable.admin.table.v1.Colum" +
      "nFamily\"K\202\323\344\223\002E\"@/v1/{name=projects/*/zo" +
      "nes/*/clusters/*/tables/*}/columnFamilie" +
      "s:\001*\022\277\001\n\022UpdateColumnFamily\022,.google.big" +
      "table.admin.table.v1.ColumnFamily\032,.goog" +
      "le.bigtable.admin.table.v1.ColumnFamily\"" +
      "M\202\323\344\223\002G\032B/v1/{name=projects/*/zones/*/cl" +
      "usters/*/tables/*/columnFamilies/*}:\001*\022\263" +
      "\001\n\022DeleteColumnFamily\0229.google.bigtable." +
      "admin.table.v1.DeleteColumnFamilyRequest",
      "\032\026.google.protobuf.Empty\"J\202\323\344\223\002D*B/v1/{n" +
      "ame=projects/*/zones/*/clusters/*/tables" +
      "/*/columnFamilies/*}\022\262\001\n\016BulkDeleteRows\022" +
      "5.google.bigtable.admin.table.v1.BulkDel" +
      "eteRowsRequest\032\026.google.protobuf.Empty\"Q" +
      "\202\323\344\223\002K\"F/v1/{table_name=projects/*/zones" +
      "/*/clusters/*/tables/*}:bulkDeleteRows:\001" +
      "*B\207\001\n\"com.google.bigtable.admin.table.v1" +
      "B\032BigtableTableServicesProtoP\001ZCgoogle.g" +
      "olang.org/genproto/googleapis/bigtable/a",
      "dmin/table/v1;tableb\006proto3"
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
          com.google.bigtable.admin.table.v1.BigtableTableDataProto.getDescriptor(),
          com.google.bigtable.admin.table.v1.BigtableTableServiceMessagesProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.bigtable.admin.table.v1.BigtableTableDataProto.getDescriptor();
    com.google.bigtable.admin.table.v1.BigtableTableServiceMessagesProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
