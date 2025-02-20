package br.com.douglas;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso cursoJava = new Curso("Curso Introdução Java", "Jorge Alcântara");
		List<Aulas> aulas = cursoJava.getLista();
		
		cursoJava.adiciona(new Aulas("Introdução", 4));
		cursoJava.adiciona(new Aulas("Principais Conceitos", 9));
		cursoJava.adiciona(new Aulas("Java na prática", 16));
		
		System.out.println(aulas);
		
	}

}
