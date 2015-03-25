<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administration</title>
<link type="text/css" rel="stylesheet" href="<c:url value="/include/mainDesign.css"/>" />
<link type="text/css" rel="stylesheet" href="<c:url value="/include/addNewsDesign.css"/>" />
</head>
<body>
	<header>
		<c:import url="/WEB-INF/include/header.jsp" />
	</header>
	
	<section>
		<div class="alignment">
		</div>
		<div id="addNewsContent">
			<form method="post" action="<c:url value="/adminPage/addNews" /> " >
				<label for="title">Titre:</label>
				<input id="title" type="text" name="newsTitle" />
				
				<label for="content">Contenu</label>
				<textarea id="content" name="newsContent" ></textarea>
				<input type="submit" />
			</form>
		</div>
		<div id="msgs">
			<c:forEach var="items" items="${error }">
				<c:out value="${items }" />
			</c:forEach>
		</div>
	</section>
	
	<footer>
			<c:import url="/WEB-INF/include/footer.jsp" />
	</footer>
</body>
</html>