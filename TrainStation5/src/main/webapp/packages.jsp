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
		<s:textfield name="paquete.description" label="description" />
		<s:textfield name="paquete.packageStateID" label="packagestateID" />
		<s:textfield name="paquete.userID" label="userID" />
		<s:textfield name="paquete.train" label="train" />
		<s:textfield name="paquete.originStation" label="originStation" />
		<s:textfield name="paquete.destinationStation" label="destinationStation" />
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
			<th>train</th>
			<th>originStation</th>
			<th>destinationStation</th>
			<th>sendDate</th>
		</tr>
		<s:iterator value="packageList" var="packages">
			<tr>
				<td><s:property value="packageID" /></td>
				<td><s:property value="description" /></td>
				<td><s:property value="packageStateID" /></td>
				<td><s:property value="userID" /></td>
				<td><s:property value="train" /></td>
				<td><s:property value="originStation" /></td>
				<td><s:property value="destinationStation" /></td>
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
			<th>station</th>
			<th>nextStation</th>
			<th>direction</th>
			<th>origin</th>
			<th>destination</th>
			<th>onGoing</th>
		</tr>
		<s:iterator value="trainList" var="trains">
			<tr>
				<td><s:property value="trainID" /></td>
				<td><s:property value="station" /></td>
				<td><s:property value="nextStation" /></td>
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