<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insert-booking" method="post">
Mobile:<input type="text" name="mobile"><br></br>
Show Date: <input type="date" name="showdate"><br><br>
Show Time: <select name="showtime">
<option value="11:00">Morning</option>
<option value="15:00">Evening</option>
<option value="18:30">1st Show</option>
<option value="21:40">2nd Show</option>
</select><br><br>
No of Tickets: <input type="number" name="nooftickets"><br><br>
Ticket Type: <select name="tickettype">
<option value="Platinum">Platinum</option>
<option value="Economy">Economy</option>
</select><br><br>
<input type="submit" value="Confirm Booking">
</form>
</body>
</html>