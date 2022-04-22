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
<h1>The Players Are: </h1>
<table>
<tr>
<th>playerNo</th>
<th>playerName</th>
<th>skill</th>
<th>runs</th>
<th>teamId</th>
<th>update</th>
</tr>
<c:forEach items ="${player}" var= "p">
<tr>
<td>
<c:out value="${p.playernumber}"></c:out>
</td>
<td>
<c:out value ="${p.skill}"></c:out>
</td>
<td>
<c:out value ="${p.playernname}"></c:out>
</td><td>
<c:out value ="${p.runs}"></c:out>
</td><td>
<c:out value ="${p.teamno}"></c:out>
</td>
<td><a href="updateplayer?id=${p.playernumber}">update</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>