package br.com.getbank.modelo;

public class SeguroDeVida implements Tributavel  {

	@Override
	public double getValorImposto() {
		return 20;
	}

}
