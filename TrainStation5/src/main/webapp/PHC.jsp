<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<script>
	
<%@include file="js/jquery-1.7.1.min.js"%>
	
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
			<input type="radio" name="train" /><label>Train1</label>
			<input type="radio" name="train" /><label>Train2</label>
			<input type="radio" name="train" /><label>Train3</label>
			<input type="radio" name="train" /><label>Train4</label>
			<input type="radio" name="train" /><label>Train5</label>
			<input type="radio" name="train" /><label>Train6</label><br>
			<hr>
			<p>Station:</p>
			<p>Rail track:</p>
			<p>Destination:</p>
			<p>Nº of packages:</p>
		</div>
		<div id="map"></div>
	</div>
	<script>
	var map;
	var imageTrain = "images/train.png";
	var imageStation = 'images/blue-mark.png';
	
	var trainMarkers = [];
	var stationMarkers = [];
	
	var trainList = [];
	var stationList = [];
	var trainPath = [];
	
	function initMap() {
		//create map
		map = new google.maps.Map(document.getElementById('map'), {
			zoom : 10,
			center : {
				lat : 43.1077539,
				lng : -2.0800512
			},
		});
		
		//set station markers in the map
		$.getJSON('JSONAction.action', function(data) {
			stationList = data.stationList;
			for (var i = 0; i < stationList.length; i++) {
//					trainPath[i] = {
//						lat : stationList[i].coordinatesLat,
//						lng : stationList[i].coordinatesLng
//						};
				
				stationMarkers[i] = new google.maps.Marker({
					position : {
						lat : stationList[i].coordinatesLat,
						lng : stationList[i].coordinatesLng
					},
					map : map,
					title : "station "+stationList[i].stationID,
					icon : imageStation
				});
			}
		});
		
		// set polyline/path points
		
		trainPath = [
			{lat: 43.254173, lng: -1.8474567},
			{lat: 43.1077539, lng: -2.0800512},
			{lat: 43.1624073, lng: -2.2517858},
			{lat: 43.2876451, lng: -2.2461133},
			{lat: 43.2809633, lng: -2.1672242},
			{lat: 43.2918111, lng: -1.9885133},
			{lat: 43.254173, lng: -1.8474567}
			];
		
		//set train path line
		
		var greenMap = new google.maps.Polyline({
			path : trainPath,
			geodesic : true,
			strokeColor : '#00FF00',
			strokeOpacity : 1.0,
			strokeWeight : 5
		});
		greenMap.setMap(map);
		
		//create train markers
		$.getJSON('JSONActionTrain.action', function(data) {
			trainList = data.trainList;
			for (var i = 0; i < trainList.length; i++) {
				trainMarkers[i] = new google.maps.Marker({
					map : map,
					title : 'Train '+i,
					icon : imageTrain
				});
			}
		});
		setMarkerTrainPosition();
	};

	function setMarkerTrainPosition() {
		setInterval(function() {
			$.getJSON('JSONActionTrain.action', function(data) {
				trainList = data.trainList;
				for (var i = 0; i < trainList.length; i++) {
					var lat; 
					var lng;
					if(trainList[i].onGoing==false){
						lat = trainList[i].station.coordinatesLat;
						lng = trainList[i].station.coordinatesLng;
					}
					else{
						if(trainList[i].direction==0){
							lat = (trainList[i].station.coordinatesLat+trainList[i].station.nextStation.coordinatesLat)/2;
							lng = (trainList[i].station.coordinatesLng+trainList[i].station.nextStation.coordinatesLng)/2;	
						}
						else{
							lat = (trainList[i].station.coordinatesLat+trainList[i].station.previousStation.coordinatesLat)/2;
							lng = (trainList[i].station.coordinatesLng+trainList[i].station.previousStation.coordinatesLng)/2;
						}
					}
					trainMarkers[i]
					.setPosition(new google.maps.LatLng({
						lat : lat,
						lng : lng
					}));
				}
			});
		}, 5000);
	};
	</script>
	<script async defer
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCpWAG8QwQnVNYs3Lbm3dMhaD1fRz1QOeA&callback=initMap">
		
	</script>
</body>
</html>