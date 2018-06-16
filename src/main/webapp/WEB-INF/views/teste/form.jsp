<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- para estruturas de controle e repetição e setar variáveis -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %> <!-- para formatações -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  <!-- para funções -->	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de cardápio</title>
</head>
<body>
     <c:url var="url" value="/cardapio/save" />
 
	<br />
	<form:form method="post" action="${url}" modelAttribute="cardapio">
	    <form:hidden path="id"/>
		<table>
			
			
			<tr>
				<td>Categoria</td>
				<td><form:checkboxes path="categorias" items="${categoriasSelect}"/></td>
			</tr>
			<tr>
				<td>Nome</td>
				<td><form:input  path="nome"/><form:errors path="nome"/></td>
			</tr>

			<tr>
				<td>Preço</td>
				<td><form:input path="preco"/><form:errors path="preco"/></td>
			</tr>
			
			<tr>
				<td>Data de Validade</td>
				<td><form:input path="dataValidade"/><form:errors path="dataValidade"/></td>
			</tr>

			<tr>
				<td><input type='submit' value='Salvar' /></td>
				<td></td>
			</tr>

		</table>

	</form:form>
</body>
</html>