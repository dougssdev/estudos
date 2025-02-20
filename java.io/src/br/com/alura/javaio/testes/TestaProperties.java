package br.com.alura.javaio.testes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestaProperties {

	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		props.setProperty("login", "dgballa");
		props.setProperty("senha", "23330111");
		props.setProperty("endereco", "frankverainne.com");
		
		
		props.store(new FileWriter("conf.properties"), "Testando java properties.");
		
		String login = props.getProperty("login");
		String senha = props.getProperty("senha");
		String endereco = props.getProperty("endereco");
		
		System.out.println(login + ", " + senha + ", " + endereco);
	}

}
