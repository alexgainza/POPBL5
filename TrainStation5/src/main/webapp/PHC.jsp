<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<script>
	<%@include file="js/jquery-1.7.1.min.js"%>
	<%@include file="js/map.js"%>
</script>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>POPBL5</title>
<link href="css/c3.min.css" rel="stylesheet" type="text/css" />
<link href="css/PHC.css" rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
</head>
<body>
	<header>
		<figure>
			<img src="images/Tren_Inicio.png" id="Tren_Inicio">
			<img src="images/Titulo_Inicio.png" id="Titulo_Inicio">
		</figure>
	</header>
	<nav>
		<a href="packages.jsp" id="sendPackage">Send Package</a>
	</nav>
	<div id="mapaSection">
		<div id="trainInfo">
			<h2>Train information</h2>
			<span>Train:</span>
			<input type="radio" name="train" onclick="setTrainMarkerVisibility(1)" /><label>Train1</label>
			<input type="radio" name="train" onclick="setTrainMarkerVisibility(2)"/><label>Train2</label>
			<input type="radio" name="train" onclick="setTrainMarkerVisibility(3)"/><label>Train3</label>
			<input type="radio" name="train" onclick="setTrainMarkerVisibility(4)"/><label>Train4</label>
			<input type="radio" name="train" onclick="setTrainMarkerVisibility(5)"/><label>Train5</label>
			<input type="radio" name="train" onclick="setTrainMarkerVisibility(6)"/><label>Train6</label>
			<input type="radio" name="train" onclick="showAllTrainMarkers()" checked="checked"/><label>All trains</label><br>
			<hr>
			<p>Station:</p>
			<p>Rail track:</p>
			<p>Destination:</p>
			<p>Nº of packages:</p>
		</div>
		<div id="map"></div>
	</div>
	<script async defer
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCpWAG8QwQnVNYs3Lbm3dMhaD1fRz1QOeA&callback=initMap">	
	</script>
</body>
</html>