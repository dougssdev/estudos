package br.com.getbank.teste;

import br.com.getbank.modelo.*;

public class Teste {
	public static void main(String[] args) {

        Object cc = new ContaCorrente(22, 33);
        Object cp = new ContaPoupanca(33, 22);

        System.out.println(cc);
        System.out.println(cp);
    }
}
