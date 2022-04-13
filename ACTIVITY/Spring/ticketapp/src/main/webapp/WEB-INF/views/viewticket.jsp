<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>The Tickets Are: </h1>
<table>
<tr>
<th>Ticket_Id</th>
<th>Booking_Date</th>
<th>Mobile</th>
<th>Movie_Name</th>
<th>NO. of Tickets</th>
<th>BOOking_Date</th>
<th>Show_Date</th>
<th>Ticket_Type</th>
<th>Total_Amount</th>
<th>update</th>
<th>delete</th>
</tr>
<c:forEach items ="${ticket}" var= "t1">
<tr>
<td>
<c:out value="${t1.ticketid}"></c:out>
</td>
<td>
<c:out value ="${t1.mobile}"></c:out>
</td>
<td>
<c:out value ="${t1.moviename}"></c:out>
</td><td>
<c:out value ="${t1.nooftickets}"></c:out>
</td><td>
<c:out value ="${t1.bookingDate}"></c:out>
</td><td>
<c:out value ="${t1.showdate}"></c:out>
</td><td>
<c:out value ="${t1.showtime}"></c:out>
</td><td>
<c:out value ="${t1.tickettype}"></c:out>
</td><td>
<c:out value ="${t1.totalamount}"></c:out>
</td>
<td><a href="updateticket?id=${t1.ticketid}">update</a></td>
<td><a href="deleteticket?id=${t1.ticketid}">delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>