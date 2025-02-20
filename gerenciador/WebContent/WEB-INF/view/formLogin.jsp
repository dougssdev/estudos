<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var= "linkEntrada"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
</head>
<body>
	
	<h1>Realize o log-in.</h1>
	
	
	<form action="${linkEntrada}" method="post">
	
	<p>Username: <input type="text" name="login"></p>
	<p>Password:  <input type="password" name="senha"></p>
	<input type="hidden" name="acao" value="Login">
	<input type="submit" >
	
	</form>
</body>
</html>