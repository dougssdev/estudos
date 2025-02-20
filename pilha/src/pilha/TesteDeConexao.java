package pilha;

public class TesteDeConexao {
	public static void main(String[] args) {
		try(Conexao c = new Conexao()){
			c.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Falha na conexao.");
		}
	}
}
