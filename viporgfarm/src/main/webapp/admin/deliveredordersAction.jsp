<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>delivered</title>
</head>
<body>
<%
String id=request.getParameter("id");
String email=request.getParameter("email");
String status="delivered";
try
{
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
	Statement st=con.createStatement();
	st.execute("update cart set statuss='"+status+"' where productid='"+id+"' and email='"+email+"' and address is not NULL");
response.sendRedirect("ordersReceived.jsp?msg=delivered");
}

catch(Exception e)
{   System.out.println(e);
	response.sendRedirect("ordersReceived.jsp?msg=invalid");
	
}
%>
</body>
</html>