// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

public interface MergeVariantsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.MergeVariantsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The destination variant set.
   * </pre>
   *
   * <code>string variant_set_id = 1;</code>
   */
  java.lang.String getVariantSetId();
  /**
   * <pre>
   * The destination variant set.
   * </pre>
   *
   * <code>string variant_set_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getVariantSetIdBytes();

  /**
   * <pre>
   * The variants to be merged with existing variants.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.Variant variants = 2;</code>
   */
  java.util.List<com.google.genomics.v1.Variant> 
      getVariantsList();
  /**
   * <pre>
   * The variants to be merged with existing variants.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.Variant variants = 2;</code>
   */
  com.google.genomics.v1.Variant getVariants(int index);
  /**
   * <pre>
   * The variants to be merged with existing variants.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.Variant variants = 2;</code>
   */
  int getVariantsCount();
  /**
   * <pre>
   * The variants to be merged with existing variants.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.Variant variants = 2;</code>
   */
  java.util.List<? extends com.google.genomics.v1.VariantOrBuilder> 
      getVariantsOrBuilderList();
  /**
   * <pre>
   * The variants to be merged with existing variants.
   * </pre>
   *
   * <code>repeated .google.genomics.v1.Variant variants = 2;</code>
   */
  com.google.genomics.v1.VariantOrBuilder getVariantsOrBuilder(
      int index);

  /**
   * <pre>
   * A mapping between info field keys and the InfoMergeOperations to
   * be performed on them.
   * </pre>
   *
   * <code>map&lt;string, .google.genomics.v1.InfoMergeOperation&gt; info_merge_config = 3;</code>
   */
  int getInfoMergeConfigCount();
  /**
   * <pre>
   * A mapping between info field keys and the InfoMergeOperations to
   * be performed on them.
   * </pre>
   *
   * <code>map&lt;string, .google.genomics.v1.InfoMergeOperation&gt; info_merge_config = 3;</code>
   */
  boolean containsInfoMergeConfig(
      java.lang.String key);
  /**
   * Use {@link #getInfoMergeConfigMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.genomics.v1.InfoMergeOperation>
  getInfoMergeConfig();
  /**
   * <pre>
   * A mapping between info field keys and the InfoMergeOperations to
   * be performed on them.
   * </pre>
   *
   * <code>map&lt;string, .google.genomics.v1.InfoMergeOperation&gt; info_merge_config = 3;</code>
   */
  java.util.Map<java.lang.String, com.google.genomics.v1.InfoMergeOperation>
  getInfoMergeConfigMap();
  /**
   * <pre>
   * A mapping between info field keys and the InfoMergeOperations to
   * be performed on them.
   * </pre>
   *
   * <code>map&lt;string, .google.genomics.v1.InfoMergeOperation&gt; info_merge_config = 3;</code>
   */
  com.google.genomics.v1.InfoMergeOperation getInfoMergeConfigOrDefault(
      java.lang.String key,
      com.google.genomics.v1.InfoMergeOperation defaultValue);
  /**
   * <pre>
   * A mapping between info field keys and the InfoMergeOperations to
   * be performed on them.
   * </pre>
   *
   * <code>map&lt;string, .google.genomics.v1.InfoMergeOperation&gt; info_merge_config = 3;</code>
   */
  com.google.genomics.v1.InfoMergeOperation getInfoMergeConfigOrThrow(
      java.lang.String key);
  /**
   * Use {@link #getInfoMergeConfigValueMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer>
  getInfoMergeConfigValue();
  /**
   * <pre>
   * A mapping between info field keys and the InfoMergeOperations to
   * be performed on them.
   * </pre>
   *
   * <code>map&lt;string, .google.genomics.v1.InfoMergeOperation&gt; info_merge_config = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer>
  getInfoMergeConfigValueMap();
  /**
   * <pre>
   * A mapping between info field keys and the InfoMergeOperations to
   * be performed on them.
   * </pre>
   *
   * <code>map&lt;string, .google.genomics.v1.InfoMergeOperation&gt; info_merge_config = 3;</code>
   */

  int getInfoMergeConfigValueOrDefault(
      java.lang.String key,
      int defaultValue);
  /**
   * <pre>
   * A mapping between info field keys and the InfoMergeOperations to
   * be performed on them.
   * </pre>
   *
   * <code>map&lt;string, .google.genomics.v1.InfoMergeOperation&gt; info_merge_config = 3;</code>
   */

  int getInfoMergeConfigValueOrThrow(
      java.lang.String key);
}
