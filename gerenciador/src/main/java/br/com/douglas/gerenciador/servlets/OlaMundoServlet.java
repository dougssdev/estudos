package br.com.douglas.gerenciador.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//ola
@WebServlet(urlPatterns = "/ola")
public class OlaMundoServlet extends HttpServlet {


	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<html>"
				+ "<body>"
				+ "Olá, essa é a minha primeira aplicação servlet"
				+ "</body>"
				+ "</html");
		
		
		System.out.println("SERVLET INICIADO");
	}

}
