// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/readgroup.proto

package com.google.genomics.v1;

public final class ReadGroupProto {
  private ReadGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_ReadGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_ReadGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_ReadGroup_Experiment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_ReadGroup_Experiment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_ReadGroup_Program_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_ReadGroup_Program_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_ReadGroup_InfoEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_ReadGroup_InfoEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"google/genomics/v1/readgroup.proto\022\022go" +
      "ogle.genomics.v1\032\034google/api/annotations" +
      ".proto\032\034google/protobuf/struct.proto\"\344\004\n" +
      "\tReadGroup\022\n\n\002id\030\001 \001(\t\022\022\n\ndataset_id\030\002 \001" +
      "(\t\022\014\n\004name\030\003 \001(\t\022\023\n\013description\030\004 \001(\t\022\021\n" +
      "\tsample_id\030\005 \001(\t\022<\n\nexperiment\030\006 \001(\0132(.g" +
      "oogle.genomics.v1.ReadGroup.Experiment\022\035" +
      "\n\025predicted_insert_size\030\007 \001(\005\0227\n\010program" +
      "s\030\n \003(\0132%.google.genomics.v1.ReadGroup.P" +
      "rogram\022\030\n\020reference_set_id\030\013 \001(\t\0225\n\004info",
      "\030\014 \003(\0132\'.google.genomics.v1.ReadGroup.In" +
      "foEntry\032l\n\nExperiment\022\022\n\nlibrary_id\030\001 \001(" +
      "\t\022\025\n\rplatform_unit\030\002 \001(\t\022\031\n\021sequencing_c" +
      "enter\030\003 \001(\t\022\030\n\020instrument_model\030\004 \001(\t\032c\n" +
      "\007Program\022\024\n\014command_line\030\001 \001(\t\022\n\n\002id\030\002 \001" +
      "(\t\022\014\n\004name\030\003 \001(\t\022\027\n\017prev_program_id\030\004 \001(" +
      "\t\022\017\n\007version\030\005 \001(\t\032G\n\tInfoEntry\022\013\n\003key\030\001" +
      " \001(\t\022)\n\005value\030\002 \001(\0132\032.google.protobuf.Li" +
      "stValue:\0028\001Bi\n\026com.google.genomics.v1B\016R" +
      "eadGroupProtoP\001Z:google.golang.org/genpr",
      "oto/googleapis/genomics/v1;genomics\370\001\001b\006" +
      "proto3"
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
        }, assigner);
    internal_static_google_genomics_v1_ReadGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_genomics_v1_ReadGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_ReadGroup_descriptor,
        new java.lang.String[] { "Id", "DatasetId", "Name", "Description", "SampleId", "Experiment", "PredictedInsertSize", "Programs", "ReferenceSetId", "Info", });
    internal_static_google_genomics_v1_ReadGroup_Experiment_descriptor =
      internal_static_google_genomics_v1_ReadGroup_descriptor.getNestedTypes().get(0);
    internal_static_google_genomics_v1_ReadGroup_Experiment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_ReadGroup_Experiment_descriptor,
        new java.lang.String[] { "LibraryId", "PlatformUnit", "SequencingCenter", "InstrumentModel", });
    internal_static_google_genomics_v1_ReadGroup_Program_descriptor =
      internal_static_google_genomics_v1_ReadGroup_descriptor.getNestedTypes().get(1);
    internal_static_google_genomics_v1_ReadGroup_Program_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_ReadGroup_Program_descriptor,
        new java.lang.String[] { "CommandLine", "Id", "Name", "PrevProgramId", "Version", });
    internal_static_google_genomics_v1_ReadGroup_InfoEntry_descriptor =
      internal_static_google_genomics_v1_ReadGroup_descriptor.getNestedTypes().get(2);
    internal_static_google_genomics_v1_ReadGroup_InfoEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_ReadGroup_InfoEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
