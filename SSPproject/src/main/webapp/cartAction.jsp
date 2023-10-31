<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
</head>
<body>
<%
String mail=session.getAttribute("email").toString();
String productid=request.getParameter("id");
int quantity =1;
int prod_price=0;
int prod_total=0;
int cart_total=0;

int z=0;
try{
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu", "root", "root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from products where id='"+productid+"'");
		while(rs.next())
		{
			prod_price=rs.getInt(4);
			prod_total=prod_price;
		}
		ResultSet rs1=st.executeQuery("select *from cart where productid='"+productid+"' and email='"+mail+"' and address is NULL");
while (rs1.next())
{
	cart_total=rs1.getInt(5);
	cart_total=cart_total+prod_total;
	quantity=rs1.getInt(3);
	quantity=quantity+1;
	z=1;
	
}
if(z==1){
	st.executeUpdate("update cart set total ='"+cart_total+"', quantity='"+quantity+"' where productid='"+productid+"' and email='"+mail+"' and address is NULL");
response.sendRedirect("home.jsp?msg=exists");
}
if(z==0)
{
	PreparedStatement ps=con.prepareStatement("insert into cart(email,productid,quantity,price,total)values(?,?,?,?,?)") ;
	ps.setString(1,mail);
	ps.setString(2,productid);
	ps.setInt(3,quantity);
	ps.setInt(4,prod_price);
	ps.setInt(5,prod_total);
	ps.executeUpdate();
	response.sendRedirect("home.jsp?msg=added");
}
}
catch(Exception e)
{
	System.out.println(e);
	response.sendRedirect("home.jsp?msg=invalid");
}
%>
</body>
</html>