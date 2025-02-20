package br.com.getbank.modelo;

import java.io.Serializable;

/**
 * Cria a classe conta, mãe da maioria das classes
 * @version 1.0
 * @author Douglas
 *
 */
public abstract class Conta implements Comparable<Conta>, Serializable{
	 double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	@Override
	public boolean equals(Object ref) {
		
		Conta c = (Conta) ref; 
		
		if(this.agencia != c.agencia) {
			return false;
		}
		if (this.numero != c.numero) {
			return false;
		}
		return true;
	}
	

	public int compareTo(Conta c) {
		return Double.compare(this.saldo, c.saldo);
		
	}

	
	public String toString() {
		return "Numero: "  + this.numero + ", Agencia: " + this.agencia;
	}
	
	
	
	public Conta (int agencia, int numero) {
//		this.saldo = 100;
		this.agencia = agencia;
		this.numero = numero;
//		System.out.println("estou criando a conta " 
//		+ this.numero);
		total ++;
		
	}
	
	
	public abstract void deposita(double valor);
	 	
	
	/**
	 * Não pode haver saque com valor maior do que o saldo.
	 * @param valor
	 * @throws SacaExcpetion
	 */
	
	public void saca(double valor) throws SacaExcpetion {
		if(this.saldo <= valor) {
			throw new SacaExcpetion("Saldo: " + this.saldo);
		}	
		this.saldo -= valor;
		
	}
	
	public boolean transfere (double valor, Conta destino ) {
		if (this.saldo >= valor) {
			this.saldo -=valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo () {
		return  this.saldo;
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public static int getTotal () {
		return Conta.total;
		
	}
}