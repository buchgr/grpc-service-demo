// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/billing/v1/cloud_billing.proto

package com.google.cloud.billing.v1;

public interface ListBillingAccountsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.v1.ListBillingAccountsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of billing accounts.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.BillingAccount billing_accounts = 1;</code>
   */
  java.util.List<com.google.cloud.billing.v1.BillingAccount> 
      getBillingAccountsList();
  /**
   * <pre>
   * A list of billing accounts.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.BillingAccount billing_accounts = 1;</code>
   */
  com.google.cloud.billing.v1.BillingAccount getBillingAccounts(int index);
  /**
   * <pre>
   * A list of billing accounts.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.BillingAccount billing_accounts = 1;</code>
   */
  int getBillingAccountsCount();
  /**
   * <pre>
   * A list of billing accounts.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.BillingAccount billing_accounts = 1;</code>
   */
  java.util.List<? extends com.google.cloud.billing.v1.BillingAccountOrBuilder> 
      getBillingAccountsOrBuilderList();
  /**
   * <pre>
   * A list of billing accounts.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.BillingAccount billing_accounts = 1;</code>
   */
  com.google.cloud.billing.v1.BillingAccountOrBuilder getBillingAccountsOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve the next page of results. To retrieve the next page,
   * call `ListBillingAccounts` again with the `page_token` field set to this
   * value. This field is empty if there are no more results to retrieve.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve the next page of results. To retrieve the next page,
   * call `ListBillingAccounts` again with the `page_token` field set to this
   * value. This field is empty if there are no more results to retrieve.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
