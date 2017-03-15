// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicecontrol/v1/distribution.proto

package com.google.api.servicecontrol.v1;

public interface DistributionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicecontrol.v1.Distribution)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The total number of samples in the distribution. Must be &gt;= 0.
   * </pre>
   *
   * <code>int64 count = 1;</code>
   */
  long getCount();

  /**
   * <pre>
   * The arithmetic mean of the samples in the distribution. If `count` is
   * zero then this field must be zero.
   * </pre>
   *
   * <code>double mean = 2;</code>
   */
  double getMean();

  /**
   * <pre>
   * The minimum of the population of values. Ignored if `count` is zero.
   * </pre>
   *
   * <code>double minimum = 3;</code>
   */
  double getMinimum();

  /**
   * <pre>
   * The maximum of the population of values. Ignored if `count` is zero.
   * </pre>
   *
   * <code>double maximum = 4;</code>
   */
  double getMaximum();

  /**
   * <pre>
   * The sum of squared deviations from the mean:
   *   Sum[i=1..count]((x_i - mean)^2)
   * where each x_i is a sample values. If `count` is zero then this field
   * must be zero, otherwise validation of the request fails.
   * </pre>
   *
   * <code>double sum_of_squared_deviation = 5;</code>
   */
  double getSumOfSquaredDeviation();

  /**
   * <pre>
   * The number of samples in each histogram bucket. `bucket_counts` are
   * optional. If present, they must sum to the `count` value.
   * The buckets are defined below in `bucket_option`. There are N buckets.
   * `bucket_counts[0]` is the number of samples in the underflow bucket.
   * `bucket_counts[1]` to `bucket_counts[N-1]` are the numbers of samples
   * in each of the finite buckets. And `bucket_counts[N] is the number
   * of samples in the overflow bucket. See the comments of `bucket_option`
   * below for more details.
   * Any suffix of trailing zeros may be omitted.
   * </pre>
   *
   * <code>repeated int64 bucket_counts = 6;</code>
   */
  java.util.List<java.lang.Long> getBucketCountsList();
  /**
   * <pre>
   * The number of samples in each histogram bucket. `bucket_counts` are
   * optional. If present, they must sum to the `count` value.
   * The buckets are defined below in `bucket_option`. There are N buckets.
   * `bucket_counts[0]` is the number of samples in the underflow bucket.
   * `bucket_counts[1]` to `bucket_counts[N-1]` are the numbers of samples
   * in each of the finite buckets. And `bucket_counts[N] is the number
   * of samples in the overflow bucket. See the comments of `bucket_option`
   * below for more details.
   * Any suffix of trailing zeros may be omitted.
   * </pre>
   *
   * <code>repeated int64 bucket_counts = 6;</code>
   */
  int getBucketCountsCount();
  /**
   * <pre>
   * The number of samples in each histogram bucket. `bucket_counts` are
   * optional. If present, they must sum to the `count` value.
   * The buckets are defined below in `bucket_option`. There are N buckets.
   * `bucket_counts[0]` is the number of samples in the underflow bucket.
   * `bucket_counts[1]` to `bucket_counts[N-1]` are the numbers of samples
   * in each of the finite buckets. And `bucket_counts[N] is the number
   * of samples in the overflow bucket. See the comments of `bucket_option`
   * below for more details.
   * Any suffix of trailing zeros may be omitted.
   * </pre>
   *
   * <code>repeated int64 bucket_counts = 6;</code>
   */
  long getBucketCounts(int index);

  /**
   * <pre>
   * Buckets with constant width.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.Distribution.LinearBuckets linear_buckets = 7;</code>
   */
  com.google.api.servicecontrol.v1.Distribution.LinearBuckets getLinearBuckets();
  /**
   * <pre>
   * Buckets with constant width.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.Distribution.LinearBuckets linear_buckets = 7;</code>
   */
  com.google.api.servicecontrol.v1.Distribution.LinearBucketsOrBuilder getLinearBucketsOrBuilder();

  /**
   * <pre>
   * Buckets with exponentially growing width.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.Distribution.ExponentialBuckets exponential_buckets = 8;</code>
   */
  com.google.api.servicecontrol.v1.Distribution.ExponentialBuckets getExponentialBuckets();
  /**
   * <pre>
   * Buckets with exponentially growing width.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.Distribution.ExponentialBuckets exponential_buckets = 8;</code>
   */
  com.google.api.servicecontrol.v1.Distribution.ExponentialBucketsOrBuilder getExponentialBucketsOrBuilder();

  /**
   * <pre>
   * Buckets with arbitrary user-provided width.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.Distribution.ExplicitBuckets explicit_buckets = 9;</code>
   */
  com.google.api.servicecontrol.v1.Distribution.ExplicitBuckets getExplicitBuckets();
  /**
   * <pre>
   * Buckets with arbitrary user-provided width.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.Distribution.ExplicitBuckets explicit_buckets = 9;</code>
   */
  com.google.api.servicecontrol.v1.Distribution.ExplicitBucketsOrBuilder getExplicitBucketsOrBuilder();

  public com.google.api.servicecontrol.v1.Distribution.BucketOptionCase getBucketOptionCase();
}
