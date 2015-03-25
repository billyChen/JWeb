<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil</title>
<link type="text/css" rel="stylesheet" href="<c:url value="/include/mainDesign.css"/>" />
<link type="text/css" rel="stylesheet" href="<c:url value="/include/newsletterDesign.css"/>" />
</head>
<body>
	<header>
		<c:import url="/WEB-INF/include/header.jsp" />
	</header>
	
	
	<section>
		<div id="confirmationContent">
			<p>
				<c:choose>
					<c:when test="${error.isEmpty()}">
						Vous vous êtes souscrit à la newsletter.
					</c:when>
					<c:otherwise>
						<c:forEach var="err" items="${error }">
							<c:out value="${err }" />
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</p>
		</div>
	</section>
	<footer>
		<c:import url="/WEB-INF/include/footer.jsp" />
	</footer>
</body>
</html>