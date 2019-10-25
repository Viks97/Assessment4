<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Local AD List</title>
</head>
<body>
<h1>Sales</h1>
	<form action="AddSalesOwner.jsp">
	<button type="Submit" name ="btnSO">Sales by Owner</button>
	</form> <br>
	<form action="AddSalesDealer.jsp">
	<button type="Submit" name ="btnSD">Sales by Dealer</button>
	</form> <br>
<h1>Housing</h1>
	<form action="HouseOffered.jsp">
	<button type="Submit" name ="btnHO">House Offered</button>
	</form> <br>
	<form action="HouseWanted.jsp">
	<button type="Submit" name ="btnHW">House Wanted</button>
	</form> <br>
<h1>Jobs</h1>
	<form action="JobOffered.jsp">
	<button type="Submit" name ="btnJO">Jobs Offered</button>
	</form> <br>
	<form action="GigOffered.jsp">
	<button type="Submit" name ="btnGO">Gigs Offered</button>
	</form> <br>
<h1>Services</h1>
	<form action="Service.jsp">
	<button type="Submit" name ="btnSO">Services Offered</button>
	</form> <br>
<h1>View Users Who Have Bought Items</h1>
	<form action="ViewUser.do">
	<button type="Submit" name ="btnSO">View Users</button>
	</form> <br>
</body>
</html>
