<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Department Page</title>
</head>
<body>

	<h1>Department Page</h1>
	
	<form:form action="department.html" method="post">
		<form:input path="id"/>
		<form:input path="name"/>
		<input type="submit" value="Create"/>
	</form:form>
	
<!-- 	<form action="department.html" method="post">
		<label>Dept ID:</label>
		<input type="text" name="deptId"/> <br/>
		<label>Dept Name:</label>
		<input type="text" name="deptName"/> <br/>
		<input type="submit" value="Create"/>		
	</form> -->

</body>
</html>