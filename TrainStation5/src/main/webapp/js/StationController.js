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

window.onLoad = loadRails();

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
			} else {
				textStation.style.display = "inline-block";
				stationId.innerHTML = train[i-1].station.stationID;
				stationId.style.display = "inline-block";
				textParking.style.display = "inline-block";
				parkingId.innerHTML = "0";
				parkingId.style.display = "inline-block";
				textPackages.style.display = "none";
				nPackages.style.display = "none";
			}
		}
	})
}

window.onLoad = loadTrains();