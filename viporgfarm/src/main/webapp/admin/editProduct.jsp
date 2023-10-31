<%@page import="java.sql.*" %>
<html>
<head>
<meta charset="utf-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">
	<link rel="stylesheet" href="../css/style.css">
	<link rel="stylesheet" href="../css/responsive-style.css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

<title>View and edit the products</title>
<style type="text/css">
		body {
    color: #000;
    overflow-x: hidden;
    height: 100%;
    background-image: url("../images/bg/bgedit1.jpg");
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
              <a class="nav-link"  href="adminHome.jsp" style="color:black;">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="allProductEditProduct.jsp" style="color:black;">Edit products</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="ordersReceived.jsp" style="color:black;">Orders</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="../Logout.jsp" style="color:black;">Logout</a>
            </li>
            <li class="nav-item"><a href="#" class="nav-link"><h3 style="font-size:1.5rem; color:#380556;"> <%out.println(email);%></h3></a></li>
          </ul>
        </div>
      </div>
    </nav>
  </header>
 <h1><a class="nav-link" href="allProductEditProduct.jsp" style="color:black; font-size:30px;">Back</a></h1>
 <%
       String id=request.getParameter("id");
 try{
	   Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
		Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select *from products where id='"+id+"'");
	
	while(rs.next())
	{
       %>
       <div class="container-fluid px-1 py-5 mx-auto">
    <div class="row d-flex justify-content-center">
        <div class="col-xl-7 col-lg-8 col-md-9 col-11 text-center">
            <h1>Edit</h1>

            <div class="card">
<form action="editProductsAction.jsp" class="form-card" method="post" >
<input type="hidden" name="id" value ="<% out.println(id); %>">
<div class="row justify-content-between text-left">
                        <div class="form-group col-sm-6 flex-column d-flex"><h4 style="color:black"> <label class="form-control-label px-3" style="font-size:2rem; color:purple;">Product Name<span class="text-danger"> *</span></label></h4> <label style="font-size:1.8rem;"><%=rs.getString(2)%></label> </div>
                        <div class="form-group col-sm-6 flex-column d-flex"><h4 style="color:black"> <label class="form-control-label px-3" style="font-size:2rem; color:purple;">Product Category<span class="text-danger"> *</span></label> </h4> <label style="font-size:1.8rem;"><%=rs.getString(3)%></label> </div>
                    </div>
                    <div class="row justify-content-between text-left">
                        <div class="form-group col-sm-6 flex-column d-flex"> <h4 style="color:black"><label class="form-control-label px-3" style="font-size:2rem; color:purple;"> Product Price<span class="text-danger"> *</span></label> </h4><input type="number" style="font-size:1.8rem;" name="price" value="<%=rs.getString(4)%>" required> </div>
                        <div class="form-group col-sm-6 flex-column d-flex"> <h4 style="color:black"><label class="form-control-label px-3" style="font-size:2rem; color:purple;">Product Availability<span class="text-danger"> *</span></label> </h4><select style="font-size:1.8rem;" name ="active" >
<option value="Yes">Yes</option>
<option value="No">No</option>
</select> </div>
                    </div>
 
<input type="submit" class="main-btn" value="Update"/>
 </form>
<%
	}
}
catch(Exception e)
{System.out.println(e);
}
%>




</body>
</html>