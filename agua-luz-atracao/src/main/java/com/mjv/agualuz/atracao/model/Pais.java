package com.mjv.agualuz.atracao.model;

public enum Pais {
	BRASIL("BR"),
	ESTADOS_UNIDOS("US"),
	FRANCA ("FR");
	
	private String sigla;
	private Pais(String sigla) {
		this.sigla = sigla;
	}
	public String getSigla() {
		return sigla;
	}
}
