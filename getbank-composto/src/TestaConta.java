
public class TestaConta {
	public static void main(String[] args) {
		Conta contaDaGeovana = new Conta();
		contaDaGeovana.deposita(200);
		
		contaDaGeovana.titular = new Cliente ();
		contaDaGeovana.titular.nome = "Geovana Marcella";
		
		System.out.println(contaDaGeovana.titular.nome);
		
	}
}
