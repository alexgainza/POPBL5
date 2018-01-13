<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Station Controller</title>
<link href="css/c3.min.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/StationController.css" />
<script type="text/javascript" src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/StationController.js"></script>
<script type="text/javascript" src="js/map.js"></script>
</head>
<body class="container">
	<header class="row">
		<div class="col-md-5">
			<figure class="row">
				<img src="images/Tren_Inicio.png" class="col-md-5">
				<img src="images/Titulo_Inicio.png" class="col-md-7">
			</figure>
		</div>
		<figure id="derecha" class="col-md-4 col-md-offset-4">
			<div class="row">
				<img src="images/euskera.png" id="idiomas">
				<img src="images/ingles.png" id="idiomas">
				<img src="images/espa�ol.png" id="idiomas">
			</div>
			<a href="Settings.jsp"> <img src="images/settings.png" id="settings"> </a>
		</figure>
	</header>
	<div>
		<a href="Stats.jsp" id="statsButton" class="btn btn-primary">See stats</a>
	</div>
	<div>
		<div style="margin:20 0;">
			<div>
				<h2>Map</h2>
			</div>
			<div id="map" style="height: 60%; width: 100%; margin:0;"></div>
			<script async defer
				src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCpWAG8QwQnVNYs3Lbm3dMhaD1fRz1QOeA&callback=initMap">
			</script>
		</div>
		<div class="row">
			<div class="col-md-3">
				<div>
					<h2>Rails</h2>
				</div>
				<div class="row" style="border: 1px solid black; margin: 0;">
					<div class="col-md-6">
						<label>Rail 1:</label> <label id="rail1"
							style="padding: 10 20; margin-top: 8;"></label><br> <label>Rail
							2:</label> <label id="rail2" style="padding: 10 20;"></label><br> <label>Rail
							3:</label> <label id="rail3" style="padding: 10 20;"></label><br> <label>Rail
							4:</label> <label id="rail4" style="padding: 10 20;"></label><br> <label>Rail
							5:</label> <label id="rail5" style="padding: 10 20;"></label><br> <label>Rail
							6:</label> <label id="rail6" style="padding: 10 20;"></label><br>
					</div>
					<div class="col-md-6">
						<label>Rail 7:</label> <label id="rail7"
							style="padding: 10 20; margin-top: 8;"></label><br> <label>Rail
							8:</label> <label id="rail8" style="padding: 10 20;"></label><br> <label>Rail
							9:</label> <label id="rail9" style="padding: 10 20;"></label><br> <label>Rail
							10:</label> <label id="rail10" style="padding: 10 20;"></label><br>
						<label>Rail 11:</label> <label id="rail11" style="padding: 10 20;"></label><br>
						<label>Rail 12:</label> <label id="rail12" style="padding: 10 20;"></label><br>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div>
					<h2>Trains</h2>
				</div>
				<div style="border: 1px solid black;">
					<label>Train 1:</label> <label id="train1"
						style="display: inline-block; padding: 10 20; margin-top: 8;"></label>
					<label id="textStation1">-Station:</label> <label id="stationId1" class="numbers"></label>
					<label id="textParking1">-Parking:</label> <label id="parkingId1" class="numbers"></label>
					<label id="textPackages1">-N� of packages:</label> <label
						id="nPackages1" class="numbers"></label> <label
						id="textDestination1">-Destination:</label> <label
						id="destinationId1" class="numbers"></label> <label id="textRail1">-Rail:</label>
					<label id="railId1" class="numbers"></label><br> <label>Train
						2:</label> <label id="train2"
						style="padding: 10 20;"></label> <label
						id="textStation2">-Station:</label> <label id="stationId2" class="numbers"></label>
					<label id="textParking2">-Parking:</label> <label id="parkingId2" class="numbers"></label>
					<label id="textPackages2">-N� of packages:</label> <label
						id="nPackages2" class="numbers"></label> <label id="textDestination2">-Destination:</label>
					<label id="destinationId2" class="numbers"></label> <label id="textRail2">-Rail:</label>
					<label id="railId2" class="numbers"></label><br> <label>Train 3:</label> <label
						id="train3" style="padding: 10 20;"></label>
					<label id="textStation3">-Station:</label> <label id="stationId3" class="numbers"></label>
					<label id="textParking3">-Parking:</label> <label id="parkingId3" class="numbers"></label>
					<label id="textPackages3">-N� of packages:</label> <label
						id="nPackages3" class="numbers"></label> <label id="textDestination3">-Destination:</label>
					<label id="destinationId3" class="numbers"></label> <label id="textRail3">-Rail:</label>
					<label id="railId3" class="numbers"></label><br> <label>Train 4:</label> <label
						id="train4" style="padding: 10 20;"></label>
					<label id="textStation4">-Station:</label> <label id="stationId4" class="numbers"></label>
					<label id="textParking4">-Parking:</label> <label id="parkingId4" class="numbers"></label>
					<label id="textPackages4">-N� of packages:</label> <label
						id="nPackages4" class="numbers"></label> <label id="textDestination4">-Destination:</label>
					<label id="destinationId4" class="numbers"></label> <label id="textRail4">-Rail:</label>
					<label id="railId4" class="numbers"></label><br> <label>Train 5:</label> <label
						id="train5" style="padding: 10 20;"></label>
					<label id="textStation5">-Station:</label> <label id="stationId5" class="numbers"></label>
					<label id="textParking5">-Parking:</label> <label id="parkingId5" class="numbers"></label>
					<label id="textPackages5">-N� of packages:</label> <label
						id="nPackages5" class="numbers"></label> <label id="textDestination5">-Destination:</label>
					<label id="destinationId5" class="numbers"></label> <label id="textRail5">-Rail:</label>
					<label id="railId5" class="numbers"></label><br> <label>Train 6:</label> <label
						id="train6" style="padding: 10 20;"></label>
					<label id="textStation6">-Station:</label> <label id="stationId6" class="numbers"></label>
					<label id="textParking6">-Parking:</label> <label id="parkingId6" class="numbers"></label>
					<label id="textPackages6">-N� of packages:</label> <label
						id="nPackages6" class="numbers"></label> <label id="textDestination6">-Destination:</label>
					<label id="destinationId6" class="numbers"></label> <label id="textRail6">-Rail:</label>
					<label id="railId6" class="numbers"></label><br>
				</div>
			</div>
			<div class="col-md-3">
				<div>
					<h2>Stations</h2>
				</div>
				<div style="border: 1px solid black;">
					<div>
						<label>Station 1:</label> <label id="station1"
							style="padding: 10 20; margin-top: 8;"></label>
					</div>
					<div>
						<label>Station 2:</label> <label id="station2"
							style="padding: 10 20;"></label>
					</div>
					<div>
						<label>Station 3:</label> <label id="station3"
							style="padding: 10 20;"></label>
					</div>
					<div>
						<label>Station 4:</label> <label id="station4"
							style="padding: 10 20;"></label>
					</div>
					<div>
						<label>Station 5:</label> <label id="station5"
							style="padding: 10 20;"></label>
					</div>
					<div>
						<label>Station 6:</label> <label id="station6"
							style="padding: 10 20;"></label>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>