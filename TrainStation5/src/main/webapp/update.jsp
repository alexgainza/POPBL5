<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts2 Hibernate Example</title>
</head>
<body>

	<h1>Edit</h1>
	<s:actionerror />

	<s:form action="edit" method="post">
		<s:textfield name="paquete.packageID" label="PackageID" />
		<s:textfield name="paquete.description" label="Description" />
		<s:textfield name="paquete.originStation" label="Origin Station" />
		<s:textfield name="paquete.destinationStation" label="Destination Station" />
		<s:textfield name="paquete.sendDate" label="Send Date" />
		<s:submit value="Edit Package" align="center" />
	</s:form>
</body>
</html>