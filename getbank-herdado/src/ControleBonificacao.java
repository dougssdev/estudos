
public class ControleBonificacao {
	private double soma;
	
	public void registra(Funcionários f) {
		double boni = f.getBonificacao();
		this.soma += boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
