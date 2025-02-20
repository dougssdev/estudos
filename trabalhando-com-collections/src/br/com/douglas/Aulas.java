package br.com.douglas;

public class Aulas implements Comparable<Aulas> {
	private String nome;
	private int duracao;
	
	public Aulas(String nome, int duracao) {
		this.duracao = duracao;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	
	@Override
	public String toString() {
		return "Aula: " + this.nome + ", " + this.duracao + " minutos.";
	}

	@Override
	public int compareTo(Aulas outraAula) {
		return this.nome.compareTo(outraAula.getNome());
	}
}
