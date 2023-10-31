<%@page import="java.sql.*" %>
<%@include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Cart</title>

<style>
h3
{
	color: blue;
	text-align: center;
}
</style>
</head>
<body bgcolor = "#CCCCFF">
<% 
String msg=request.getParameter("msg");
if("notpossible".equals(msg))
{
%>
<h3 >Click on remove!</h3>
<%} %>
<%
if("inc".equals(msg))
{
%>
<h3>Quantity Increased.</h3>
<%} %>
<%
if("dec".equals(msg))
{
%>
<h3>Quantity  Decreased.</h3>
<%} %>
<%
if("removed".equals(msg))
{
%>
<h3 >Product Removed!</h3>
<%} %>



<table>
<thead>
<%
int total=0;
int sno=0;
try {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu", "root", "root");
	Statement st=con.createStatement();
	ResultSet rs1=st.executeQuery("select sum(total) from cart where email='"+email+"' and address is NULL");
	while(rs1.next())
	{
		total=rs1.getInt(1);
	} 
	%>

          <tr>
            <th scope="col" style="background-color:#FFE6BB ;">Total:  <%out.println(total); %> </th>
             <%if(total>0){ %>   <th scope="col" style="background-color:#FFCCCC;" ><a href="addressPaymentForOrder.jsp">Proceed to order</a></th><%} %>
          </tr>
        </thead>
        <thead>
          <tr>
          <th scope="col">S.No</th>
            <th scope="col">Product Name</th>
            <th scope="col">Category</th>
            <th scope="col"> Price</th>
            <th scope="col">Quantity</th>
            <th scope="col">Sub Total</th>
            <th scope="col">Remove </th>
          </tr>
        </thead>
        <tbody>
      <%
      ResultSet rs=st.executeQuery("select *from products inner join cart on products.id=cart.productid and cart.email='"+email+"' and cart.address is NULL");
      while(rs.next())
      {
      %>
          <tr>
			<% sno=sno+1; %>
          	 <td><% out.println(sno); %></td>
            <td><%=rs.getString(2) %></td>
            <td><%=rs.getString(3) %></td>
            <td><%=rs.getString(4) %> </td>
            <td><a href="QuantityAction.jsp?id=<%=rs.getString(1)%>&quantity=inc">+</a><%=rs.getString(8) %>  <a href="QuantityAction.jsp?id=<%=rs.getString(1)%>&quantity=dec">-</a></td>
            <td><%=rs.getString(10) %></td>
            <td><a href="removepage.jsp?id=<%=rs.getString(1)%>">Remove </a></td>
          </tr>
<%
      }}
catch(Exception e)
{System.out.println(e);
	}
%>
         

        </tbody>
      </table>
      <br>
      <br>
      <br>

</body>
</html>