<%-- 
    Document   : home1.jsp
    Created on : Apr 1, 2019, 9:02:18 PM
    Author     : SONY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
  text-align: left;
}
table#t01 {
  width: 50%;    
  background-color: lightpink;
}
</style>
</head>
<body>  
<% 
	String uname =  request.getParameter("uname");
	String email = request.getParameter("email");
	String tarea = request.getParameter("tarea");
	String date= request.getParameter("date");
	
%>
<table id="t01">
    <h1>DATA INSERTED SUCCESSFULLY</h1>
<tr>
	<td>Username</td>
	<td><%= uname %></td>
</tr>
<tr>
	<td>email</td>
	<td><%= email  %></td>
</tr>
<tr>
	<td>complaint</td>
	<td><%= tarea  %></td>
</tr>
<tr>
	<td>date of applied</td>
	<td><%= date %></td>
</tr>


</table>
</body>
</html>