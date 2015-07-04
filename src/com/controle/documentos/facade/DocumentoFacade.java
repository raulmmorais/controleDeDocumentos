/**
 * 
 */
package com.controle.documentos.facade;

import java.util.List;

import com.controle.vo.AutorVO;
import com.controle.vo.NaturezaDocumentoVO;
import com.controle.vo.TipoDocumentoVO;

/**
 * @author ®aul
 *
 */
public interface DocumentoFacade {

	public List<NaturezaDocumentoVO> obterListaNaturezaDocumentos();	
	public void gravarNovaNaturezaDocumento(NaturezaDocumentoVO naturezaDocmentoVO);

	public List<AutorVO> obterListaAutores();
	public void gravarNovoAutor(AutorVO autorVO);
	
	public List<TipoDocumentoVO> obterListaTipoDocumento();	
	public void gravarNovoTipoDocumento(TipoDocumentoVO tipoDocumentoVO);
}
