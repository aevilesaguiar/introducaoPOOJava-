package poo.model;

import javax.management.RuntimeErrorException;

public class Pessoa {
	private static final int TAMANHO_CPF=11;
	private static final int TAMANHO_CNPJ=14;
	
	private enum TipoPessoa{FISICA, JURIDICA}
	private Integer codigo;
	private String nome;
	
	private String documento;
	private TipoPessoa tipo;
	
	public String getDocumento() {
		return documento;
	}
	
	public void setDocumento(String documento) {
		if(this.documento==null || documento.isEmpty()) {//isEmpty() método para verificar se é vazio
			throw new RuntimeException("Documento não pode ser nulo ou vazio");
		}
		if(documento.length()==TAMANHO_CPF) {
			setDocumento(documento,tipo=TipoPessoa.FISICA);
			
		}else if(documento.length()==TAMANHO_CNPJ){
			setDocumento(documento,tipo=TipoPessoa.JURIDICA);
		}else {
			throw new RuntimeException("Documento Inválido para pessoa fisica ou jurídica");
		}
	
	}
	
	private void setDocumento(String documento, TipoPessoa tipo) {
		this.documento = documento;
		this.tipo=tipo;

	}
	

}
