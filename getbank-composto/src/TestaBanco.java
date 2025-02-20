
public class TestaBanco {
	public static void main(String[] args) {
		Cliente douglas = new Cliente();
		
		douglas.nome = "Douglas Sabino";
		douglas.cpf = "202.202.202-54";
		douglas.profissao = "Programador";
		
		
		Conta contaDouglas = new Conta();
		
		contaDouglas.titular = douglas;
		
		System.out.println(contaDouglas.titular.nome);
		
		
		
	}
}
