package br.com.getbank.teste;

import br.com.getbank.modelo.ContaCorrente;
import br.com.getbank.modelo.ContaPoupanca;
import br.com.getbank.modelo.SacaExcpetion;

public class TestaContas {
	public static void main(String[] args) throws SacaExcpetion {
		ContaCorrente cc = new ContaCorrente(202, 24);
		cc.deposita(50);
//		cc.saca(10);
		
		ContaPoupanca cp = new ContaPoupanca(203, 45);
		cp.deposita (80);
		
		cc.transfere(20, cp);
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}
}