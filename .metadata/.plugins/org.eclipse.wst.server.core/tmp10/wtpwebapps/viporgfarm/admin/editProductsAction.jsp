<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update product page</title>
</head>
<body>
<%
String id=request.getParameter("id");
String name=request.getParameter("name");
String category=request.getParameter("category");
String price=request.getParameter("price");
String active=request.getParameter("active");
try{
	//Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");

	PreparedStatement ps=con.prepareStatement("update products set price=?,active=? where id=?");
	ps.setString(1,price);
	ps.setString(2, active);
	ps.setString(3,id);
    ps.execute(); 
	System.out.println("Product successfully updated!");
if(active.equals("No"))
{
	ps.execute("delete from cart where productid='"+id+"' and address is NULL");
}
response.sendRedirect("allProductEditProduct.jsp?msg=done");
}
catch(Exception e)
{
	System.out.println(e);
	response.sendRedirect("allProductEditProduct.jsp?msg=wrong");
}
%>
</body>
</html>