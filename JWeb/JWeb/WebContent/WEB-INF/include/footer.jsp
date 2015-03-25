<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<div id="footerContent">
		<p>Projet JWeb - Java</p>
		<p>2014-2015</p>
		<p>Billy CHEN - Marc Aublin--Monteforte</p>
		<div id="footerSession">
			<c:choose>
				 <c:when test="${sessionScope.sessionConnected.name == 'admin' }" >
					<a href="<c:url value="/adminPage/Admin" />">Espace admin</a>	
				</c:when>
				<c:when test="${!empty sessionScope.sessionConnected }">
					<p>Bonjour ${sessionScope.sessionConnected.name }</p>
				</c:when>
			</c:choose>
		</div>
	</div>
