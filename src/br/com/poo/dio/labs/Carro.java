package br.com.poo.dio.labs;

import java.math.BigDecimal;

public class Carro {
	
	private String cor;
	private String placa;
	private BigDecimal preco;
	private double capacidadeTanque;
	
	
	public Carro() {
	
	}


	public Carro(String cor, String placa, BigDecimal preco, double capacidadeTanque) {
	
		this.cor = cor;
		this.placa = placa;
		this.preco = preco;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	
	

}
