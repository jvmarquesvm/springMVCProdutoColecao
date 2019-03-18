<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>SpringBoot - Collections</title>
		<link href="${pageContext.request.contextPath }/resources/css/style.css" rel="stylesheet" type="text/css">
	</head>
	<body>
		<h3>Lista de Produtos</h3>
		<table border="1" cellpadding="2" cellspacing="2">
		<tr>
			<td>Id</td>
			<td>Nome</td>
			<td>Foto</td>
			<td>Preço</td>
			<td>Quantidade</td>
			<td>total</td>
		</tr>
		<c:forEach var="product" items="${products }">
			<tr>
				<td>${product.id }</td>
				<td>${product.name }</td>
				<td>
					<img src="${pageContext.request.contextPath }/resources/images/${product.photo }" />
				</td>
				<td>${product.preco }</td>
				<td>${product.quantidade }</td>
				<td>${product.preco * product.quantidade }</td>
			</tr>
		</c:forEach>
		</table>
	</body>
</html>