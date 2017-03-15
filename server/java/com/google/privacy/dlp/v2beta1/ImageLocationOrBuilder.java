// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

public interface ImageLocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta1.ImageLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Top coordinate of the bounding box. (0,0) is upper left.
   * </pre>
   *
   * <code>int32 top = 1;</code>
   */
  int getTop();

  /**
   * <pre>
   * Left coordinate of the bounding box. (0,0) is upper left.
   * </pre>
   *
   * <code>int32 left = 2;</code>
   */
  int getLeft();

  /**
   * <pre>
   * Width of the bounding box in pixels.
   * </pre>
   *
   * <code>int32 width = 3;</code>
   */
  int getWidth();

  /**
   * <pre>
   * Height of the bounding box in pixels.
   * </pre>
   *
   * <code>int32 height = 4;</code>
   */
  int getHeight();
}
