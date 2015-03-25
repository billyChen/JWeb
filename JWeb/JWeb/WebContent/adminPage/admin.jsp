<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administration</title>
<link type="text/css" rel="stylesheet" href="<c:url value="/include/mainDesign.css"/>" />
<link type="text/css" rel="stylesheet" href="<c:url value="/include/adminDesign.css"/>" />
</head>
<body>
	<header>
		<c:import url="/WEB-INF/include/header.jsp" />
	</header>
	
	<section>
		<div id="adminContent">
			<a href="<c:url value="/adminPage/addNews" />">Ajouter une news</a>
			<a href="<c:url value="/adminPage/Members" /> ">Consulter les membres</a>
		</div>
	</section>
	
	<footer>
			<c:import url="/WEB-INF/include/footer.jsp" />
	</footer>
</body>
</html>