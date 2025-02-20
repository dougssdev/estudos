
public class Cliente implements Autenticavel  {
	
	private Autenticacao autenticador;
	
	public Cliente() {
		this.autenticador = new Autenticacao();
		
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}
	
	public boolean autentica (int senha) {
		return this.autenticador.autentica(senha);
	}

}
