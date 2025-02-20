<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Erro</title>
</head>
<body>
	
	<c:import url="logout-parcial.jsp"/>
	
	
	<c:if test="${empty empresa }">
	
	<h2>Falha no cadastro</h2>
	Infelizmente nehnuma empresa foi cadastrada.
	
	</c:if>

</body>
</html>