<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>The Movies are</h1>
<table>
<tr>
<th>Movie id</th>
<th>Movie name</th>
</tr>
<c:forEach items="${movie }" val="m">
<tr>
<td>
<c:out val="${m.movieid }">
</c:out>
</td>
<td>
<c:out val="${m.moviename }">
</c:out>
</td>
</tr>
</c:forEach>
</table>
${movie}
</body>
</html>