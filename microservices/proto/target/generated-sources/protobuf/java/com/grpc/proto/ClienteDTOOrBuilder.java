// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cliente.proto

package com.grpc.proto;

public interface ClienteDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ClienteDTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>int64 idPessoa = 2;</code>
   */
  long getIdPessoa();

  /**
   * <code>string nomeCliente = 3;</code>
   */
  java.lang.String getNomeCliente();
  /**
   * <code>string nomeCliente = 3;</code>
   */
  com.google.protobuf.ByteString
      getNomeClienteBytes();

  /**
   * <code>double limite = 4;</code>
   */
  double getLimite();

  /**
   * <code>string dataCadastro = 5;</code>
   */
  java.lang.String getDataCadastro();
  /**
   * <code>string dataCadastro = 5;</code>
   */
  com.google.protobuf.ByteString
      getDataCadastroBytes();

  /**
   * <code>int32 diaVencimento = 6;</code>
   */
  int getDiaVencimento();

  /**
   * <code>bool credito = 7;</code>
   */
  boolean getCredito();
}
