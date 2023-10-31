<%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<title>Payment page</title>
<meta charset="utf-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">
	<link rel="stylesheet" href="../css/style.css">
	<link rel="stylesheet" href="../css/responsive-style.css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<link rel="stylesheet" href="css/cartstyle.css">
  <link rel="stylesheet" href="css/yourcartcss.css">
<style type="text/css">
		body {
    color: #000;
    overflow-x: hidden;
    height: 100%;
    background:white;
    background-repeat: no-repeat;
    background-size: 100% 110%

}

.card {
    padding: 30px 40px;
    margin-top: 60px;
    margin-bottom: 60px;
    border: none !important;
    box-shadow: 0 6px 12px 0 rgba(0, 0, 0, 0.2)
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
<script>
if(window.history.forward(1) !=null)
	window.history.forward(1);
	</script>
</head>
<body>
<header>
		<nav class="navbar  navbar-expand-lg navigation-wrap ">
					 <img src="images/Viplogo.png" class="img-fluid" style="position:absolute;margin-left:20px;">
			<div class="container" >
				<div class="collapse navbar-collapse" id="navbarNav" >
						<a class="main-btn" href="homepage.jsp">Home</a>
						<a class="main-btn" href="myCart.jsp">Back</a>
					</div>
				<a class="navbar-brand" href="#">
				 <img src="images/organicLogo.png" class="img-fluid">
				</a>
				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
					<!-- <span class="navbar-toggler-icon"></span> -->
					<i class="fas fa-stream navbar-toggler-icon"></i>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav ms-auto mb-2 mb-lg-0">

						<li><a class="main-btn" href="Logout.jsp">Logout</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
<br>

<%
String email= session.getAttribute("email").toString();
int total=0;
int sno=0;
try {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
	Statement st=con.createStatement();
	ResultSet rs1=st.executeQuery("select sum(total) from cart where email='"+email+"' and address is NULL");
	while(rs1.next())
	{
		total=rs1.getInt(1);

	} 
	
	 ResultSet rs2=st.executeQuery("select *from users where email='"+email+"' ");
     while(rs2.next())
     {
  	 
     %>       
<h2 style="position:absolute;margin-left:80px;top:105px;color:#00a149">CONGRATULATIONS <%out.println(email);%>YOU AVAIL 10% DISCOUNT ON TOTAL PRICE!</h2>
<div class="container" style="position:absolute;top:59px;margin-left:150px" >
<form action="addresspaymentpage.jsp" method="post">
		<h2 style="margin-left:150px;top:130px;position:absolute;font-size:25px" >You pay(after 10% discount):<h2 style="margin-left:500px;top:130px;position:absolute;font-size:32px;color: black" > Rs.<%out.println(total-(total/10)); %></h2> </h2>
	<h3 style="margin-left:150px;top:180px;position:absolute;font-size:25px;font-family: Verdana, Arial, Helvetica, sans-serif ;border:2px solid ;padding:6px">Enter Address</h3>
	<input style="margin-left:360px;border:2px solid;top:175px;position:absolute" type = "text" name="address" value="<%=rs2.getString(7)%>" placeholder="Enter address" required>
<h3 style="margin-left:650px;width: 200px;top:180px;position:absolute;font-size:25px;font-family: Verdana, Arial, Helvetica, sans-serif ;border:2px solid ; padding:6px">Enter City</h3>
	<input style="margin-left:870px;border:2px solid;top:175px;position:absolute" type = "text" name="city" value="<%=rs2.getString(8)%>" placeholder="Enter city" required>
	<h3 style="margin-left:150px;width: 189px;top:270px;position:absolute;font-size:25px;font-family: Verdana, Arial, Helvetica, sans-serif ;border:2px solid ;padding:6px">Enter State</h3>
	<input style="margin-left:360px;border:2px solid;top:265px;position:absolute" type = "text" name="state" value="<%=rs2.getString(9)%>" placeholder="Enter state" required>
	<h3 style="margin-left:650px;width: 200px;top:270px;position:absolute;font-size:25px;font-family: Verdana, Arial, Helvetica, sans-serif ;border:2px solid ;padding:6px">Enter Country</h3>
	<input style="margin-left:870px;border:2px solid;top:265px;position:absolute" type = "text" name="country" value="<%=rs2.getString(10)%>" placeholder="Enter country" required>

<h3 style="margin-left:150px;width: 189px;top:370px;position:absolute;font-size:25px;font-family: Verdana, Arial, Helvetica, sans-serif ;border:2px solid ;padding:6px">EnterPayMode</h3>
	<input style="margin-left:360px;border:2px solid;top:365px;position:absolute" type = "text" name="paymentmethod" value="Online transaction" placeholder="Enter payment method" required>
	
<h3 style="margin-left:650px;width: 200px;top:370px;position:absolute;font-size:25px;font-family: Verdana, Arial, Helvetica, sans-serif ;border:2px solid ;padding:6px">MobileNumber</h3>
	<input style="margin-left:870px;border:2px solid;top:365px;position:absolute" type = "text" name="mobilenumber" value="<%=rs2.getString(3)%>" placeholder="Enter mobile number" required>
	


<h3 style="margin-left:150px;width: 450px;top:470px;position:absolute;font-size:25px;font-family: Verdana, Arial, Helvetica, sans-serif ;border:2px solid ;padding:6px">Pay online to THE ORGANIC FARM</h3>
<input style="margin-left:660px;border:2px solid;top:465px;position:absolute" type = "text" name="transactionid" placeholder="Enter TransactionId" required>
<img src="images/qr_code.png" style="position:absolute;top:465px;margin-left:950px; width:300px" alt="">

<h3 style="color: red;margin-left:150px;top:565px;position:absolute">*Please enter your transaction ID.</h3>

<h3 style="color: red;margin-left:150px;top:620px;position:absolute">T&C* Orders may be terminated if transactionId is incorrect.</h3>
<button class="main-btn" style="margin-left:150px;top:670px;position:absolute" type="submit"> Proceed to Bill</button>
<h3 style="color: red;margin-left:150px;top:750px;position:absolute">*Please check all the details before proceeding to bill.</h3>

</form>
</div>
<%
}}
catch(Exception e){
System.out.println(e);
}
%>
      <br>
      <br>
      <br>

</body>
</html>