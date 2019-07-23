<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Dynamic select (Dropdown)</title>
</head>
<body>
	<h2>Age</h2>
	<form:form method="post" action="selectSubmit.html" modelAttribute="person">
		<p>Select Multiple Countries</p>
		<form:select path="selectedCountryList" items="${person.countryList}" />
		<br>

		<p>Select Multiple Countries</p>
		<form:select path="homeCountry">
			<form:option value="INDIA" />
			<form:option value="PAK" />
			<form:option value="NEPAL" />
			<form:option value="SWITZERLAND" />
			<form:option value="USA" />
			<form:option value="CHINA" />
			<form:option value="AUSTRALIA" />
		</form:select>
		
		
		<form:select path="neighbourCountry">
			<form:option value="INDIA" />
			<form:option value="PAK" />
			<form:option value="NEPAL" />
			<form:option value="SWITZERLAND" />
			<form:option value="USA" />
			<form:option value="CHINA" />
			<form:option value="AUSTRALIA" />
			<form:options items="${person.countryEntityList}" itemValue="code" itemLabel="name"/>
		</form:select>

		<input type="submit" value="Add Countries" />

	</form:form>
</body>
</html>
