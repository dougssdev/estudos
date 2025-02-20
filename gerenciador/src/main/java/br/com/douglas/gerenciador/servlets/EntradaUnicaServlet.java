package br.com.douglas.gerenciador.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.douglas.gerenciador.acao.Acao;

//@WebServlet("/entrada")
public class EntradaUnicaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");

//AUTORIZACAO FILTER
		
//		HttpSession session = request.getSession();
//		boolean usuarioNaoLogado = (session.getAttribute("usuario") == null);
//		boolean acaoEhProtegida = !(paramAcao.equals("Login") || paramAcao.equals("FormLogin"));
//		
//		if(usuarioNaoLogado && acaoEhProtegida) {
//			response.sendRedirect("entrada?acao=FormLogin");
//			return;
//		}
//		
//		String nomeDaClasse = "br.com.douglas.gerenciador.acao." + paramAcao;
//		
//		String nome;
//		try {
//		    Class<?> classe = Class.forName(nomeDaClasse); 
//		    @SuppressWarnings("deprecation")
//			Acao acao = (Acao) classe.newInstance(); 
//		    nome = acao.executar(request, response);
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//		    throw new ServletException(e);
//		}
//		
//		String[] tipoEEndereco = nome.split(":");
//
//		if (tipoEEndereco[0].equals("forward")) {
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEEndereco[1]);
//			rd.forward(request, response);
//		} else {
//			response.sendRedirect(tipoEEndereco[1]);
//		}

		
//		if (parameter.equals("Lista")) {
//
//			ListaDeEmpresas acao = new ListaDeEmpresas();
//			nome = acao.executar(request, response);
//
//		} else if (parameter.equals("MostraEmpresas")) {
//
//			MostraEmpresas acao = new MostraEmpresas();
//			nome = acao.executar(request, response);
//
//		} else if (parameter.equals("RemoveEmpresas")) {
//
//			RemoveEmpresas acao = new RemoveEmpresas();
//			nome = acao.executar(request, response);
//
//		} else if (parameter.equals("AlteraEmpresas")) {
//
//			AlteraEmpresas acao = new AlteraEmpresas();
//			nome = acao.executar(request, response);
//
//		} else if (parameter.equals("NovaEmpresa")) {
//
//			NovaEmpresa acao = new NovaEmpresa();
//			nome = acao.executar(request, response);
//
//		} else if (parameter.equals("FormEmpresa")) {
//
//			FormEmpresa acao = new FormEmpresa();
//			nome = acao.executar(request, response);
//
//		}

	}
}
