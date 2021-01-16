<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Department List</title>
</head>
<body>

	<h1>Department List</h1>
	<table border="1">
		<thead>
			<tr>
				<td>DEPT ID</td>
				<td>DEPT NAME</td>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="d" items="${DEPT_LIST}">
				<tr>
					<td>${d.id}</td>
					<td>${d.name}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>