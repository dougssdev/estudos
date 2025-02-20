package br.com.douglas.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.douglas.gerenciador.modelos.Banco;
import br.com.douglas.gerenciador.modelos.Empresa;

public class Lista implements Acao{

	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Listando empresas.");

		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();

		request.setAttribute("lista", lista);
		
		return "forward:lista.jsp";
	}

}
