<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var= "linkEntrada"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
</head>
<body>
	
		<c:import url="logout-parcial.jsp"/>
	
	
	<h1>Realize o cadastro de sua empresa:</h1>
	
	
	<form action="${linkEntrada}" method="post">
	
	<p>Nome da Empresa: <input type="text" name="nome"></p>
	<p>Data de Abertura:  <input type="text" name="data"></p>
	<input type="hidden" name="acao" value="NovaEmpresa">
	<input type="submit" >
	
	</form>
</body>
</html>