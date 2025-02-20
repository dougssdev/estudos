<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/entrada" var= "linkAlteraEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recadastro</title>
</head>
<body>
	
		<c:import url="logout-parcial.jsp"/>
	
	
	<h1>Insira as novas informações da sua empresa.:</h1>
	
	
	<form action="${linkAlteraEmpresa}" method="post">
	
	<p>Nome da Empresa: <input type="text" name="nome" value="${empresa.nome}"></p>
	<p>Data de Abertura:  <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>"></p>
	<input type="hidden" name="id" value="${empresa.id}">
	<input type="hidden" name="acao" value="AlteraEmpresas">
	<input type="submit" >
	
	</form>
</body>
</html>