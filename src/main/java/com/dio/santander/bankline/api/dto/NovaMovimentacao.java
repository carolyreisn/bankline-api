package com.dio.santander.bankline.api.dto;

import com.dio.santander.bankline.api.model.MovimentacaoTipo;

public class NovaMovimentacao {
	
	private String descricao;
	private Double valor;
	private MovimentacaoTipo tipo;
	public String getDescricao() {
		return descricao;
	}
	public Double getValor() {
		return valor;
	}
	public MovimentacaoTipo getTipo() {
		return tipo;
	}
	public Integer getIdConta() {
		return idConta;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	private Integer idConta;

}
