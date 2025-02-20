package br.com.alura.javaio.testes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("estrelato.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

//		FileWriter fw = new FileWriter("maispoder.txt");
		
//		PrintStream ps = new PrintStream("maispoder.txt");
		
//		BufferedWriter fw = new BufferedWriter( new FileWriter("maispoder.txt"));
		
		long ini = System.currentTimeMillis();
		
		PrintWriter ps = new PrintWriter("maispoder.txt"); 
		
		ps.println("Hello World");
		ps.println("This is your end");
		ps.println("Tecnology has become the most powerful thing that ever existed");
		ps.println("How do you feel knowing that the heart is going to explode?");
		ps.println();
		ps.println("Rest In Nothing.");
		
		
		ps.close();
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Passaram-se " + (fim-ini) + " milissegundos.");
		}		
}
