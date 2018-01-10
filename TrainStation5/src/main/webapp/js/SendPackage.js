function getNumberPackages() {
	var list = document.getElementById("numbersList");
	console.log(list);
	var option = list.options[list.selectedIndex].value;
	var form1 = document.getElementById("form1");
	var form2 = document.getElementById("form2");
	var form3 = document.getElementById("form3");
	var form4 = document.getElementById("form4");
	var form5 = document.getElementById("form5");

	if (option == 1) {
		form1.style.display = "inline-block";
		form2.style.display = "none";
		form3.style.display = "none";
		form4.style.display = "none";
		form5.style.display = "none";
	} else if (option == 2) {
		form1.style.display = "inline-block";
		form2.style.display = "inline-block";
		form3.style.display = "none";
		form4.style.display = "none";
		form5.style.display = "none";
	} else if (option == 3) {
		form1.style.display = "inline-block";
		form2.style.display = "inline-block";
		form3.style.display = "inline-block";
		form4.style.display = "none";
		form5.style.display = "none";
	} else if (option == 4) {
		form1.style.display = "inline-block";
		form2.style.display = "inline-block";
		form3.style.display = "inline-block";
		form4.style.display = "inline-block";
		form5.style.display = "none";
	} else if (option == 5) {
		form1.style.display = "inline-block";
		form2.style.display = "inline-block";
		form3.style.display = "inline-block";
		form4.style.display = "inline-block";
		form5.style.display = "inline-block";
	} else {
		form1.style.display = "none";
		form2.style.display = "none";
		form3.style.display = "none";
		form4.style.display = "none";
		form5.style.display = "none";
	}
}