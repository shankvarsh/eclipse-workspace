<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*,java.util.*,java.io.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select values from empp table</title>
</head>
<body>
<% 
int empid=Integer.parseInt(request.getParameter("q1"));  
	  		          
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");  
		              
		PreparedStatement ps=con.prepareStatement("select * from empp where empid=?");  
		ps.setInt(1,empid);  
		              
		out.print("<table width=50% border=1>");  
		out.print("<caption>Result:</caption>");  
		  
		ResultSet rs=ps.executeQuery();  
		              
		/* Printing column names */  
		ResultSetMetaData rsmd=rs.getMetaData();  
		int total=rsmd.getColumnCount();  
		out.print("<tr>");  
		for(int i=1;i<=total;i++)  
		{  
		out.print("<th>"+rsmd.getColumnName(i)+"</th>");  
		}  
		  
		out.print("</tr>");  
		              
		/* Printing result */  
		  
		while(rs.next())  
		{  
		out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"  </td><td>"+rs.getInt(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+ "</td></tr>");  
		                  
		}  
		  
		out.print("</table>");  
		              
		}catch (Exception e2) {e2.printStackTrace();}  
		          
		finally{out.close();}  
	%>
</body>
</html>