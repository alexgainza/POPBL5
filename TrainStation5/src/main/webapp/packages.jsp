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
		<s:textfield name="paquete.packageID" label="PackageID" />
		<s:textfield name="paquete.description" label="description" />
		<s:textfield name="paquete.packageStateID" label="packagestateID" />
		<s:textfield name="paquete.userID" label="userID" />
		<s:textfield name="paquete.trainID" label="trainID" />
		<s:textfield name="paquete.originStationID" label="stationID" />
		<s:textfield name="paquete.destinationStationID" label="stationID" />
		<s:textfield name="paquete.sendDate" label="sendDate" />

		<s:submit value="Add Package" align="center" />
	</s:form>

	<s:form action="list1" method="post">
		<s:submit value="List packages" align="center" />
	</s:form>

	<h2>Packages in Master</h2>
	<table border="1">
		<tr>
			<th>packageID</th>
			<th>description</th>
			<th>packageStateID</th>
			<th>userID</th>
			<th>trainID</th>
			<th>originStationID</th>
			<th>destinationStationID</th>
			<th>sendDate</th>
		</tr>
		<s:iterator value="packageList" var="packages">
			<tr>
				<td><s:property value="packageID" /></td>
				<td><s:property value="description" /></td>
				<td><s:property value="packageStateID" /></td>
				<td><s:property value="userID" /></td>
				<td><s:property value="trainID" /></td>
				<td><s:property value="originStationID" /></td>
				<td><s:property value="destinationStationID" /></td>
				<td><s:property value="sendDate" /></td>
				<td><a href="delete?id=<s:property value="packageID"/>">delete</a></td>
			</tr>
		</s:iterator>
	</table>
	
	<s:form action="list2" method="post">
		<s:submit value="List trains" align="center" />
	</s:form>
	<table border="1">
		<tr>
			<th>trainID</th>
			<th>stationID</th>
			<th>nextStationID</th>
			<th>direction</th>
			<th>origin</th>
			<th>destination</th>
			<th>onGoing</th>
		</tr>
		<s:iterator value="trainList" var="trains">
			<tr>
				<td><s:property value="trainID" /></td>
				<td><s:property value="stationID" /></td>
				<td><s:property value="nextStationID" /></td>
				<td><s:property value="direction" /></td>
				<td><s:property value="origin" /></td>
				<td><s:property value="destination" /></td>
				<td><s:property value="onGoing" /></td>
				<td><a href="delete?id=<s:property value="trainID"/>">delete</a></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>