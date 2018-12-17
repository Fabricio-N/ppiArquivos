<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="../menu.jsp"></c:import>
	<h1>Adicionar contato</h1>
	<form action="/agendaspring/contatos" method="post">
		Nome: <input type="text" name="nome">
		
		Email: <input type="text" name="email">
		
		Endereço: <input type="text" name="endereco">
		
		Data de Nascimento: <input type="text" name="dataNascimento">
		<button type="submit">Adicionar</button>
		
	</form>
</body>
</html>