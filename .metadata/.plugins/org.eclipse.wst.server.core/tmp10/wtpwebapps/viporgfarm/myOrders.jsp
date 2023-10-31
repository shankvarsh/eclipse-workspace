<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.sql.*" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Orders</title>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <meta name="Description" content="Enter your description here" />
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <!-- bootstrap CDN -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
  <!-- OWN CSS -->
  <link rel="stylesheet" href="css/cartstyle.css">
  <link rel="stylesheet" href="css/responsive-style.css">
  <link rel="stylesheet" href="css/yourcartcss.css">
</head>
<body data-bs-spy="scroll" data-bs-target=".navbar" data-bs-offset="100">
<%String email=session.getAttribute("email").toString(); %>
  <header>
    <nav class="navbar navbar-expand-lg navigation-wrap">
      <div class="container">
        <a class="navbar-brand" href="#">
          <img src="./images/organicLogo.png" class="img-fluid" style="position:absolute;margin-left:550px;">
          <img src="./images/Viplogo.png" class="img-fluid">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <!-- <span class="navbar-toggler-icon"></span> -->
          <i class="fas fa-stream navbar-toggler-icon"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link " href="homepage.jsp">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="myCart.jsp">My Cart</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="myOrders.jsp">My Orders</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="Logout.jsp">Logout</a>
            </li>
            <li><a href="#"><h3 style="font-size:1.5rem; color:#380556;"> <%out.println(email);%></h3></a></li>
          </ul>
        </div>
      </div>
    </nav>
  </header>
<div class="container">
<h1 class="text-center" style="position:absolute;border-color:black;margin-left: 530px ;font-size:50px;color: #1D244B;top:150px" >ORDERS</h1>

<table class="table table-hover shopping-cart-wrap" style="position:absolute;top:260px;width:1200px;margin-left:60px" >
<thead class="text-muted">
          <tr>
            <th scope="col">S.No</th>
            <th scope="col">Product Name</th>
            <th scope="col">category</th>
            <th scope="col">  Price</th>
            <th scope="col">Quantity</th>
            <th scope="col"> Sub Total</th>
             <th scope="col">Payment Method</th>
              <th scope="col">Status</th>
              
          </tr>
        </thead>
        <tbody>
<%
int sno=0;
try {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select *from cart inner join products where cart.productid=products.id and cart.email='"+email+"'");
	while(rs.next())
	{
		sno=sno+1;
%>
          <tr>
            <td><% out.println(sno); %></td>
            <td><%=rs.getString(15) %></td>
            <td><%=rs.getString(16) %></td>
            <td> <%=rs.getString(17) %></td>
            <td><%=rs.getString(3) %> </td>
             <td><%=rs.getString(5) %></td>
              <td><%=rs.getString(11) %></td>
               <td><%=rs.getString(13) %></td>
            <br>
          </tr>
        </tbody>
          <%} %>
      </table>
   </div>
 </div>
<%
	}

catch(Exception e)
{
	System.out.println(e);
}
%>
</body>
</html>