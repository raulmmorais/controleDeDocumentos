package com.controle.vo;

public enum TipoLogradouro {
	AEROPORTO("AER", "Aeroporto"), 
	ALAMEDA("AL", "Alameda"), 
	APARTAMENTO ("AP", "Apartamento"), 
	AVENIDA ("AV", "Avenida"), 
	BECO ("BC", "Beco"), 
	BLOCO ("BL", "Bloco"),
	CAMINHO ("CAM", "Caminho"),
	ESCADINHA ("ESCD", "Escadinha"),
	ESTACAO ("EST", "Esta��o"),
	ESTRADA ("ETR", "Estrada"),
	FAZENDA ("FAZ", "Fazemda"),
	FORTALEZA ("FORT", "Fortaleza"),
	GALERIA ("GL", "Galeria"),
	LADEIRA ("LD", "Ladeira"),
	LARGO ("LGO", "Largo"),
	PRA�A ("P�A", "Pra�a"),
	PARQUE ("PRQ", "Parque"),
	PRAIA ("PR", "Praia"),
	QUADRA ("QD", "Quadra"),
	QUILOMETRO ("KM", "Quil�metro"),
	QUINTA ("QTA", "Quinta"),
	RODOVIA ("ROD", "Rodovia"),
	RUA ("R", "Rua"),
	SUPERQUADRA ("SQD", "Super Quadra"),  
	TRAVESSA ("TRV", "Travessa"),
	VIADUTO ("VD", "Viadulto"),
	VILA("VL", "Vila");
	
	String abreviacao;
	String descricao;
	
	TipoLogradouro(String abreviacao, String descricao){
		this.abreviacao = abreviacao;
		this.descricao = descricao;
	}
}
