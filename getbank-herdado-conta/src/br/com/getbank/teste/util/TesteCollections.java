package br.com.getbank.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TesteCollections {

	public static void main(String[] args) {
	List nomes = new ArrayList();
	nomes.add("Douglas");
	nomes.add("Malcolm");
	nomes.add("Marie");
	nomes.add("Amelia");
	nomes.add("Brenda");
	nomes.add("Carlos");
	nomes.add("Eneas");
	
	for (int i = 0; i < nomes.size(); i++) {
		System.out.println(nomes.get(i));
	}
	//
	
	System.out.println("------Lista Embaralhada---------");
	Collections.shuffle(nomes);//embaralha
	
	for (int i = 0; i < nomes.size(); i++) {
		System.out.println(nomes.get(i));
	}
	
	System.out.println("------Lista Invertida----------");
	Collections.reverse(nomes);
	
	for (int i = 0; i < nomes.size(); i++) {
		System.out.println(nomes.get(i));
	}
	
	System.out.println("------Lista Rotacionada----------");
	Collections.rotate(nomes, 1);
	
	for (int i = 0; i < nomes.size(); i++) {
		System.out.println(nomes.get(i));
	
		}
	}
}
