package br.com.douglas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso cursoJava = new Curso("Kevin Durant", "Introdu��o Java");

		cursoJava.adiciona(new Aulas("Introdu��o", 11));
		cursoJava.adiciona(new Aulas("Principais Conceitos", 22));
		cursoJava.adiciona(new Aulas("Java na pr�tica", 29));

		System.out.println(cursoJava.getLista());
		
		List<Aulas> aulas = new ArrayList<>(cursoJava.getLista());
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(cursoJava.getTempoTotal());
		System.out.println(cursoJava);
	}

}
