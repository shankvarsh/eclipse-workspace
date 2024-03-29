<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Vegetables</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">

  <!-- OWN CSS -->
  <link rel="stylesheet" href="./css/style1.css">
  <link rel="stylesheet" href="./css/responsive-style.css">

</head>
<body style="margin-bottom:50px;">
<%String email=session.getAttribute("email").toString(); %>
  <header>
    <nav class="navbar navbar-expand-lg navigation-wrap">
      <div class="container">
        <a class="navbar-brand" href="#">
          <img src="./images/organicLogo.png" class="img-fluid" style="position:absolute;margin-left:10px;">
          <img src="./images/Viplogo.png" class="img-fluid">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <!-- <span class="navbar-toggler-icon"></span> -->
          <i class="fas fa-stream navbar-toggler-icon"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link" href="homepage.jsp">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="prodvege.jsp">Products</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="myCart.jsp">My Cart</a>
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
    <nav class="navbar  navbar-expand-lg navigation-wrap " style="top:79px;postion:absolute;">
    
     <div class="collapse navbar-collapse" id="navbarNav" >
     
          <ul class="navbar-nav" style="margin-left:250px;">
            <li class="nav-item" >
              <a class="nav-link" href="prodfruits.jsp" style="padding-right:100px;">Fruits</a>
            </li>
             <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="prodvege.jsp" style="padding-right:100px;">Vegetables</a>
            </li>
            
            <li class="nav-item">
              <a class="nav-link  " href="prodgrains.jsp" style="padding-right:100px;">Grains</a>
            </li>
            <li class="nav-item">
              <a class="nav-link " href="proddry.jsp" style="padding-right:100px;">Dry fruits</a>
            </li>
            <li class="nav-item">
              <a class="nav-link " href="prodoil.jsp" style="padding-right:100px;">Oils</a>
            </li>
             <li class="nav-item">
              <a class="nav-link " href="prodspices.jsp" style="padding-right:100px;">Spices</a>
            </li>
            </ul>
            </div>
            
    </nav>
  </header>
  
  
  
   <!-- Products section -->
   <section id="product" class="product">
     <div class="headline text-center mb-5">
       <h2 class="pb-3 position-relative d-inline-block" style="color:#00a149 ">Vegetables</h2>
     </div>
   </section>
   <%
String msg=request.getParameter("msg");
if("added".equals(msg))
{
%>
<h3 style="margin-left:600px; color:red">Added successfully to cart!</h3>
<%} %>
<%
if("exists".equals(msg))
{
%>
<h3 style="margin-left:650px; color:red">Quantity increased!</h3>
<%} %>
<% 
if("invalid".equals(msg))
{
%>
<h3 style="margin-left:600px; color:red" >Error occured! Please try again!</h3>
<%} %>
    <section id="products" class="products">

      <div class="container">
        <div class="row">
          <div class="col-sm-12">
          </div>
          
        </div>
        <div class="row">
        
        
         <div class="col-sm-6 col-lg-4">
           <a href="#" class="d-block text-center mb-4">
             <div class="product-list">
               <div class="product-image position-relative">
<%
try{
	   //Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from products where id=101");
		while(rs.next())
		{
%>
 <img src="./images/img/vege/v1.PNG" alt="products" class="img-fluid product-image-first" >
               </div>
               <div class="product-name pt-3">
                 <h3 class="text-capitalize"><%=rs.getString(2) %></h3>
                 <p class="mb-0 amount">Rs. <%=rs.getString(4) %></p>
                 <div class="py-1">
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                 </div>
              <a href="vegeAction.jsp?id=<%=rs.getString(1) %>">   <button type="button" class="add_to_Card" style="margin-left:230px;line-height: 50px;text-align: center; border-radius: 5px;" >Add to cart </button> </a>
               </div>
             </div>
           </a>
         </div>
        <%
		} }
  catch(Exception e)
	{
		System.out.println(e);
	}
%>
       
       
        <div class="col-sm-6 col-lg-4">
           <a href="#" class="d-block text-center mb-4">
             <div class="product-list">
               <div class="product-image position-relative">
<%
try{
	   //Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from products where id=102");
		while(rs.next())
		{
%>
 <img src="./images/img/vege/v2.PNG" alt="products" class="img-fluid product-image-first" >
               </div>
               <div class="product-name pt-3">
                 <h3 class="text-capitalize"><%=rs.getString(2) %></h3>
                 <p class="mb-0 amount">Rs. <%=rs.getString(4) %></p>
                 <div class="py-1">
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                 </div>
             <a href="vegeAction.jsp?id=<%=rs.getString(1) %>"><button type="button" class="add_to_Card" style="margin-left:230px;line-height: 50px;text-align: center; border-radius: 5px;" >Add to cart </button></a>
               </div>
             </div>
           </a>
         </div>
       

  <%
		} }
  catch(Exception e)
	{
		System.out.println(e);
	}
%>

<div class="col-sm-6 col-lg-4">
           <a href="#" class="d-block text-center mb-4">
             <div class="product-list">
               <div class="product-image position-relative">
<%
try{
	   //Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from products where id=103");
		while(rs.next())
		{
%>
 <img src="./images/img/vege/v3.PNG" alt="products" class="img-fluid product-image-first" >
               </div>
               <div class="product-name pt-3">
                 <h3 class="text-capitalize"><%=rs.getString(2) %></h3>
                 <p class="mb-0 amount">Rs. <%=rs.getString(4) %></p>
                 <div class="py-1">
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                 </div>
           <a href="vegeAction.jsp?id=<%=rs.getString(1) %>"><button type="button" class="add_to_Card" style="margin-left:230px;line-height: 50px;text-align: center; border-radius: 5px;" >Add to cart </button></a>
               </div>
             </div>
           </a>
         </div>
        <%
		} }
  catch(Exception e)
	{
		System.out.println(e);
	}
%>

<div class="col-sm-6 col-lg-4">
           <a href="#" class="d-block text-center mb-4">
             <div class="product-list">
               <div class="product-image position-relative">
<%
try{
	   //Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from products where id=104");
		while(rs.next())
		{
%>
 <img src="./images/img/vege/v4.PNG" alt="products" class="img-fluid product-image-first" >
               </div>
               <div class="product-name pt-3">
                 <h3 class="text-capitalize"><%=rs.getString(2) %></h3>
                 <p class="mb-0 amount">Rs. <%=rs.getString(4) %></p>
                 <div class="py-1">
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                 </div>
           <a href="vegeAction.jsp?id=<%=rs.getString(1) %>"><button type="button" class="add_to_Card" style="margin-left:230px;line-height: 50px;text-align: center; border-radius: 5px;" >Add to cart </button></a>
               </div>
             </div>
           </a>
         </div>
        <%
		} }
  catch(Exception e)
	{
		System.out.println(e);
	}
%>



<div class="col-sm-6 col-lg-4">
           <a href="#" class="d-block text-center mb-4">
             <div class="product-list">
               <div class="product-image position-relative">
<%
try{
	   //Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from products where id=105");
		while(rs.next())
		{
%>
 <img src="./images/img/vege/v5.PNG" alt="products" class="img-fluid product-image-first" >
               </div>
               <div class="product-name pt-3">
                 <h3 class="text-capitalize"><%=rs.getString(2) %></h3>
                 <p class="mb-0 amount">Rs. <%=rs.getString(4) %></p>
                 <div class="py-1">
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                 </div>
           <a href="vegeAction.jsp?id=<%=rs.getString(1) %>"><button type="button" class="add_to_Card" style="margin-left:230px;line-height: 50px;text-align: center; border-radius: 5px;" >Add to cart </button></a>
               </div>
             </div>
           </a>
         </div>
        <%
		} }
  catch(Exception e)
	{
		System.out.println(e);
	}
%>


<div class="col-sm-6 col-lg-4">
           <a href="#" class="d-block text-center mb-4">
             <div class="product-list">
               <div class="product-image position-relative">
<%
try{
	   //Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from products where id=106");
		while(rs.next())
		{
%>
 <img src="./images/img/vege/v6.PNG" alt="products" class="img-fluid product-image-first" >
               </div>
               <div class="product-name pt-3">
                 <h3 class="text-capitalize"><%=rs.getString(2) %></h3>
                 <p class="mb-0 amount">Rs. <%=rs.getString(4) %></p>
                 <div class="py-1">
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                 </div>
           <a href="vegeAction.jsp?id=<%=rs.getString(1) %>"><button type="button" class="add_to_Card" style="margin-left:230px;line-height: 50px;text-align: center; border-radius: 5px;" >Add to cart </button></a>
               </div>
             </div>
           </a>
         </div>
      
        <%
		} }
  catch(Exception e)
	{
		System.out.println(e);
	}
%>
   </div>
</body>
</html>