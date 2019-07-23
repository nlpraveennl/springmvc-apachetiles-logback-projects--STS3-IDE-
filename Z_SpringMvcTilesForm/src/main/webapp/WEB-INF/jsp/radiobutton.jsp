<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Static radio button</title>
</head>
<body>
	<h2>Gender</h2>
	<form:form method="post" action="radiobuttonSubmit.html" modelAttribute="person">
		Male: <form:radiobutton path="gender" value="Male"/><br>
		Female: <form:radiobutton path="gender" value="Female"/><br>
		<input type="submit" value="Add Gender" />
	</form:form>
</body>
</html>
