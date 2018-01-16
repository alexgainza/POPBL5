<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Settings</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/Settings.css" />
</head>
<body class="container">
	<header class="row">
		<div class="col-md-5">
			<figure class="row">
				<img src="images/Tren_Inicio.png" class="col-md-5">
				<img src="images/Titulo_Inicio.png" class="col-md-7">
			</figure>
		</div>
		<div class="col-md-7 col-md-offset-7">
			<a href="Settings.jsp" style="float:right; margin-top: 20px;"> <img src="images/settings.png"> </a>
		</div>
	</header>
	<div id="update">
		<h2>Update profile</h2>
		<s:actionerror />
		<s:form action="editUser" method="post">
			<s:textfield id="id" name="user.userID" label="ID" />
			<s:textfield id="name" name="user.nombre" label="First name" />
			<s:textfield id="last" name="user.apellido" label="Last name" />
			<s:textfield id="username" name="user.username" label="Username" />
			<s:password id="pass" name="user.password" label="Password" />
			<s:textfield id="role" name="user.role.roleID" label="Role" />
			<s:submit value="Edit User" align="center" class="btn btn-primary"/>
		</s:form>
		<button type="button" class="btn btn-danger" onclick="javascript:history.back()">Cancel</button>
	</div>
</body>
</html>