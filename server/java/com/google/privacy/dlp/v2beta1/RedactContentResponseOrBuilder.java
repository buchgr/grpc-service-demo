// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

public interface RedactContentResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta1.RedactContentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The redacted content.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 1;</code>
   */
  java.util.List<com.google.privacy.dlp.v2beta1.ContentItem> 
      getItemsList();
  /**
   * <pre>
   * The redacted content.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 1;</code>
   */
  com.google.privacy.dlp.v2beta1.ContentItem getItems(int index);
  /**
   * <pre>
   * The redacted content.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 1;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * The redacted content.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 1;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2beta1.ContentItemOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * The redacted content.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2beta1.ContentItem items = 1;</code>
   */
  com.google.privacy.dlp.v2beta1.ContentItemOrBuilder getItemsOrBuilder(
      int index);
}
