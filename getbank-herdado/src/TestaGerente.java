
public class TestaGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Luca Brazzi");
		gerente.setCpf("1230-412");
		gerente.setSalario(5400.00);
		
		gerente.setSenha(2309);
		boolean autenticou = gerente.autentica(2309);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		System.out.println(autenticou);
		System.out.println(gerente.getBonificacao());
	}
}
