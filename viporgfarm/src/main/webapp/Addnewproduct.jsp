<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.sql.*"%>


   
   
    
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="image" method="post" enctype="multipart/form-data">
        	
<TABLE border="0">

<TD>ID: </TD>   
<TD><input type=number size=20 value=" " name="id"></TD>
</TR>
<TR>
<TD> Name: </TD>           
<TD><input type=text size=20 value=" " name="name"></TD>
</TR>

<TD>Category:</TD>     
<TD>     <input type=text size=20 value="" name="category" maxlength=30></TD>
</TR>
<TR>
<TD>Price</TD> 
<TD><input type=double size=20 value="" name="price" maxlength=30></TD>
</TR>
<TR>
<TR>
<TD>Quantity</TD> 
<TD><input type=int size=20 value="" name="quantity" maxlength=20></TD>
</TR>

<TR>
  <td>Upload</td>
          <td>  <input type="file"   name="image" required="required"/><br/><br/></td></TR>
          <tr >  <td colspan="2"><input type="submit"/> </td></tr>
        </form>
    </body>
</html>
