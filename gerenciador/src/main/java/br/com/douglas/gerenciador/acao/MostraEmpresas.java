package br.com.douglas.gerenciador.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.douglas.gerenciador.modelos.Banco;
import br.com.douglas.gerenciador.modelos.Empresa;

public class MostraEmpresas implements Acao {

	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Mostrando empresa.");
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Banco banco = new Banco();

		Empresa empresa = banco.mostraEmpresa(id);

		System.out.println(empresa.getNome());

		request.setAttribute("empresa", empresa);
		

		return "forward:formAlteraEmpresa.jsp";
	}
}
