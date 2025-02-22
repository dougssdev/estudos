import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void liberaReajuste(Funcionario funcionario, Desempenho desempenho) {
	BigDecimal percentual = desempenho.percentualReajuste();
	BigDecimal reajuste = funcionario.getSalario().multiply(percentual).setScale(2, RoundingMode.HALF_UP);
	funcionario.reajustarSalario(reajuste);
	}
}
