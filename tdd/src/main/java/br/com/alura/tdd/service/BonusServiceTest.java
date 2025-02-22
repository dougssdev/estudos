package br.com.alura.tdd.service;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void testaFuncionarioComBonusMaiorQue1000() {
		BonusService service = new BonusService();
		
		 	assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("Fernando", LocalDate.now(), new BigDecimal("25000"))));
		
	}
	
	void bonusDeveriaSer10porCentoDoSalario() {
		BonusService service = new BonusService();
		
		BigDecimal bonus = service.calcularBonus(new Funcionario("Fernando", LocalDate.now(), new BigDecimal("8000")));
		
		assertEquals(new BigDecimal("800.00"), bonus);
	}

	void bonus() {
		BonusService service = new BonusService();
		
		BigDecimal bonus = service.calcularBonus(new Funcionario("Fernando", LocalDate.now(), new BigDecimal("10000")));
		
		assertEquals(new BigDecimal("1000.00"), bonus);
	}

	

}
