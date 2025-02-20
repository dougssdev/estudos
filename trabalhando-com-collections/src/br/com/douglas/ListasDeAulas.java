package br.com.douglas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListasDeAulas {

	public static void main(String[] args) {
		
		Aulas aula1 = new Aulas("Desenvolvimento Web", 7);
		Aulas aula2 = new Aulas("Algoritmos e Lógica de Programação", 15);
		Aulas aula3 = new Aulas("Maps e HashCodes", 23);
		
		List<Aulas> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		aulas.sort(Comparator.comparing(Aulas::getNome));
		
		for (Aulas aulas2 : aulas) {
			System.out.println(aulas2);

		}
				
		
	}

}
