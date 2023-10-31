<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*,java.util.*,java.io.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>forgotPasswordAction</title>
</head>
<body>
<%
String email=request.getParameter("email");
String mobilenumber=request.getParameter("mobilenumber");
String securityQuestion=request.getParameter("securityQuestion");
String answer=request.getParameter("answer");
String newpassword=request.getParameter("newpassword");

int check=0;
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu", "root", "root");
	Statement st=conn.createStatement();
	
	ResultSet rs=st.executeQuery("select *from users where email='"+email+"'and mobilenumber='"+mobilenumber+"' and securityQuestion='"+securityQuestion+"' and answer ='"+answer+"'");
	
		while(rs.next())
		{   check=1;
			PreparedStatement ps = conn.prepareStatement("update users set password= ? where email=?");
			ps.setString(1, newpassword);
			ps.setString(2,email);
			ps.executeUpdate(); 
			response.sendRedirect("forgotPassword.jsp?msg=done");
	}
	if (check==0)
	{
		response.sendRedirect("forgotPassword.jsp?msg=invalid");
	}
}
catch(Exception e)
{
	System.out.print(e);
}
%>
</body>
</html>