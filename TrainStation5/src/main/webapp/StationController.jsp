<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<script>
	
<%@include file="js/jquery-1.7.1.min.js"%>
<%@include file="js/StationController.js"%>
	
</script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>POPBL5</title>
<link href="css/c3.min.css" rel="stylesheet" type="text/css" />
<link href="css/StationController.css" rel="stylesheet" type="text/css" />
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
	<div>
		<div style="display:inline-block;">
			<h2>Rails</h2>
			<label>Rail 1:</label>
			<label id="rail1" style="display:inline-block; background-color:black; padding:5 20;"></label><br>
			<label>Rail 7:</label>
			<label id="rail7" style="display:inline-block; background-color:black; padding:5 20;"></label><br>
			<label>Rail 2:</label>
			<label id="rail2" style="display:inline-block; background-color:black; padding:5 20;"></label><br>
			<label>Rail 8:</label>
			<label id="rail8" style="display:inline-block; background-color:black; padding:5 20;"></label><br>
			<label>Rail 3:</label>
			<label id="rail3" style="display:inline-block; background-color:black; padding:5 20;"></label><br>
			<label>Rail 9:</label>
			<label id="rail9" style="display:inline-block; background-color:black; padding:5 20;"></label><br>
			<label>Rail 4:</label>
			<label id="rail4" style="display:inline-block; background-color:black; padding:5 20;"></label><br>
			<label>Rail 10:</label>
			<label id="rail10" style="display:inline-block; background-color:black; padding:5 20;"></label><br>
			<label>Rail 5:</label>
			<label id="rail5" style="display:inline-block; background-color:black; padding:5 20;"></label><br>
			<label>Rail 11:</label>
			<label id="rail11" style="display:inline-block; background-color:black; padding:5 20;"></label><br>
			<label>Rail 6:</label>
			<label id="rail6" style="display:inline-block; background-color:black; padding:5 20;"></label><br>
			<label>Rail 12:</label>
			<label id="rail12" style="display:inline-block; background-color:black; padding:5 20;"></label><br>
		</div>
		<div style="display:inline-block;">
			<h2>Trains</h2>
			<label>Train 1:</label>
			<label id="train1" style="display:inline-block; background-color:black; padding:5 20;"></label>
			<label id="textStation1">-Station:</label>
			<label id="stationId1"></label>
			<label id="textParking1">-Parking:</label>
			<label id="parkingId1"></label>
			<label id="textPackages1">-Nº of packages:</label>
			<label id="nPackages1"></label>
			<label id="textDestination1">-Destination:</label>
			<label id="destinationId1"></label>
			<label id="textRail1">-Rail:</label>
			<label id="railId1"></label><br>
			<label>Train 2:</label>
			<label id="train2" style="display:inline-block; background-color:black; padding:5 20;"></label>
			<label id="textStation2">-Station:</label>
			<label id="stationId2"></label>
			<label id="textParking2">-Parking:</label>
			<label id="parkingId2"></label>
			<label id="textPackages2">-Nº of packages:</label>
			<label id="nPackages2"></label>
			<label id="textDestination2">-Destination:</label>
			<label id="destinationId2"></label>
			<label id="textRail2">-Rail:</label>
			<label id="railId2"></label><br>
			<label>Train 3:</label>
			<label id="train3" style="display:inline-block; background-color:black; padding:5 20;"></label>
			<label id="textStation3">-Station:</label>
			<label id="stationId3"></label>
			<label id="textParking3">-Parking:</label>
			<label id="parkingId3"></label>
			<label id="textPackages3">-Nº of packages:</label>
			<label id="nPackages3"></label>
			<label id="textDestination3">-Destination:</label>
			<label id="destinationId3"></label>
			<label id="textRail3">-Rail:</label>
			<label id="railId3"></label><br>
			<label>Train 4:</label>
			<label id="train4" style="display:inline-block; background-color:black; padding:5 20;"></label>
			<label id="textStation4">-Station:</label>
			<label id="stationId4"></label>
			<label id="textParking4">-Parking:</label>
			<label id="parkingId4"></label>
			<label id="textPackages4">-Nº of packages:</label>
			<label id="nPackages4"></label>
			<label id="textDestination4">-Destination:</label>
			<label id="destinationId4"></label>
			<label id="textRail4">-Rail:</label>
			<label id="railId4"></label><br>
			<label>Train 5:</label>
			<label id="train5" style="display:inline-block; background-color:black; padding:5 20;"></label>
			<label id="textStation5">-Station:</label>
			<label id="stationId5"></label>
			<label id="textParking5">-Parking:</label>
			<label id="parkingId5"></label>
			<label id="textPackages5">-Nº of packages:</label>
			<label id="nPackages5"></label>
			<label id="textDestination5">-Destination:</label>
			<label id="destinationId5"></label>
			<label id="textRail5">-Rail:</label>
			<label id="railId5"></label><br>
			<label>Train 6:</label>
			<label id="train6" style="display:inline-block; background-color:black; padding:5 20;"></label>
			<label id="textStation6">-Station:</label>
			<label id="stationId6"></label>
			<label id="textParking6">-Parking:</label>
			<label id="parkingId6"></label>
			<label id="textPackages6">-Nº of packages:</label>
			<label id="nPackages6"></label>
			<label id="textDestination6">-Destination:</label>
			<label id="destinationId6"></label>
			<label id="textRail6">-Rail:</label>
			<label id="railId6"></label><br>
		</div>
	</div>

</body>
</html>