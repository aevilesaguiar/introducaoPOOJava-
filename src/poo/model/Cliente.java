package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

	
	private String numCartao;
	
	//objeto complexo
	private List<Endereco> enderecos;


	private List<Endereco> getEnderecos() {
		if(this.enderecos==null) {
			enderecos=new ArrayList<Endereco>();
		}
		return enderecos;
	}


	public void adicionaEndereco(Endereco endereco) {
		if(endereco == null) {
			throw new NullPointerException("Endere�o n�o pode ser nulo");
		}
		if(endereco.getCep()==null) {
			throw new NullPointerException("cep n�o pode ser nulo");
		}
		getEnderecos().add(endereco);
		
	
}
}
