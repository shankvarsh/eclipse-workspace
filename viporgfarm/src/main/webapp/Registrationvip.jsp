<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account</title>
	
<style>
body {
  background-image: url("./images/bg/bg-4.jpg");

  text-align: center;
  font-size:25px;
}
.container {
  position: relative;
  text-align: center;

  color: white;
  
}
.text-block {
  position: absolute;
  top:2px;
  left:35%;
  text-align:left;
  font-family:Californian FB ;
   font-size:25px;
  color: black;
}
input[type=submit] {
    background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    float:left;
}
input[type=submit]:hover {
background-color: #32a336;
}
</style>
</head>
<body>
 <header>
      <nav class="navbar navbar-expand-lg navigation-wrap" style="background:#472780">
        <div class="container">
          <a class="navbar-brand" href="./finalVIP/start_page.html">
             <img src="./images/Viplogo.png" class="img-fluid" style="margin-Left:100px">
          </a>
</div>
</nav>
          </header>
<form action="regact.jsp" method="post">
<div class="container">

     <div class="text-block" style="margin-top:100px;">
     <h1><b>Create Account</b></h1>
      <table  align="Center" >
   <tr>
   <td><b>Enter Full Name:</b></td>  
   <td><input type="text" name="t1" size=20></td>
    </tr>
    <tr><td><b>Enter Mobile Number:</b></td>
<td> <input type="text" name="t2" size=20></td>
</tr>
<tr>
<td><b>Enter Email:</b>  </td> 
 <td><input type="text" name="t3" size=20></td>
</tr>
<tr>
<td><b>Enter Password:</b>  </td> 
 <td> <input type="password" name="t4" size=20></td>
</tr>
<tr>
<td><b>Enter Pin Code:</b>  </td> 
 <td> <input type="text" name="t5" size=20></td>
</tr>
<tr>
<td><b>Enter Flat/HouseNo:</b></td> 
 <td> <input type="text" name="t6" size=20></td>
</tr>
<tr>
<td><b>Enter Area/Colony/Street:</b>  </td> 
 <td> <input type="text" name="t7" size=20></td>
</tr>
<tr>
<td><b>Enter Landmark: </b> </td> 
 <td><input type="text" name="t8" size=20></td>
</tr>
<tr>
<td><b>Enter City/Town:</b> </td> 
 <td><input type="text" name="t9" size=20></td>
</tr>
<tr>
<td><b>Enter State:</b> </td> 
 <td><input type="text" name="t10" size=20></td>
</tr>
<tr>
<td><b>Enter Country:</b>  </td> 
 <td> <input type="text" name="t11" size=20></td>
</tr>
 </table>
<input type="Submit" value="Create Account"  style=" border-color:black;float:middle ;margin-left:100px;margin-top:10px;font-size:30px" > 

</div>

</div>
</form>
<h6 style="position:absolute;top: 570px; margin-left:638px">Already have an account?<a href="./finalVIP/loginvip.jsp">Login.</a> </h6>
 <%
  String msg=request.getParameter("msg");
  if("valid".equals(msg))
  {
  %>
<h2 style="position:absolute;top: 600px; margin-left:550px">Successfully Registered !</h2>
<%}%> 
<%
if ("invalid".equals(msg))
{
	 %>
<h2 style="position:absolute;top: 600px; margin-left:550px">Error occured. Please try again.</h2>
<%}%> 
</body>
</html>