package br.com.douglas;

import java.util.Objects;

public class Aluno {
	private String nome;
	private int matricula;
	
	public Aluno(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		if (nome == null) {
			throw new NullPointerException("Esse aluno não existe");
		}
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(matricula, nome);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return matricula == other.matricula && Objects.equals(nome, other.nome);
	}



	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}
	
	@Override
	public String toString() {
		return "Aluno: " + this.nome + ", Matricula: " + this.matricula;
	}
	
}
