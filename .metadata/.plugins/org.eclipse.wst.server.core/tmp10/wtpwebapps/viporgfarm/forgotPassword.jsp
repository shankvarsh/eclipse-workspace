<!DOCTYPE html>
<html>
<head>
<title>ForgotPassword</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!--Fontawesome CDN-->
<!------ Include the above in your HEAD tag ---------->

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">

 <style>
 	.form-gap {
    padding-top: 70px;
}
 </style>
</head>
<body>
	<div style="position: absolute;margin-left:150px;top:150px; ">
		<img src="./images/forgotpass.jpg">
	</div>
	 <div class="form-gap"></div>
<div class="container" style="position:absolute;margin-left:700px;max-width:500px" >
	<div class="row">
		<div class="col-md-4 col-md-offset-4" style="position:absolute;margin-left:150px;max-width:300px">
            <div class="panel panel-default">
              <div class="panel-body">
                <div class="text-center">
                  <h3><i class="fa fa-lock fa-4x"></i></h3>
                  <h2 class="text-center">Forgot Password?</h2>
                  <p>You can reset your password here.</p>
                  <div class="panel-body">
    
                    <form action="forgotPasswordAction.jsp" method="post">
    
                      <div class="form-group">
                        <div class="input-group">
                          <span class="input-group-addon"><i class="glyphicon glyphicon-envelope color-blue"></i></span>
                          <input name="email" placeholder="email address" class="form-control"  type="email" required>
                      </div>
                           <input name="mobilenumber" placeholder="Mobile Number" class="form-control"  type="number" required></div>
           <select name="securityQuestion" style="width:100%">
	  <option value="Where were you born?">Where were you Born?</option>
	  <option value="What is your favourite colour?">What is your favourite color?</option>
	  <option value="Who is your bestfriend?">Who is your Best Friend?</option>
	 </select></div>

                            <input name="answer" placeholder="Answer" class="form-control"  type="text" required><br>
                             <input name="newpassword" placeholder="New Password" class="form-control"  type="password" required><br>
                        </div>
                      </div>
                      <div class="form-group">
                        <input class="btn btn-lg btn-primary btn-block" value="Reset Password" type="submit">
                      </div>
                      
                      <input type="hidden" class="hide" name="token" id="token" value=""> 
                    </form>
                    <h5><a href="login.jsp">Back to Login...</a></h5>
                  </div>
                </div>
              </div>
            </div>
          </div>
	</div>
</div>
    <%
 String msg =request.getParameter("msg");
 if("done".equals(msg))
 {
 %>
 <h4 style="position:absolute; bottom:80px; margin-left:830px;">Password Changed Successfully!</h4>
<%} %>
<%
if ("invalid".equals(msg)) 
{%>
 <h4 style="position:absolute; bottom:80px; margin-left:870px;">Error occured! Try again!</h4>
<%} %>
   
</body>
</html>