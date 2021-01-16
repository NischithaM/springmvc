<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Book List</h1>
	<table border="1">
		<thead>
			<tr>
				<td>Book ISBN</td>
				<td>Book Title</td>
				<td>Book Price</td>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="b" items="${BOOK_LIST}">
				<tr>
					<td>${b.isbn}</td>
					<td>${b.title}</td>
					<td>${b.price}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>