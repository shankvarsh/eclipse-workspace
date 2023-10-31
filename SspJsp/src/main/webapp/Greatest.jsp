<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greatest of three numbers</title>
</head>
<body bgcolor="#BFBFBF">
<%
        int a= Integer.parseInt(request.getParameter("t1"));
        int b= Integer.parseInt(request.getParameter("t2"));
        int c= Integer.parseInt(request.getParameter("t3"));
    %>
    <h1>Biggest Number is:
    <%
        if ((a>b) && (a>c))
            out.println(a);
        else if (b>c)
            out.println(b);
        else
            out.println(c);
    %>
    </h1>
</body>
</html>