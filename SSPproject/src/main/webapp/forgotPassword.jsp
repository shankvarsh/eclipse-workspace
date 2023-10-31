<!DOCTYPE html>
<html>
<head>
<title>ForgotPassword</title>
</head>
<body bgcolor ="#FFE5B4">
     <form action="forgotPasswordAction.jsp" method ="post">
     <input type="email" name="email" placeholder="Enter email" required><br>
     <input type="number" name="mobilenumber" placeholder="Enter Mobile number" required><br>
     <select name="securityQuestion">
     <option value="Where were you born?"> Where were you born?</option>
      <option value="What is your favourite colour?">What is your faourite colour? </option>
      <option value="Who is your bestfriend?">Who is your bestfriend? </option>
     </select><br>
      <input type="text" name="answer" placeholder="Enter answer" required><br>
       <input type="password" name="newpassword" placeholder="Enter new password" required><br>
    <input type="submit" value="Save"><br>
    
     </form>
      <h2><a href="login.jsp">Login</a></h2>
    <%
 String msg =request.getParameter("msg");
 if("done".equals(msg))
 {
 %>
 <h1>Password Changed Successfully!</h1>
<%} %>
<%
if ("invalid".equals(msg)) 
{%>
<h1>Error occured. Try Again !</h1>
<%} %>
   
</body>
</html>