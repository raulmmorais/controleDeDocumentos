package com.controle.vo;

public class OrigemDestinoVO extends BaseVO{
	private static final long serialVersionUID = -19948184371087539L;
	
	public OrigemDestinoVO(Long id, String descricao, String codigo, EnderecoVO enderecoVO) {
		super(id, descricao, codigo);
		this.enderecoVO = enderecoVO;
	}
	public OrigemDestinoVO() {
	}

	private EnderecoVO enderecoVO;
	
	public EnderecoVO getEnderecoVO() {
		return enderecoVO;
	}


	public void setEnderecoVO(EnderecoVO enderecoVO) {
		this.enderecoVO = enderecoVO;
	}

}
