<%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta content="text/html; charset=ISO-8859-1">
<title>Admin orders</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <meta name="Description" content="Enter your description here" />
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <!-- bootstrap CDN -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
  <!-- OWN CSS -->
  <link rel="stylesheet" href="../css/cartstyle.css">
  <link rel="stylesheet" href="../css/responsive-style.css">
  <link rel="stylesheet" href="../css/style.css">
  <link rel="stylesheet" href="../css/yourcartcss.css">
</head>
<body>
<%String email=session.getAttribute("email").toString(); %>
  <!-- header design -->
  <header>
    <nav class="navbar navbar-expand-lg navigation-wrap" style="background:#D6FE97;top:0px;">
      <div class="container" >
        <a class="navbar-brand" href="adminHome.jsp">
          <img src="../images/organicLogo.png" class="img-fluid" style="position:absolute;margin-left:550px;top:7px;">
           </a>
           <a class="navbar-brand" href="../finalVIP/start_page.html">
          <img src="../images/Viplogo.png" class="img-fluid">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <!-- <span class="navbar-toggler-icon"></span> -->
          <i class="fas fa-stream navbar-toggler-icon"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link"  href="adminHome.jsp">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link " href="allProductEditProduct.jsp">Edit products</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="ordersReceived.jsp">Orders</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="../Logout.jsp">Logout</a>
            </li>
            <li><a href="#"><h3 style="font-size:1.5rem; color:#380556;"> <%out.println(email);%></h3></a></li>
          </ul>
        </div>
      </div>
    </nav>
  </header>
 <h3>Orders Received</h3>
<%
String msg=request.getParameter("msg");

if("cancel".equals(msg))
		{
	%>
<h3  style="position:absolute;margin-left:650px; color:red;top:220px;" >Order is Cancelled!</h3>
<%}%>
<%
if("delivered".equals(msg))
		{%>
<h3  style="position:absolute;margin-left:650px; color:red;top:220px;">Order is delivered!</h3>
<%}%>
<%
if("invalid".equals(msg))
		{%>
<h3  style="position:absolute;margin-left:650px; color:red;top:220px;">Error occured! Please try again!</h3>
<%}%>
<%
int total=0;
try {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
	Statement st=con.createStatement();
	ResultSet rs1=st.executeQuery("select sum(total) from cart where statuss='delivered'");
	while(rs1.next())
	{
		total=rs1.getInt(1);
	} 
	%>
	<div class="container">
<h1 class="text-center" style="position:absolute;border-color:black;margin-left: 490px ;font-size:50px;color: #1D244B;top:100px" >All Products</h1>

 <h2 style="position:absolute;top:180px;margin-left:60px">Account balance:  <%out.println(total-(total/10)); %> </h2>
<table class="table table-hover shopping-cart-wrap"  id="customers" style="position:absolute;top:260px;width:1200px;margin-left:60px" >
<thead class="text-muted">
          <tr>
          
          <th scope="col">sno</th>
          <th scope="col">Email</th>
          <th scope="col">Mobile Number</th>
            <th scope="col">Product Name</th>
            <th scope="col">Quantity</th>
            <th scope="col"> Sub Total</th>
            <th scope="col">Address</th>
            <th scope="col">City</th>
            <th scope="col">State</th>
            <th scope="col">Country</th>
             <th scope="col">Payment Method</th>
              <th scope="col">T-ID</th>
              <th scope="col">Status</th>
              <th scope="col">Action</th>
          </tr>
          <%
		}
catch(Exception e)
		{
	System.out.println(e);
		}
%>
          
      <%
      
      int sno=0;
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select *from cart inner join products where cart.productid=products.id and cart.transactionid is not NULL and cart.statuss='processing'");
			while(rs.next())
			{
				sno=sno+1;
			%>  
       

           
         
          <tr>
          
          <td><% out.println(sno); %></td>
            <td><%=rs.getString(1) %></td>
            <td><%=rs.getString(10) %></td>
            <td> <%=rs.getString(15) %></td>
            <td><%=rs.getString(3) %> </td>
             <td><%=rs.getString(5) %></td>
              <td><%=rs.getString(6) %></td>
               <td><%=rs.getString(7) %></td>
               <td> <%=rs.getString(8) %></td>
            <td><%=rs.getString(9) %> </td>
             <td><%=rs.getString(11) %></td>
              <td><%=rs.getString(12) %></td>
               <td><%=rs.getString(13) %></td>
            
      
               <td><a href="cancelordersAction.jsp?id=<%=rs.getString(2)%>&email=<%=rs.getString(1)%>">Cancel </a></td>
                <td><a href="deliveredordersAction.jsp?id=<%=rs.getString(2)%>&email=<%=rs.getString(1)%>">Deliver </a></td>
            </tr>
            <%} %>
        </table>
    
<%
		}
catch(Exception e)
		{
	System.out.println(e);
		}
%>
</body>
</html>