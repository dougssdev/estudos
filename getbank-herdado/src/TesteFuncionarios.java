
public class TesteFuncionarios {

	public static void main(String[] args) {
		Funcionários douglas = new EditorVideo();
		
		douglas.setNome("Douglas Sabino");
		douglas.setCpf("000000000-00");
		douglas.setSalario(8000.00);
		
		System.out.println(douglas.getNome());
		System.out.println(douglas.getCpf());
		System.out.println(douglas.getSalario());
		System.out.println(douglas.getBonificacao());
	}

}
