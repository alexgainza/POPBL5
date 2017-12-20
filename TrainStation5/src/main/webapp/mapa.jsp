<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>POPBL5</title>
<link href="css/c3.min.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<header>
	<h1>TRAIN STATION 5</h1>
	</header>
	<nav> <a href="Mapa.html">Map</a> <a href="Graficos.html">Graphics</a>
	</nav>
	<hr></hr>
	<div id="mapaSection">
		<h2>Train path</h2>
		<div id="map"></div>
	</div>
	<script>
		var map;
		var imageTrain = "images/train.png";
		var metro = 0;
		var dir = 1;
		var maxMetros = 20;
		var markerTrain;
		var trainPath = [ {
			lat : 43.341624107,
			lng : -1.771914275
		}, {
			lat : 43.339504355,
			lng : -1.783146793
		}, {
			lat : 43.339701517,
			lng : -1.794626691
		}, {
			lat : 43.333534355,
			lng : -1.80233634
		}, {
			lat : 43.331110232,
			lng : -1.814039913
		}, {
			lat : 43.329613803,
			lng : -1.825501183
		}, {
			lat : 43.329793573,
			lng : -1.837356851
		}, {
			lat : 43.330757823,
			lng : -1.848113535
		}, {
			lat : 43.326133701,
			lng : -1.858416533
		}, {
			lat : 43.320115946,
			lng : -1.867587139
		}, {
			lat : 43.314173763,
			lng : -1.876031981
		}, {
			lat : 43.310774278,
			lng : -1.885829412
		}, {
			lat : 43.312903793,
			lng : -1.897322972
		}, {
			lat : 43.317937889,
			lng : -1.906037236
		}, {
			lat : 43.318453848,
			lng : -1.916271711
		}, {
			lat : 43.321243069,
			lng : -1.927400643
		}, {
			lat : 43.319759071,
			lng : -1.939294374
		}, {
			lat : 43.321374644,
			lng : -1.951046591
		}, {
			lat : 43.321952017,
			lng : -1.9631947
		}, {
			lat : 43.32619664,
			lng : -1.972911876
		}, {
			lat : 43.322108135,
			lng : -1.983798841
		} ];
		function initMap() {
			map = new google.maps.Map(document.getElementById('map'), {
				zoom : 12,
				center : {
					lat : 43.320115946,
					lng : -1.876031981
				},
			});
			var greenLine = [ {
				lat : 43.341624107,
				lng : -1.771914275
			}, {
				lat : 43.339504355,
				lng : -1.783146793
			}, {
				lat : 43.339701517,
				lng : -1.794626691
			}, {
				lat : 43.333534355,
				lng : -1.80233634
			}, {
				lat : 43.331110232,
				lng : -1.814039913
			}, {
				lat : 43.329613803,
				lng : -1.825501183
			}, {
				lat : 43.329793573,
				lng : -1.837356851
			}, {
				lat : 43.330757823,
				lng : -1.848113535
			}, {
				lat : 43.326133701,
				lng : -1.858416533
			}, {
				lat : 43.320115946,
				lng : -1.867587139
			}, {
				lat : 43.314173763,
				lng : -1.876031981
			}, {
				lat : 43.310774278,
				lng : -1.885829412
			}, {
				lat : 43.312903793,
				lng : -1.897322972
			}, {
				lat : 43.317937889,
				lng : -1.906037236
			}, {
				lat : 43.318453848,
				lng : -1.916271711
			}, {
				lat : 43.321243069,
				lng : -1.927400643
			}, {
				lat : 43.319759071,
				lng : -1.939294374
			}, {
				lat : 43.321374644,
				lng : -1.951046591
			}, {
				lat : 43.321952017,
				lng : -1.9631947
			}, {
				lat : 43.32619664,
				lng : -1.972911876
			}, {
				lat : 43.322108135,
				lng : -1.983798841
			} ];
			var greenMap = new google.maps.Polyline({
				path : greenLine,
				geodesic : true,
				strokeColor : '#00FF00',
				strokeOpacity : 1.0,
				strokeWeight : 5
			});

			greenMap.setMap(map);

			var LatLng = new Array(6);
			LatLng[0] = {
				lat : 43.341624107,
				lng : -1.771914275,
				belowAvg : 'no'
			};
			LatLng[1] = {
				lat : 43.330757823,
				lng : -1.848113535,
				belowAvg : 'no'
			};
			LatLng[2] = {
				lat : 43.326133701,
				lng : -1.858416533,
				belowAvg : 'yes'
			};
			LatLng[3] = {
				lat : 43.310774278,
				lng : -1.885829412,
				belowAvg : 'yes'
			};
			LatLng[4] = {
				lat : 43.317937889,
				lng : -1.906037236,
				belowAvg : 'no'
			};
			LatLng[5] = {
				lat : 43.322108135,
				lng : -1.983798841,
				belowAvg : 'no'
			};

			var image = 'images/blue-mark.png';
			for (var i = 0; i < LatLng.length; i++) {
				if (LatLng[i].belowAvg == 'yes') {
					var marker = new google.maps.Marker({
						position : LatLng[i],
						map : map,
						title : 'Full',
						icon : image
					});
				} else
					var marker = new google.maps.Marker({
						position : LatLng[i],
						map : map,
						title : 'Not full'
					});
			}
			markerTrain = new google.maps.Marker({
				position : trainPath[metro],
				map : map,
				title : 'Train',
				icon : imageTrain
			});
			//markerTrain.setMap( map );
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
	</script>
	<script async defer
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCpWAG8QwQnVNYs3Lbm3dMhaD1fRz1QOeA&callback=initMap">
		
	</script>
</body>
</html>