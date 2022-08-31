package br.com.fiap.poo1;

public class Cliente {
	private String nome;
	private String cpf;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	@Override
	public String toString() {
		return "Cliente =" + nome + ", \n CPF=" + cpf + ", \n TEL=" + telefone + "]";
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	// construtores 
	public Cliente(String cpf) {
		this.cpf = cpf; 
		
	}
	public Cliente() {
		
	}
	public Cliente (String nome, String telefone, String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}

}
