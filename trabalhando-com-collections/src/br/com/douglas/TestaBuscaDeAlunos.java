package br.com.douglas;

public class TestaBuscaDeAlunos {

	public static void main(String[] args) {
		Curso cursoJava = new Curso("Kevin Durant", "Como Jogar Basquete");
		
		cursoJava.adiciona(new Aulas("Introdução", 11));
		cursoJava.adiciona(new Aulas("Principais Conceitos", 22));
		cursoJava.adiciona(new Aulas("Basquete na prática", 29));

		Aluno a1 = new Aluno("Luka Doncic", 7745);
		Aluno a2 = new Aluno("Ja Morant", 2154);
		Aluno a3 = new Aluno("ZachLavine", 2908);
		Aluno a4 = new Aluno("Michael Jordan", 2345);
		Aluno a5 = new Aluno("Scottie Pippen", 1733);
		
		cursoJava.matricula(a1);
		cursoJava.matricula(a2);
		cursoJava.matricula(a3);
		cursoJava.matricula(a4);
		cursoJava.matricula(a5);
		
		System.out.println("Há algum aluno com a matricula 2345?");
		System.out.println("Sim, é o " + cursoJava.buscaMatriculado(2345));
		
//		System.out.println(cursoJava.estaMatriculado(a5));
//		System.out.println("O a3 é igual ao Lavine? " + a3.equals(a3));
//		System.out.println(a3.hashCode() == a3.hashCode());
	
		
//		cursoJava.getAlunos().forEach(aluno -> {
//			System.out.println(aluno);
//		});
		
	}

}
