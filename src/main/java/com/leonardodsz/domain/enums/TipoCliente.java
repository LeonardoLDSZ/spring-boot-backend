package com.leonardodsz.domain.enums;

import com.leonardodsz.domain.enums.TipoCliente;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) { //roda sem obj instaciado
		if(cod == null) {
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()) { //percorre PF e PJ
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}