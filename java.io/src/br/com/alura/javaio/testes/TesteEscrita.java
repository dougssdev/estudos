package br.com.alura.javaio.testes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("estrelato.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Sempre sonhei em conseguir");
		bw.newLine();
		bw.newLine();
		bw.write("O tempo e a natureza brandir");
		
		bw.close();
		}		
}
