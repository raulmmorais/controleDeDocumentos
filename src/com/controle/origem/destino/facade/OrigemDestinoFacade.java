package com.controle.origem.destino.facade;

import java.util.List;

import com.controle.vo.OrigemDestinoVO;

public interface OrigemDestinoFacade {
	
	public List<OrigemDestinoVO> obterListaOrigemDestino();
	public void gravarOrigemDestino(OrigemDestinoVO vo);

}
