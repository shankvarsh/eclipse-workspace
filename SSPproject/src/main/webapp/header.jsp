<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>

</head>
    <!--Header-->

    <%String email=session.getAttribute("email").toString(); %>
            <center><h2>THE CAM STORE</h2></center>
            <h2><a href=""> <%out.println(email);%></a></h2>
            <a href="home.jsp">Home</a><br>
            <a href="myCart.jsp">My Cart</a><br>
            <a href="myOrders.jsp">My Orders</a><br>
            <a href="Logout.jsp">Logout </a><br>
            
           <br>
           <!--table-->
