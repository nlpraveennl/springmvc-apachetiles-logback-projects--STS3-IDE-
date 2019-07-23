<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>User Validation</title>
</head>
<body>
	<h2>User Detail</h2>
	<form:form method="post" action="userValidationSubmit.html" modelAttribute="user">
		Name: <form:input path="name"/> <form:errors path="name" /> <br>
		Password: <form:input path="password"/> <form:errors path="password" /> <br>
		<input type="submit" value="Login" />
	</form:form>
</body>
</html>
