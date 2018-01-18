<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<link rel="stylesheet" href="css/Header.css" />
<header class="row">
	<div class="col-md-5">
		<figure class="row">
			<img src="images/Tren_Inicio.png" class="col-md-5">
			<img src="images/Titulo_Inicio.png" class="col-md-7">
		</figure>
	</div>
	<div class="col-md-7 col-md-offset-7">
		<s:form action="settings" method="post" id="settings">
			<s:submit type="image" method="execute" src="images/settings.png" align="center" id="submit"/>
		</s:form>
	</div>
</header>