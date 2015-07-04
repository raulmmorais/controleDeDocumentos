package com.controle.dao;

import java.util.ArrayList;
import java.util.List;

import com.controle.vo.OrigemDestinoVO;

public class OrigemDestinoDAO {

	private static List<OrigemDestinoVO> listaOrigemDestino = geraListaTeste();
	
	public void gravaOrigemDestino(OrigemDestinoVO origemDestinoVO){
		//TODO metodo para gravar no banco
		listaOrigemDestino.add(origemDestinoVO);
	}
	public List<OrigemDestinoVO> obterListaOrigemDestino(){
		//TODO metodo para recuperar a lista do banco de dados
		return listaOrigemDestino;
	}
	
	private static List<OrigemDestinoVO> geraListaTeste(){
		List<OrigemDestinoVO> listaTeste = new ArrayList<OrigemDestinoVO>();
		
		
		return listaTeste;
	}
}
