<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="headerBar">
	<div id="headerBarContent">
		<ul id="menuProduct">
			<li><a href="<c:url value="/Accueil" />"><img src="<c:url value="/include/img/poire_apple.jpg" />" alt="logo_site" width="40" /></a></li>
			<li><a href="<c:url value="/JPhone" />">jPhone</a></li>
			<li><a href="<c:url value="/JPad" />">jPad</a></li>
			<li><a href="<c:url value="/JMac" />">jMac</a></li>
			<li><a href="<c:url value="/JPod" />">jPod</a></li>
			<li><a href="<c:url value="${empty sessionScope.sessionConnected ? '/Connection' : '/Deconnexion' }" />">	<c:choose>
																															<c:when test="${empty sessionScope.sessionConnected }">Connection</c:when>
																															<c:otherwise>Déconnexion</c:otherwise>
																														</c:choose>
				</a>
			</li>
			
			<li>
				<form method="post" action="<c:url value="/Newsletter" />">
					<input type="text" name="newsletter" placeholder="Newsletter" />
					<input type="submit" value="OK" />
				</form>
			</li>
		</ul>
	</div>
</div>
