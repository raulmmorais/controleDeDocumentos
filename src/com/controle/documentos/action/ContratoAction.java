package com.controle.documentos.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @author ®aul
 *
 */
public class ContratoAction extends ActionSupport{
	private static final long serialVersionUID = -662118553109621101L;
	
	public String novoContrato(){
		return SUCCESS;
	}
	public String listaContratos(){
		return SUCCESS;
	}
}
