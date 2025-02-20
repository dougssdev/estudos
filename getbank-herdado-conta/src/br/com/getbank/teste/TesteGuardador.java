package br.com.getbank.teste;

import java.util.ArrayList;

import br.com.getbank.modelo.*;

public class TesteGuardador {
	public static void main(String[] args) {
		ArrayList<Conta> guarda = new ArrayList<>();
		
		Conta cc = new ContaCorrente(21, 2);
		guarda.add(cc);
		
		Conta cc1 = new ContaCorrente(12, 2);
		guarda.add(cc1);
		
		Conta cc2 = new ContaCorrente(3, 5);
		guarda.add(cc2);
		
		Conta cc3 = new ContaCorrente(52, 5);
		guarda.add(cc3);
		
		
		
		int tamanho = guarda.size();
		System.out.println(tamanho);

		Object ref = guarda.get(1);
		System.out.println(ref);
		
	}
}
