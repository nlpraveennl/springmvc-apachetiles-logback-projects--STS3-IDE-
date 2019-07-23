<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Dynamic Checckbox</title>
</head>
<body>
	<h2>User Qualification</h2>
	<form:form method="post" action="checkboxesSubmit.html" modelAttribute="checkboxes">
		<table>
			<tr>
				<td>-----Course Completed-----</td>
				<td>-----------------</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<form:checkboxes path="courses" items="${allCourses}"/> 
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Qualification" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>
