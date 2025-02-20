
public class TesteReferencias {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSalario(3000);
		
		Designer d = new Designer();
		d.setSalario(1500);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2100);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(ev);
		controle.registra(d);
		controle.registra(g);
		
		System.out.println("o resultado final e igual a " 
		+ controle.getSoma());
		
	}
}
