package br.com.getbank.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.getbank.modelo.Conta;
import br.com.getbank.modelo.ContaCorrente;


public class TesteGenerics {

	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<>();
		Conta cc1 = new ContaCorrente(73, 32);
		
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(12, 10);
		
		lista.add(cc2);
		
		System.out.println("Tamanho:" + lista.size());
		
		Conta cc3 = new ContaCorrente(21, 36);
		
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(15, 47);
		
		lista.add(cc4);
		
		System.out.println("Tamanho:" + lista.size());
		
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println("-----------");
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		
		
	}

		
}

