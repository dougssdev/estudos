
public class TestandoMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 1065;
		//conta.deposita(500);
		
		//System.out.println(conta.saldo);
		
		//conta.saca(40);
		//System.out.println(conta.saldo);
		
		Conta contaPoderosa = new  Conta();
		contaPoderosa.saldo = 5000;
		
		contaPoderosa.transfere(500, conta);
		System.out.println(contaPoderosa.saldo);
		System.out.println(conta.saldo);
		
	}
}
