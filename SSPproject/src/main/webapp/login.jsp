<!DOCTYPE html>
<html>
<head>
<title>Login</title>
</head><body  bgcolor = "FFEFD5">
<form action="loginAction.jsp" method= "post">
<h1>Welcome to THE CAM STORE</h1><BR><BR>
<input type="email" name="email" placeholder="Enter Email" required><br>
<input type="password" name="password" placeholder="Enter password" required><br>
<input type="submit" value="login">
</form>
      <h2><a href="signup.jsp">SignUp</a></h2>
       <h2><a href="forgotPassword.jsp">Forgot Password?</a></h2>
 <%
 String msg =request.getParameter("msg");
 if("notexist".equals(msg))
 {
 %>
  <h1>Incorrect Username or Password</h1>
<%} %>
<%
if ("invalid".equals(msg)) 
{%>
<h1>Error occured. Try Again !</h1>
<%} %>
   

</body>
</html>