// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/readgroupset.proto

package com.google.genomics.v1;

public final class ReadGroupSetProto {
  private ReadGroupSetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_ReadGroupSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_ReadGroupSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_ReadGroupSet_InfoEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_ReadGroupSet_InfoEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%google/genomics/v1/readgroupset.proto\022" +
      "\022google.genomics.v1\032\034google/api/annotati" +
      "ons.proto\032\"google/genomics/v1/readgroup." +
      "proto\032\034google/protobuf/struct.proto\"\237\002\n\014" +
      "ReadGroupSet\022\n\n\002id\030\001 \001(\t\022\022\n\ndataset_id\030\002" +
      " \001(\t\022\030\n\020reference_set_id\030\003 \001(\t\022\014\n\004name\030\004" +
      " \001(\t\022\020\n\010filename\030\005 \001(\t\0222\n\013read_groups\030\006 " +
      "\003(\0132\035.google.genomics.v1.ReadGroup\0228\n\004in" +
      "fo\030\007 \003(\0132*.google.genomics.v1.ReadGroupS" +
      "et.InfoEntry\032G\n\tInfoEntry\022\013\n\003key\030\001 \001(\t\022)",
      "\n\005value\030\002 \001(\0132\032.google.protobuf.ListValu" +
      "e:\0028\001Bl\n\026com.google.genomics.v1B\021ReadGro" +
      "upSetProtoP\001Z:google.golang.org/genproto" +
      "/googleapis/genomics/v1;genomics\370\001\001b\006pro" +
      "to3"
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
          com.google.genomics.v1.ReadGroupProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        }, assigner);
    internal_static_google_genomics_v1_ReadGroupSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_genomics_v1_ReadGroupSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_ReadGroupSet_descriptor,
        new java.lang.String[] { "Id", "DatasetId", "ReferenceSetId", "Name", "Filename", "ReadGroups", "Info", });
    internal_static_google_genomics_v1_ReadGroupSet_InfoEntry_descriptor =
      internal_static_google_genomics_v1_ReadGroupSet_descriptor.getNestedTypes().get(0);
    internal_static_google_genomics_v1_ReadGroupSet_InfoEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_ReadGroupSet_InfoEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.genomics.v1.ReadGroupProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
