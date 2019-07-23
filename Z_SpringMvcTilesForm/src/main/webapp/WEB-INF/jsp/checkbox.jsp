<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Static Checckbox</title>
</head>
<body>
	<h2>User Qualification</h2>
	<form:form method="post" action="checkboxSubmit.html" modelAttribute="checkbox">
		<table>
			<tr>
				<td>-----Course Completed-----</td>
				<td>-----------------</td>
			</tr>
			<tr>
				<td><form:label path="completed">is completed</form:label></td>
				<td><form:checkbox path="completed" /></td>
			</tr>
			<tr>
				<td>-----Courses-----</td>
				<td>-----------------</td>
			</tr>
			<tr>
				<td><form:label path="courses">Java</form:label></td>
				<td><form:checkbox path="courses" value="JAVA"/></td>
			</tr>
			<tr>
				<td><form:label path="courses">JAVA EE</form:label></td>
				<td><form:checkbox path="courses" value="JAVA EE"/></td>
			</tr>
			<tr>
				<td><form:label path="courses">MYSQL</form:label></td>
				<td><form:checkbox path="courses" value="MYSQL"/></td>
			</tr>
			<tr>
				<td>-----RESULT-----</td>
				<td>-----------------</td>
			</tr>
			<tr>
				<td><form:label path="result">Result</form:label></td>
				<td><form:checkbox path="result" value="Pass"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Qualification" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>
