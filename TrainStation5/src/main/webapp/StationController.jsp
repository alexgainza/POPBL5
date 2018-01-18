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
<body>
	<div>
		<s:form action="logout" method="post" id="buttons">
			<s:submit method="execute" value="Logout" align="center" id="submit" class="btn btn-danger" />
		</s:form>
		<s:form action="stats" method="post" id="buttons">
			<s:submit method="execute" value="See Stats" align="center" id="submit" class="btn btn-primary" />
		</s:form>
	</div>
	<div>
		<div id="mapa">
			<div>
				<h2>Map</h2>
			</div>
			<div id="map"></div>
			<script async defer
				src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCpWAG8QwQnVNYs3Lbm3dMhaD1fRz1QOeA&callback=initMap">
			</script>
		</div>
		<div class="row">
			<div id="rails" class="col-md-3">
				<div>
					<h2>Rails</h2>
				</div>
				<div class="row border">
					<div class="col-md-6">
						<label>Rail 1:</label> <label id="rail1" class="box1"></label><br>
						<label>Rail 2:</label> <label id="rail2" class="box"></label><br>
						<label>Rail	3:</label> <label id="rail3" class="box"></label><br>
						<label>Rail	4:</label> <label id="rail4" class="box"></label><br>
						<label>Rail	5:</label> <label id="rail5" class="box"></label><br>
						<label>Rail	6:</label> <label id="rail6" class="box"></label><br>
					</div>
					<div class="col-md-6">
						<label>Rail 7:</label> <label id="rail7" class="box1"></label><br>
						<label>Rail 8:</label> <label id="rail8" class="box"></label><br>
						<label>Rail 9:</label> <label id="rail9" class="box"></label><br>
						<label>Rail	10:</label> <label id="rail10" class="box"></label><br>
						<label>Rail 11:</label> <label id="rail11" class="box"></label><br>
						<label>Rail 12:</label> <label id="rail12" class="box"></label><br>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div>
					<h2>Trains</h2>
				</div>
				<div class="border">
					<label>Train 1:</label> 
					<label id="train1" class="box1" style="display: inline-block; "></label>
					<label id="textStation1">-Station:</label> <label id="stationId1" class="numbers"></label>
					<label id="textParking1">-Parking:</label> <label id="parkingId1" class="numbers"></label>
					<label id="textPackages1">-Nº of packages:</label> 
					<label id="nPackages1" class="numbers"></label>
					<label id="textDestination1">-Destination:</label>
					<label id="destinationId1" class="numbers"></label> 
					<label id="textRail1">-Rail:</label>
					<label id="railId1" class="numbers"></label><br> 
					<label>Train 2:</label>
					<label id="train2" class="box"></label>
					<label id="textStation2">-Station:</label>
					<label id="stationId2" class="numbers"></label>
					<label id="textParking2">-Parking:</label> 
					<label id="parkingId2" class="numbers"></label>
					<label id="textPackages2">-Nº of packages:</label>
					<label id="nPackages2" class="numbers"></label>
					<label id="textDestination2">-Destination:</label>
					<label id="destinationId2" class="numbers"></label>
					<label id="textRail2">-Rail:</label>
					<label id="railId2" class="numbers"></label><br>
					<label>Train 3:</label>
					<label id="train3" class="box"></label>
					<label id="textStation3">-Station:</label>
					<label id="stationId3" class="numbers"></label>
					<label id="textParking3">-Parking:</label>
					<label id="parkingId3" class="numbers"></label>
					<label id="textPackages3">-Nº of packages:</label>
					<label id="nPackages3" class="numbers"></label>
					<label id="textDestination3">-Destination:</label>
					<label id="destinationId3" class="numbers"></label>
					<label id="textRail3">-Rail:</label>
					<label id="railId3" class="numbers"></label><br>
					<label>Train 4:</label>
					<label id="train4" class="box"></label>
					<label id="textStation4">-Station:</label>
					<label id="stationId4" class="numbers"></label>
					<label id="textParking4">-Parking:</label> 
					<label id="parkingId4" class="numbers"></label>
					<label id="textPackages4">-Nº of packages:</label> 
					<label id="nPackages4" class="numbers"></label>
					<label id="textDestination4">-Destination:</label>
					<label id="destinationId4" class="numbers"></label>
					<label id="textRail4">-Rail:</label>
					<label id="railId4" class="numbers"></label><br>
					<label>Train 5:</label>
					<label id="train5" class="box"></label>
					<label id="textStation5">-Station:</label> 
					<label id="stationId5" class="numbers"></label>
					<label id="textParking5">-Parking:</label> 
					<label id="parkingId5" class="numbers"></label>
					<label id="textPackages5">-Nº of packages:</label> 
					<label id="nPackages5" class="numbers"></label>
					<label id="textDestination5">-Destination:</label>
					<label id="destinationId5" class="numbers"></label>
					<label id="textRail5">-Rail:</label>
					<label id="railId5" class="numbers"></label><br>
					<label>Train 6:</label>
					<label id="train6" class="box"></label>
					<label id="textStation6">-Station:</label>
					<label id="stationId6" class="numbers"></label>
					<label id="textParking6">-Parking:</label>
					<label id="parkingId6" class="numbers"></label>
					<label id="textPackages6">-Nº of packages:</label>
					<label id="nPackages6" class="numbers"></label>
					<label id="textDestination6">-Destination:</label>
					<label id="destinationId6" class="numbers"></label>
					<label id="textRail6">-Rail:</label>
					<label id="railId6" class="numbers"></label><br>
				</div>
			</div>
			<div class="col-md-3">
				<div id="stations">
					<h2>Stations</h2>
				</div>
				<div class="border">
					<div>
						<label>Station 1:</label> 
						<label id="station1" class="box1"></label>
					</div>
					<div>
						<label>Station 2:</label>
						<label id="station2" class="box"></label>
					</div>
					<div>
						<label>Station 3:</label>
						<label id="station3" class="box"></label>
					</div>
					<div>
						<label>Station 4:</label>
						<label id="station4" class="box"></label>
					</div>
					<div>
						<label>Station 5:</label>
						<label id="station5" class="box"></label>
					</div>
					<div>
						<label>Station 6:</label>
						<label id="station6" class="box"></label>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>