<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cancel order action page</title>
</head>
<body>
<%
String id=request.getParameter("id");
String email=request.getParameter("email");
String status="cancel";
try
{
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu", "root", "root");
	Statement st=con.createStatement();
	st.execute("update cart set statuss='"+status+"' where productid='"+id+"' and email='"+email+"' and address is not NULL");
response.sendRedirect("ordersReceived.jsp?msg=cancel");
}

catch(Exception e)
{   System.out.println(e);
	response.sendRedirect("ordersReceived.jsp?msg=invalid");
	
}
%>

</body>
</html>