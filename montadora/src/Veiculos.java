
public abstract class Veiculos{
	protected double valor;
	protected double saldo;
	
	
	
	public boolean paga() {
		if (this.saldo >= this.valor) {
		this.saldo -= this.valor;	
		System.out.println("Pagamento confirmado! Saldo restante " + saldo );
		return true;
		}	else {
		System.out.println("Pagamento recusado! Saldo insuficiente");
		return false;
		}
	}	
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
}

