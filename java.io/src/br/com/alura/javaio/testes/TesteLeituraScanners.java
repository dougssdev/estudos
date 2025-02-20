package br.com.alura.javaio.testes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanners {

	public static void main(String[] args) throws Exception {
		Scanner leitor = new Scanner(new File("contas.csv"));
		
		while(leitor.hasNextLine()) {
			String linha = leitor.nextLine();
//			System.out.println(linha);
			
			Scanner analisador = new Scanner(linha);
			analisador.useLocale(Locale.US);
			analisador.useDelimiter(",");
			
			String tipoDeConta =	analisador.next();
			int agencia =	analisador.nextInt();
			int numero = analisador.nextInt();
			String nome =	analisador.next();
			double saldo =	analisador.nextDouble();
			
			System.out.format("%s - %03d-%05d, %s: %8.2f %n" ,
													tipoDeConta, agencia, numero, nome, saldo);
		
			analisador.close();
		}
		
		leitor.close();
		
	}
}
