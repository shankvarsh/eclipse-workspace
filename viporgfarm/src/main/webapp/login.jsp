<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link rel="stylesheet" href="./css/style1.css">
  <link rel="stylesheet" href="./css/responsive-style.css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	<!--Custom styles-->
	<link rel="stylesheet" type="text/css" href="./css/logincss.css">
</head>
<body background="./images/organiclogin1.jpg">
 <header>
    <nav class="navbar  navbar-expand-lg navigation-wrap ">
           <img src="images/Viplogo.png" class="img-fluid" style="position:absolute;margin-left:10px;">
      <div class="container" >
        <div class="collapse navbar-collapse" id="navbarNav" >
            
          </div>
        <a class="navbar-brand" href="#">
     <a href="firstpage.jsp">   <img src="./images/organicLogo.png" class="img-fluid" ></a> 
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <!-- <span class="navbar-toggler-icon"></span> -->
          <i class="fas fa-stream navbar-toggler-icon"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav" style="position:absolute;margin-left:550px;">
          <ul class="navbar-nav ms-auto mb-2 mb-lg-0">

      
          </ul>
        </div>
      </div>
    </nav>
  </header>
<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>Login</h3>
				<div class="d-flex justify-content-end social_icon">
					
				</div>
			</div>
			<div class="card-body">
				<form action="loginAction.jsp" method="post">
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="email" name="email" class="form-control" placeholder="username" required>
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" name="password" class="form-control" placeholder="password" required>
					</div>
					
					<div class="form-group">
						<input type="submit" value="Login" class="btn float-right login_btn">
					</div>
				</form>
			</div>
			<div class="card-footer">
				<div class="d-flex justify-content-center links">
					Don't have an account?<a href="signup.jsp">Create Account</a>
				</div>
				<div class="d-flex justify-content-center">
					<a href="forgotPassword.jsp">Forgot your password?</a>
				</div>
			</div>
		</div>
	</div>
</div>
 <%
 String msg =request.getParameter("msg");
 if("notexist".equals(msg))
 {
 %>
  <h5 style="position:absolute; bottom:280px; margin-left:600px; color:white;">Incorrect Username or Password</h5>
<%} %>
<%
if ("invalid".equals(msg)) 
{%>
<h5 style="position:absolute; bottom:280px; margin-left:600px; color:white;">Invalid. Please Try Again!</h5>
<%} %>
   

</body>
</html>