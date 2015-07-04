/**
 * 
 */
package com.controle.origem.destino.facade;

import java.util.List;

import com.controle.dao.OrigemDestinoDAO;
import com.controle.vo.OrigemDestinoVO;

/**
 * @author ®aul
 *
 */
public class OrigemDestinoFacadeImpl implements OrigemDestinoFacade {

	private OrigemDestinoDAO origemDestinoDAO = new OrigemDestinoDAO();
	@Override
	public List<OrigemDestinoVO> obterListaOrigemDestino() {
		return origemDestinoDAO.obterListaOrigemDestino();
	}

	@Override
	public void gravarOrigemDestino(OrigemDestinoVO vo) {
		origemDestinoDAO.gravaOrigemDestino(vo);
	}

}
