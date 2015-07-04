package com.controle.documentos.action;

import java.util.List;

import com.controle.origem.destino.facade.OrigemDestinoFacade;
import com.controle.origem.destino.facade.OrigemDestinoFacadeImpl;
import com.controle.vo.OrigemDestinoVO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author ®aul
 *
 */
public class OrigemDestinoAction extends ActionSupport{
	private static final long serialVersionUID = -19629138675041987L;
	
	private OrigemDestinoVO origemDestinoVO;
	private List<OrigemDestinoVO> origensDestinos;
	
	private OrigemDestinoFacade origemDestinoFacade = new OrigemDestinoFacadeImpl();

	public String novaOrigemDestino(){
		setOrigemDestinoVO(new OrigemDestinoVO());
		return SUCCESS;
	}
	public String gravarOrigemDestino(){
		origemDestinoFacade.gravarOrigemDestino(origemDestinoVO);
		return SUCCESS;
	}
	public String listaOrigemDestino(){
		origensDestinos = origemDestinoFacade.obterListaOrigemDestino();
		return SUCCESS;
	}
	/**
	 * @return the origemDestinoVO
	 */
	public OrigemDestinoVO getOrigemDestinoVO() {
		return origemDestinoVO;
	}
	/**
	 * @param origemDestinoVO the origemDestinoVO to set
	 */
	public void setOrigemDestinoVO(OrigemDestinoVO origemDestinoVO) {
		this.origemDestinoVO = origemDestinoVO;
	}
	/**
	 * @return the origensDestinos
	 */
	public List<OrigemDestinoVO> getOrigensDestinos() {
		return origensDestinos;
	}
	/**
	 * @param origensDestinos the origensDestinos to set
	 */
	public void setOrigensDestinos(List<OrigemDestinoVO> origensDestinos) {
		this.origensDestinos = origensDestinos;
	}
}
