package br.com.douglas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Curso {
	
	private String instrutor;
	private String nome;
	private List<Aulas> lista = new ArrayList<>();
	private Collection<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso(String instrutor, String nome) {
		this.instrutor = instrutor;
		this.nome = nome;
	}
	
	
	
	public String getNome(){
		return this.nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public void adiciona(Aulas aula) {
		this.lista.add(aula);
		
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
	}
	
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	public Collection<Aluno> getAlunos(){
		return Collections.unmodifiableCollection(alunos);
	}
	
	public List<Aulas> getLista() {
		return Collections.unmodifiableList(lista);
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aulas aulas : lista) {
			tempoTotal += aulas.getDuracao();
		}
		return tempoTotal;
	}
	
	public Aluno buscaMatriculado(Integer numero) {
		return this.matriculaParaAluno.get(numero);
	}
	
	@Override
	public String toString() {
		return "Curso: " + this.nome + " , Tempo Total: " + getTempoTotal() + ", Instrutor: " + this.instrutor ;
	
	}
}
