<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="uploadPrescription"  method="post" enctype="multipart/form-data">
        	
<TABLE border="0">

<TD>ID: </TD>   
<TD><input type=number size=20 value=" " name="id"></TD>
<TR>
  <td>Upload</td>
          <td>  <input type="file"   name="image" required="required"/><br/><br/></td></TR>
          <tr >  <td colspan="2"><input type="submit"/> </td></tr>
        </form>
    </body>
</html>