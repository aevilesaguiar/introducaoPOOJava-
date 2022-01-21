package br.com.poo.dio.trabalhandoComCollection;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
	
	public static void main(String[] args) {
		
	//Dada uma lista com 7 notas de um aluno[7,8.5,9.3,5,7,0,3.6] faça:

		List <Double>notas = new ArrayList<Double>();
		notas.add(7.00);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.00);
		notas.add(7.00);
		notas.add(0.00);
		notas.add(3.6);
		System.out.println(notas);
		
		
		System.out.println("Exiba a posição da nota:"+notas.indexOf(5d));
		
		System.out.println("Adicione na lista a nota 8.0 na posição 4:");
		
		
}

}