
public class Gerente extends Funcionários implements Autenticavel {
	
private Autenticacao autenticador;
	
	public Gerente () {
		this.autenticador = new Autenticacao();
		
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}
	
	public boolean autentica (int senha) {
		return this.autenticador.autentica(senha);
	}
	
	
	public double getBonificacao() {
		System.out.println("chamando todos os Gerentes.");
		return super.getSalario();
		
	}
}
