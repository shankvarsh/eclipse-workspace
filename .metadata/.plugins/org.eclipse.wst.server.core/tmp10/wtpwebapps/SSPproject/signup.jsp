<!DOCTYPE html>
<html>
<head>

<title>Signup</title>
</head>
<body bgcolor = "E6E6FA">

    <form action="signupAction.jsp" method="post">
    <input type="text" name="name" placeholder="Enter Name" required><br>
     <input type="email" name="email" placeholder="Enter Mail ID" required><br>
      <input type="number" name="mobilenumber" placeholder="Enter Mobile number" required><br>
      <select name="securityQuestion" required>
      <option value="Where were you born?"> Where were you born?</option>
      <option value="What is your favourite colour?">What is your favourite colour? </option>
      <option value="Who is your bestfriend?">Who is your bestfriend? </option>
      </select><br>
       <input type="text" name="answer" placeholder="Enter Answer" required><br>
       <input type="password" name="password" placeholder="Enter Password" required><br>
<input type="submit" value="signup">
    </form>
      <h2><a href="login.jsp">Login</a></h2>
  <%
  String msg=request.getParameter("msg");
  if("valid".equals(msg))
  {
  %>
<h1>Successfully Registered !</h1>
<%}%> 
<%
if ("invalid".equals(msg))
{
	 %>
<h1>Error occured. Please try again.</h1>
<%}%> 
   
</body>
</html>