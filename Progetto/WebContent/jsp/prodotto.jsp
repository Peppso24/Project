<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp" />
	<section>
		<grid>
	
			<div col="1/3">
				<img src="img/prodotti/${prodotto.id}.jpg">
			</div>
		
			<div col="1/3">
				<h3>
					<a href="#">${prodotto.nome}</a>
				</h3>
				${prodotto.descrizione}
			</div>
		
			<div col="1/3">
				<p>Categorie:
					<c:forEach items="${categorieProdotto}" var="categoria" varStatus="status">
						<a href="Categoria?id=<c:out value="${categoria.id}"/>"><c:out value="${categoria.nome}" /></a><c:if test="${not status.last}">, </c:if>
					</c:forEach>
				</p>
				<h4>Prezzo: ${prodotto.prezzoEuro} &euro;</h4>
				<form action="Carrello" method="post">
					<label>Quantità:</label>
					<select name="addNum">
						<c:forEach begin="1" end="30" varStatus="loop">
							<option value="${loop.index}">${loop.index}</option>
						</c:forEach>
					</select>
					<input type="hidden" name="prodId" value="${prodotto.id}">
					<input type="submit" value="Aggiungi al carrello">
				</form>
			</div>
	
		</grid>
	</section>
<%@include file="footer.html"%>