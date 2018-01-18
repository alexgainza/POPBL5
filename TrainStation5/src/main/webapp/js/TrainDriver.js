function train1() {
	var buttons = document.getElementById("chooseTrain");
	buttons.style.display = "none";
	var info = document.getElementById("info");
	info.style.display = "inline-block";
	
	var trains = [];
	var stations = [];
	var j = 0;
	$.getJSON('JSONAction.action', function(data) {
		trains = data.trainList;
		stations = data.stationList;
		console.log(stations.sendPackageList);
		
		var nPackagesIn = document.getElementById("nPackagesIn");
		var nPackagesOut = document.getElementById("nPackagesOut");
		var stationId = document.getElementById("stationId");
		var destinationId = document.getElementById("destinationId");
		var railId = document.getElementById("railId");
		var stop = document.getElementById("stop");
		
		nPackagesOut.innerHTML = trains[0].packageList.length;
		if(trains[0].rail == null) {
			stationId.innerHTML = trains[0].station.nextStation.description;
		}
		else {
			stationId.innerHTML = trains[0].rail.nextStation.description;
		}
		if(trains[0].packageList.length == 0) {
			destinationId.innerHTML = "No destination"
		} else destinationId.innerHTML = trains[0].packageList[0].destination.description;
		
		if(trains[0].rail == null) {
			railId.innerHTML = "0";
		}
		else {
			railId.innerHTML = trains[0].rail.railID;
		}
		if((trains[0].packageList.length == 0) || (trains[0].packageList[0].destination.stationID == trains[0].rail.nextStation.stationID)) {
			stop.style.backgroundColor = "red";
		}
		else {
			stop.style.backgroundColor = "green";
		}
	}),
	setInterval('train1()', 10000);
}

function train2() {
	var buttons = document.getElementById("chooseTrain");
	buttons.style.display = "none";
	var info = document.getElementById("info");
	info.style.display = "block";
	var trains = [];
	var stations = [];
	$.getJSON('JSONAction.action', function(data) {
		trains = data.trainList;
		stations = data.stationList;
		console.log(stations.sendPackageList);
		
		var nPackagesIn = document.getElementById("nPackagesIn");
		var nPackagesOut = document.getElementById("nPackagesOut");
		var stationId = document.getElementById("stationId");
		var destinationId = document.getElementById("destinationId");
		var railId = document.getElementById("railId");
		var stop = document.getElementById("stop");
		
		nPackagesOut.innerHTML = trains[1].packageList.length;
		if(trains[1].rail == null) {
			stationId.innerHTML = trains[1].station.nextStation.description;
		}
		else {
			stationId.innerHTML = trains[1].rail.nextStation.description;
		}
		if(trains[1].packageList.length == 0) {
			destinationId.innerHTML = "No destination"
		} else destinationId.innerHTML = trains[1].packageList[0].destination.description;
		if(trains[1].rail == null) {
			railId.innerHTML = "0";
		}
		else {
			railId.innerHTML = trains[1].rail.railID;
		}
		if((trains[1].packageList.length == 0) || (trains[1].packageList[0].destination.stationID == trains[1].rail.nextStation.stationID)) {
			stop.style.backgroundColor = "red";
		}
		else {
			stop.style.backgroundColor = "green";
		}
	}),
	setInterval('train2()', 10000);
}

function train3() {
	var buttons = document.getElementById("chooseTrain");
	buttons.style.display = "none";
	var info = document.getElementById("info");
	info.style.display = "block";
	var trains = [];
	var stations = [];
	$.getJSON('JSONAction.action', function(data) {
		trains = data.trainList;
		stations = data.stationList;
		console.log(stations.sendPackageList);
		
		var nPackagesIn = document.getElementById("nPackagesIn");
		var nPackagesOut = document.getElementById("nPackagesOut");
		var stationId = document.getElementById("stationId");
		var destinationId = document.getElementById("destinationId");
		var railId = document.getElementById("railId");
		var stop = document.getElementById("stop");
		
		nPackagesOut.innerHTML = trains[2].packageList.length;
		if(trains[2].rail == null) {
			stationId.innerHTML = trains[2].station.nextStation.description;
		}
		else {
			stationId.innerHTML = trains[2].rail.nextStation.description;
		}
		if(trains[2].packageList.length == 0) {
			destinationId.innerHTML = "No destination"
		} else destinationId.innerHTML = trains[2].packageList[0].destination.description;
		if(trains[2].rail == null) {
			railId.innerHTML = "0";
		}
		else {
			railId.innerHTML = trains[2].rail.railID;
		}
		if((trains[2].packageList.length == 0) || (trains[2].packageList[0].destination.stationID == trains[2].rail.nextStation.stationID)) {
			stop.style.backgroundColor = "red";
		}
		else {
			stop.style.backgroundColor = "green";
		}
	}),
	setInterval('train3()', 10000);
}

function train4() {
	var buttons = document.getElementById("chooseTrain");
	buttons.style.display = "none";
	var info = document.getElementById("info");
	info.style.display = "block";
	var trains = [];
	var stations = [];
	$.getJSON('JSONAction.action', function(data) {
		trains = data.trainList;
		stations = data.stationList;
		console.log(stations.sendPackageList);
		
		var nPackagesIn = document.getElementById("nPackagesIn");
		var nPackagesOut = document.getElementById("nPackagesOut");
		var stationId = document.getElementById("stationId");
		var destinationId = document.getElementById("destinationId");
		var railId = document.getElementById("railId");
		var stop = document.getElementById("stop");
		
		nPackagesOut.innerHTML = trains[3].packageList.length;
		if(trains[3].rail == null) {
			stationId.innerHTML = trains[3].station.nextStation.description;
		}
		else {
			stationId.innerHTML = trains[3].rail.nextStation.description;
		}
		if(trains[3].packageList.length == 0) {
			destinationId.innerHTML = "No destination"
		} else destinationId.innerHTML = trains[3].packageList[0].destination.description;
		if(trains[3].rail == null) {
			railId.innerHTML = "0";
		}
		else {
			railId.innerHTML = trains[3].rail.railID;
		}
		if((trains[3].packageList.length == 0) || (trains[3].packageList[0].destination.stationID == trains[3].rail.nextStation.stationID)) {
			stop.style.backgroundColor = "red";
		}
		else {
			stop.style.backgroundColor = "green";
		}
	}),
	setInterval('train4()', 10000);
}

function train5() {
	var buttons = document.getElementById("chooseTrain");
	buttons.style.display = "none";
	var info = document.getElementById("info");
	info.style.display = "block";
	var trains = [];
	var stations = [];
	$.getJSON('JSONAction.action', function(data) {
		trains = data.trainList;
		stations = data.stationList;
		console.log(stations.sendPackageList);
		
		var nPackagesIn = document.getElementById("nPackagesIn");
		var nPackagesOut = document.getElementById("nPackagesOut");
		var stationId = document.getElementById("stationId");
		var destinationId = document.getElementById("destinationId");
		var railId = document.getElementById("railId");
		var stop = document.getElementById("stop");
		
		nPackagesOut.innerHTML = trains[4].packageList.length;
		if(trains[4].rail == null) {
			stationId.innerHTML = trains[4].station.nextStation.description;
		}
		else {
			stationId.innerHTML = trains[4].rail.nextStation.description;
		}
		if(trains[4].packageList.length == 0) {
			destinationId.innerHTML = "No destination"
		} else destinationId.innerHTML = trains[4].packageList[0].destination.description;
		if(trains[4].rail == null) {
			railId.innerHTML = "0";
		}
		else {
			railId.innerHTML = trains[4].rail.railID;
		}
		if((trains[4].packageList.length == 0) || (trains[4].packageList[0].destination.stationID == trains[4].rail.nextStation.stationID)) {
			stop.style.backgroundColor = "red";
		}
		else {
			stop.style.backgroundColor = "green";
		}
	}),
	setInterval('train5()', 10000);
}

function train6() {
	var buttons = document.getElementById("chooseTrain");
	buttons.style.display = "none";
	var info = document.getElementById("info");
	info.style.display = "block";
	var trains = [];
	var stations = [];
	$.getJSON('JSONAction.action', function(data) {
		trains = data.trainList;
		stations = data.stationList;
		console.log(stations.sendPackageList);
		
		var nPackagesIn = document.getElementById("nPackagesIn");
		var nPackagesOut = document.getElementById("nPackagesOut");
		var stationId = document.getElementById("stationId");
		var destinationId = document.getElementById("destinationId");
		var railId = document.getElementById("railId");
		var stop = document.getElementById("stop");
		
		nPackagesOut.innerHTML = trains[5].packageList.length;
		if(trains[5].rail == null) {
			stationId.innerHTML = trains[5].station.nextStation.description;
		}
		else {
			stationId.innerHTML = trains[5].rail.nextStation.description;
		}
		if(trains[5].packageList.length == 0) {
			destinationId.innerHTML = "No destination"
		} else destinationId.innerHTML = trains[5].packageList[0].destination.description;
		if(trains[5].rail == null) {
			railId.innerHTML = "0";
		}
		else {
			railId.innerHTML = trains[5].rail.railID;
		}
		if((trains[5].packageList.length == 0) || (trains[5].packageList[0].destination.stationID == trains[5].rail.nextStation.stationID)) {
			stop.style.backgroundColor = "red";
		}
		else {
			stop.style.backgroundColor = "green";
		}
	}),
	setInterval('train6()', 10000);
}