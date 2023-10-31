<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ThreeInOne</title>
</head>
<body>
<%!                        // 1st declaration
  String str;              // variables to retrieve client data of name and numbers
  int fn, sn, product;
%>
                           <!-- 2nd declaration -->	
<%!                        // standard user name
  String stdUser = "Nadar";  // infact, the two declarations can be made one. 
%>                         <!--  it is just to show that multiple declarations are possible -->
				
<%                         // 1st scriptlet to extract client data
  str = request.getParameter("t1");          // str is global variable declared in first declaration
  String str1 = request.getParameter("t2");
  String str2 = request.getParameter("t3");  // str1 and str2 are local to scriptlet as they are declared here itself  and used
                           // convert (parse) str1 and str2 into integer values for arithmetic operations		
  fn = Integer.parseInt(str1);	
  sn = Integer.parseInt(str2);  	
  product = fn * sn;
 %>                        <!-- // close first scriptlet -->
                           <!-- second scriptlet using global values and validating -->
<%                         // infact, both scriptlets can be clubbed; it is just to show two scriptlets are 
                           //possible and access to global variables are possible from any number of scriptlets
  out.println("Accessing global variables from scriptlet:<br>");
  if(str.endsWith(stdUser))
    out.println("<b>Product of " + fn + " and " + sn + " is " + product + "</b>");
  else
    out.println("<b>You are not eligible to get product as your login failed</b>");
 %>
<hr>
                           <!-- three expressions using the declaration global values -->
Accessing global variables from Expression<br>
Your first number: <%= fn %>. <br>
Your Second number: <%= sn %>. <br>
Their product: <%= product %>. <br>

</body>
</html>