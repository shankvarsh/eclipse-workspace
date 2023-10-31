<!DOCTYPE html>
<html>
<head>
<head>
	<meta charset="utf-8">
	<title>Register</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">
	<link rel="stylesheet" href="./css/style.css">
	<link rel="stylesheet" href="./css/responsive-style.css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.css"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script >
		function validate(val) {
v1 = document.getElementById("name");
v2 = document.getElementById("mobilenumber");
v3 = document.getElementById("email");
v4 = document.getElementById("password");
v5 = document.getElementById("answer");


flag1 = true;
flag2 = true;
flag3 = true;
flag4 = true;
flag5 = true;


if(val>=1 || val==0) {
if(v1.value == "") {
v1.style.borderColor = "red";
flag1 = false;
}
else {
v1.style.borderColor = "green";
flag1 = true;
}
}

if(val>=2 || val==0) {
if(v2.value == "") {
v2.style.borderColor = "red";
flag2 = false;
}
else {
v2.style.borderColor = "green";
flag2 = true;
}
}
if(val>=3 || val==0) {
if(v3.value == "") {
v3.style.borderColor = "red";
flag3 = false;
}
else {
v3.style.borderColor = "green";
flag3 = true;
}
}
if(val>=4 || val==0) {
if(v4.value == "") {
v4.style.borderColor = "red";
flag4 = false;
}
else {
v4.style.borderColor = "green";
flag4 = true;
}
}
if(val>=5 || val==0) {
if(v5.value == "") {
v5.style.borderColor = "red";
flag5 = false;
}
else {
v5.style.borderColor = "green";
flag5 = true;
}
}


flag = flag1 && flag2 && flag3 && flag4 && flag5;

return flag;
}
	</script>
	<title></title>
	<style type="text/css">
		body {
    color: #000;
    overflow-x: hidden;
    height: 100%;
    background-image: url("images/bg/background1.png");
    background-repeat: no-repeat;
    background-size: 100% 100%

}

.card {
    padding: 30px 40px;
    margin-top: 60px;
    margin-bottom: 60px;
    border: none !important;
    box-shadow: 0 6px 12px 0 rgba(0, 0, 0, 0.2);
    background-color: #FBF8FF;
    
}

.blue-text {
    color: #00BCD4
}

.form-control-label {
    margin-bottom: 0
}

input,
textarea,
button {
    padding: 8px 15px;
    border-radius: 5px !important;
    margin: 5px 0px;
    box-sizing: border-box;
    border: 1px solid #ccc;
    font-size: 18px !important;
    font-weight: 300
}

input:focus,
textarea:focus {
    -moz-box-shadow: none !important;
    -webkit-box-shadow: none !important;
    box-shadow: none !important;
    border: 1px solid #00BCD4;
    outline-width: 0;
    font-weight: 400
}

.btn-block {
    text-transform: uppercase;
    font-size: 18px !important;
    font-weight: 400;
    height: 43px;
    cursor: pointer
}

.btn-block:hover {
    color: #fff !important
}

button:focus {
    -moz-box-shadow: none !important;
    -webkit-box-shadow: none !important;
    box-shadow: none !important;
    outline-width: 0
}
h1{
	font-family: cursive;
}
	</style>
</head>
<body>
	<header>
		<nav class="navbar  navbar-expand-lg navigation-wrap ">
			<div class="container" >
				<div class="collapse navbar-collapse" id="navbarNav" >
						<a class="navbar-brand" href="finalVIP/start_page.html">
				  <img src="./images/Viplogo.png" class="img-fluid" style="position:absolute;margin-left:10px;">
				</a>
					</div>
					   
				
				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
					<!-- <span class="navbar-toggler-icon"></span> -->
					<i class="fas fa-stream navbar-toggler-icon"></i>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">

				</div>
			</div>
		</nav>
	</header>
<div class="container-fluid px-1 py-5 mx-auto">
    <div class="row d-flex justify-content-center">
        <div class="col-xl-7 col-lg-8 col-md-9 col-11 text-center">
            <h1 style="color:white;">REGISTER</h1>

            <div class="card">

                <form class="form-card" action="trialaction.jsp" method="post">
                    <div class="row justify-content-between text-left">
                        <div class="form-group col-sm-6 flex-column d-flex"><h4 style="color:black"> <label class="form-control-label px-3">Name<span class="text-danger"> *</span></label></h4> <input type="text" name="name" placeholder="Enter your name" onblur="validate(1)" required> </div>
                        <div class="form-group col-sm-6 flex-column d-flex"><h4 style="color:black"> <label class="form-control-label px-3">Mobile Number<span class="text-danger"> *</span></label> </h4><input type="number" name="mobilenumber" placeholder="Enter your Mobile number" onblur="validate(2)"> </div>
                    </div>
                    <div class="row justify-content-between text-left">
                        <div class="form-group col-sm-6 flex-column d-flex"> <h4 style="color:black"><label class="form-control-label px-3"> Email<span class="text-danger"> *</span></label> </h4><input type="email" name="email" placeholder="Enter Email" onblur="validate(3)" required> </div>
                        <div class="form-group col-sm-6 flex-column d-flex"> <h4 style="color:black"><label class="form-control-label px-3">Password<span class="text-danger"> *</span></label> </h4><input type="password" name="password" placeholder="Enter Password" onblur="validate(4)" required> </div>
                    </div>
                    
                     <div class="row justify-content-between text-left">
                        <div class="form-group col-sm-6 flex-column d-flex"><h4 style="color:black"> <label class="form-control-label px-3">Address<span class="text-danger"> *</span></label></h4> <input type="text" name="address" placeholder="Enter your address" onblur="validate(1)" required> </div>
                        <div class="form-group col-sm-6 flex-column d-flex"><h4 style="color:black"> <label class="form-control-label px-3">City<span class="text-danger"> *</span></label> </h4><input type="text" name="city" placeholder="Enter your city" onblur="validate(1)"> </div>
                    </div>
                    <div class="row justify-content-between text-left">
                        <div class="form-group col-sm-6 flex-column d-flex"> <h4 style="color:black"><label class="form-control-label px-3"> State<span class="text-danger"> *</span></label> </h4><input type="text" name="state" placeholder="Enter state" onblur="validate(1)" required> </div>
                        <div class="form-group col-sm-6 flex-column d-flex"> <h4 style="color:black"><label class="form-control-label px-3">Country<span class="text-danger"> *</span></label> </h4><input type="text" name="country" placeholder="Enter country" onblur="validate(1)" required> </div>
                    </div>
                    
                    
                    
                    
<br>


									<center>	<div class="row justify-content-center">
                        <div class="form-group col-sm-6 flex-column d-flex"> <h4 style="color:black"><select name="securityQuestion" style="width:70%" required>
	  <option value="Where were you born?">Where were you Born?</option>
	  <option value="What is your favourite colour?">What is your favourite color?</option>
	  <option value="Who is your bestfriend?">Who is your Best Friend?</option>
	 </select> <span class="text-danger"> *</span><br></td></tr>  </div>

                    </div>
										<div class="form-group col-sm-6 flex-column d-flex"> <h4 style="color:black"></label> </h4><input type="text" name="answer" placeholder="Enter Answer" onblur="validate(5)" required> </div>



                    <div class="row justify-content-center">
                        <div class="form-group col-sm-6"><input type="submit" class="btn-block btn-success" value="signup"> </div>
                        <h4>Already have an account?<a href="finalVIP/loginvip.jsp"> Login</a></h4>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
  <%
  String msg=request.getParameter("msg");
  if("valid".equals(msg))
  {
  %>
<h1 style="position:absolute;top: 120px; margin-left:620px;color:white;">Successfully Registered !</h1>
<%}%> 
<%
if ("invalid".equals(msg))
{
	 %>
<h1 style="position:absolute;top: 120px; margin-left:520px;color:white;">Error occured. Please try again.</h1>
<%}%> 
   
</body>
</html>