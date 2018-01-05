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
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>POPBL5</title>
<link href="css/c3.min.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/PHC.css" />
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
</head>
<body>
	<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
	<script src="js/bootstrap.min.js"></script>
	<header>
		<figure>
			<img src="images/Tren_Inicio.png" id="Tren_Inicio">
			<img src="images/Titulo_Inicio.png" id="Titulo_Inicio">
		</figure>
	</header>
	<nav>
		<a href="SendPackage.jsp" class="btn btn-success">Send Package</a>
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
			<p>N� of packages:</p>
		</div>
		<div id="map"></div>
	</div>
	<script async defer
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCpWAG8QwQnVNYs3Lbm3dMhaD1fRz1QOeA&callback=initMap">	
	</script>
</body>
</html>