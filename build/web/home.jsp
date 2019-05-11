<%-- 
    Document   : home
    Created on : 31 Mar, 2019, 10:39:39 AM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
	String fname =  request.getParameter("fname");
	String lname = request.getParameter("lname");
	String place = request.getParameter("place");
	String cgory = request.getParameter("cgory");
	String  email= request.getParameter("email");
	String address  = request.getParameter("address");
%>
<table id="t01">
    <h1>DATA INSERTED SUCCESSFULLY</h1>
<tr>
	<td>First Name</td>
	<td><%= fname %></td>
</tr>
<tr>
	<td>Last Name</td>
	<td><%=lname  %></td>
</tr>
<tr>
	<td>Place</td>
	<td><%=place  %></td>
</tr>
<tr>
	<td>Category</td>
	<td><%= cgory %></td>
</tr>
<tr>
	<td>Email</td>
	<td><%= email %></td>
</tr>
<tr>
	<td>Address</td>
	<td><%= address %></td>
</tr>

</table>
</body>
</html>