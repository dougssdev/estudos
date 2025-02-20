
public class testandoFluxo {
	public static void main(String[] args) {
		int idade = 14;
		int quantidadeDePessoas = 6;
		
		
		if (idade >= 18) {
			System.out.println("voce e maior de idade, bem vindo a festa");
			
		} else {
			
				if (quantidadeDePessoas > 2) {
					System.out.println("voce nao e de maior, mas pode entrar ja que esta acompanhado!");
				} else {
					System.out.println("uma pena, voce devera ficar de fora.");
				}
		}
	}
}
