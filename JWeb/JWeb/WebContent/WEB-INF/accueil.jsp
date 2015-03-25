<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil</title>
<link type="text/css" rel="stylesheet" href="<c:url value="/include/mainDesign.css"/>" />
<link type="text/css" rel="stylesheet" href="<c:url value="/include/AccueilDesign.css"/>" />
</head>
<body>
	<header>
		<c:import url="/WEB-INF/include/header.jsp" />
	</header>
	
	
	<section>
		<div id="headerSection">
			<div id="headerSection_left">
				<p>TENDANCES</p>
			</div>
		</div>
		<img src="<c:url value="/include/img/iphone6_accueil.jpg" />" alt="photo_accueil" />
		<div id="sectionFooter">
			<p>
				L’iPhone 6 n’est pas seulement plus grand en taille. 
				Il est plus grand en tout.<br />
				Plus large, mais beaucoup plus fin. 
				Plus puissant, mais remarquablement économe en énergie. <br />
				Sa surface lisse métallique épouse à merveille le nouvel écran Retina HD. 
				Redessinée, affûtée, perfectionnée, une nouvelle génération d’iPhone est née.
				Sous son design profilé s’opère une fusion parfaite entre matériel et logiciel.
			</p>				
			<p style="border-bottom: 1px solid gray">CARACTERISTIQUES</p>
			<p>
				Enregistrement vidéo HD 1080p (30 i/s ou 60 i/s) 	<br />
				Flash True Tone Ralenti (120 i/s ou 240 i/s)		<br />
				Accéléré Stabilisation vidéo de qualité cinéma		<br />
				Mise au point automatique continue					<br />
				Prise de photos pendant l’enregistrement vidéo		<br />
				Détection des visages améliorée						<br />	
				Zoom 3x												<br />
				Géoréférencement des vidéos							<br /> <br />
			</p>
			<p>
				Batterie au lithium-ion rechargeable intégrée <br />
				Recharge via USB par l’ordinateur ou l’adaptateur secteur <br />
				Temps de conversation : jusqu’à 14 heures en 3G <br />
				Autonomie en veille : jusqu’à 10 jours (250 heures) <br />
				Navigation sur Internet : jusqu’à 10 heures en 3G, jusqu’à 10 heures en 4G LTE, jusqu’à 11 heures en Wi‑Fi <br />
				Lecture vidéo : jusqu’à 11 heures <br />
				Lecture audio : jusqu’à 50 heures<br />
			</p>
			<div id="prix">
				<p>
					799€
				</p>
			</div>
		</div>
		<div id="news">
			<div id="newsHeader">
				<p>NEWS</p>
			</div>
		</div>
		<div id="newsContent">
			<c:forEach var="item" items="${data}">
				<h2><c:out value="${item.title}" /> - <c:out value="${item.date }" /></h2> 
				<p>
					<c:out value="${item.content }" />
				</p>
			</c:forEach>
		</div>
	</section>
	<footer>
		<c:import url="/WEB-INF/include/footer.jsp" />
	</footer>
</body>
</html>