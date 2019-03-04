// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

package com.google.cloud.vision.v1p4beta1;

/**
 *
 *
 * <pre>
 * Color information consists of RGB channels, score, and the fraction of
 * the image that the color occupies in the image.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p4beta1.ColorInfo}
 */
public final class ColorInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p4beta1.ColorInfo)
    ColorInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ColorInfo.newBuilder() to construct.
  private ColorInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ColorInfo() {
    score_ = 0F;
    pixelFraction_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ColorInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.type.Color.Builder subBuilder = null;
              if (color_ != null) {
                subBuilder = color_.toBuilder();
              }
              color_ = input.readMessage(com.google.type.Color.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(color_);
                color_ = subBuilder.buildPartial();
              }

              break;
            }
          case 21:
            {
              score_ = input.readFloat();
              break;
            }
          case 29:
            {
              pixelFraction_ = input.readFloat();
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p4beta1_ColorInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p4beta1_ColorInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p4beta1.ColorInfo.class,
            com.google.cloud.vision.v1p4beta1.ColorInfo.Builder.class);
  }

  public static final int COLOR_FIELD_NUMBER = 1;
  private com.google.type.Color color_;
  /**
   *
   *
   * <pre>
   * RGB components of the color.
   * </pre>
   *
   * <code>.google.type.Color color = 1;</code>
   */
  public boolean hasColor() {
    return color_ != null;
  }
  /**
   *
   *
   * <pre>
   * RGB components of the color.
   * </pre>
   *
   * <code>.google.type.Color color = 1;</code>
   */
  public com.google.type.Color getColor() {
    return color_ == null ? com.google.type.Color.getDefaultInstance() : color_;
  }
  /**
   *
   *
   * <pre>
   * RGB components of the color.
   * </pre>
   *
   * <code>.google.type.Color color = 1;</code>
   */
  public com.google.type.ColorOrBuilder getColorOrBuilder() {
    return getColor();
  }

  public static final int SCORE_FIELD_NUMBER = 2;
  private float score_;
  /**
   *
   *
   * <pre>
   * Image-specific score for this color. Value in range [0, 1].
   * </pre>
   *
   * <code>float score = 2;</code>
   */
  public float getScore() {
    return score_;
  }

  public static final int PIXEL_FRACTION_FIELD_NUMBER = 3;
  private float pixelFraction_;
  /**
   *
   *
   * <pre>
   * The fraction of pixels the color occupies in the image.
   * Value in range [0, 1].
   * </pre>
   *
   * <code>float pixel_fraction = 3;</code>
   */
  public float getPixelFraction() {
    return pixelFraction_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (color_ != null) {
      output.writeMessage(1, getColor());
    }
    if (score_ != 0F) {
      output.writeFloat(2, score_);
    }
    if (pixelFraction_ != 0F) {
      output.writeFloat(3, pixelFraction_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (color_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getColor());
    }
    if (score_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, score_);
    }
    if (pixelFraction_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(3, pixelFraction_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.vision.v1p4beta1.ColorInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p4beta1.ColorInfo other =
        (com.google.cloud.vision.v1p4beta1.ColorInfo) obj;

    boolean result = true;
    result = result && (hasColor() == other.hasColor());
    if (hasColor()) {
      result = result && getColor().equals(other.getColor());
    }
    result =
        result
            && (java.lang.Float.floatToIntBits(getScore())
                == java.lang.Float.floatToIntBits(other.getScore()));
    result =
        result
            && (java.lang.Float.floatToIntBits(getPixelFraction())
                == java.lang.Float.floatToIntBits(other.getPixelFraction()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasColor()) {
      hash = (37 * hash) + COLOR_FIELD_NUMBER;
      hash = (53 * hash) + getColor().hashCode();
    }
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getScore());
    hash = (37 * hash) + PIXEL_FRACTION_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getPixelFraction());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p4beta1.ColorInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.ColorInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.ColorInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.ColorInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.ColorInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.ColorInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.ColorInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.ColorInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.ColorInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.ColorInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.ColorInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.ColorInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.vision.v1p4beta1.ColorInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Color information consists of RGB channels, score, and the fraction of
   * the image that the color occupies in the image.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p4beta1.ColorInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p4beta1.ColorInfo)
      com.google.cloud.vision.v1p4beta1.ColorInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p4beta1_ColorInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p4beta1_ColorInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p4beta1.ColorInfo.class,
              com.google.cloud.vision.v1p4beta1.ColorInfo.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p4beta1.ColorInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (colorBuilder_ == null) {
        color_ = null;
      } else {
        color_ = null;
        colorBuilder_ = null;
      }
      score_ = 0F;

      pixelFraction_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p4beta1_ColorInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.ColorInfo getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p4beta1.ColorInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.ColorInfo build() {
      com.google.cloud.vision.v1p4beta1.ColorInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.ColorInfo buildPartial() {
      com.google.cloud.vision.v1p4beta1.ColorInfo result =
          new com.google.cloud.vision.v1p4beta1.ColorInfo(this);
      if (colorBuilder_ == null) {
        result.color_ = color_;
      } else {
        result.color_ = colorBuilder_.build();
      }
      result.score_ = score_;
      result.pixelFraction_ = pixelFraction_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vision.v1p4beta1.ColorInfo) {
        return mergeFrom((com.google.cloud.vision.v1p4beta1.ColorInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p4beta1.ColorInfo other) {
      if (other == com.google.cloud.vision.v1p4beta1.ColorInfo.getDefaultInstance()) return this;
      if (other.hasColor()) {
        mergeColor(other.getColor());
      }
      if (other.getScore() != 0F) {
        setScore(other.getScore());
      }
      if (other.getPixelFraction() != 0F) {
        setPixelFraction(other.getPixelFraction());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.vision.v1p4beta1.ColorInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vision.v1p4beta1.ColorInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.type.Color color_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Color, com.google.type.Color.Builder, com.google.type.ColorOrBuilder>
        colorBuilder_;
    /**
     *
     *
     * <pre>
     * RGB components of the color.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     */
    public boolean hasColor() {
      return colorBuilder_ != null || color_ != null;
    }
    /**
     *
     *
     * <pre>
     * RGB components of the color.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     */
    public com.google.type.Color getColor() {
      if (colorBuilder_ == null) {
        return color_ == null ? com.google.type.Color.getDefaultInstance() : color_;
      } else {
        return colorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * RGB components of the color.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     */
    public Builder setColor(com.google.type.Color value) {
      if (colorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        color_ = value;
        onChanged();
      } else {
        colorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * RGB components of the color.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     */
    public Builder setColor(com.google.type.Color.Builder builderForValue) {
      if (colorBuilder_ == null) {
        color_ = builderForValue.build();
        onChanged();
      } else {
        colorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * RGB components of the color.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     */
    public Builder mergeColor(com.google.type.Color value) {
      if (colorBuilder_ == null) {
        if (color_ != null) {
          color_ = com.google.type.Color.newBuilder(color_).mergeFrom(value).buildPartial();
        } else {
          color_ = value;
        }
        onChanged();
      } else {
        colorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * RGB components of the color.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     */
    public Builder clearColor() {
      if (colorBuilder_ == null) {
        color_ = null;
        onChanged();
      } else {
        color_ = null;
        colorBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * RGB components of the color.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     */
    public com.google.type.Color.Builder getColorBuilder() {

      onChanged();
      return getColorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * RGB components of the color.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     */
    public com.google.type.ColorOrBuilder getColorOrBuilder() {
      if (colorBuilder_ != null) {
        return colorBuilder_.getMessageOrBuilder();
      } else {
        return color_ == null ? com.google.type.Color.getDefaultInstance() : color_;
      }
    }
    /**
     *
     *
     * <pre>
     * RGB components of the color.
     * </pre>
     *
     * <code>.google.type.Color color = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Color, com.google.type.Color.Builder, com.google.type.ColorOrBuilder>
        getColorFieldBuilder() {
      if (colorBuilder_ == null) {
        colorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.Color,
                com.google.type.Color.Builder,
                com.google.type.ColorOrBuilder>(getColor(), getParentForChildren(), isClean());
        color_ = null;
      }
      return colorBuilder_;
    }

    private float score_;
    /**
     *
     *
     * <pre>
     * Image-specific score for this color. Value in range [0, 1].
     * </pre>
     *
     * <code>float score = 2;</code>
     */
    public float getScore() {
      return score_;
    }
    /**
     *
     *
     * <pre>
     * Image-specific score for this color. Value in range [0, 1].
     * </pre>
     *
     * <code>float score = 2;</code>
     */
    public Builder setScore(float value) {

      score_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Image-specific score for this color. Value in range [0, 1].
     * </pre>
     *
     * <code>float score = 2;</code>
     */
    public Builder clearScore() {

      score_ = 0F;
      onChanged();
      return this;
    }

    private float pixelFraction_;
    /**
     *
     *
     * <pre>
     * The fraction of pixels the color occupies in the image.
     * Value in range [0, 1].
     * </pre>
     *
     * <code>float pixel_fraction = 3;</code>
     */
    public float getPixelFraction() {
      return pixelFraction_;
    }
    /**
     *
     *
     * <pre>
     * The fraction of pixels the color occupies in the image.
     * Value in range [0, 1].
     * </pre>
     *
     * <code>float pixel_fraction = 3;</code>
     */
    public Builder setPixelFraction(float value) {

      pixelFraction_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The fraction of pixels the color occupies in the image.
     * Value in range [0, 1].
     * </pre>
     *
     * <code>float pixel_fraction = 3;</code>
     */
    public Builder clearPixelFraction() {

      pixelFraction_ = 0F;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p4beta1.ColorInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p4beta1.ColorInfo)
  private static final com.google.cloud.vision.v1p4beta1.ColorInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p4beta1.ColorInfo();
  }

  public static com.google.cloud.vision.v1p4beta1.ColorInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ColorInfo> PARSER =
      new com.google.protobuf.AbstractParser<ColorInfo>() {
        @java.lang.Override
        public ColorInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ColorInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ColorInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ColorInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.ColorInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
