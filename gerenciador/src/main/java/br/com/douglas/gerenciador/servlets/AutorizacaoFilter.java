package br.com.douglas.gerenciador.servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebFilter("/entrada")
public class AutorizacaoFilter extends HttpFilter implements Filter {

	@Override
	public void init(FilterConfig config) throws ServletException {
	}
	
	@Override
	public void destroy() {
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("AutorizaçãoFilter");
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String paramAcao = request.getParameter("acao");

		HttpSession session = req.getSession();
		boolean usuarioNaoLogado = (session.getAttribute("usuario") == null);
		boolean acaoEhProtegida = !(paramAcao.equals("Login") || paramAcao.equals("FormLogin"));

		if (usuarioNaoLogado && acaoEhProtegida) {
			res.sendRedirect("entrada?acao=FormLogin");
			return;
		}
		
		chain.doFilter(req, res);

	}

}
