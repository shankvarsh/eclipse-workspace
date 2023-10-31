<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,java.util.*,java.io.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Updating the empp table</title>
</head>
<body>
<%
int empid=Integer.parseInt(request.getParameter("t1"));
int salary=Integer.parseInt(request.getParameter("t2"));
String job=request.getParameter("designation");

try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu", "root", "root");
PreparedStatement ps = con.prepareStatement("update empp set salary=?,job=? where empid=?");
ps.setInt(1,salary);
ps.setString(2, job);
ps.setInt(3,empid);
ps.executeUpdate(); 
out.println("Record Updated Successfully!!");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>
</body>
</html>