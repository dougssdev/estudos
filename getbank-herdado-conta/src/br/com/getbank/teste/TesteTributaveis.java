package br.com.getbank.teste;

import br.com.getbank.modelo.CalculadorDeImposto;
import br.com.getbank.modelo.ContaCorrente;
import br.com.getbank.modelo.SeguroDeVida;

public class TesteTributaveis {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(202, 303);
		cc.deposita(100);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(sv);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());
	}
}
