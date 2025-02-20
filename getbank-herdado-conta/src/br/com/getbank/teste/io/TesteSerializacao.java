package br.com.getbank.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.getbank.modelo.Cliente;
import br.com.getbank.modelo.ContaCorrente;

public class TesteSerializacao {
	
	public static void main (String[] args) throws FileNotFoundException, IOException {
		
		 Cliente cliente = new Cliente();
	        cliente.setNome("Malaquias");
	        cliente.setProfissao("Decantador");
	        cliente.setCpf("22042209");

	        ContaCorrente cc = new ContaCorrente(222, 333);
	        cc.setTitular(cliente);
	        cc.deposita(222.3);

	        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
	        oos.writeObject(cc);
	        oos.close();

	}
}
