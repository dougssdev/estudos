package br.com.douglas;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso cursoJava = new Curso("Curso Introdu��o Java", "Jorge Alc�ntara");
		List<Aulas> aulas = cursoJava.getLista();
		
		cursoJava.adiciona(new Aulas("Introdu��o", 4));
		cursoJava.adiciona(new Aulas("Principais Conceitos", 9));
		cursoJava.adiciona(new Aulas("Java na pr�tica", 16));
		
		System.out.println(aulas);
		
	}

}
