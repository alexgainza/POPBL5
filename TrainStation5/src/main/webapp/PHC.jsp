<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>PHC</title>

<link rel="stylesheet" href="css/PHC.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/map.js"></script>
<script type="text/javascript" src="js/PHC.js"></script>
</head>
<body class="container">
	<header>
		<figure>
			<img src="images/Tren_Inicio.png" id="Tren_Inicio">
			<img src="images/Titulo_Inicio.png" id="Titulo_Inicio">
		</figure>
	</header>
	<nav>
		<a href="SendPackage.jsp" class="btn btn-success">Send Package</a>
	</nav>
	<div  class="row" id="mapaSection">
		<div class="col-md-6" id="trainInfo">
			<h2>Train information</h2>
			<input id="train1" type="radio" name="train" onclick="setTrainMarkerVisibility(1); loadTrain();" /><label id="textTrain">Train1</label>
			<input id="train2" type="radio" name="train" onclick="setTrainMarkerVisibility(2); loadTrain();"/><label id="textTrain">Train2</label>
			<input id="train3" type="radio" name="train" onclick="setTrainMarkerVisibility(3); loadTrain();"/><label id="textTrain">Train3</label>
			<input id="train4" type="radio" name="train" onclick="setTrainMarkerVisibility(4); loadTrain();"/><label id="textTrain">Train4</label>
			<input id="train5" type="radio" name="train" onclick="setTrainMarkerVisibility(5); loadTrain();"/><label id="textTrain">Train5</label>
			<input id="train6" type="radio" name="train" onclick="setTrainMarkerVisibility(6); loadTrain();"/><label id="textTrain">Train6</label>
			<input id="trains" type="radio" name="train" onclick="showAllTrainMarkers(); loadTrain();" checked="checked"/><label  id="textTrain">All trains</label><br>
			<hr>
			<label id="textStation" class="text">Station:</label><label id="stationId" class="numbers"></label><br>
			<label id="textRail" class="text">Rail track:</label><label id="railId" class="numbers"></label><br>
			<label id="textDestination" class="text">Destination:</label><label id="destinationId" class="numbers"></label><br>
			<label id="textPackages" class="text">Nº of packages:</label><label id="nPackages" class="numbers"></label><br>
		</div>
		<div class="col-md-6">
			<div id="map"></div>
		</div>
	</div>
	<script async defer
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCpWAG8QwQnVNYs3Lbm3dMhaD1fRz1QOeA&callback=initMap">	
	</script>
</body>
</html>