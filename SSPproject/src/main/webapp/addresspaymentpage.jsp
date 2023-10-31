<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>address payment page action</title>
</head>
<body>
<%
String email= session.getAttribute("email").toString();
String address= request.getParameter("address");
String city= request.getParameter("city");
String state= request.getParameter("state");
String country= request.getParameter("country");
String mobilenumber= request.getParameter("mobilenumber");
String paymentmethod= request.getParameter("paymentmethod");
String transactionid="";
transactionid=request.getParameter("transactionid");
String statuss="bill";
try
{
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu", "root", "root");
	PreparedStatement ps=con.prepareStatement("update users set address =?,city=?,state=?,country=?,mobilenumber=? where email=? ");
ps.setString(1,address);
ps.setString(2,city);
ps.setString(3,state);
ps.setString(4,country);
ps.setString(5,mobilenumber);
ps.setString(6,email);
ps.executeUpdate();

PreparedStatement ps1=con.prepareStatement("update cart set address=?,city=?,state=?,country=?,mobilenumber=?,paymentmethod=?,transactionid=?,statuss=? where email=? and address is NULL");
ps1.setString(1,address);
ps1.setString(2,city);
ps1.setString(3,state);
ps1.setString(4,country);
ps1.setString(5,mobilenumber);
ps1.setString(6,paymentmethod);
ps1.setString(7,transactionid);
ps1.setString(9,email);
ps1.setString(8,statuss);
ps1.executeUpdate();
response.sendRedirect("bill.jsp");
}

catch(Exception e)
{
	System.out.println(e);
}
%>
</body>
</html>