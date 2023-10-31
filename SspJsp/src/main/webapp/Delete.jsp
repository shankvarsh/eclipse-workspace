<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,java.util.*,java.io.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete values in cart</title>
</head>
<body>
<%

try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");
	PreparedStatement ps=con.prepareStatement("delete from empp where empid=?");
	ps.setInt(1,empid);
    ps.executeUpdate();
	out.println("Record Deleted Successfully!");  
	
	              
	}catch (Exception e2) {e2.printStackTrace();}  
	          
	finally{out.close();} 
%>
</body>
</html>