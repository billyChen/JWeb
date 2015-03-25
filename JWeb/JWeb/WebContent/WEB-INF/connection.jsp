<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Connection</title>
<link type="text/css" rel="stylesheet" href="<c:url value="/include/mainDesign.css"/>" />
<link type="text/css" rel="stylesheet" href="<c:url value="/include/connexionDesign.css"/>" />
</head>
<body>
	<header>
		<c:import url="/WEB-INF/include/header.jsp" />
	</header>
	
	<section>
		<div class="alignment">
		</div>
		
		<div id="formContent">
			<div id="mainForm">
				<form action="<c:url value="/Connection" />" method="post">
					<label for="inputName">Nom: </label>
					<input id="inputName" type="text" name="name" />
					
					<label for="inputpassword">Mot de passe: </label>
					<input id="inputpassword" type="password" name="password" />
					<input type="submit" />
				</form>
				<a href="<c:url value="/Inscription" />" >Pas encore inscrit ? </a>
			</div>
		</div>
	</section>
	
	<footer>
			<c:import url="/WEB-INF/include/footer.jsp" />
	</footer>
</body>
</html>