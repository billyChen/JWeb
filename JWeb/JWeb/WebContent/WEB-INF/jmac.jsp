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
			<img src="<c:url value="/include/img/macbookair.jpg" />" alt="mbAir"/>
		</div>
				<div id="productSectionFooter">
			<h2>CARACTERISTIQUES</h2>
			<h4>Systeme</h4>
			<p>
				Intel Core i5 bicœur à 1,4 GHz <br />
				Turbo Boost jusqu'à 2,7 GHz <br />
				Intel HD Graphics 5000 <br />
				4 Go de mémoire <br />
				128 Go de stockage flash PCIe1 <br />
			</p>
			
			<h4>Batterie: </h4>
			<p>
				Jusqu’à 10 heures d’autonomie pour naviguer sur Internet en Wi‑Fi, regarder des vidéos ou écouter de la musique <br />
				Jusqu’à 9 heures d’autonomie pour naviguer sur Internet via un réseau de données cellulaires <br />
				Recharge via l’adaptateur secteur ou le port USB d’un ordinateur <br />
			</p>
			
			<h4>Ecran: </h4>
			<p>
				Écran Retina HD <br />
				Écran panoramique Multi‑Touch rétroéclairé par LED de 4,7 pouces (diagonale) avec technologie IPS<br />
				Résolution de 1 334 x 750 pixels à 326 ppp <br />
				Contraste 1 400:1 (standard) <br />
			</p>
			
			<p id="prix" style="font-size: 35px">
				999€
			</p>
			</div>
	</section>
	
	<footer>
			<c:import url="/WEB-INF/include/footer.jsp" />
	</footer>
</body>
</html>