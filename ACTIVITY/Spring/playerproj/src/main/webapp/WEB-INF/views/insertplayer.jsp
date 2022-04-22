<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert</title>
</head>
<body>
<form action="insert_the_player" method ="post">
player id:<input type="number" name="pnum"><br><br>
player name:<input type="text" name="pname"><br><br>
Skill:<select name="skill">
<option value="Batsman">Bats man</option>
<option value="Bowler">Bowler</option>
<option value="All Rounder">All Rounder</option>
<option value="Wicket Keeper">Wicket Keeper</option>
</select><br><br>
Runs: <input type="number" name="runs">
Team Id:<select name="teamid">
<option value="1">RCB</option>
<option value="2">CSK</option>
<option value="3">MI</option>
<option value="4">RR</option>
<option value="5">DC</option>
<option value="6">SRH</option>
</select><br><br>
<input type="submit" value="Register">
</form>
</body>
</html>