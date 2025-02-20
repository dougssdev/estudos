
public class primeiraConta {
	public static void main(String[] args) {
		Conta	criaPrimeiraConta = new Conta();
		criaPrimeiraConta.saldo = 200;
		
		//System.out.println(criaPrimeiraConta.saldo);
		
		Conta criaSegundaConta = new Conta();
		criaSegundaConta.saldo = 500;
		
		System.out.println("O saldo disponivel na sua conta e " + criaPrimeiraConta.saldo);
		System.out.println("O saldo disponivel na sua conta e " + criaSegundaConta.saldo);
	}
}
