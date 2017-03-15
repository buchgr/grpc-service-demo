// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/ml/v1/job_service.proto

package com.google.cloud.ml.api.v1;

public interface HyperparameterOutputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.ml.v1.HyperparameterOutput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The trial id for these results.
   * </pre>
   *
   * <code>string trial_id = 1;</code>
   */
  java.lang.String getTrialId();
  /**
   * <pre>
   * The trial id for these results.
   * </pre>
   *
   * <code>string trial_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getTrialIdBytes();

  /**
   * <pre>
   * The hyperparameters given to this trial.
   * </pre>
   *
   * <code>map&lt;string, string&gt; hyperparameters = 2;</code>
   */
  int getHyperparametersCount();
  /**
   * <pre>
   * The hyperparameters given to this trial.
   * </pre>
   *
   * <code>map&lt;string, string&gt; hyperparameters = 2;</code>
   */
  boolean containsHyperparameters(
      java.lang.String key);
  /**
   * Use {@link #getHyperparametersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getHyperparameters();
  /**
   * <pre>
   * The hyperparameters given to this trial.
   * </pre>
   *
   * <code>map&lt;string, string&gt; hyperparameters = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getHyperparametersMap();
  /**
   * <pre>
   * The hyperparameters given to this trial.
   * </pre>
   *
   * <code>map&lt;string, string&gt; hyperparameters = 2;</code>
   */

  java.lang.String getHyperparametersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * The hyperparameters given to this trial.
   * </pre>
   *
   * <code>map&lt;string, string&gt; hyperparameters = 2;</code>
   */

  java.lang.String getHyperparametersOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The final objective metric seen for this trial.
   * </pre>
   *
   * <code>.google.cloud.ml.v1.HyperparameterOutput.HyperparameterMetric final_metric = 3;</code>
   */
  boolean hasFinalMetric();
  /**
   * <pre>
   * The final objective metric seen for this trial.
   * </pre>
   *
   * <code>.google.cloud.ml.v1.HyperparameterOutput.HyperparameterMetric final_metric = 3;</code>
   */
  com.google.cloud.ml.api.v1.HyperparameterOutput.HyperparameterMetric getFinalMetric();
  /**
   * <pre>
   * The final objective metric seen for this trial.
   * </pre>
   *
   * <code>.google.cloud.ml.v1.HyperparameterOutput.HyperparameterMetric final_metric = 3;</code>
   */
  com.google.cloud.ml.api.v1.HyperparameterOutput.HyperparameterMetricOrBuilder getFinalMetricOrBuilder();

  /**
   * <pre>
   * All recorded object metrics for this trial.
   * </pre>
   *
   * <code>repeated .google.cloud.ml.v1.HyperparameterOutput.HyperparameterMetric all_metrics = 4;</code>
   */
  java.util.List<com.google.cloud.ml.api.v1.HyperparameterOutput.HyperparameterMetric> 
      getAllMetricsList();
  /**
   * <pre>
   * All recorded object metrics for this trial.
   * </pre>
   *
   * <code>repeated .google.cloud.ml.v1.HyperparameterOutput.HyperparameterMetric all_metrics = 4;</code>
   */
  com.google.cloud.ml.api.v1.HyperparameterOutput.HyperparameterMetric getAllMetrics(int index);
  /**
   * <pre>
   * All recorded object metrics for this trial.
   * </pre>
   *
   * <code>repeated .google.cloud.ml.v1.HyperparameterOutput.HyperparameterMetric all_metrics = 4;</code>
   */
  int getAllMetricsCount();
  /**
   * <pre>
   * All recorded object metrics for this trial.
   * </pre>
   *
   * <code>repeated .google.cloud.ml.v1.HyperparameterOutput.HyperparameterMetric all_metrics = 4;</code>
   */
  java.util.List<? extends com.google.cloud.ml.api.v1.HyperparameterOutput.HyperparameterMetricOrBuilder> 
      getAllMetricsOrBuilderList();
  /**
   * <pre>
   * All recorded object metrics for this trial.
   * </pre>
   *
   * <code>repeated .google.cloud.ml.v1.HyperparameterOutput.HyperparameterMetric all_metrics = 4;</code>
   */
  com.google.cloud.ml.api.v1.HyperparameterOutput.HyperparameterMetricOrBuilder getAllMetricsOrBuilder(
      int index);
}
