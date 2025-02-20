package br.com.douglas.testesalternatvios;
import java.util.*;


public class ListasDeStrings {

	public static void main(String[] args) {
		List<String> aulas = new ArrayList<String>();
		
		aulas.add("Estudo de Perspectiva");
		aulas.add("Coloriza��o e Ambienta��o");
		aulas.add("Linhas de a��o e Composi��o");
		
		System.out.println("O primeiro curso da lista � o: " + aulas.get(0));
		
		Collections.sort(aulas);
		
		for (String listaDeAulas : aulas) {
			System.out.println(listaDeAulas);
		}
	}
}
