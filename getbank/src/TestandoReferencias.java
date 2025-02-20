
public class TestandoReferencias {
	public static void main(String[] args) {
		Conta criaPrimeiraConta = new Conta();
		criaPrimeiraConta.saldo = 500;
		
		Conta criaSegundaConta = criaPrimeiraConta;
		criaSegundaConta.saldo += 1000;
		
		System.out.println(criaPrimeiraConta.saldo);
		
		;
	}
}
