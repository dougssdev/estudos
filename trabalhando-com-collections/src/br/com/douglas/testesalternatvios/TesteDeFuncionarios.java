package br.com.douglas.testesalternatvios;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteDeFuncionarios {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Abilio", 57);
		Funcionario f2 = new Funcionario ("Evanildo", 34);
		Funcionario f3 = new Funcionario ("Gilson", 42);
		
		Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
		
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		Iterator<Funcionario> iterador = funcionarios.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next().getNome());
		}
	}

}
