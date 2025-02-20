package br.com.getbank.teste.util;

public class TesteArraysPrimitivos {
	public static void main(String[] args) {
		double[] valores = new double[10];
		
		for (double i = 0; i < valores.length; i++) {
			valores[(int)i] = i*i;
		}
		
		for (double i = 0; i < valores.length; i++) {
			System.out.println(valores[(int) i]);
		}
		 
		
	}
}
