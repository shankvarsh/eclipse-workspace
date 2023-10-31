<%@page import="java.sql.*" %>
<html>
<head>
<title>Bill</title>
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
</head>
<body>
<header>
		<nav class="navbar  navbar-expand-lg navigation-wrap ">
					 <img src="images/Viplogo.png" class="img-fluid" style="position:absolute;margin-left:20px;">
			<div class="container" >
				<div class="collapse navbar-collapse" id="navbarNav" >
						
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
                         <li><a class="main-btn" href="continueShopping.jsp">Continue Shopping</a></li>
						<li><a class="main-btn" href="Logout.jsp">Logout</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<center>  <div style="position:absolute;top:80px;background:#00a149;color:#FFC222;padding:20px;width:100%;font-family:sans-serif;font-size:35px">
  <img src="images/check-mark (1).png"><br>ORDER PLACED!<br>  THANK YOU!! <br> Will be delivered in 24 hours!
      </div></center>
<%
String email=session.getAttribute("email").toString();
int total=0;
int sno=0;
try {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select sum(total) from cart where email='"+email+"'and statuss='bill'");
	while(rs.next())
	{
		total=rs.getInt(1);
		} 
	ResultSet rs2=st.executeQuery("select *from users inner join cart where cart.email='"+email+"'and cart.statuss='bill'");
	while(rs2.next())
	{ 
%>


 <div class="card" style="position:absolute;margin-left:30px;top:300px;width:95%;">
<form action="editProductsAction.jsp" class="form-card" method="post" >
<div class="row justify-content-between text-left">
<div class="form-group col-sm-6 flex-column d-flex"><h4 style="font-size:2rem; color:purple;"> <label class="form-control-label px-3" style="font-size:2rem; color:purple;">Email<span class="text-danger">*</span></label></h4> <label class="form-control-label px-3" style="font-size:1.8rem; position:absolute;margin-left:100px"><%out.println(email); %> </div>
<div class="form-group col-sm-6 flex-column d-flex"><h4 style="font-size:2rem; color:purple;"> <label class="form-control-label px-3" style="font-size:2rem; color:purple;">Mobile Number<span class="text-danger">*</span></label> </h4> <label class="form-control-label px-3" style="font-size:1.8rem; position:absolute;margin-left:250px"><%=rs2.getString(20) %></label> </div>
                    </div>
                    <div class="row justify-content-between text-left">
<div class="form-group col-sm-6 flex-column d-flex"><h4 style="font-size:2rem; color:purple;"> <label class="form-control-label px-3" style="font-size:2rem; color:purple;">Payment Method<span class="text-danger">*</span></label></h4> <label class="form-control-label px-3" style="font-size:1.8rem; position:absolute;margin-left:280px"><%=rs2.getString(21) %> </div>
<div class="form-group col-sm-6 flex-column d-flex"><h4 style="font-size:2rem; color:purple;"> <label class="form-control-label px-3" style="font-size:2rem; color:purple;">Transaction Id<span class="text-danger">*</span></label> </h4> <label class="form-control-label px-3" style="font-size:1.8rem; position:absolute;margin-left:240px"><%=rs2.getString(22) %></label> </div>
                    </div>
<div class="row justify-content-between text-left">
<div class="form-group col-sm-6 flex-column d-flex"><h4 style="font-size:2rem; color:purple;"> <label class="form-control-label px-3" style="font-size:2rem; color:purple;">City<span class="text-danger">*</span></label></h4> <label class="form-control-label px-3" style="font-size:1.8rem; position:absolute;margin-left:100px"><%=rs2.getString(17) %> </div>
<div class="form-group col-sm-6 flex-column d-flex"><h4 style="font-size:2rem; color:purple;"> <label class="form-control-label px-3" style="font-size:2rem; color:purple;">Address<span class="text-danger">*</span></label> </h4> <label class="form-control-label px-3" style="font-size:1.8rem; position:absolute;margin-left:160px"><%=rs2.getString(16) %></label> </div>
                    </div>
<div class="row justify-content-between text-left">
<div class="form-group col-sm-6 flex-column d-flex"><h4 style="font-size:2rem; color:purple;"> <label class="form-control-label px-3" style="font-size:2rem; color:purple;">State<span class="text-danger">*</span></label></h4> <label class="form-control-label px-3" style="font-size:1.8rem; position:absolute;margin-left:100px"><%=rs2.getString(18) %> </div>
<div class="form-group col-sm-6 flex-column d-flex"><h4 style="font-size:2rem; color:purple;"> <label class="form-control-label px-3" style="font-size:2rem; color:purple;">Country<span class="text-danger">*</span></label> </h4> <label class="form-control-label px-3" style="font-size:1.8rem; position:absolute;margin-left:160px"><%=rs2.getString(19) %></label> </div>
                    </div>
                    
                    </form>
                    </div>
                    

<%break;} %>

	<br>

<table id="customers">
<div class="container" >


<table class="table table-hover shopping-cart-wrap" style="position:relative;top:790px;width:1200px;margin-left:150px" >
<thead class="text-muted">
  <tr>
    <th>S.No</th>
    <th>Product Name</th>
    <th>category</th>
    <th>Price</th>
    <th>Quantity</th>
     <th>Sub Total</th>
  </tr>
  <%
  ResultSet rs1=st.executeQuery("select *from cart inner join products where cart.productid= products.id and cart.email='"+email+"' and cart.statuss='bill'");
  while (rs1.next())
  {
	  sno=sno+1;
  %>
  <tr>
    <td><% out.println(sno); %></td>
    <td><%=rs1.getString(15) %></td>
    <td><%=rs1.getString(16) %></td>
    <td><%=rs1.getString(17) %></td>
    <td><%=rs1.getString(3) %></td>
     <td><%=rs1.getString(5) %></td>
  </tr>
  <tr>
<%} %>
</tr>
</thead>
</table>
</div>
</table>
<center>
<div style="position:absolute;top:620px;margin-left:555px;">
<h3>Total: Rs.<%out.println(total); %></h3>
<h3>Total after 10% discount: Rs.<%out.println(total-(total/10)); %>/-</h3>

<a onclick="window.print();"><button class="main-btn">Print</button></a>
</div>
</center>
<br><br><br><br>
<%
}
catch(Exception e){
System.out.println(e);
}
%>
</body>
</html>