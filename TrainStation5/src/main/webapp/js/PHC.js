function loadTrain() {
	var train = [];
	$.getJSON('JSONAction.action', function(data) {
		train = data.trainList;
		console.log(train);

		var stationId = document.getElementById("stationId");
		var textStation = document.getElementById("textStation");
		var railId = document.getElementById("railId");
		var destinationId = document.getElementById("destinationId");
		var textDestination = document.getElementById("textDestination");
		var nPackages = document.getElementById("nPackages");

		if (document.getElementById('train1').checked) {
			if (train[0].onGoing == false) {
				destinationId.style.display = "none";
				textDestination.style.display = "none";
				railId.style.display = "none";
				textRail.style.display = "none";
				stationId.innerHTML = train[0].station.description;
				stationId.style.display = "inline-block";
				textStation.style.display = "inline-block";
			} else {
				stationId.style.display = "none";
				textStation.style.display = "none";
				destinationId.innerHTML = train[0].station.description;
				destinationId.style.display = "inline-block";
				textDestination.style.display = "inline-block";
				railId.style.display = "inline-block";
				textRail.style.display = "inline-block";
				if (train[0].rail == null) {
					railId.innerHTML = "0";
				} else {
					railId.innerHTML = train[0].rail.railID;
				}
			}
			nPackages.innerHTML = train[0].packageList.length
		}

		else if (document.getElementById('train2').checked) {
			if (train[1].onGoing == false) {
				destinationId.style.display = "none";
				textDestination.style.display = "none";
				railId.style.display = "none";
				textRail.style.display = "none";
				stationId.innerHTML = train[1].station.description;
				stationId.style.display = "inline-block";
				textStation.style.display = "inline-block";
			} else {
				stationId.style.display = "none";
				textStation.style.display = "none";
				destinationId.innerHTML = train[1].station.description;
				destinationId.style.display = "inline-block";
				textDestination.style.display = "inline-block";
				railId.style.display = "inline-block";
				textRail.style.display = "inline-block";
				if (train[1].rail == null) {
					railId.innerHTML = "0";
				} else {
					railId.innerHTML = train[1].rail.railID;
				}
			}
			nPackages.innerHTML = train[1].packageList.length
		}

		else if (document.getElementById('train3').checked) {
			if (train[2].onGoing == false) {
				destinationId.style.display = "none";
				textDestination.style.display = "none";
				railId.style.display = "none";
				textRail.style.display = "none";
				stationId.innerHTML = train[2].station.description;
				stationId.style.display = "inline-block";
				textStation.style.display = "inline-block";
			} else {
				stationId.style.display = "none";
				textStation.style.display = "none";
				destinationId.innerHTML = train[2].station.description;
				destinationId.style.display = "inline-block";
				textDestination.style.display = "inline-block";
				railId.style.display = "inline-block";
				textRail.style.display = "inline-block";
				if (train[2].rail == null) {
					railId.innerHTML = "0";
				} else {
					railId.innerHTML = train[2].rail.railID;
				}
			}
			nPackages.innerHTML = train[2].packageList.length
		}

		else if (document.getElementById('train4').checked) {
			if (train[3].onGoing == false) {
				destinationId.style.display = "none";
				textDestination.style.display = "none";
				railId.style.display = "none";
				textRail.style.display = "none";
				stationId.innerHTML = train[3].station.description;
				stationId.style.display = "inline-block";
				textStation.style.display = "inline-block";
			} else {
				stationId.style.display = "none";
				textStation.style.display = "none";
				destinationId.innerHTML = train[3].station.description;
				destinationId.style.display = "inline-block";
				textDestination.style.display = "inline-block";
				railId.style.display = "inline-block";
				textRail.style.display = "inline-block";
				if (train[3].rail == null) {
					railId.innerHTML = "0";
				} else {
					railId.innerHTML = train[3].rail.railID;
				}
			}
			nPackages.innerHTML = train[3].packageList.length
		}

		else if (document.getElementById('train5').checked) {
			if (train[4].onGoing == false) {
				destinationId.style.display = "none";
				textDestination.style.display = "none";
				railId.style.display = "none";
				textRail.style.display = "none";
				stationId.innerHTML = train[4].station.description;
				stationId.style.display = "inline-block";
				textStation.style.display = "inline-block";
			} else {
				stationId.style.display = "none";
				textStation.style.display = "none";
				destinationId.innerHTML = train[4].station.description;
				destinationId.style.display = "inline-block";
				textDestination.style.display = "inline-block";
				railId.style.display = "inline-block";
				textRail.style.display = "inline-block";
				if (train[4].rail == null) {
					railId.innerHTML = "0";
				} else {
					railId.innerHTML = train[4].rail.railID;
				}
			}
			nPackages.innerHTML = train[4].packageList.length
		}

		else if (document.getElementById('train6').checked) {
			if (train[5].onGoing == false) {
				destinationId.style.display = "none";
				textDestination.style.display = "none";
				railId.style.display = "none";
				textRail.style.display = "none";
				stationId.innerHTML = train[5].station.description;
				stationId.style.display = "inline-block";
				textStation.style.display = "inline-block";
			} else {
				stationId.style.display = "none";
				textStation.style.display = "none";
				destinationId.innerHTML = train[5].station.description;
				destinationId.style.display = "inline-block";
				textDestination.style.display = "inline-block";
				railId.style.display = "inline-block";
				textRail.style.display = "inline-block";
				if (train[5].rail == null) {
					railId.innerHTML = "0";
				} else {
					railId.innerHTML = train[5].rail.railID;
				}
			}
			nPackages.innerHTML = train[5].packageList.length
		}

		else if (document.getElementById('trains').checked) {
			destinationId.style.display = "none";
			textDestination.style.display = "inline-block";
			railId.style.display = "none";
			textRail.style.display = "inline-block";
			stationId.style.display = "none";
			textStation.style.display = "inline-block";
			nPackages.style.display = "none";
			textPackages.style.display = "inline-block";
		}
	}),
	setInterval('loadTrain()', 10000);
}