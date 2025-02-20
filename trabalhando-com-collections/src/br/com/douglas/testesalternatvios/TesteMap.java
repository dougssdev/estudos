package br.com.douglas.testesalternatvios;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap {
	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<>();
		
		mapa.put("Leandro", 37);
		mapa.put("Alessandra", 26);
		mapa.put("Gabriel", 32);
		mapa.put("Angelica", 34);
		mapa.put("Samuel", 23);
		mapa.put("Natália", 29);
		
		Set<String> chaves = mapa.keySet();
		for (String string : chaves) {
			System.out.println(string);
		}
		
		Collection<Integer> valores =  mapa.values();
		for (Integer integer : valores) {
			System.out.println(integer);
		}
		
		Set<Map.Entry<String, Integer>> tudo = mapa.entrySet();
		for (Map.Entry<String, Integer> entry : tudo) {
			System.out.println(entry);
		}
	}
}
