<%@page import="java.sql.*" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Cart</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <meta name="Description" content="Enter your description here" />
  <title>100% Organic</title>
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <!-- bootstrap CDN -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
  <!-- OWN CSS -->
  <link rel="stylesheet" href="./css/cartstyle.css">
  <link rel="stylesheet" href="./css/responsive-style.css">
  <link rel="stylesheet" href="./css/yourcartcss.css">

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
              <a class="nav-link active" aria-current="page" href="myCart.jsp">My Cart</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="myOrders.jsp">My Orders</a>
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
<% 
String msg=request.getParameter("msg");
if("notpossible".equals(msg))
{
%>
<h3 style="position:absolute;margin-left:650px; color:red;top:200px;" >Click on remove!</h3>
<%} %>
<%
if("inc".equals(msg))
{
%>
<h3 style="position:absolute;margin-left:650px; color:red;top:200px;">Quantity Increased.</h3>
<%} %>
<%
if("dec".equals(msg))
{
%>
<h3 style="position:absolute;margin-left:650px; color:red;top:200px;">Quantity  Decreased.</h3>
<%} %>
<%
if("removed".equals(msg))
{
%>
<h3 style="position:absolute;margin-left:650px; color:red;top:200px;">Product Removed!</h3>
<%} %>




<%
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
	%>
<div class="container">
<br>  <h1 class="text-center" style="position:absolute;border-color:black;margin-left: 550px ;font-size:50px;color: #1D244B;top:100px" >CART</h1>


<h2 style="position:absolute;top:180px;margin-left:60px">Total : <%out.println(total); %> </h2>
<%if(total>0){ %> <a href="addressPaymentForOrder.jsp" class="main-btn" style="position:absolute;top:100px;margin-left:1150px;">Proceed to order</a><%} %>
<div class="card" style="position:absolute;top:230px;width:1200px;margin-left:60px">
<table class="table table-hover shopping-cart-wrap" >
<thead class="text-muted">
<tr>
  <th scope="col">S.No</th>
  <th scope="col">Product</th>
  <th scope="col">Category</th>

  <th scope="col" width="120">Price</th>
  <th scope="col" width="120">Quantity</th>
  <th scope="col" width="120">Sub Total</th>

  <th scope="col" width="200" class="text-right">Action</th>
</tr>
</thead>
<tbody>
      <%
      ResultSet rs=st.executeQuery("select *from products inner join cart on products.id=cart.productid and cart.email='"+email+"' and cart.address is NULL");
      while(rs.next())
      {
      %>
          <tr>
			<% sno=sno+1; %>
          	 <td><% out.println(sno); %></td>
            <td><%=rs.getString(2) %></td>
            <td><%=rs.getString(3) %></td>
            <td><%=rs.getString(4) %> </td>
            <td><a href="QuantityAction.jsp?id=<%=rs.getString(1)%>&quantity=inc">+</a><%=rs.getString(8) %>  <a href="QuantityAction.jsp?id=<%=rs.getString(1)%>&quantity=dec">-</a></td>
            <td><%=rs.getString(10) %></td>
            <td><a href="removepage.jsp?id=<%=rs.getString(1)%>">Remove </a></td>
          </tr>
<%
      }}
catch(Exception e)
{System.out.println(e);
	}
%>
         

        </tbody>
      </table>
      </div>
 </div>
</body>
</html>