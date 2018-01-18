<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>TrainStation5</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/Login.css" />
</head>
<body class="container">
		<!--<s:url var="localeEN" namespace="/" action="locale">
			<s:param name="request_locale">EN</s:param>
		</s:url>
		<s:url var="localeEU" namespace="/" action="locale">
			<s:param name="request_locale">EU</s:param>
		</s:url>
		<s:url var="localeES" namespace="/" action="locale">
			<s:param name="request_locale">ES</s:param>
		</s:url>
		<s:a href="%{localeEN}"><img src="images/ingles.png"></s:a>
		<s:a href="%{localeEU}"><img src="images/euskera.png"></s:a>
		<s:a href="%{localeES}"><img src="images/español.png"></s:a>-->
	<header>
		<figure>
			<img src="images/Tren_Inicio.png" class="img-responsive img-rounded" id="Tren_Inicio">
			<img src="images/Titulo_Inicio.png" class="img-responsive img-rounded" id="Titulo_Inicio">
		</figure>
	</header>
	<div id="login">
		<s:actionerror />
		<s:form action="login.action" method="post">
			<s:textfield name="username" key="global.username" size="20" />
			<s:password name="password" key="global.password" size="20" />
			<s:submit method="execute" key="global.login" align="center" id="submit" class="btn btn-primary" />
		</s:form>
	</div>
</body>
</html>