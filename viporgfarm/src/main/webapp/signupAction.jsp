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
String address="";
String city="";
String state="";
String country="";
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into users values('"+email+"','"+name+"','"+mobilenumber+"','"+securityQuestion+"','"+answer+"','"+password+"','"+address+"','"+city+"','"+state+"','"+country+"')");
response.sendRedirect("signup.jsp?msg=valid");
out.println("Data is successfully inserted!");
}
catch(Exception e)
{System.out.print(e);
	response.sendRedirect("signup.jsp?msg=invalid");

e.printStackTrace();
}
%>
</body>
</html>