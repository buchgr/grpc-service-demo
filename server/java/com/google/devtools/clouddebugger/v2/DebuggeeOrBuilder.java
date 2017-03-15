// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouddebugger/v2/data.proto

package com.google.devtools.clouddebugger.v2;

public interface DebuggeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouddebugger.v2.Debuggee)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique identifier for the debuggee generated by the controller service.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * Unique identifier for the debuggee generated by the controller service.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Project the debuggee is associated with.
   * Use the project number when registering a Google Cloud Platform project.
   * </pre>
   *
   * <code>string project = 2;</code>
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project the debuggee is associated with.
   * Use the project number when registering a Google Cloud Platform project.
   * </pre>
   *
   * <code>string project = 2;</code>
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * Debuggee uniquifier within the project.
   * Any string that identifies the application within the project can be used.
   * Including environment and version or build IDs is recommended.
   * </pre>
   *
   * <code>string uniquifier = 3;</code>
   */
  java.lang.String getUniquifier();
  /**
   * <pre>
   * Debuggee uniquifier within the project.
   * Any string that identifies the application within the project can be used.
   * Including environment and version or build IDs is recommended.
   * </pre>
   *
   * <code>string uniquifier = 3;</code>
   */
  com.google.protobuf.ByteString
      getUniquifierBytes();

  /**
   * <pre>
   * Human readable description of the debuggee.
   * Including a human-readable project name, environment name and version
   * information is recommended.
   * </pre>
   *
   * <code>string description = 4;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Human readable description of the debuggee.
   * Including a human-readable project name, environment name and version
   * information is recommended.
   * </pre>
   *
   * <code>string description = 4;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * If set to `true`, indicates that the debuggee is considered as inactive by
   * the Controller service.
   * </pre>
   *
   * <code>bool is_inactive = 5;</code>
   */
  boolean getIsInactive();

  /**
   * <pre>
   * Version ID of the agent release. The version ID is structured as
   * following: `domain/type/vmajor.minor` (for example
   * `google.com/gcp-java/v1.1`).
   * </pre>
   *
   * <code>string agent_version = 6;</code>
   */
  java.lang.String getAgentVersion();
  /**
   * <pre>
   * Version ID of the agent release. The version ID is structured as
   * following: `domain/type/vmajor.minor` (for example
   * `google.com/gcp-java/v1.1`).
   * </pre>
   *
   * <code>string agent_version = 6;</code>
   */
  com.google.protobuf.ByteString
      getAgentVersionBytes();

  /**
   * <pre>
   * If set to `true`, indicates that the agent should disable itself and
   * detach from the debuggee.
   * </pre>
   *
   * <code>bool is_disabled = 7;</code>
   */
  boolean getIsDisabled();

  /**
   * <pre>
   * Human readable message to be displayed to the user about this debuggee.
   * Absence of this field indicates no status. The message can be either
   * informational or an error status.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.StatusMessage status = 8;</code>
   */
  boolean hasStatus();
  /**
   * <pre>
   * Human readable message to be displayed to the user about this debuggee.
   * Absence of this field indicates no status. The message can be either
   * informational or an error status.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.StatusMessage status = 8;</code>
   */
  com.google.devtools.clouddebugger.v2.StatusMessage getStatus();
  /**
   * <pre>
   * Human readable message to be displayed to the user about this debuggee.
   * Absence of this field indicates no status. The message can be either
   * informational or an error status.
   * </pre>
   *
   * <code>.google.devtools.clouddebugger.v2.StatusMessage status = 8;</code>
   */
  com.google.devtools.clouddebugger.v2.StatusMessageOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * NOTE: This field is deprecated. Consumers should use
   * `ext_source_contexts` if it is not empty. Debug agents should populate
   * both this field and `ext_source_contexts`.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.SourceContext source_contexts = 9;</code>
   */
  java.util.List<com.google.devtools.source.v1.SourceContext> 
      getSourceContextsList();
  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * NOTE: This field is deprecated. Consumers should use
   * `ext_source_contexts` if it is not empty. Debug agents should populate
   * both this field and `ext_source_contexts`.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.SourceContext source_contexts = 9;</code>
   */
  com.google.devtools.source.v1.SourceContext getSourceContexts(int index);
  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * NOTE: This field is deprecated. Consumers should use
   * `ext_source_contexts` if it is not empty. Debug agents should populate
   * both this field and `ext_source_contexts`.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.SourceContext source_contexts = 9;</code>
   */
  int getSourceContextsCount();
  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * NOTE: This field is deprecated. Consumers should use
   * `ext_source_contexts` if it is not empty. Debug agents should populate
   * both this field and `ext_source_contexts`.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.SourceContext source_contexts = 9;</code>
   */
  java.util.List<? extends com.google.devtools.source.v1.SourceContextOrBuilder> 
      getSourceContextsOrBuilderList();
  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * NOTE: This field is deprecated. Consumers should use
   * `ext_source_contexts` if it is not empty. Debug agents should populate
   * both this field and `ext_source_contexts`.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.SourceContext source_contexts = 9;</code>
   */
  com.google.devtools.source.v1.SourceContextOrBuilder getSourceContextsOrBuilder(
      int index);

  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * Contexts describing a remote repo related to the source code
   * have a `category` label of `remote_repo`. Source snapshot source
   * contexts have a `category` of `snapshot`.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.ExtendedSourceContext ext_source_contexts = 13;</code>
   */
  java.util.List<com.google.devtools.source.v1.ExtendedSourceContext> 
      getExtSourceContextsList();
  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * Contexts describing a remote repo related to the source code
   * have a `category` label of `remote_repo`. Source snapshot source
   * contexts have a `category` of `snapshot`.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.ExtendedSourceContext ext_source_contexts = 13;</code>
   */
  com.google.devtools.source.v1.ExtendedSourceContext getExtSourceContexts(int index);
  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * Contexts describing a remote repo related to the source code
   * have a `category` label of `remote_repo`. Source snapshot source
   * contexts have a `category` of `snapshot`.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.ExtendedSourceContext ext_source_contexts = 13;</code>
   */
  int getExtSourceContextsCount();
  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * Contexts describing a remote repo related to the source code
   * have a `category` label of `remote_repo`. Source snapshot source
   * contexts have a `category` of `snapshot`.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.ExtendedSourceContext ext_source_contexts = 13;</code>
   */
  java.util.List<? extends com.google.devtools.source.v1.ExtendedSourceContextOrBuilder> 
      getExtSourceContextsOrBuilderList();
  /**
   * <pre>
   * References to the locations and revisions of the source code used in the
   * deployed application.
   * Contexts describing a remote repo related to the source code
   * have a `category` label of `remote_repo`. Source snapshot source
   * contexts have a `category` of `snapshot`.
   * </pre>
   *
   * <code>repeated .google.devtools.source.v1.ExtendedSourceContext ext_source_contexts = 13;</code>
   */
  com.google.devtools.source.v1.ExtendedSourceContextOrBuilder getExtSourceContextsOrBuilder(
      int index);

  /**
   * <pre>
   * A set of custom debuggee properties, populated by the agent, to be
   * displayed to the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * A set of custom debuggee properties, populated by the agent, to be
   * displayed to the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * A set of custom debuggee properties, populated by the agent, to be
   * displayed to the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * A set of custom debuggee properties, populated by the agent, to be
   * displayed to the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * A set of custom debuggee properties, populated by the agent, to be
   * displayed to the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);
}
