<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>TrainStation5</title>
<link rel="stylesheet" href="css/index.css"/>
</head>

<body>
	<header>
		<figure>
			<img src="images/Tren_Inicio.png" id="Tren_Inicio">
			<img src="images/Titulo_Inicio.png" id="Titulo_Inicio">
		</figure>
	</header>
	<s:actionerror />
	<s:form action="login.action" method="post">
		<s:textfield name="username" key="label.username" size="20" />
		<s:password name="password" key="label.password" size="20" />
		<s:submit method="execute" key="label.login" align="center" id="submit"/>
	</s:form>
</body>
</html>