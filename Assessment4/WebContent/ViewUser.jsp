<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="SalesDealer.do" method="get">
		<table border="1" cellspacing="2" >
			<tr>
				<td>Name</td>
				<td>Email</td>
				<td>Phone</td>
				<td>City</td>
				<td>ZipCode</td>
			</tr>
			<c:forEach items="${data}" var="b">
				<tr>
					<Td> ${b.name } </Td>
					<Td> ${b.email } </Td>
					<Td> ${b.phone } </Td>
					<Td> ${b.city } </Td>
					<Td> ${b.zipCode } </Td>
				</tr>
			</c:forEach>
		</table>
		<a href="index.jsp">Go back</a><br>
</form>
</body>
</html>