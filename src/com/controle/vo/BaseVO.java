/**
 * 
 */
package com.controle.vo;

import java.io.Serializable;

/**
 * @author �aul
 *
 */
public class BaseVO implements Serializable{
	private static final long serialVersionUID = -6124541450742123477L;

	public BaseVO() {}
	public BaseVO(Long id, String descricao, String codigo) {
		this.id = id;
		this.descricao = descricao;
		this.codigo = codigo;
	}
	
	private Long id;
	private String descricao;
	private String codigo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
