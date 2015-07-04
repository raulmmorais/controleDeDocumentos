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
	ESTACAO ("EST", "Estação"),
	ESTRADA ("ETR", "Estrada"),
	FAZENDA ("FAZ", "Fazemda"),
	FORTALEZA ("FORT", "Fortaleza"),
	GALERIA ("GL", "Galeria"),
	LADEIRA ("LD", "Ladeira"),
	LARGO ("LGO", "Largo"),
	PRAÇA ("PÇA", "Praça"),
	PARQUE ("PRQ", "Parque"),
	PRAIA ("PR", "Praia"),
	QUADRA ("QD", "Quadra"),
	QUILOMETRO ("KM", "Quilômetro"),
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
