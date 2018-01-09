<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>TrainStation5</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/index.css" />
</head>

<body>
	<script src="js/bootstrap.min.js"></script>
	<header>
		<figure>
			<img src="images/Tren_Inicio.png" class="img-responsive img-rounded" id="Tren_Inicio">
			<img src="images/Titulo_Inicio.png" class="img-responsive img-rounded" id="Titulo_Inicio">
		</figure>
	</header>
	<div>
		<s:actionerror />
		<s:form action="login.action" method="post">
			<s:textfield name="username" key="label.username" size="20" />
			<s:password name="password" key="label.password" size="20" />
			<s:submit method="execute" key="label.login" align="center"
				id="submit" class="btn btn-primary" />
		</s:form>
	</div>
</body>
</html>