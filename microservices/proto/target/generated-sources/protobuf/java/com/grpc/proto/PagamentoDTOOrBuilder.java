// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pagamento.proto

package com.grpc.proto;

public interface PagamentoDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PagamentoDTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>double valorPago = 2;</code>
   */
  double getValorPago();

  /**
   * <code>string dataPagamento = 3;</code>
   */
  java.lang.String getDataPagamento();
  /**
   * <code>string dataPagamento = 3;</code>
   */
  com.google.protobuf.ByteString
      getDataPagamentoBytes();

  /**
   * <code>.EnumTipoPagamento tipoPagamento = 4;</code>
   */
  int getTipoPagamentoValue();
  /**
   * <code>.EnumTipoPagamento tipoPagamento = 4;</code>
   */
  com.grpc.proto.EnumTipoPagamento getTipoPagamento();

  /**
   * <code>bool isParcelado = 5;</code>
   */
  boolean getIsParcelado();

  /**
   * <code>int32 parcelas = 6;</code>
   */
  int getParcelas();

  /**
   * <code>double juros = 7;</code>
   */
  double getJuros();

  /**
   * <code>int64 idCliente = 8;</code>
   */
  long getIdCliente();

  /**
   * <code>int32 idLancamento = 9;</code>
   */
  int getIdLancamento();
}
