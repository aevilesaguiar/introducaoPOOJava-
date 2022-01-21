package br.com.poo.dio.labsexerc01;



public class Carro extends Veiculo {
	

	private String cor;
	private String placa;
	private double capacidadeTanque;
	
	public Carro() {
	
	}


	
	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}


	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}


	
	public double totalValorTanque(double valorCombustivel, double capacidadeTanque) {
		
		return (valorCombustivel*capacidadeTanque);
	}


	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", placa=" + placa + ", capacidadeTanque=" + capacidadeTanque + "]";
	}
	
	

}
