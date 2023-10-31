<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,java.util.*,java.io.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert into emp table</title>
</head>
<body>
<% 
int empid=Integer.parseInt(request.getParameter("t1"));
String empname = request.getParameter("t2");
int salary=Integer.parseInt(request.getParameter("t3"));
String gender = request.getParameter("r1");
String job=request.getParameter("designation");

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu", "root", "root");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into empp(empid,empname,salary,gender,job)values('"+empid+"','"+empname+"','"+salary+"','"+gender+"','"+job+"')");
out.println("Data is successfully inserted!");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>
</body>
</html>