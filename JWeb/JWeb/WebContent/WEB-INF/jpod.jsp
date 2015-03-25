<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JPhone</title>
<link type="text/css" rel="stylesheet" href="<c:url value="/include/mainDesign.css"/>" />
<link type="text/css" rel="stylesheet" href="<c:url value="/include/product.css"/>" />
</head>
<body>
	<header>
		<c:import url="/WEB-INF/include/header.jsp" />
	</header>
	
	<section>
		<div id="productSection">
			<img src="<c:url value="/include/img/ipod.jpg" />" alt="mbAir"/>
		</div>
				<div id="productSectionFooter">
			<h2>CARACTERISTIQUES</h2>
			<h4>Audio</h4>
			<p>	
				AAC (8 à 320 kbit/s), AAC protégé (depuis l’iTunes Store),<br />
				MP3 (8 à 320 kbit/s), MP3 VBR, Audible (formats 2, 3 et 4, Audible Enhanced Audio, AAX et AAX+), <br /> 
				Apple Lossless, AIFF et WAV <br />		
			</p>
			<h4>Batterie: </h4>
			<p>
				Lecture audio <br />
				Jusqu’à 15 heures <br />
			</p>
			
			<h4>Dimensions </h4>
			<p>
				29 × 31,6 × 8,7 mm <br />
				(clip compris) <br />
			</p>
			
			<p id="prix" style="font-size: 35px">
				55€
			</p>
			</div>
	</section>
	
	<footer>
			<c:import url="/WEB-INF/include/footer.jsp" />
	</footer>
</body>
</html>