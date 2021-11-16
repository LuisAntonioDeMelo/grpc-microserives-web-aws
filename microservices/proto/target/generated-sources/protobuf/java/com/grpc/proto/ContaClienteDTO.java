// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: conta-cliente.proto

package com.grpc.proto;

/**
 * Protobuf type {@code ContaClienteDTO}
 */
public  final class ContaClienteDTO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ContaClienteDTO)
    ContaClienteDTOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContaClienteDTO.newBuilder() to construct.
  private ContaClienteDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContaClienteDTO() {
    id_ = 0L;
    clienteId_ = 0L;
    saldo_ = 0D;
    limitePagamento_ = 0D;
    debitoPendente_ = 0D;
    tipoConta_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ContaClienteDTO(
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
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 16: {

            clienteId_ = input.readInt64();
            break;
          }
          case 25: {

            saldo_ = input.readDouble();
            break;
          }
          case 33: {

            limitePagamento_ = input.readDouble();
            break;
          }
          case 41: {

            debitoPendente_ = input.readDouble();
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            tipoConta_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.proto.ContaCliente.internal_static_ContaClienteDTO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.proto.ContaCliente.internal_static_ContaClienteDTO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.proto.ContaClienteDTO.class, com.grpc.proto.ContaClienteDTO.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int CLIENTE_ID_FIELD_NUMBER = 2;
  private long clienteId_;
  /**
   * <code>int64 cliente_id = 2;</code>
   */
  public long getClienteId() {
    return clienteId_;
  }

  public static final int SALDO_FIELD_NUMBER = 3;
  private double saldo_;
  /**
   * <code>double saldo = 3;</code>
   */
  public double getSaldo() {
    return saldo_;
  }

  public static final int LIMITEPAGAMENTO_FIELD_NUMBER = 4;
  private double limitePagamento_;
  /**
   * <code>double limitePagamento = 4;</code>
   */
  public double getLimitePagamento() {
    return limitePagamento_;
  }

  public static final int DEBITOPENDENTE_FIELD_NUMBER = 5;
  private double debitoPendente_;
  /**
   * <code>double debitoPendente = 5;</code>
   */
  public double getDebitoPendente() {
    return debitoPendente_;
  }

  public static final int TIPOCONTA_FIELD_NUMBER = 6;
  private int tipoConta_;
  /**
   * <code>.TipoConta tipoConta = 6;</code>
   */
  public int getTipoContaValue() {
    return tipoConta_;
  }
  /**
   * <code>.TipoConta tipoConta = 6;</code>
   */
  public com.grpc.proto.TipoConta getTipoConta() {
    @SuppressWarnings("deprecation")
    com.grpc.proto.TipoConta result = com.grpc.proto.TipoConta.valueOf(tipoConta_);
    return result == null ? com.grpc.proto.TipoConta.UNRECOGNIZED : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (clienteId_ != 0L) {
      output.writeInt64(2, clienteId_);
    }
    if (saldo_ != 0D) {
      output.writeDouble(3, saldo_);
    }
    if (limitePagamento_ != 0D) {
      output.writeDouble(4, limitePagamento_);
    }
    if (debitoPendente_ != 0D) {
      output.writeDouble(5, debitoPendente_);
    }
    if (tipoConta_ != com.grpc.proto.TipoConta.CORRENTE.getNumber()) {
      output.writeEnum(6, tipoConta_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (clienteId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, clienteId_);
    }
    if (saldo_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, saldo_);
    }
    if (limitePagamento_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, limitePagamento_);
    }
    if (debitoPendente_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, debitoPendente_);
    }
    if (tipoConta_ != com.grpc.proto.TipoConta.CORRENTE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, tipoConta_);
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
    if (!(obj instanceof com.grpc.proto.ContaClienteDTO)) {
      return super.equals(obj);
    }
    com.grpc.proto.ContaClienteDTO other = (com.grpc.proto.ContaClienteDTO) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && (getClienteId()
        == other.getClienteId());
    result = result && (
        java.lang.Double.doubleToLongBits(getSaldo())
        == java.lang.Double.doubleToLongBits(
            other.getSaldo()));
    result = result && (
        java.lang.Double.doubleToLongBits(getLimitePagamento())
        == java.lang.Double.doubleToLongBits(
            other.getLimitePagamento()));
    result = result && (
        java.lang.Double.doubleToLongBits(getDebitoPendente())
        == java.lang.Double.doubleToLongBits(
            other.getDebitoPendente()));
    result = result && tipoConta_ == other.tipoConta_;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + CLIENTE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getClienteId());
    hash = (37 * hash) + SALDO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSaldo()));
    hash = (37 * hash) + LIMITEPAGAMENTO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLimitePagamento()));
    hash = (37 * hash) + DEBITOPENDENTE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getDebitoPendente()));
    hash = (37 * hash) + TIPOCONTA_FIELD_NUMBER;
    hash = (53 * hash) + tipoConta_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.proto.ContaClienteDTO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.ContaClienteDTO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.ContaClienteDTO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.ContaClienteDTO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.ContaClienteDTO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.ContaClienteDTO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.ContaClienteDTO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.proto.ContaClienteDTO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.proto.ContaClienteDTO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.proto.ContaClienteDTO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.proto.ContaClienteDTO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.proto.ContaClienteDTO parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grpc.proto.ContaClienteDTO prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ContaClienteDTO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ContaClienteDTO)
      com.grpc.proto.ContaClienteDTOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.proto.ContaCliente.internal_static_ContaClienteDTO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.proto.ContaCliente.internal_static_ContaClienteDTO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.proto.ContaClienteDTO.class, com.grpc.proto.ContaClienteDTO.Builder.class);
    }

    // Construct using com.grpc.proto.ContaClienteDTO.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      clienteId_ = 0L;

      saldo_ = 0D;

      limitePagamento_ = 0D;

      debitoPendente_ = 0D;

      tipoConta_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.proto.ContaCliente.internal_static_ContaClienteDTO_descriptor;
    }

    @java.lang.Override
    public com.grpc.proto.ContaClienteDTO getDefaultInstanceForType() {
      return com.grpc.proto.ContaClienteDTO.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.proto.ContaClienteDTO build() {
      com.grpc.proto.ContaClienteDTO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.proto.ContaClienteDTO buildPartial() {
      com.grpc.proto.ContaClienteDTO result = new com.grpc.proto.ContaClienteDTO(this);
      result.id_ = id_;
      result.clienteId_ = clienteId_;
      result.saldo_ = saldo_;
      result.limitePagamento_ = limitePagamento_;
      result.debitoPendente_ = debitoPendente_;
      result.tipoConta_ = tipoConta_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grpc.proto.ContaClienteDTO) {
        return mergeFrom((com.grpc.proto.ContaClienteDTO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.proto.ContaClienteDTO other) {
      if (other == com.grpc.proto.ContaClienteDTO.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getClienteId() != 0L) {
        setClienteId(other.getClienteId());
      }
      if (other.getSaldo() != 0D) {
        setSaldo(other.getSaldo());
      }
      if (other.getLimitePagamento() != 0D) {
        setLimitePagamento(other.getLimitePagamento());
      }
      if (other.getDebitoPendente() != 0D) {
        setDebitoPendente(other.getDebitoPendente());
      }
      if (other.tipoConta_ != 0) {
        setTipoContaValue(other.getTipoContaValue());
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
      com.grpc.proto.ContaClienteDTO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.proto.ContaClienteDTO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private long clienteId_ ;
    /**
     * <code>int64 cliente_id = 2;</code>
     */
    public long getClienteId() {
      return clienteId_;
    }
    /**
     * <code>int64 cliente_id = 2;</code>
     */
    public Builder setClienteId(long value) {
      
      clienteId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 cliente_id = 2;</code>
     */
    public Builder clearClienteId() {
      
      clienteId_ = 0L;
      onChanged();
      return this;
    }

    private double saldo_ ;
    /**
     * <code>double saldo = 3;</code>
     */
    public double getSaldo() {
      return saldo_;
    }
    /**
     * <code>double saldo = 3;</code>
     */
    public Builder setSaldo(double value) {
      
      saldo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double saldo = 3;</code>
     */
    public Builder clearSaldo() {
      
      saldo_ = 0D;
      onChanged();
      return this;
    }

    private double limitePagamento_ ;
    /**
     * <code>double limitePagamento = 4;</code>
     */
    public double getLimitePagamento() {
      return limitePagamento_;
    }
    /**
     * <code>double limitePagamento = 4;</code>
     */
    public Builder setLimitePagamento(double value) {
      
      limitePagamento_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double limitePagamento = 4;</code>
     */
    public Builder clearLimitePagamento() {
      
      limitePagamento_ = 0D;
      onChanged();
      return this;
    }

    private double debitoPendente_ ;
    /**
     * <code>double debitoPendente = 5;</code>
     */
    public double getDebitoPendente() {
      return debitoPendente_;
    }
    /**
     * <code>double debitoPendente = 5;</code>
     */
    public Builder setDebitoPendente(double value) {
      
      debitoPendente_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double debitoPendente = 5;</code>
     */
    public Builder clearDebitoPendente() {
      
      debitoPendente_ = 0D;
      onChanged();
      return this;
    }

    private int tipoConta_ = 0;
    /**
     * <code>.TipoConta tipoConta = 6;</code>
     */
    public int getTipoContaValue() {
      return tipoConta_;
    }
    /**
     * <code>.TipoConta tipoConta = 6;</code>
     */
    public Builder setTipoContaValue(int value) {
      tipoConta_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.TipoConta tipoConta = 6;</code>
     */
    public com.grpc.proto.TipoConta getTipoConta() {
      @SuppressWarnings("deprecation")
      com.grpc.proto.TipoConta result = com.grpc.proto.TipoConta.valueOf(tipoConta_);
      return result == null ? com.grpc.proto.TipoConta.UNRECOGNIZED : result;
    }
    /**
     * <code>.TipoConta tipoConta = 6;</code>
     */
    public Builder setTipoConta(com.grpc.proto.TipoConta value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      tipoConta_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.TipoConta tipoConta = 6;</code>
     */
    public Builder clearTipoConta() {
      
      tipoConta_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ContaClienteDTO)
  }

  // @@protoc_insertion_point(class_scope:ContaClienteDTO)
  private static final com.grpc.proto.ContaClienteDTO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.proto.ContaClienteDTO();
  }

  public static com.grpc.proto.ContaClienteDTO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContaClienteDTO>
      PARSER = new com.google.protobuf.AbstractParser<ContaClienteDTO>() {
    @java.lang.Override
    public ContaClienteDTO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ContaClienteDTO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ContaClienteDTO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContaClienteDTO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.proto.ContaClienteDTO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

