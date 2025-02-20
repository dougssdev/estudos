package br.com.douglas.testesalternatvios;
import java.util.*;


public class ListasDeStrings {

	public static void main(String[] args) {
		List<String> aulas = new ArrayList<String>();
		
		aulas.add("Estudo de Perspectiva");
		aulas.add("Colorização e Ambientação");
		aulas.add("Linhas de ação e Composição");
		
		System.out.println("O primeiro curso da lista é o: " + aulas.get(0));
		
		Collections.sort(aulas);
		
		for (String listaDeAulas : aulas) {
			System.out.println(listaDeAulas);
		}
	}
}
