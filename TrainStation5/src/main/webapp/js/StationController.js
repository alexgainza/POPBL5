function loadRails() {
	var rail = [];
	$.getJSON('JSONAction.action', function(data) {
		rail = data.railList;
		// console.log(rail);
		for (var i = 1; i <= rail.length; i++) {
			var box = document.getElementById("rail" + i);
			if (rail[i - 1].occupied == false) {
				box.style.backgroundColor = "green";
			} else {
				box.style.backgroundColor = "red";
			}
		}
	})
}

function loadTrains() {
	var train = [];
	$.getJSON('JSONAction.action', function(data) {
		train = data.trainList;
		for (var i = 1; i <= train.length; i++) {
			var box = document.getElementById("train" + i)
			var textPackages = document.getElementById("textPackages" + i)
			var nPackages = document.getElementById("nPackages" + i)
			var textStation = document.getElementById("textStation" + i)
			var stationId = document.getElementById("stationId" + i)
			var textParking = document.getElementById("textParking" + i)
			var parkingId = document.getElementById("parkingId" + i)
			var textDestination = document.getElementById("textDestination" + i)
			var destinationId = document.getElementById("destinationId" + i)
			var textRail = document.getElementById("textRail" + i)
			var railId = document.getElementById("railId" + i)

			if (train[i - 1].onGoing == false) {
				box.style.backgroundColor = "green";
			} else {
				box.style.backgroundColor = "red";
			}
			if (box.style.backgroundColor == "red") {
				textStation.style.display = "none";
				stationId.style.display = "none";
				textParking.style.display = "none";
				parkingId.style.display = "none";
				textPackages.style.display = "inline-block";
				nPackages.innerHTML = train[i - 1].packageList.length;
				nPackages.style.display = "inline-block";
				textDestination.style.display = "inline-block";
				destinationId.innerHTML = "Station " + train[i - 1].station.description;
				destinationId.style.display = "inline-block";
				textRail.style.display = "inline-block";
				if (train[i - 1].rail == null) {
					railId.innerHTML = "0";
				} else {
					railId.innerHTML = train[i - 1].rail.railID;
				}
				railId.style.display = "inline-block";
			} else {
				textStation.style.display = "inline-block";
				stationId.innerHTML = "Station " + train[i - 1].station.description;
				stationId.style.display = "inline-block";
				textParking.style.display = "none";
				parkingId.style.display = "none";
				/*textParking.style.display = "inline-block";
				for(var j = 1; j <= 4; j++) {
					console.log(train[i - 1].station.parks);
					console.log(train[i-1]);
					if(train[i - 1].station.parks[j].trainID == train[i - 1].trainID) {
						parkingId.innerHTML = j;
					}
				}
				parkingId.style.display = "inline-block";*/
				textPackages.style.display = "none";
				nPackages.style.display = "none";
				textDestination.style.display = "none";
				destinationId.style.display = "none";
				textRail.style.display = "none";
				railId.style.display = "none";
			}
		}
	})
}

function loadStations() {
	var station = [];
	$.getJSON('JSONAction.action', function(data) {
		station = data.stationList;
		for (var i = 1; i <= station.length; i++) {
			var box = document.getElementById("station" + i);
			if (station[i - 1].parks.length == 4) {
				box.style.backgroundColor = "red";
			} else {
				box.style.backgroundColor = "green";
			}
		}
	})
}

window.onLoad = loadRails();
window.onLoad = loadTrains();
window.onLoad = loadStations();