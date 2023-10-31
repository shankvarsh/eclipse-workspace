<%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<title>Home</title>
<script>
if(window.history.forward(1) !=null)
	window.history.forward(1);
	</script>
</head>
<body bgcolor="#FDD7E4">
<br>
<table>
<thead>
<%
String email= session.getAttribute("email").toString();
int total=0;
int sno=0;
try {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu", "root", "root");
	Statement st=con.createStatement();
	ResultSet rs1=st.executeQuery("select sum(total) from cart where email='"+email+"' and address is NULL");
	while(rs1.next())
	{
		total=rs1.getInt(1);

	} 
%>
<h2>CONGRATULATIONS <%out.println(email);%>TODAY YOU AVAIL 10% DISCOUNT ON TOTAL PRICE!!!</h2>
          <tr>
          <th scope="col"><a href="myCart.jsp"> Back</a></th>
            <th scope="col" style="background-color: #FFE6BB;">Total price: Rs.<%out.println(total); %>  </th>
                    <th scope="col" style="background-color: #FFE6BB;">You pay(after 10% discount): Rs.<%out.println(total-(total/10)); %>  </th>
        
          </tr>
        </thead>
        <thead>
          <tr>
          <th scope="col">S.No</th>
            <th scope="col">Product Name</th>
            <th scope="col">Category</th>
            <th scope="col"> Price</th>
            <th scope="col">Quantity</th>
            <th scope="col">Sub Total</th>
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
            <td><%=rs.getString(8) %> </td>
            <td><%=rs.getString(10) %></td>
            </tr>
       <%} 
       ResultSet rs2=st.executeQuery("select *from users where email='"+email+"' ");
       while(rs2.next())
       {
    	 
       %>  
        </tbody>
      </table>
      
<hr style="width: 100%">
<form action="addresspaymentpage.jsp" method="post"> 
 
 <h3>Enter Address</h3>
<input type = "text" name="address" value="<%=rs2.getString(7)%>" placeholder="Enter address" required>



<h3>Enter city</h3>
<input type = "text" name="city" value="<%=rs2.getString(8)%>" placeholder="Enter city" required>




<h3>Enter State</h3>
<input type = "text" name="state" value="<%=rs2.getString(9)%>" placeholder="Enter state" required>




<h3>Enter country</h3>
<input type = "text" name="country" value="<%=rs2.getString(10)%>" placeholder="Enter country" required>
<hr style="width: 100%">

<h3>Select Payment mode</h3>
 <select name= "paymentmethod">
 <option value="UPI">UPI</option>
 <option value="Debitcard">Debitcard</option>
 <option value="Netbanking">Netbanking</option>
  <option value="E-wallet">E-wallet</option>
 </select>

<h3>Pay online to thecamstore.com</h3>
<input type = "text" name="transactionid" placeholder="Enter TransactionId" required>

<h3 style="color: red">*Please enter your transaction ID.</h3>

<hr style="width: 100%">


<h3>Mobile Number</h3>
<input type = "text" name="mobilenumber" value="<%=rs2.getString(3)%>" placeholder="Enter Mobile number" required>

<h3 style="color: red">T&C*Orders may be terminated if transactionId is incorrect.</h3>
<button type="submit"> Proceed to Bill</button>
<h3 style="color: red">*Please check all the details before proceeding to bill.</h3>

</form>
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