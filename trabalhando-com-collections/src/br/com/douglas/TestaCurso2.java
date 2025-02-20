package br.com.douglas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso cursoJava = new Curso("Kevin Durant", "Introdução Java");

		cursoJava.adiciona(new Aulas("Introdução", 11));
		cursoJava.adiciona(new Aulas("Principais Conceitos", 22));
		cursoJava.adiciona(new Aulas("Java na prática", 29));

		System.out.println(cursoJava.getLista());
		
		List<Aulas> aulas = new ArrayList<>(cursoJava.getLista());
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(cursoJava.getTempoTotal());
		System.out.println(cursoJava);
	}

}
