
public class Administrador extends Funcionários implements Autenticavel {

	private Autenticacao autenticador;
	
	public Administrador() {
		this.autenticador = new Autenticacao();
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public boolean autentica (int senha) {
		return this.autenticador.autentica(senha);
	}

	
	@Override
	public double getBonificacao() {
		return 1000;
	}

}
