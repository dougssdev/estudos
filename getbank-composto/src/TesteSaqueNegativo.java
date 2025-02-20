
public class TesteSaqueNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(1500);
		conta.saca(1600);
		
		
		System.out.println(conta.getSaldo());
		System.out.println(conta.saca(1600));
		
	
	}
}
