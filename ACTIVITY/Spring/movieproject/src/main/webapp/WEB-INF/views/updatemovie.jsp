<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1></h1>
<form action="update-moviedetail" method="post">
movieid:<input type="number"  value="${movie.movieid }" name="pnum"><br></br>
moviename:<input type="text"  value="${movie.moviename }" name="pname">
<input type="submit" value="Update Player">
</form>
</body>
</html>