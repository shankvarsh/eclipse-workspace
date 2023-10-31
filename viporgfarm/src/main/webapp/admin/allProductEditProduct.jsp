<%@page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
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
<body >
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
              <a class="nav-link active" aria-current="page" href="allProductEditProduct.jsp">Edit products</a>
            </li>
            <li class="nav-item">
              <a class="nav-link"  href="ordersReceived.jsp">Orders</a>
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
<%
String msg=request.getParameter("msg");
if("done".equals(msg))
{
%>
<h3 style="position:absolute;margin-left:580px; color:red;top:220px;" >Product Successfully Updated!</h3>
<%} %>
<%

if("wrong".equals(msg))
{
%>
<h3 style="position:absolute;margin-left:580px; color:red;top:220px;" >Some thing went wrong! Try again!</h3>
<%} %>
<div class="container">
<h1 class="text-center" style="position:absolute;border-color:black;margin-left: 470px ;font-size:50px;color: #1D244B;top:150px" >All Products</h1>

<table class="table table-hover shopping-cart-wrap" style="position:absolute;top:260px;width:1200px;margin-left:60px" >
<thead class="text-muted">
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Category</th>
            <th scope="col"> Price</th>
            <th>Status</th>
            <th scope="col">Edit </th>
          </tr>
        </thead>
        <tbody>
       <%
       try{
    	   Class.forName("com.mysql.jdbc.Driver");
   		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
   		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from products");
		
		while(rs.next())
		{
       
       %>
          <tr>
            <td><%=rs.getString(1) %></td>
            <td><%=rs.getString(2) %></td>
            <td><%=rs.getString(3) %></td>
            <td> <%=rs.getString(4) %></td>
            <td><%=rs.getString(5) %></td>
            <td><a href="editProduct.jsp?id=<%=rs.getString(1) %>">Edit </a></td>
          </tr>
         <%
         }
         }
         catch(Exception e)
       {
        	 System.out.println(e);
       }
         %>
        </tbody>
      </table>

</body>
</html>