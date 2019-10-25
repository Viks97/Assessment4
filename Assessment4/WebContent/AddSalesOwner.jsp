<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddSalesOwner">
<input type="text" name ="newName" placeholder="Add Name"> <br>
	<input type="text" name ="newPrice" placeholder="Add Price"> <br>
	<input type="text" name ="newCondition" placeholder="Add Condition"> <br>
	<button type="Submit" name="btn1">Add</button>
	</form>
	<a href="index.jsp">Go back</a><br>
	<a href="SalesOwner.do">View Items</a>
</body>
</html>