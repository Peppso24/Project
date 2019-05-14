<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp" />
	<section>
		<h1>${categoria.nome}</h1>
		<p>${categoria.descrizione}</p>
	
		<grid>
			<c:forEach items="${prodotti}" var="prodotto">
				<div col="1/3">
					<a href="Prodotto?id=${prodotto.id}"><img src="img/prodotti/${prodotto.id}.jpg"></a>
				</div>
				<div col="2/3">
					<h3>
						<a href="Prodotto?id=${prodotto.id}">${prodotto.nome}</a>
					</h3>
					<p>${prodotto.descrizione}</p>
					<h4>Prezzo: ${prodotto.prezzoEuro} &euro;</h4>
				</div>
			</c:forEach>
			<c:if test="${empty prodotti}">
				<div col="1">Nessun prodotto nella categoria.</div>
			</c:if>
	</section>
<%@include file="footer.html"%>