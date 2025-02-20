package br.com.getbank.teste.util;

import br.com.getbank.modelo.*; 

public class TesteArrayReferencias {
	public static void main(String[] args) {
		Conta[] referencias = new Conta[5];
		ContaCorrente cc1 = new ContaCorrente(12, 5);
	
		
		referencias[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(12, 6);
		
		referencias[1] = cc2;
		
		Cliente c = new Cliente();
		c.setNome("Cramunhao");
		System.out.println(c.getNome());
		
		ContaCorrente ref = (ContaCorrente) referencias[0];
	
		System.out.println(cc1.getNumero());
		System.out.println(cc2.getAgencia());
		System.out.println(ref.getTitular());
		
		int[] teste = {23, 541, 42, 53, 45};
		System.out.println(teste[2]);
	}
}
