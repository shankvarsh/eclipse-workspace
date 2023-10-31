<%@page import="java.sql.*" %>
<%@include file="adminHeader.jsp" %>
<html>
<head>
<title>View and edit the products</title>
</head>
<body bgcolor ="#9AFEFF">
 <h2><a class="back" href="allProductEditProduct.jsp">Back</a></h2>
 <%
       String id=request.getParameter("id");
 try{
	   Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu", "root", "root");
		Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select *from products where id='"+id+"'");
	
	while(rs.next())
	{
       %>
<form action="editProductsAction.jsp" method="post" >
<input type="hidden" name="id" value ="<% out.println(id); %>">

 <h3>Enter Name</h3><br>
<input type="text" name="name" value="<%=rs.getString(2)%>" required>
<hr>



<h3>Enter Category</h3><br>
 <input type="text" name="category" value="<%=rs.getString(3)%>" required>
<hr>



<h3>Enter Price</h3><br>
  <input type="number" name="price" value="<%=rs.getString(4)%>" required>
<hr>



<h3>Active</h3><br>
<select name ="active" >
<option value="Yes">Yes</option>
<option value="No">No</option>
</select>
<input type="submit" value="Update"/>
 </form>
<%
	}
}
catch(Exception e)
{System.out.println(e);
}
%>




</body>
</html>