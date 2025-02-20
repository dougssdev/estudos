
public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta(201, 4505);
		
		conta.setAgencia(201);
		System.out.println(conta.getAgencia());
		
		Cliente douglas = new Cliente ();
		douglas.setNome("Douglas Sabino");
		
		conta.setTitular(douglas);
		
		System.out.println(conta.getTitular().getNome());
	}
}
