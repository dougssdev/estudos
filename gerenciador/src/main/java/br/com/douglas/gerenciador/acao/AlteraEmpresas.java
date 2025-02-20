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

public class AlteraEmpresas implements Acao {

	public String executar(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		System.out.println("Alterando empresa");

		String parameter = request.getParameter("nome");
		String dataParameter = request.getParameter("data");
		String idParameter = request.getParameter("id");

		Integer id = Integer.valueOf(idParameter);

		Date dataAbertura = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			dataAbertura = sdf.parse(dataParameter);
		} catch (ParseException e) {
			throw new ServletException();
		}

		Banco banco = new Banco();

		Empresa empresa = banco.mostraEmpresa(id);
		empresa.setNome(parameter);
		empresa.setDataAbertura(dataAbertura);

		return "redirect:entrada?acao=Lista";

	}
}
