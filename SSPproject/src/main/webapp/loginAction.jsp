<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,java.util.*,java.io.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>loginaction</title>
</head>
<body>
<% 
String email = request.getParameter("email");
String password = request.getParameter("password");
if ("admin@gmail.com".equals(email) && "admin".equals(password))
{
	session.setAttribute("email",email);
	response.sendRedirect("admin/adminHome.jsp");
}
else
{
	int z=0;
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu", "root", "root");
		Statement st=conn.createStatement();
		
		ResultSet rs=st.executeQuery("select *from users where email='"+email+"'and password='"+password+"'");
		while(rs.next())
		{
			z=1;
			session.setAttribute("email",email);
			response.sendRedirect("home.jsp");
		}
		if(z==0)
		{
			response.sendRedirect("login.jsp?msg=notexist");}
	}
	catch(Exception e)
	{
		System.out.print(e);
		response.sendRedirect("login.jsp?msg=invalid");

	e.printStackTrace();
	}
}
%>
</body>
</html>
