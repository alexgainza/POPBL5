<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Train Driver</title>
<link rel="stylesheet" href="css/TrainDriver.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/TrainDriver.js"></script>
</head>
<body>
	<s:form action="logout" method="post" id="logout">
		<s:submit method="execute" value="Logout" align="center" id="submit" class="btn btn-danger" />
	</s:form>
	<div id="chooseTrain" class="row">
		<button id="button" type="button" class="btn btn-default col-md-5" onclick="train1()">Train 1</button>
		<button id="button" type="button" class="btn btn-primary col-md-5" onclick="train2()">Train 2</button>
		<button id="button" type="button" class="btn btn-success col-md-5" onclick="train3()">Train 3</button>
		<button id="button" type="button" class="btn btn-info col-md-5" onclick="train4()">Train 4</button>
		<button id="button" type="button" class="btn btn-warning col-md-5" onclick="train5()">Train 5</button>
		<button id="button" type="button" class="btn btn-danger col-md-5" onclick="train6()">Train 6</button>
	</div>
	<div id="info">
		<label>Nº of packages to deliver: </label>
		<label id="nPackagesOut" class="numbers"></label><br>
		<label>Next Station:</label>
		<label id="stationId" class="numbers"></label><br>
		<label>Destination:</label>
		<label id="destinationId" class="numbers"></label><br>
		<label>Rail track number:</label>
		<label id="railId" class="numbers"></label><br>
		<label>Stop train:</label>
		<label id="stop"></label>
	</div>
</body>
</html>