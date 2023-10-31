<%@page import="java.sql.*" %>
<%@include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body bgcolor = "#F2D7D5">
<%
String msg=request.getParameter("msg");
if("added".equals(msg))
{
%>
<h3 >Added successfully to cart!</h3>
<%} %>
<%
if("exists".equals(msg))
{
%>
<h3 >Quantity increased!</h3>
<%} %>
<% 
if("invalid".equals(msg))
{
%>
<h3 >Error occured! Please try again!</h3>
<%} %>
<table>
        <thead>
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Category</th>
            <th scope="col"> Price</th>
            <th scope="col">Add to cart </th>
          </tr>
        </thead>
        <tbody>
<%
try{
	   //Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu", "root", "root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from products where active='yes'");
		while(rs.next())
		{
%>
<tr>
            <td><%=rs.getString(1) %></td>
            <td><%=rs.getString(2) %></td>
            <td><%=rs.getString(3) %></td>
            <td><%=rs.getString(4) %></td>
            <td><a href="cartAction.jsp?id=<%=rs.getString(1) %>">Add </a></td>
          </tr>
<%
		} 
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
%>
        </tbody>
      </table>
      <br>
      <br>
      <br>

		
</body>
</html>