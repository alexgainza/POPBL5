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
		var metro = 0;
		var dir = 1;
		var title = '';
		var maxMetros = 6;
		var markerTrain;
		var trainPath = [ {
			lat : 43.2541730,
			lng : -1.8474567
		}, {
			lat : 43.1077539,
			lng : -2.0800512
		}, {
			lat : 43.1624073,
			lng : -2.2517858
		}, {
			lat : 43.2876451,
			lng : -2.2461133
		}, {
			lat : 43.2809633,
			lng : -2.1672242
		}, {
			lat : 43.2918111,
			lng : -1.9885133
		} ];
		function initMap() {
			map = new google.maps.Map(document.getElementById('map'), {
				zoom : 10,
				center : {
					lat : 43.204875467278846,
					lng : -2.0939938724040985
				},
			});
			var greenLine = [ {
				lat : 43.2541730,
				lng : -1.8474567
			}, {
				lat : 43.1077539,
				lng : -2.0800512
			}, {
				lat : 43.1624073,
				lng : -2.2517858
			}, {
				lat : 43.2876451,
				lng : -2.2461133
			}, {
				lat : 43.2809633,
				lng : -2.1672242
			}, {
				lat : 43.2918111,
				lng : -1.9885133
			}, {
				lat : 43.2541730,
				lng : -1.8474567
			} ];
			var greenMap = new google.maps.Polyline({
				path : greenLine,
				geodesic : true,
				strokeColor : '#00FF00',
				strokeOpacity : 1.0,
				strokeWeight : 5
			});

			greenMap.setMap(map);

			markerTrain = new google.maps.Marker({
				position : trainPath[metro],
				map : map,
				title : 'Train',
				icon : imageTrain
			});
			//getLoad('Train', imageTrain);
			console.log("llamando a colocar");
			getLoad('Station', imageStation);
			moveMarkerTrain(map, markerTrain);
		};

		function moveMarkerTrain(map, markerTrain) {
			setInterval(function() {
				if (metro == maxMetros) {
					dir = 0;
				}
				if (metro == 0) {
					dir = 1;
				}
				if (dir) {
					metro++;
				} else {
					metro--;
				}
				markerTrain
						.setPosition(new google.maps.LatLng(trainPath[metro]));
				//map.panTo( new google.maps.LatLng(trainPath[metro]));
			}, 100);

		};
		function getLoad(title, image) {
			$.getJSON('JSONAction.action', function(data) {
				var stationList = (data.stationList);
				console.log("antes de colocar");
				for (var i = 0; i < stationList.length; i++) {
					console.log("estacion " + i + " latitud: "
							+ stationList[i].coordinatesLat);
					var markerStation = new google.maps.Marker({
						position : {
							lat : stationList[i].coordinatesLat,
							lng : stationList[i].coordinatesLng
						},
						map : map,
						title : title,
						icon : image
					});
				}
				console.log("colocados");
			});
		}
	</script>
	<script async defer
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCpWAG8QwQnVNYs3Lbm3dMhaD1fRz1QOeA&callback=initMap">
		
	</script>
</body>
</html>