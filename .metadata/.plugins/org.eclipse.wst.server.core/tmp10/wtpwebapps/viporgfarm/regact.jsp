<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*,java.util.*,java.io.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Action</title>
</head>
<body>
<% 
String name = request.getParameter("t1");
String number = request.getParameter("t2");
String email = request.getParameter("t3");
String password= request.getParameter("t4");
String pin= request.getParameter("t5");

String house = request.getParameter("t6");
String area = request.getParameter("t7");
String land = request.getParameter("t8");
String city = request.getParameter("t9");
String state = request.getParameter("t10");
String country = request.getParameter("t11");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
Statement st=con.createStatement();

String  sql="Insert into usersvip('"+name+"','"+number+"','"+email+"','"+password+"','"+pin+"','"+house+"','"+area+"','"+city+"','"+land+"','"+state+"','"+country+"')";
response.sendRedirect("Registrationvip.jsp?msg=valid");
out.println("Data is successfully inserted!");
con.close();
}
catch(Exception e)
{System.out.print(e);
	response.sendRedirect("Registrationvip.jsp?msg=invalid");

e.printStackTrace();
}
%>
</body>
</html>