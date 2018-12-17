<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alterar</title>
</head>
<body>
	<c:import url="../menu.jsp"></c:import>
	<h1>Alterar contato</h1>
	<form action="/agendaspring/contatos/alterar" method="post">
	
		<input type="hidden" readonly="readonly" name="id" value="${contato.id }">
		
		Nome: <input type="text" name="nome" value="${contato.nome }">
		
		Email: <input type="text" name="email" value="${contato.email }">
		
		Endereço: <input type="text" name="endereco" value="${contato.endereco }">
		
		Data de Nascimento: <input type="text" name="dataNascimento" value='<fmt:formatDate pattern="dd/MM/yyyy" value="${contato.dataNascimento.time }"/>'>
		<button type="submit">Alterar</button>
		
	</form>
</body>
</html>