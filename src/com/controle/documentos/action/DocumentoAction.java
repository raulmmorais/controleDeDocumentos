/**
 * 
 */
package com.controle.documentos.action;

import java.util.List;

import com.controle.documentos.facade.DocumentoFacade;
import com.controle.documentos.facade.DocumentoFacadeImpl;
import com.controle.vo.AutorVO;
import com.controle.vo.NaturezaDocumentoVO;
import com.controle.vo.TipoDocumentoVO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author ®aul
 *
 */

public class DocumentoAction extends ActionSupport{
	private static final long serialVersionUID = -2236897000766344505L;

	//VOs
	private NaturezaDocumentoVO naturezaDocumentoVO;
	private AutorVO autorVO;
	private TipoDocumentoVO tipoDocumentoVO;
	
	//Listas
	private List<NaturezaDocumentoVO> natuezaDocumentos;
	private List<AutorVO> autores;
	private List<TipoDocumentoVO> tipoDocumentos;
	
	//facade
	private DocumentoFacade documentoFacade = new DocumentoFacadeImpl();
	
	public String novoDocumento(){
		return SUCCESS;
	}
	public String abrirDocumento(){
		return SUCCESS;
	}
	public String renomearDocumento(){
		return SUCCESS;
	}
	public String documentosDigitalizados(){
		return SUCCESS;
	}
	public String tiposDeDocumento(){
		tipoDocumentos = documentoFacade.obterListaTipoDocumento();
		return SUCCESS;
	}
	public String novoTipoDeDocumento(){
		tipoDocumentoVO = new TipoDocumentoVO();
		return SUCCESS;
	}
	public String gravarTipoDocumento(){
		documentoFacade.gravarNovoTipoDocumento(tipoDocumentoVO);
		return SUCCESS;
	}
	public String novoAutor(){
		autorVO = new AutorVO();
		return SUCCESS;
	}
	public String gravarAutor(){
		documentoFacade.gravarNovoAutor(autorVO);
		return SUCCESS;
	}
	public String listaAutores(){
		autores = documentoFacade.obterListaAutores();
		return SUCCESS;
	}
	
	public String novaNatureza(){
		setNaturezaDocumentoVO(new NaturezaDocumentoVO());
		return SUCCESS;
	}
	public String listaNatureza(){
		natuezaDocumentos = documentoFacade.obterListaNaturezaDocumentos();
		return SUCCESS;
	}
	
	public String gravarNovaNatureza(){
		documentoFacade.gravarNovaNaturezaDocumento(naturezaDocumentoVO);
		return SUCCESS;
	}
	
	/**
	 * @return the naturezaDocumentoVO
	 */
	public NaturezaDocumentoVO getNaturezaDocumentoVO() {
		return naturezaDocumentoVO;
	}
	/**
	 * @param naturezaDocumentoVO the naturezaDocumentoVO to set
	 */
	public void setNaturezaDocumentoVO(NaturezaDocumentoVO naturezaDocumentoVO) {
		this.naturezaDocumentoVO = naturezaDocumentoVO;
	}
	/**
	 * @return the natuezaDocumentos
	 */
	public List<NaturezaDocumentoVO> getNatuezaDocumentos() {
		return natuezaDocumentos;
	}
	/**
	 * @param natuezaDocumentos the natuezaDocumentos to set
	 */
	public void setNatuezaDocumentos(List<NaturezaDocumentoVO> natuezaDocumentos) {
		this.natuezaDocumentos = natuezaDocumentos;
	}
	/**
	 * @return the autorVO
	 */
	public AutorVO getAutorVO() {
		return autorVO;
	}
	/**
	 * @param autorVO the autorVO to set
	 */
	public void setAutorVO(AutorVO autorVO) {
		this.autorVO = autorVO;
	}
	/**
	 * @return the autores
	 */
	public List<AutorVO> getAutores() {
		return autores;
	}
	/**
	 * @param autores the autores to set
	 */
	public void setAutores(List<AutorVO> autores) {
		this.autores = autores;
	}
	/**
	 * @return the tipoDocumentos
	 */
	public List<TipoDocumentoVO> getTipoDocumentos() {
		return tipoDocumentos;
	}
	/**
	 * @param tipoDocumentos the tipoDocumentos to set
	 */
	public void setTipoDocumentos(List<TipoDocumentoVO> tipoDocumentos) {
		this.tipoDocumentos = tipoDocumentos;
	}
	/**
	 * @return the tipoDocumentoVO
	 */
	public TipoDocumentoVO getTipoDocumentoVO() {
		return tipoDocumentoVO;
	}
	/**
	 * @param tipoDocumentoVO the tipoDocumentoVO to set
	 */
	public void setTipoDocumentoVO(TipoDocumentoVO tipoDocumentoVO) {
		this.tipoDocumentoVO = tipoDocumentoVO;
	}
}
