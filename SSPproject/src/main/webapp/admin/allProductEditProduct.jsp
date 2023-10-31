<%@page import="java.sql.*" %>
<%@include file="adminHeader.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
</head>
<body bgcolor ="#B7CEEC">

<%
String msg=request.getParameter("msg");
if("done".equals(msg))
{
%>
<h3 >Product Successfully Updated!</h3>
<%} %>
<%

if("wrong".equals(msg))
{
%>
<h3 >Some thing went wrong! Try again!</h3>
<%} %>
<table>
        <thead>
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Category</th>
            <th scope="col"> Price</th>
            <th>Status</th>
            <th scope="col">Edit </th>
          </tr>
        </thead>
        <tbody>
       <%
       try{
    	   Class.forName("com.mysql.jdbc.Driver");
   		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu", "root", "root");
   		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from products");
		
		while(rs.next())
		{
       
       %>
          <tr>
            <td><%=rs.getString(1) %></td>
            <td><%=rs.getString(2) %></td>
            <td><%=rs.getString(3) %></td>
            <td> <%=rs.getString(4) %></td>
            <td><%=rs.getString(5) %></td>
            <td><a href="editProduct.jsp?id=<%=rs.getString(1) %>">Edit </a></td>
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

</body>
</html>