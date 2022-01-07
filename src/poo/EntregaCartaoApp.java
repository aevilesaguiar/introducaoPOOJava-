package poo;

import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartaoApp {

	public static void main(String[] args) {
		
		//dados do endere�o
		Endereco endereco = new  Endereco();
		endereco.setCep("123456789");
		//dados do cliente
		Cliente cliente = new  Cliente();

		
		try {
			cliente.adicionaEndereco(endereco);
			System.out.println("Endere�o adicionado com Sucesso");
		} catch (Exception e) {
			System.err.println("Houve um erro ao adicionar endere�o: "+ e.getMessage());
		}
		
		
		
		
	}

}
