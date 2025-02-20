package br.com.getbank.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public String toString() {
	    return "ContaCorrente, " + super.toString();
	}
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}

	@Override
	public void saca(double valor)	throws SacaExcpetion {
		double valorASacar = valor + 0.3;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
}
