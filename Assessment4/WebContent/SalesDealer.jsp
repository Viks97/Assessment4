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
				<td>Product Name</td>
				<td>Product Price</td>
				<td>Product condition</td>
			</tr>
			<c:forEach items="${data}" var="b">
				<tr>
					<Td> ${b.name } </Td>
					<Td> ${b.price } </Td>
					<Td> ${b.condition } </Td>
				</tr>
			</c:forEach>
		</table>
		<a href="index.jsp">Go back</a><br>
		<a href="AddUser.jsp">Reply</a>
	
</form>
</body>
</html>