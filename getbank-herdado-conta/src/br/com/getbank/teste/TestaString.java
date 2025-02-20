package br.com.getbank.teste;

public class TestaString {
	public static void main(String[] args) {
		String a = "DeMar DeRozan";
		
		int b = a.length(); 

		int d = a.indexOf("GOAT");
		System.out.println(d);
		
		char c = a.charAt(3);
		System.out.println(c);
		
//		
//		for(int i = 1; i < b; i++) {
//			System.out.println(i);
//		}
		
		//a.replace("s", "S");
		System.out.println(b);
		System.out.println(a);
	}
}
