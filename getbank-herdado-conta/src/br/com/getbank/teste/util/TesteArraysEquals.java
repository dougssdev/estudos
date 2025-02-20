package br.com.getbank.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.getbank.modelo.Conta;
import br.com.getbank.modelo.ContaCorrente;

public class TesteArraysEquals {

	public static void main(String[] args) {
		
		LinkedList<Conta> contas = new LinkedList<>();

		//ArrayList<Conta> contas = new ArrayList<>();
		
		Conta cc1 = new ContaCorrente(22, 10);
		contas.add(cc1);
		
		Conta cc2 = new ContaCorrente(22, 9);
		contas.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 9);		
		
		boolean existe = contas.contains(cc3);
		
		System.out.println("Ja existe? " + existe);
		
	}
}
