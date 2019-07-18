<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
		<style>
		.login-form-container
		{
			margin-top:10%;
			border: 1px solid darkgray;
		    padding: 15px;
		    background-color: royalblue;
		    color: white;
		}
		.login-form-header
		{
			font-family: monospace;
		    font-size: 22px;
		    border-bottom: 1px solid white;
		}
		.login-form-header p{
			margin: auto
		}
		.login-form-body
		{
			margin-top: 25px;
		}
		</style>
	</head>
	
	<body>
		<div class="container-fluid">
			<div class="login-form-container col-md-4 offset-md-3">
				<div class="row login-form-header">
					<p>Login Here</p>
				</div>
				<div class="login-form-body">
					<form:form method="post" action="authenticateUser.html" class="form-horizontal">
					  <div class="form-group">
					    <label for="inputEmail3" class="col-sm-2 control-label">User Name</label>
					    <div class="col-sm-12">
					      <form:input path="userName" type="text" placeholder="User Name" />
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
					    <div class="col-sm-12">
					      <form:input path="password" placeholder="Password" />
					    </div>
					  </div>
					  <div class="form-group">
					    <div class="col-sm-offset-2 col-sm-10">
					      <button type="submit" class="btn btn-default">Sign in</button>
					    </div>
					  </div>
					</form:form>
				</div>
			</div>
		</div>
	</body>
</html>