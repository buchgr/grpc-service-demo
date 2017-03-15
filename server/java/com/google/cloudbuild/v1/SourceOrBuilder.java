// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

public interface SourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.Source)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If provided, get the source from this location in in Google Cloud
   * Storage.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.StorageSource storage_source = 2;</code>
   */
  com.google.cloudbuild.v1.StorageSource getStorageSource();
  /**
   * <pre>
   * If provided, get the source from this location in in Google Cloud
   * Storage.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.StorageSource storage_source = 2;</code>
   */
  com.google.cloudbuild.v1.StorageSourceOrBuilder getStorageSourceOrBuilder();

  /**
   * <pre>
   * If provided, get source from this location in a Cloud Repo.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource repo_source = 3;</code>
   */
  com.google.cloudbuild.v1.RepoSource getRepoSource();
  /**
   * <pre>
   * If provided, get source from this location in a Cloud Repo.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.RepoSource repo_source = 3;</code>
   */
  com.google.cloudbuild.v1.RepoSourceOrBuilder getRepoSourceOrBuilder();

  public com.google.cloudbuild.v1.Source.SourceCase getSourceCase();
}
