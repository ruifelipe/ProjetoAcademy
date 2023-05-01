package br.com.academy.Enums;

public enum Status {

	ATIVO("Ativo"),
	INATIVO("Inativo"),
	TRANCADO("Trancado"),
	CANCELADO("Cacelado");
	
	private String status;
	
	private Status(String status) { 
		this.status = status;
	}
	
}
