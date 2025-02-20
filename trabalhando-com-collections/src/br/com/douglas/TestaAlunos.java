package br.com.douglas;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> conjuntoDeAlunos = new HashSet<>();
		
		conjuntoDeAlunos.add("Fabricio Carraro");
		conjuntoDeAlunos.add("Luka Doncic");
		conjuntoDeAlunos.add("Marcelo Lara");
		conjuntoDeAlunos.add("Leo PeeWee");
		conjuntoDeAlunos.add("Lucas Maia");
		
		System.out.println(conjuntoDeAlunos.size());
		
		
//		for (String aluno : conjuntoDeAlunos) {
//			System.out.println(aluno);
//		}
//		
	
		
	}
}
