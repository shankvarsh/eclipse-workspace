<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>

</head>
    <!--Header-->
   
   <%String email= session.getAttribute("email").toString(); %>
            <center><h2>THE CAM STORE </h2></center>
            <a href="allProductEditProduct.jsp">Edit Products </a><br>
            <a href="ordersReceived.jsp">Orders Received </a><br>
            <a href="../Logout.jsp">Logout </a><br>
         
           <br>
           <!--table-->