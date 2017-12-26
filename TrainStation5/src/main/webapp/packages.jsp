<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts2 Hibernate Example</title>
</head>
<body>

	<h1>Add / Delete / List Package</h1>
	<s:actionerror />

	<s:form action="add" method="post">
		<s:textfield name="paquete.description" label="Description" />
		<s:textfield name="paquete.origin.stationID" label="Origin Station" />
		<s:textfield name="paquete.destination.stationID" label="Destination Station" />
		<s:textfield name="paquete.sendDate" label="Send Date" />

		<s:submit value="Add Package" align="center" />
	</s:form>
	
	<s:form action="mapa" method="post">
		<s:submit value="Ver mapa" align="center" />
	</s:form>
	
	<s:form action="list1" method="post">
		<s:submit value="List packages" align="center" />
	</s:form>

	<h2>Packages in Master</h2>
	<table border="1">
		<tr>
			<th>PackageID</th>
			<th>Tren asignado</th>
			<th>Description</th>
			<th>Package State</th>
			<th>Send Date</th>
			<th>Origin Station</th>
			<th>Destination Station</th>
		</tr>
		<s:iterator value="packageList" var="packages">
			<tr>
				<td><s:property value="packageID" /></td>
				<td><s:property value="asignadoTren" /></td>
				<td><s:property value="description" /></td>
				<td><s:property value="packageState" /></td>
				<td><s:property value="sendDate" /></td>
				<td><s:property value="origin.stationID" /></td>
				<td><s:property value="destination.stationID" /></td>
				<td><a href="delete?id=<s:property value="packageID"/>">delete</a></td>
				<td><a href="update.jsp">edit</a></td>
			</tr>
		</s:iterator>
	</table>
	
	<s:form action="list2" method="post">
		<s:submit value="List trains" align="center" />
	</s:form>
	<table border="1">
		<tr>
			<th>Train</th>
			<th>Station</th>
			<th>Rail</th>
			<th>Direction</th>
			<th>Package List</th>
			<th>OnGoing</th>
		</tr>
		<s:iterator value="trainList" var="trains">
			<tr>
				<td><s:property value="trainID" /></td>
				<td><s:property value="station.stationID" /></td>
				<td><s:property value="rail.railID" /></td>
				<td><s:property value="direction" /></td>
				<td><s:property value="packageList" /></td>
				<td><s:property value="onGoing" /></td>
				<td><a href="delete?id=<s:property value="trainID"/>">delete</a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>