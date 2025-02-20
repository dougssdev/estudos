package br.com.douglas.testesalternatvios;

public class Funcionario {
	private String nome;
	private int idade;
	
	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return idade;
	}
	public void setCpf(int idade) {
		this.idade = idade;
	}
}
