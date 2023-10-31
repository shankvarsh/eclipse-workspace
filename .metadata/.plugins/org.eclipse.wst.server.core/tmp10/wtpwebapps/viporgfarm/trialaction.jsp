<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*,java.util.*,java.io.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignupAction</title>
</head>
<body>
<% 
String email = request.getParameter("email");
String name = request.getParameter("name");
String mobilenumber = request.getParameter("mobilenumber");
String securityQuestion = request.getParameter("securityQuestion");
String answer = request.getParameter("answer");
String password = request.getParameter("password");
String address=request.getParameter("address");
String city=request.getParameter("city");
String state=request.getParameter("state");
String country=request.getParameter("country");
try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into trial values('"+email+"','"+name+"','"+mobilenumber+"','"+securityQuestion+"','"+answer+"','"+password+"','"+address+"','"+city+"','"+state+"','"+country+"')");
response.sendRedirect("trial.jsp?msg=valid");
out.println("Data is successfully inserted!");
}
catch(Exception e)
{System.out.print(e);
	response.sendRedirect("trial.jsp?msg=invalid");

e.printStackTrace();
}
%>
</body>
</html>