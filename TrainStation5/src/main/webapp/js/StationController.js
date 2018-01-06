var rail = [];

function loadRails() {
	$.getJSON('JSONAction.action', function(data) {
		rail = data.estados;
		console.log(rail);
		for (var i = 1; i <= rail.length; i++) {
			var text = document.getElementById("rail" + i);
			if (rail[i-1] == false) {
				text.style.backgroundColor = "green";
			} else
				text.style.backgroundColor = "red";
		}
	})
}

window.onLoad = loadRails();