<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update-playerdetail" method="post">
Player Name:<input type="text" value="${player.playernname}" name="pname"> <br><br>
runs: <input type="number" value="${player.runs }" name="runs"><br>
<input type="submit" value="Update">
</form>
</body>
</html>