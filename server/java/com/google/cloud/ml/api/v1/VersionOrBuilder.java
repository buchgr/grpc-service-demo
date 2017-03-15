// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/ml/v1/model_service.proto

package com.google.cloud.ml.api.v1;

public interface VersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.ml.v1.Version)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required.The name specified for the version when it was created.
   * The version name must be unique within the model it is created in.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required.The name specified for the version when it was created.
   * The version name must be unique within the model it is created in.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. The description specified for the version when it was created.
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Optional. The description specified for the version when it was created.
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Output only. If true, this version will be used to handle prediction
   * requests that do not specify a version.
   * You can change the default version by calling
   * [projects.methods.versions.setDefault](/ml/reference/rest/v1/projects.models.versions/setDefault).
   * </pre>
   *
   * <code>bool is_default = 3;</code>
   */
  boolean getIsDefault();

  /**
   * <pre>
   * Required. The Google Cloud Storage location of the trained model used to
   * create the version. See the
   * [overview of model deployment](/ml/docs/concepts/deployment-overview) for
   * more informaiton.
   * When passing Version to
   * [projects.models.versions.create](/ml/reference/rest/v1/projects.models.versions/create)
   * the model service uses the specified location as the source of the model.
   * Once deployed, the model version is hosted by the prediction service, so
   * this location is useful only as a historical record.
   * </pre>
   *
   * <code>string deployment_uri = 4;</code>
   */
  java.lang.String getDeploymentUri();
  /**
   * <pre>
   * Required. The Google Cloud Storage location of the trained model used to
   * create the version. See the
   * [overview of model deployment](/ml/docs/concepts/deployment-overview) for
   * more informaiton.
   * When passing Version to
   * [projects.models.versions.create](/ml/reference/rest/v1/projects.models.versions/create)
   * the model service uses the specified location as the source of the model.
   * Once deployed, the model version is hosted by the prediction service, so
   * this location is useful only as a historical record.
   * </pre>
   *
   * <code>string deployment_uri = 4;</code>
   */
  com.google.protobuf.ByteString
      getDeploymentUriBytes();

  /**
   * <pre>
   * Output only. The time the version was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time the version was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time the version was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time the version was last used for prediction.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_use_time = 6;</code>
   */
  boolean hasLastUseTime();
  /**
   * <pre>
   * Output only. The time the version was last used for prediction.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_use_time = 6;</code>
   */
  com.google.protobuf.Timestamp getLastUseTime();
  /**
   * <pre>
   * Output only. The time the version was last used for prediction.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_use_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUseTimeOrBuilder();

  /**
   * <pre>
   * Optional. The Google Cloud ML runtime version to use for this deployment.
   * If not set, Google Cloud ML will choose a version.
   * </pre>
   *
   * <code>string runtime_version = 8;</code>
   */
  java.lang.String getRuntimeVersion();
  /**
   * <pre>
   * Optional. The Google Cloud ML runtime version to use for this deployment.
   * If not set, Google Cloud ML will choose a version.
   * </pre>
   *
   * <code>string runtime_version = 8;</code>
   */
  com.google.protobuf.ByteString
      getRuntimeVersionBytes();

  /**
   * <pre>
   * Optional. Manually select the number of nodes to use for serving the
   * model. If unset (i.e., by default), the number of nodes used to serve
   * the model automatically scales with traffic. However, care should be
   * taken to ramp up traffic according to the model's ability to scale. If
   * your model needs to handle bursts of traffic beyond it's ability to
   * scale, it is recommended you set this field appropriately.
   * </pre>
   *
   * <code>.google.cloud.ml.v1.ManualScaling manual_scaling = 9;</code>
   */
  boolean hasManualScaling();
  /**
   * <pre>
   * Optional. Manually select the number of nodes to use for serving the
   * model. If unset (i.e., by default), the number of nodes used to serve
   * the model automatically scales with traffic. However, care should be
   * taken to ramp up traffic according to the model's ability to scale. If
   * your model needs to handle bursts of traffic beyond it's ability to
   * scale, it is recommended you set this field appropriately.
   * </pre>
   *
   * <code>.google.cloud.ml.v1.ManualScaling manual_scaling = 9;</code>
   */
  com.google.cloud.ml.api.v1.ManualScaling getManualScaling();
  /**
   * <pre>
   * Optional. Manually select the number of nodes to use for serving the
   * model. If unset (i.e., by default), the number of nodes used to serve
   * the model automatically scales with traffic. However, care should be
   * taken to ramp up traffic according to the model's ability to scale. If
   * your model needs to handle bursts of traffic beyond it's ability to
   * scale, it is recommended you set this field appropriately.
   * </pre>
   *
   * <code>.google.cloud.ml.v1.ManualScaling manual_scaling = 9;</code>
   */
  com.google.cloud.ml.api.v1.ManualScalingOrBuilder getManualScalingOrBuilder();
}
