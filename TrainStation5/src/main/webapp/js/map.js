var map;
var imageTrain = "images/train_icon";
var imageStation = 'images/station2.png';

var trainMarkers = [];
var stationMarkers = [];

var trainList = [];
var stationList = [];
var trainPath = [];

function initMap() {
	// create map
	var mapaSection = $('#mapaSection').val();
	var zoom=11;
	if(mapaSection!=null){
		zoom--;
	}
	map = new google.maps.Map(document.getElementById('map'), {
		zoom : zoom,
		center : {
			lat : 43.24187136506322,
			lng : -2.075067753214389
		}
	});
    // style mapa
	map.setOptions({styles: {
	    "elementType": "labels",
	    "stylers": [
	      {
	        "visibility": "off"
	      }
	    ]
	  }});
	// set station markers in the map
	$.getJSON('JSONAction.action', function(data) {
		stationList = data.stationList;
		for (var i = 0; i < stationList.length; i++) {
			// trainPath[i] = {
			// lat : stationList[i].coordinatesLat,
			// lng : stationList[i].coordinatesLng
			// };

			stationMarkers[i] = new google.maps.Marker({
				position : {
					lat : stationList[i].coordinatesLat,
					lng : stationList[i].coordinatesLng
				},
				map : map,
				title : "station " + stationList[i].stationID,
				icon : imageStation
			});
		}
	});

	// set polyline/path points

	trainPath = [ {
		lat : 43.254173,
		lng : -1.8474567
	}, {
		lat : 43.1948592,
		lng : -1.8492325
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
		lat : 43.254173,
		lng : -1.8474567
	} ];

	// set train path line

	var greenMap = new google.maps.Polyline({
		path : trainPath,
		geodesic : true,
		strokeColor : '#0053ff',
		strokeOpacity : 1.0,
		strokeWeight : 2
	});
	greenMap.setMap(map);

	// create train markers
	$.getJSON('JSONAction.action', function(data) {
		trainList = data.trainList;
		for (var i = 0; i < trainList.length; i++) {
			trainMarkers[i] = new google.maps.Marker({
				map : map,
				title : 'Train ' + i,
				icon : imageTrain+(i+1)+".png"
			});
		}
	});
	setTrainPosition()
	setMarkerTrainPositionInterval();
};
function setTrainPosition(){
	var parkList = [];
	for(var i = 0; i < stationList.length;i++){
		parkList[i] = stationList[i].parks.length;
	}
	$.getJSON('JSONAction.action', function(data) {
						trainList = data.trainList;
						for (var i = 0; i < trainList.length; i++) {
							var lat;
							var lng;
							if (trainList[i].onGoing == false) {
								lat = trainList[i].station.coordinatesLat;
								lng = trainList[i].station.coordinatesLng;
								lng-=(0.008*parkList[trainList[i].station.stationID])
								parkList[trainList[i].station.stationID]--;
							} else {
								if (trainList[i].direction == 0) {
									lat = (trainList[i].station.coordinatesLat + trainList[i].station.nextStation.coordinatesLat) / 2;
									lng = (trainList[i].station.coordinatesLng + trainList[i].station.nextStation.coordinatesLng) / 2;
								} else {
									lat = (trainList[i].station.coordinatesLat + trainList[i].station.previousStation.coordinatesLat) / 2;
									lng = (trainList[i].station.coordinatesLng + trainList[i].station.previousStation.coordinatesLng) / 2;
								}
							}
							trainMarkers[i]
									.setPosition(new google.maps.LatLng(
											{
												lat : lat,
												lng : lng
											}));
						}
					});
}
function setMarkerTrainPositionInterval() {
	setInterval(
			function() {
				setTrainPosition();
			}, 1000);
};
function showAllTrainMarkers() {
	for (var i = 0; i < trainMarkers.length; i++) {
		trainMarkers[i].setVisible(true);
	}
}
function setTrainMarkerVisibility(markerId) {
	for (var i = 1; i <= trainMarkers.length; i++) {
		if (i == markerId) {
			trainMarkers[i - 1].setVisible(true);
		} else {
			trainMarkers[i - 1].setVisible(false);
		}
	}
}