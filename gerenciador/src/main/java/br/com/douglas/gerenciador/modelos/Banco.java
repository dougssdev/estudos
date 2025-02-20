package br.com.douglas.gerenciador.modelos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaDeUsuarios = new ArrayList<>();
	private static Integer id = 1;

	static {
		Empresa empresa = new Empresa();
		empresa.setId(id++);
		empresa.setNome("Los Pollos Hermanos");
		Empresa empresa2 = new Empresa();
		empresa2.setId(id++);
		empresa2.setNome("Aperture Science");
		lista.add(empresa);
		lista.add(empresa2);
		
		Usuario user1 = new Usuario();
		user1.setLogin("douglas");
		user1.setSenha("123456");
		Usuario user2 = new Usuario();
		user2.setLogin("geovana");
		user2.setSenha("123456");

		listaDeUsuarios.add(user1);
		listaDeUsuarios.add(user2);
		
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.id++);
		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {

		Iterator<Empresa> it = lista.iterator();

		while (it.hasNext()) {
			Empresa emp = it.next();

			if (emp.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa mostraEmpresa(Integer id2) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id2) {
				return empresa;
			}
		}
		return null;
	}

	public Usuario usuarioExiste(String login, String senha) {
		for (Usuario user : listaDeUsuarios) {
			if(user.ehIgual(login, senha)) {
				return user;
			}
		}
		return null;
	}
	
	
}
