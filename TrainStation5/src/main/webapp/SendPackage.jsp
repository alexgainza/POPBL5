<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts2 Hibernate Example</title>
<link href="css/SendPackage.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<header>
		<figure>
			<img src="images/Tren_Inicio.png" id="Tren_Inicio">
			<img src="images/Titulo_Inicio.png" id="Titulo_Inicio">
		</figure>
	</header>
	<div>
		<s:select label="Number of packages"
		headerKey="-1" headerValue="Select nº of packages"
		list="numberList"
		name="number"
		value="defaultNumber" />
	</div>
	<s:if test="%{#number==1}">
		<s:form action="add" method="post">
			<s:textfield name="paquete.description" label="Description" />
			<s:textfield name="paquete.origin.stationID" label="Origin Station" />
			<s:textfield name="paquete.destination.stationID"
				label="Destination Station" />
			<s:textfield name="paquete.sendDate" label="Send Date" />
		</s:form>
	</s:if>
	<s:elseif test="%{param.numberList == '2'}">
		<s:form action="add" method="post">
			<s:textfield name="paquete.description" label="Description" />
			<s:textfield name="paquete.origin.stationID" label="Origin Station" />
			<s:textfield name="paquete.destination.stationID"
				label="Destination Station" />
			<s:textfield name="paquete.sendDate" label="Send Date" />
		</s:form>
	</s:elseif>
	<s:elseif test="%{#numberList == '3'}">
		<s:form action="add" method="post">
			<s:textfield name="paquete.description" label="Description" />
			<s:textfield name="paquete.origin.stationID" label="Origin Station" />
			<s:textfield name="paquete.destination.stationID"
				label="Destination Station" />
			<s:textfield name="paquete.sendDate" label="Send Date" />
		</s:form>
	</s:elseif>
	<s:elseif test="%{#numberList == 4}">
		<s:form action="add" method="post">
			<s:textfield name="paquete.description" label="Description" />
			<s:textfield name="paquete.origin.stationID" label="Origin Station" />
			<s:textfield name="paquete.destination.stationID"
				label="Destination Station" />
			<s:textfield name="paquete.sendDate" label="Send Date" />
		</s:form>
	</s:elseif>
	<s:elseif test="%{#numberList == 5}">
		<s:form action="add" method="post">
			<s:textfield name="paquete.description" label="Description" />
			<s:textfield name="paquete.origin.stationID" label="Origin Station" />
			<s:textfield name="paquete.destination.stationID"
				label="Destination Station" />
			<s:textfield name="paquete.sendDate" label="Send Date" />
		</s:form>
	</s:elseif>

	<s:submit value="Add Package" align="center" />

</body>
</html>