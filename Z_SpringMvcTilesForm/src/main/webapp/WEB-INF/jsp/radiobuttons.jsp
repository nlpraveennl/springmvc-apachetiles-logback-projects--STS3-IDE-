<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Dynamic radio button</title>
</head>
<body>
	<h2>Age</h2>
	<form:form method="post" action="radiobuttonsSubmit.html" modelAttribute="person">
		<form:radiobuttons path="age" items="${person.ageList}"/><br>
		<form:hidden path="ageList" /> 
		<input type="submit" value="Add Age" />
	</form:form>
</body>
</html>
