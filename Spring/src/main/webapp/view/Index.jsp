<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"/>

<style type="text/css">
body{
	margin-top: 70px;
}
</style>
</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="/">MVC App</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="<%=request.getContextPath()%>/">Home</a></li>
					<li><a href="<%=request.getContextPath()%>/Empleados/">Lista Empleados</a></li>
					<li><a href="<%=request.getContextPath()%>/Reuniones/">Lista Reuniones</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>

	<div class="container">

		<div class="page-header"><h1>Sistema de Manejo de empleados</h1></div>

	</div>
	<!-- /.container -->
</body>
</html>