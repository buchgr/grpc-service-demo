// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/billing.proto

package com.google.api;

public interface BillingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Billing)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Names of the metrics to report to billing. Each name must
   * be defined in [Service.metrics][google.api.Service.metrics] section.
   * </pre>
   *
   * <code>repeated string metrics = 1;</code>
   */
  java.util.List<java.lang.String>
      getMetricsList();
  /**
   * <pre>
   * Names of the metrics to report to billing. Each name must
   * be defined in [Service.metrics][google.api.Service.metrics] section.
   * </pre>
   *
   * <code>repeated string metrics = 1;</code>
   */
  int getMetricsCount();
  /**
   * <pre>
   * Names of the metrics to report to billing. Each name must
   * be defined in [Service.metrics][google.api.Service.metrics] section.
   * </pre>
   *
   * <code>repeated string metrics = 1;</code>
   */
  java.lang.String getMetrics(int index);
  /**
   * <pre>
   * Names of the metrics to report to billing. Each name must
   * be defined in [Service.metrics][google.api.Service.metrics] section.
   * </pre>
   *
   * <code>repeated string metrics = 1;</code>
   */
  com.google.protobuf.ByteString
      getMetricsBytes(int index);

  /**
   * <pre>
   * A list of billing status rules for configuring billing status check.
   * </pre>
   *
   * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
   */
  java.util.List<com.google.api.BillingStatusRule> 
      getRulesList();
  /**
   * <pre>
   * A list of billing status rules for configuring billing status check.
   * </pre>
   *
   * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
   */
  com.google.api.BillingStatusRule getRules(int index);
  /**
   * <pre>
   * A list of billing status rules for configuring billing status check.
   * </pre>
   *
   * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
   */
  int getRulesCount();
  /**
   * <pre>
   * A list of billing status rules for configuring billing status check.
   * </pre>
   *
   * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
   */
  java.util.List<? extends com.google.api.BillingStatusRuleOrBuilder> 
      getRulesOrBuilderList();
  /**
   * <pre>
   * A list of billing status rules for configuring billing status check.
   * </pre>
   *
   * <code>repeated .google.api.BillingStatusRule rules = 5;</code>
   */
  com.google.api.BillingStatusRuleOrBuilder getRulesOrBuilder(
      int index);
}
