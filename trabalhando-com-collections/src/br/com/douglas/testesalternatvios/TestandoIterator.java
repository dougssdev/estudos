package br.com.douglas.testesalternatvios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIterator {

	public static void main(String[] args) {
		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("E");
		letras.add("I");
		letras.add("O");
		letras.add("U");
		
		Iterator<String> it = letras.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
