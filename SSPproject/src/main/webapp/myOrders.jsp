<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.sql.*" %>
<%@include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body bgcolor = "#ECC5C0">
<h1>My Orders</h1>
<table>
        <thead>
          <tr>
            <th scope="col">S.No</th>
            <th scope="col">Product Name</th>
            <th scope="col">category</th>
            <th scope="col">  Price</th>
            <th scope="col">Quantity</th>
            <th scope="col"> Sub Total</th>
             <th scope="col">Payment Method</th>
              <th scope="col">Status</th>
              
          </tr>
        </thead>
        <tbody>
<%
int sno=0;
try {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu", "root", "root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select *from cart inner join products where cart.productid=products.id and cart.email='"+email+"'");
	while(rs.next())
	{
		sno=sno+1;
%>
          <tr>
            <td><% out.println(sno); %></td>
            <td><%=rs.getString(15) %></td>
            <td><%=rs.getString(16) %></td>
            <td> <%=rs.getString(17) %></td>
            <td><%=rs.getString(3) %> </td>
             <td><%=rs.getString(5) %></td>
              <td><%=rs.getString(11) %></td>
               <td><%=rs.getString(13) %></td>
            <br>
          </tr>
        </tbody>
          <%} %>
      </table>
   
<%
	}

catch(Exception e)
{
	System.out.println(e);
}
%>
</body>
</html>