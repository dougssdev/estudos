package br.com.douglas.gerenciador.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.douglas.gerenciador.modelos.Banco;
import br.com.douglas.gerenciador.modelos.Empresa;

@WebServlet("/empresas")
public class EmpresasService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Empresa> empresas = new Banco().getEmpresas();
		
		String header = request.getHeader("Accept");
		
		System.out.println(header);
		
		if(header.endsWith("xml")) {
			XStream xstream = new XStream();
			xstream.alias("Empresa", Empresa.class);
			String xml = xstream.toXML(empresas); 
			
			
			response.setContentType("application/xml");
			response.getWriter().print(xml);
		} else if (header.endsWith("json")) {
			Gson gson = new Gson();
			String json = gson.toJson(empresas);
			 
			response.setContentType("application/json");
			response.getWriter().print(json);
		} else {
			response.setContentType("application/json");
			response.getWriter().print("{'message':'no content'}");
		}
	
		if(header.contains("xml")) {
			XStream xstream = new XStream();
		    xstream.alias("empresa", Empresa.class);
		    String xml = xstream.toXML(empresas); 

		    response.setContentType("application/xml");
		    response.getWriter().print(xml);
		}
		
	
	}

}
