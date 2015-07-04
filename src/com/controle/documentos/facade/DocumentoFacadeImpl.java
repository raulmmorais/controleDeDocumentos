/**
 * 
 */
package com.controle.documentos.facade;

import java.util.List;

import com.controle.dao.DocumentoDAO;
import com.controle.vo.AutorVO;
import com.controle.vo.NaturezaDocumentoVO;
import com.controle.vo.TipoDocumentoVO;

/**
 * @author ®aul
 *
 */
public class DocumentoFacadeImpl implements DocumentoFacade {
	
	private DocumentoDAO dao = new DocumentoDAO();

	@Override
	public List<NaturezaDocumentoVO> obterListaNaturezaDocumentos() {
		return dao.obterListaNaturezaDocumentos();
	}
	@Override
	public void gravarNovaNaturezaDocumento(NaturezaDocumentoVO naturezaDocmentoVO) {
		dao.gravarNaturezaDocumentoVO(naturezaDocmentoVO);
	}

	@Override
	public List<AutorVO> obterListaAutores() {
		return dao.obterListaAutores();
	}
	@Override
	public void gravarNovoAutor(AutorVO autorVO) {
		dao.gravarNovoAutor(autorVO);
	}
	@Override
	public List<TipoDocumentoVO> obterListaTipoDocumento() {
		return dao.obterListaTipoDocumento();
	}
	@Override
	public void gravarNovoTipoDocumento(TipoDocumentoVO tipoDocumentoVO) {
		dao.gravarNovoTipoDocumento(tipoDocumentoVO);
	}

}
