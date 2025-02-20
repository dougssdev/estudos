package br.com.douglas.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.douglas.gerenciador.modelos.Banco;
import br.com.douglas.gerenciador.modelos.Usuario;

public class Login implements Acao {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		System.out.println("Logando " + login);
		
		Banco banco = new Banco();
		Usuario user = banco.usuarioExiste(login, senha);
		
		if(user != null) {
			System.out.println("Usuário existe.");
			HttpSession session = request.getSession();
			session.setAttribute("usuario", user);
			return "redirect:entrada?acao=Lista";
			
		}
		
		return "redirect:entrada?acao=FormLogin";
	}

}
