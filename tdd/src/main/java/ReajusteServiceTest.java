import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class ReajusteServiceTest {

	private ReajusteService service;
	private Funcionario funcionario;
	
	@BeforeEach
	public void inicializar() {
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Amadeo Garcia",LocalDate.now(), new BigDecimal("1000.00"));
	}
	
	@Test
	public void reajusteDeTresPorcentoCasoDesempenhoForADesejar() {
		service.liberaReajuste(funcionario ,Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal ("1030.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteDeQuinzePorcentoCasoDesempenhoForBom() {
		service.liberaReajuste(funcionario ,Desempenho.BOM);
		assertEquals(new BigDecimal ("1150.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteDeVintePorcentoCasoDesempenhoForOtimo() {
		service.liberaReajuste(funcionario ,Desempenho.OTIMO);
		assertEquals(new BigDecimal ("1200.00"), funcionario.getSalario());
		
	}
	
}
