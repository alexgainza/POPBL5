<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Stats</title>
<link href="css/c3.min.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/Stats.css" />
<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/d3/3.5.17/d3.min.js"></script>
<script src="js/c3.min.js"></script>
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
	<div id="grafico">
		<h1>Nº of packages per day</h1>
		<div id="perDay"></div>
	</div>
	<div id="grafico">
		<h1>Nº of packages per month</h1>
		<div id="perMonth"></div>
	</div>
	<div id="grafico">
		<h1>Nº of packages per year</h1>
		<div id="perYear"></div>
	</div>
	<div id="grafico">
		<h1>Nº of trains stopped in each station</h1>
		<div id="trains"></div>
	</div>
	<script>
		var chart = c3.generate({
			bindto : '#perDay',
			data : {
				x: 'Days',
				columns : [ 
					['Days', 'Monday', 'Tuesday', 'Wendesday', 'Thursday', 'Friday', 'Saturday', 'Sunday'],
					['Packages', 21, 11, 10, 14, 8, 4, 4]
				]
			},
			axis: {
				x: {
					type: 'category'
				}
			}
		});

		var chart = c3.generate({
			bindto : '#perMonth',
			data : {
				x: 'Months',
				columns : [ 
					['Months', 'January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
					[ 'Packages', 84, 46, 23, 35, 54, 41, 39, 48, 37, 47, 51, 90]
				]
			},
			axis: {
				x: {
					type: 'category'
				}
			}
		});

		var chart = c3.generate({
			bindto : '#perYear',
			data : {
				x: 'Years',
				columns : [
					['Years', 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017],
					['Packages', 445, 548, 594, 651, 710, 764, 912, 1215]
				]
			},
			axis: {
				x: {
					type: 'category'
				}
			}
		});
		
		var chart = c3.generate({
			bindto : '#trains',
			data : {
				x: 'Stations',
				columns : [
					['Stations', 'Donostia', 'Zarautz', 'Zumaia', 'Azpeitia', 'Tolosa', 'Oiartzun'],
					['Trains stopped', 12, 8, 6, 2, 9, 5]
				],
				type: 'bar'
			},
			axis: {
				x: {
					type: 'category'
				}
			}
		});
	</script>
</body>
</html>