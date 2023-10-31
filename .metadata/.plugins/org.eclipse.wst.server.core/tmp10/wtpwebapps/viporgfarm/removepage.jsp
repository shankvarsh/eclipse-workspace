<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Remove page</title>
</head>
<body>
<%
String email= session.getAttribute("email").toString();
String productid=request.getParameter("id");

try{
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
	Statement st=con.createStatement();
	st.executeUpdate("delete from cart where email='"+email+"' and productid='"+productid+"' and address is NULL");
response.sendRedirect("myCart.jsp?msg=removed");

}

catch(Exception e)
{
	System.out.println(e);
}
%>
</body>
</html>