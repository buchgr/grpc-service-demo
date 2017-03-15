// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/mutation.proto

package com.google.spanner.v1;

public final class MutationProto {
  private MutationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_Mutation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_Mutation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_Mutation_Write_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_Mutation_Write_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_Mutation_Delete_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_Mutation_Delete_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n google/spanner/v1/mutation.proto\022\021goog" +
      "le.spanner.v1\032\034google/api/annotations.pr" +
      "oto\032\034google/protobuf/struct.proto\032\034googl" +
      "e/spanner/v1/keys.proto\"\306\003\n\010Mutation\0223\n\006" +
      "insert\030\001 \001(\0132!.google.spanner.v1.Mutatio" +
      "n.WriteH\000\0223\n\006update\030\002 \001(\0132!.google.spann" +
      "er.v1.Mutation.WriteH\000\022=\n\020insert_or_upda" +
      "te\030\003 \001(\0132!.google.spanner.v1.Mutation.Wr" +
      "iteH\000\0224\n\007replace\030\004 \001(\0132!.google.spanner." +
      "v1.Mutation.WriteH\000\0224\n\006delete\030\005 \001(\0132\".go",
      "ogle.spanner.v1.Mutation.DeleteH\000\032S\n\005Wri" +
      "te\022\r\n\005table\030\001 \001(\t\022\017\n\007columns\030\002 \003(\t\022*\n\006va" +
      "lues\030\003 \003(\0132\032.google.protobuf.ListValue\032C" +
      "\n\006Delete\022\r\n\005table\030\001 \001(\t\022*\n\007key_set\030\002 \001(\013" +
      "2\031.google.spanner.v1.KeySetB\013\n\toperation" +
      "B|\n\025com.google.spanner.v1B\rMutationProto" +
      "P\001Z8google.golang.org/genproto/googleapi" +
      "s/spanner/v1;spanner\252\002\027Google.Cloud.Span" +
      "ner.V1b\006proto3"
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
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.spanner.v1.KeysProto.getDescriptor(),
        }, assigner);
    internal_static_google_spanner_v1_Mutation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_spanner_v1_Mutation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_Mutation_descriptor,
        new java.lang.String[] { "Insert", "Update", "InsertOrUpdate", "Replace", "Delete", "Operation", });
    internal_static_google_spanner_v1_Mutation_Write_descriptor =
      internal_static_google_spanner_v1_Mutation_descriptor.getNestedTypes().get(0);
    internal_static_google_spanner_v1_Mutation_Write_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_Mutation_Write_descriptor,
        new java.lang.String[] { "Table", "Columns", "Values", });
    internal_static_google_spanner_v1_Mutation_Delete_descriptor =
      internal_static_google_spanner_v1_Mutation_descriptor.getNestedTypes().get(1);
    internal_static_google_spanner_v1_Mutation_Delete_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_Mutation_Delete_descriptor,
        new java.lang.String[] { "Table", "KeySet", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.spanner.v1.KeysProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
