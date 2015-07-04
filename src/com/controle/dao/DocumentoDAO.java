/**
 * 
 */
package com.controle.dao;

import java.util.ArrayList;
import java.util.List;

import com.controle.vo.AutorVO;
import com.controle.vo.NaturezaDocumentoVO;
import com.controle.vo.TipoDocumentoVO;

/**
 * @author ®aul
 *
 */
public class DocumentoDAO {

	static List<NaturezaDocumentoVO> naturezaDocumentos = listaNatureza();		
	private static List<NaturezaDocumentoVO> listaNatureza(){
		List<NaturezaDocumentoVO> naturezaDocumentos = new ArrayList<NaturezaDocumentoVO>();
		NaturezaDocumentoVO natureza = new NaturezaDocumentoVO(new Long(1),"SOLICITAÇÃO", "SOL" );		
		NaturezaDocumentoVO natureza2 = new NaturezaDocumentoVO(new Long(2), "RESPOSTA", "RES");		
		NaturezaDocumentoVO natureza3 = new NaturezaDocumentoVO(new Long(3), "RECIBO DE DOCUMENTO EMITIDO", "REC");		
		naturezaDocumentos.add(natureza);
		naturezaDocumentos.add(natureza2);
		naturezaDocumentos.add(natureza3);
		return naturezaDocumentos;
	}
	static List<AutorVO> autores = listaAutores();
	private static List<AutorVO> listaAutores(){
		List<AutorVO> autores = new ArrayList<AutorVO>();
		AutorVO autor1 = new AutorVO(new Long(1), "Adriano Melo", "4432178-3");
		AutorVO autor2 = new AutorVO(new Long(2), "Marlene Lima", "4405054-2");
		AutorVO autor3 = new AutorVO(new Long(3), "André Damasceno", "4436858-5");
		autores.add(autor1);
		autores.add(autor2);
		autores.add(autor3);
		return autores;
	}
	static List<TipoDocumentoVO> tipoDocumentos = listaTiposDocumentos();
	private static List<TipoDocumentoVO> listaTiposDocumentos(){
		List<TipoDocumentoVO> tipoDocumentos = new ArrayList<TipoDocumentoVO>();
		TipoDocumentoVO tc1 = new TipoDocumentoVO(new Long(1), "COMUNICAÇÃO INTERNA", "CI");
		TipoDocumentoVO tc2 = new TipoDocumentoVO(new Long(2), "GUIA DE REMESSA", "GR");
		TipoDocumentoVO tc3 = new TipoDocumentoVO(new Long(3), "OFÍCIO", "OF");
		tipoDocumentos.add(tc1);
		tipoDocumentos.add(tc2);
		tipoDocumentos.add(tc3);
		return tipoDocumentos;
	}
	
	public List<NaturezaDocumentoVO> obterListaNaturezaDocumentos() {
		return naturezaDocumentos;
	}

	public void gravarNaturezaDocumentoVO(NaturezaDocumentoVO naturezaDocmentoVO) {
		// TODO Auto-generated method stub
		long id = naturezaDocumentos.size()+1;
		naturezaDocmentoVO.setId(id);
		naturezaDocumentos.add(naturezaDocmentoVO);
		System.out.println(naturezaDocmentoVO.getDescricao());
	}
	public List<AutorVO> obterListaAutores() {
		// TODO Auto-generated method stub
		return autores;
	}
	public void gravarNovoAutor(AutorVO autorVO) {
		// TODO Auto-generated method stub
		long codigo = autores.size()+1;
		autorVO.setId(codigo);
		autores.add(autorVO);
	}
	
	public List<TipoDocumentoVO> obterListaTipoDocumento(){
		return tipoDocumentos;
	}
	public void gravarNovoTipoDocumento(TipoDocumentoVO tipoDocumentoVO){
		long id = tipoDocumentos.size()+1;
		tipoDocumentoVO.setId(id);
		tipoDocumentos.add(tipoDocumentoVO);
	}
}
