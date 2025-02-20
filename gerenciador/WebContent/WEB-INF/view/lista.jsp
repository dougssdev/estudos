<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page
	import="java.util.List, br.com.douglas.gerenciador.modelos.Empresa"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Empresas</title>
</head>
<body>
	
	<c:import url="logout-parcial.jsp"/>
	
	<h2>Usu�rio Logado.</h2>
	<p>O usu�rio ${usuario.login} est� logado.</p>
	
	<h2>Lista de Empresas:</h2>

	<ul>
		<c:forEach items="${lista}" var="empresa">
			<li>${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/></li>
			 <a href="/gerenciador/entrada?acao=RemoveEmpresas&id=${empresa.id}">remover</a>  <a href="/gerenciador/entrada?acao=MostraEmpresas&id=${empresa.id}">editar</a> 
		</c:forEach>
	</ul>
	
</body>
</html>