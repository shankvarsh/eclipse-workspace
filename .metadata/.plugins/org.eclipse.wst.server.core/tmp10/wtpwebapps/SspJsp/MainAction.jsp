<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*,java.util.*,java.io.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main action page for users</title>
</head>
<body>
<%
response.getWriter().append("Served at: ").append(request.getContextPath());
String[] oc=request.getParameterValues("oc");
response.setContentType("text/html");
out.print("<html><body>");
out.print("<h1>The occassion is </h1>");
out.print("<ul>");
for (String s : oc)    
{
	out.print("<li>" + s + "</li>");
}
out.print("</ul>");
out.print("<br><h3><a href='Selectpage.jsp'>Next</a></h3>");  
out.print("</body></html>");

%>
</body>
</html>