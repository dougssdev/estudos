package br.com.getbank.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {

	public static void main(String[] args) {
		
		int a = 21; 
		
		List<Integer> i = new ArrayList<>();
		i.add(2);//Autoboxing
		i.add(1);
		i.add(6);
		i.add(5);
		
		String a1 = "52";
		String tel = "219";
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.TYPE);
		System.out.println(Integer.SIZE);
		
		
		System.out.println("======================");
		
		Integer maximo = Integer.valueOf(51);
		System.out.println(maximo.intValue());
		
		int numero = Integer.parseInt(a1);
		System.out.println(numero);
		
		Number n = Double.valueOf(13.5);
		System.out.println(n.doubleValue());
		
		Number s = Float.valueOf(120.34f);
		System.out.println(s.floatValue());
		
		int n2 = Integer.parseInt(tel);
		System.out.println(n2);
	}

}
