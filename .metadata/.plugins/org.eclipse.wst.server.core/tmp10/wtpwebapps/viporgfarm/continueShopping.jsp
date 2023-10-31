<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Continue shopping</title>
</head>
<body>
<%
String email=session.getAttribute("email").toString();
String statuss="processing";
try{
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
	PreparedStatement ps=con.prepareStatement("Update cart set statuss=? where email=? and statuss='bill'");
	ps.setString(1,statuss);
	ps.setString(2,email);
	ps.executeUpdate();
	response.sendRedirect("homepage.jsp");
}
catch(Exception e)
{
	System.out.println(e);
}
%>
</body>
</html>