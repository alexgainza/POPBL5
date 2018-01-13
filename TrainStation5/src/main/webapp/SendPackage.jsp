<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Send Package</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/SendPackage.css" />
<script type="text/javascript" src="js/SendPackage.js"></script>
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
				<img src="images/español.png" id="idiomas">
			</div>
			<a href="Settings.jsp"> <img src="images/settings.png" id="settings"> </a>
		</figure>
	</header>
	<a href="PHC.jsp" class="btn btn-danger">Exit</a>
	<div id="dropdown">
		<label>Number of packages: </label> <select id="numbersList"
			onchange="getNumberPackages()">
			<option value="0">0</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5" selected="selected">5</option>
		</select>
	</div>
	<s:form id="form1" action="addPackage" method="post">
		<h4>Package 1</h4>
		<s:textfield name="paquete.description" label="Description" />
		<s:textfield name="paquete.origin.stationID" label="Origin Station" />
		<s:textfield name="paquete.destination.stationID"
			label="Destination Station" />
		<s:textfield name="paquete.sendDate" label="Send Date" />
		<s:submit value="Add Package" align="center" class="btn btn-primary"/>
	</s:form>
	<s:form id="form2" action="addPackage" method="post">
		<h4>Package 2</h4>
		<s:textfield name="paquete.description" label="Description" />
		<s:textfield name="paquete.origin.stationID" label="Origin Station" />
		<s:textfield name="paquete.destination.stationID"
			label="Destination Station" />
		<s:textfield name="paquete.sendDate" label="Send Date" />
		<s:submit value="Add Package" align="center" class="btn btn-primary" />
	</s:form>
	<s:form id="form3" action="addPackage" method="post">
		<h4>Package 3</h4>
		<s:textfield name="paquete.description" label="Description" />
		<s:textfield name="paquete.origin.stationID" label="Origin Station" />
		<s:textfield name="paquete.destination.stationID"
			label="Destination Station" />
		<s:textfield name="paquete.sendDate" label="Send Date" />
		<s:submit value="Add Package" align="center" class="btn btn-primary" />
	</s:form>
	<s:form id="form4" action="addPackage" method="post">
		<h4>Package 4</h4>
		<s:textfield name="paquete.description" label="Description" />
		<s:textfield name="paquete.origin.stationID" label="Origin Station" />
		<s:textfield name="paquete.destination.stationID"
			label="Destination Station" />
		<s:textfield name="paquete.sendDate" label="Send Date" />
		<s:submit value="Add Package" align="center" class="btn btn-primary" />
	</s:form>
	<s:form id="form5" action="addPackage" method="post">
		<h4>Package 5</h4>
		<s:textfield name="paquete.description" label="Description" />
		<s:textfield name="paquete.origin.stationID" label="Origin" />
		<s:textfield name="paquete.destination.stationID" label="Destination" />
		<s:textfield name="paquete.sendDate" label="Send Date" />
		<s:submit value="Add Package" align="center" class="btn btn-primary" />
	</s:form>
</body>
</html>