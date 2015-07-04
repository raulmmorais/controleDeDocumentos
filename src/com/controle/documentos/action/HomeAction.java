package com.controle.documentos.action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Raul
 *
 */
public class HomeAction extends ActionSupport{
	private static final long serialVersionUID = 8174030362325603328L;

	/***
	 * Action chamada quando a aplicação incia
	 * @return
	 */
	public String home(){
		return SUCCESS;
	}
}
