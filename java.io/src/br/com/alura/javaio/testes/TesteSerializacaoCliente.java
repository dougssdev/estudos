package br.com.alura.javaio.testes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Cliente cliente = new Cliente();
//		cliente.setNome("Nicodemo");
//		cliente.setProfissao("Mago");
//		cliente.setCpf("20202020");
//		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		System.out.println(cliente.getCpf());
	}
}
