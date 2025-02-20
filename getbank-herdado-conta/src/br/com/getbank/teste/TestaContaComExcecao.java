package br.com.getbank.teste;

import br.com.getbank.modelo.Conta;
import br.com.getbank.modelo.ContaCorrente;
import br.com.getbank.modelo.SacaExcpetion;

public class TestaContaComExcecao {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(122, 234);
		conta.deposita(239);
		try {
			conta.saca(100);
		}	catch (SacaExcpetion e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println(conta.getSaldo());
		
	}

}
