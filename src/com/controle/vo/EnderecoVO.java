package com.controle.vo;

import java.io.Serializable;

public class EnderecoVO implements Serializable{
	private static final long serialVersionUID = 4041560283113801226L;
	
	public EnderecoVO(){}
	
	public EnderecoVO(String cep, String logradouro,
			TipoLogradouro tipoLogradouro, String complemento, String cidade,
			String bairro, Integer numero) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.tipoLogradouro = tipoLogradouro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numero = numero;
	}

	private String cep;
	private String logradouro;
	private TipoLogradouro tipoLogradouro;
	private String complemento;
	private String cidade;
	private String bairro;
	private Integer numero;

	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
