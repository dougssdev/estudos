package br.com.alura.javaio.testes;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteEncondingEUnicode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "ó";
		System.out.println(s.codePointAt(0));
		
		Charset cs = Charset.defaultCharset();
		System.out.println(cs);
		
		byte[] bytes = s.getBytes("UTF-8");
		System.out.print(bytes.length + " UTF-8, "); 
		String sNovo = new String(bytes, "UTF-8");
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + " UTF-16, "); 
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);
		
		bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + " windows-1252, "); 
		sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);
	}

}
