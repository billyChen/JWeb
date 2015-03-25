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
			<img src="<c:url value="/include/img/iphone6.jpg" />" alt="iphone6" />
		</div>
		<div id="productSectionFooter">
			<h2>CARACTERISTIQUES</h2>
			<h4>Appareil:</h4>
			<p>
				Nouvel appareil photo iSight 8 mégapixels avec pixels de 1,5 µm <br />
				Mise au point automatique avec Focus Pixels <br />
				Ouverture ƒ/2,2 <br />
				Stabilisation optique de l’image (iPhone 6 Plus uniquement) <br />
				Flash True Tone <br />
				Objectif à cinq éléments <br />
				Filtre infrarouge hybride <br />
				Capteur arrière de luminosité <br />
				Protection de l’objectif en cristal de saphir <br />
				Stabilisation automatique de l’image <br />
				HDR photo automatique <br />
				Détection des visages améliorée <br />
				Réglage de l’expositionPanoramique (jusqu’à 43 mégapixels) <br />
				Mode rafale <br />
				Mise au point par toucher <br />
				Géoréférencement des photos <br />
				Mode minuteur <br />
			</p>
			
			<h4>Batterie: </h4>
			<p>
				Batterie au lithium-ion rechargeable intégrée <br />
				Recharge via USB par l’ordinateur ou l’adaptateur secteur <br />
				Temps de conversation : jusqu’à 14 heures en 3G <br />
				Autonomie en veille : jusqu’à 10 jours (250 heures) <br />
				Navigation sur Internet : jusqu’à 10 heures en 3G, jusqu’à 10 heures en 4G LTE, jusqu’à 11 heures en Wi‑Fi<br />
				Lecture vidéo : jusqu’à 11 heures <br />
				Lecture audio : jusqu’à 50 heures<br />
			</p>
			
			<h4>Capteurs: </h4>
			<p>
				Touch ID <br />
				Baromètre <br />
				Gyroscope à trois axes <br />
				Accéléromètre <br />
				Détecteur de proximité <br />
				Capteur de luminosité ambiante <br />
			</p>
			
			<h4>Ecran: </h4>
			<p>
				Écran Retina HD <br />
				Écran panoramique Multi‑Touch rétroéclairé par LED de 4,7 pouces (diagonale) avec technologie IPS<br />
				Résolution de 1 334 x 750 pixels à 326 ppp <br />
				Contraste 1 400:1 (standard) <br />
			</p>
			
			<p id="prix" style="font-size: 35px">
				799€
			</p>
			</div>
			</section>
	
	<footer>
			<c:import url="/WEB-INF/include/footer.jsp" />
	</footer>
</body>
</html>