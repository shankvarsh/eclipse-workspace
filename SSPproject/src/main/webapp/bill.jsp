 <%@page import="java.sql.*" %>
<html>
<head>
<title>Bill</title>
</head>
<body bgcolor="#E9CFEC">
<%
String email=session.getAttribute("email").toString();
int total=0;
int sno=0;
try {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu", "root", "root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select sum(total) from cart where email='"+email+"'and statuss='bill'");
	while(rs.next())
	{
		total=rs.getInt(1);
		} 
	ResultSet rs2=st.executeQuery("select *from users inner join cart where cart.email='"+email+"'and cart.statuss='bill'");
	while(rs2.next())
	{ 
%>
<h3>VISIT AGAIN! @THE CAM STORE</h3>
<hr>
<h3>Email:<%out.println(email); %>  </h3><br>
<h3>Mobile Number:<%=rs2.getString(20) %>  </h3>  <br>
<h3>Payment Method:<%=rs2.getString(21) %>  </h3><br>
<h3>Transaction Id:<%=rs2.getString(22) %>  </h3><br>
<h3>City:<%=rs2.getString(17) %>  </h3> <br>
<h3>Address:<%=rs2.getString(16) %>  </h3> <br>
<h3>State:<%=rs2.getString(18) %>  </h3><br>
<h3>Country:<%=rs2.getString(19)%>  </h3>  <br>
<hr>
<%break;} %>

	
	<br>
	
<table id="customers">
<h3>Product Details</h3>
  <tr>
    <th>S.No</th>
    <th>Product Name</th>
    <th>category</th>
    <th>Price</th>
    <th>Quantity</th>
     <th>Sub Total</th>
  </tr>
  <%
  ResultSet rs1=st.executeQuery("select *from cart inner join products where cart.productid= products.id and cart.email='"+email+"' and cart.statuss='bill'");
  while (rs1.next())
  {
	  sno=sno+1;
  %>
  <tr>
    <td><% out.println(sno); %></td>
    <td><%=rs1.getString(15) %></td>
    <td><%=rs1.getString(16) %></td>
    <td><%=rs1.getString(17) %></td>
    <td><%=rs1.getString(3) %></td>
     <td><%=rs1.getString(5) %></td>
  </tr>
  <tr>
<%} %>
</table>
<h3>Total: Rs.<%out.println(total); %></h3>
<h3>Total after 10% discount: Rs.<%out.println(total-(total/10)); %>/-</h3>
<a href="continueShopping.jsp"><button>Continue Shopping</button></a>
<a onclick="window.print();"><button>Print</button></a>
<br><br><br><br>
<%
}
catch(Exception e){
System.out.println(e);
}
%>
</body>
</html>