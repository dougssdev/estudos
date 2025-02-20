package br.com.douglas.gerenciador.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.douglas.gerenciador.modelos.Banco;

public class RemoveEmpresas implements Acao{

	public String executar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		System.out.println("Remove empresa.");
		
		String parameterId = request.getParameter("id");
		Integer id = Integer.valueOf(parameterId);

		Banco banco = new Banco();
		banco.removeEmpresa(id);

		return "redirect:entrada?acao=Lista";
	}
}
