<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Train Driver</title>
<link rel="stylesheet" href="css/TrainDriver.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/TrainDriver.js"></script>
</head>
<body class="container">
	<header class="row">
		<div class="col-md-5">
			<figure class="row">
				<img src="images/Tren_Inicio.png" class="col-md-5">
				<img src="images/Titulo_Inicio.png" class="col-md-7">
			</figure>
		</div>
		<div class="col-md-7 col-md-offset-7">
			<a href="Settings.jsp" style="float:right; margin-top: 20px;"> <img src="images/settings.png"> </a>
		</div>
	</header>
	<a href="Login.jsp" id="logout" class="btn btn-danger">Log Out</a>
	<div id="chooseTrain" class="row">
		<button id="button" type="button" class="btn btn-default col-md-5" onclick="train1()">Train 1</button>
		<button id="button" type="button" class="btn btn-primary col-md-5" onclick="train2()">Train 2</button>
		<button id="button" type="button" class="btn btn-success col-md-5" onclick="train3()">Train 3</button>
		<button id="button" type="button" class="btn btn-info col-md-5" onclick="train4()">Train 4</button>
		<button id="button" type="button" class="btn btn-warning col-md-5" onclick="train5()">Train 5</button>
		<button id="button" type="button" class="btn btn-danger col-md-5" onclick="train6()">Train 6</button>
	</div>
	<div id="info">
		<div id="packages" class="row">
			<div class="col-md-4 centered">
				<label>Nº of packages in: </label>
				<label id="nPackagesIn" class="numbers"></label>
			</div>
			<div class="col-md-4 centered">
				<label>Nº of packages out: </label>
				<label id="nPackagesOut" class="numbers"></label><br>
			</div>
		</div>
		<div>
			<label>Next Station:</label>
			<label id="stationId" class="numbers"></label><br>
			<label>Destination:</label>
			<label id="destinationId" class="numbers"></label><br>
			<label>Rail track number:</label>
			<label id="railId" class="numbers"></label><br>
			<label>Stop train:</label>
			<label id="stop"></label>
		</div>
	</div>
</body>
</html>