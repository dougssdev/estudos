public class Conta{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta (int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando a conta " 
		+ this.numero);
		total ++;
		
	}
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
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