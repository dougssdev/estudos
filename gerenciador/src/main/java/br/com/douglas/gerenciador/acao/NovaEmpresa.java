package br.com.douglas.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.douglas.gerenciador.modelos.Banco;
import br.com.douglas.gerenciador.modelos.Empresa;

public class NovaEmpresa implements Acao {

	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Iniciando Cadastro.");

		String parameter = request.getParameter("nome");
		String dataParameter = request.getParameter("data");

		Date dataAbertura = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			dataAbertura = sdf.parse(dataParameter);
		} catch (ParseException e) {
			throw new ServletException();
		}

		Empresa empresa = new Empresa();
		empresa.setNome(parameter);
		empresa.setDataAbertura(dataAbertura);

		Banco banco = new Banco();
		banco.adiciona(empresa);

		request.setAttribute("empresa", empresa.getNome());
		return "redirect:entrada?acao=Lista";

	}

}
