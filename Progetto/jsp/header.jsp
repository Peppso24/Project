<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%><!DOCTYPE html>
<html>
<head>
<title>TSW store</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
<link href="bare.min.css" rel="stylesheet"><!-- http://www.barecss.com -->
</head>
<body>
	<nav>
		<label>
			<header>
				<a href="."><img src="img/logo.png">TSW store</a>
			</header>
			<ul>
				<li>
					<form action="Ricerca" method="get">
						<input type="text" name="q" placeholder="Ricerca" value="<c:out value="${param.q}" />">
					</form>
				</li>
				<li><a href=".">Home</a></li>
				<li><a>Categorie prodotti</a>
					<menu>
						<c:forEach items="${categorie}" var="categoria">
							<menuitem>
							<a href="Categoria?id=<c:out value="${categoria.id}"/>"><c:out
									value="${categoria.nome}" /></a></menuitem>
						</c:forEach>
					</menu></li>
				<li><a href="Carrello">Carrello</a></li>
			</ul>
		</label>
	</nav>