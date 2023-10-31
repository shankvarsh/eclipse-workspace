<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Question one</title>
</head>
<body>
<body bgcolor="#BFBFBF">
<%
        int a= Integer.parseInt(request.getParameter("t1"));
        String b= request.getParameter("t2");
        int c= Integer.parseInt(request.getParameter("t3"));
         out.println("<h1>Name:</h1>"+b);
         out.println("<h1>ID:</h1>"+a);
    %>
    <h1>
    Calculating Gross salary:
    <%
        if (c<=5000)
        {
        	int da=(c*10)/100;
        	int ta=(c*10)/100;
        	int pf=(c*8)/100;
        	int hra=(c*12)/100;
        	int gs=da+ta-pf+hra;
        	out.println("<h1> da is:</h1>"+da);
        	out.println("<h1> ta is:</h1>"+ta);
            out.println("<h1> pf is:</h1>"+pf);
            out.println("<h1> hra is:</h1>"+hra);
            out.println("<h1> Gross salary is:</h1>"+gs);
        }
        else if (c>5000 && c<=10000)
        {
        	int da=(c*12)/100;
        	int ta=(c*10)/100;
        	int pf=(c*8)/100;
        	int hra=(c*12)/100;
        	int gs=da+ta-pf+hra;
        	out.println("<h1> da is:</h1>"+da);
        	out.println("<h1> ta is:</h1>"+ta);
            out.println("<h1> pf is:</h1>"+pf);
            out.println("<h1> hra is:</h1>"+hra);
            out.println("<h1> Gross salary is:</h1>"+gs);
            
        }
        else if (c>10000 && c<=20000)
        {
        	int da=(c*15)/100;
        	int ta=(c*12)/100;
        	int pf=(c*10)/100;
        	int hra=(c*14)/100;
        	int gs=da+ta-pf+hra;
        	out.println("<h1> da is:</h1>"+da);
        	out.println("<h1> ta is:</h1>"+ta);
            out.println("<h1> pf is:</h1>"+pf);
            out.println("<h1> hra is:</h1>"+hra);
            out.println("<h1> Gross salary is:</h1>"+gs);
        }
        else if (c>20000 && c<=40000)
        {
        	int da=(c*20)/100;
        	int ta=(c*15)/100;
        	int pf=(c*15)/100;
        	int hra=(c*20)/100;
        	int gs=da+ta-pf+hra;
        	out.println("<h1> da is:</h1>"+da);
        	out.println("<h1> ta is:</h1>"+ta);
            out.println("<h1> pf is:</h1>"+pf);
            out.println("<h1> hra is:</h1>"+hra);
            out.println("<h1> Gross salary is:</h1>"+gs);
        }
        else
        {
        	int da=(c*25)/100;
    	int ta=(c*20)/100;
    	int pf=(c*20)/100;
    	int hra=(c*15)/100;
    	int gs=da+ta-pf+hra;
    	out.println("<h1> da is:</h1>"+da);
    	out.println("<h1> ta is:</h1>"+ta);
        out.println("<h1> pf is:</h1>"+pf);
        out.println("<h1> hra is:</h1>"+hra);
        out.println("<h1> Gross salary is:</h1>"+gs);
        }
    %>
    </h1>
</body>
</html>