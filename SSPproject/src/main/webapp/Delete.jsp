<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,java.util.*,java.io.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete values from empp</title>
</head>
<body>
<%
try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");
	Statement st=con.createStatement();
	st.execute("delete from cart where email='Lucky@gmail.com'");
	
	out.println("Record Deleted Successfully!");  
	
	              
	}catch (Exception e) {System.out.println(e);}  
	          
	finally{out.close();} 
%>
</body>
</html>