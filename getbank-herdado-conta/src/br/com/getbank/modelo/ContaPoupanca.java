package br.com.getbank.modelo;

public class ContaPoupanca extends Conta {

	@Override
	public String toString() {
	    return "ContaPoupanca, " + super.toString();
	}
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
}
