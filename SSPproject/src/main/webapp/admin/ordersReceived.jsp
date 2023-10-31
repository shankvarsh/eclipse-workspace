 <%@page import="java.sql.*" %>
 <%@include file="adminHeader.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home</title>
</head>
<body bgcolor="#99C68E">
 <h3>Orders Received</h3>
<%
String msg=request.getParameter("msg");

if("cancel".equals(msg))
		{
	%>
<h3 >Order is Cancelled!</h3>
<%}%>
<%
if("delivered".equals(msg))
		{%>
<h3>Order is delivered!</h3>
<%}%>
<%
if("invalid".equals(msg))
		{%>
<h3 >Error occured! Please try again!</h3>
<%}%>
<%
int total=0;
try {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu", "root", "root");
	Statement st=con.createStatement();
	ResultSet rs1=st.executeQuery("select sum(total) from cart where statuss='delivered'");
	while(rs1.next())
	{
		total=rs1.getInt(1);
	} 
	%>
<table id="customers">
          <tr>
           <th scope="col" style="background-color:#FFE6BB ;">Account balance:  <%out.println(total-(total/10)); %>  </th>
          <th scope="col">sno</th>
          <th scope="col">Email</th>
          <th scope="col">Mobile Number</th>
            <th scope="col">Product Name</th>
            <th scope="col">Quantity</th>
            <th scope="col"> Sub Total</th>
            <th scope="col">Address</th>
            <th scope="col">City</th>
            <th scope="col">State</th>
            <th scope="col">Country</th>
             <th scope="col">Payment Method</th>
              <th scope="col">T-ID</th>
              <th scope="col">Status</th>
              <th scope="col">Action</th>
          </tr>
          <%
		}
catch(Exception e)
		{
	System.out.println(e);
		}
%>
          
      <%
      
      int sno=0;
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu", "root", "root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select *from cart inner join products where cart.productid=products.id and cart.transactionid is not NULL and cart.statuss='processing'");
			while(rs.next())
			{
				sno=sno+1;
			%>  
       

           
         
          <tr>
          
          <td><% out.println(sno); %></td>
            <td><%=rs.getString(1) %></td>
            <td><%=rs.getString(10) %></td>
            <td> <%=rs.getString(15) %></td>
            <td><%=rs.getString(3) %> </td>
             <td><%=rs.getString(5) %></td>
              <td><%=rs.getString(6) %></td>
               <td><%=rs.getString(7) %></td>
               <td> <%=rs.getString(8) %></td>
            <td><%=rs.getString(9) %> </td>
             <td><%=rs.getString(11) %></td>
              <td><%=rs.getString(12) %></td>
               <td><%=rs.getString(13) %></td>
            
      
               <td><a href="cancelordersAction.jsp?id=<%=rs.getString(2)%>&email=<%=rs.getString(1)%>">Cancel </a></td>
                <td><a href="deliveredordersAction.jsp?id=<%=rs.getString(2)%>&email=<%=rs.getString(1)%>">Deliver </a></td>
            </tr>
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