// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

public interface FindingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta1.Finding)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The specific string that may be potentially sensitive info.
   * </pre>
   *
   * <code>string quote = 1;</code>
   */
  java.lang.String getQuote();
  /**
   * <pre>
   * The specific string that may be potentially sensitive info.
   * </pre>
   *
   * <code>string quote = 1;</code>
   */
  com.google.protobuf.ByteString
      getQuoteBytes();

  /**
   * <pre>
   * The specific type of info the string might be.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.InfoType info_type = 2;</code>
   */
  boolean hasInfoType();
  /**
   * <pre>
   * The specific type of info the string might be.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.InfoType info_type = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.InfoType getInfoType();
  /**
   * <pre>
   * The specific type of info the string might be.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.InfoType info_type = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.InfoTypeOrBuilder getInfoTypeOrBuilder();

  /**
   * <pre>
   * Estimate of how likely it is that the info_type is correct.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.Likelihood likelihood = 3;</code>
   */
  int getLikelihoodValue();
  /**
   * <pre>
   * Estimate of how likely it is that the info_type is correct.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.Likelihood likelihood = 3;</code>
   */
  com.google.privacy.dlp.v2beta1.Likelihood getLikelihood();

  /**
   * <pre>
   * Location of the info found.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.Location location = 4;</code>
   */
  boolean hasLocation();
  /**
   * <pre>
   * Location of the info found.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.Location location = 4;</code>
   */
  com.google.privacy.dlp.v2beta1.Location getLocation();
  /**
   * <pre>
   * Location of the info found.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.Location location = 4;</code>
   */
  com.google.privacy.dlp.v2beta1.LocationOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * Timestamp when finding was detected.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Timestamp when finding was detected.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Timestamp when finding was detected.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();
}
