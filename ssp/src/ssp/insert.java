package ssp;
import java.sql.*;
import java.io.*;
public class insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			 //Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");  
			
				PreparedStatement stmt1=con.prepareStatement("insert into employee values(?,?,?)");  
				stmt1.setInt(1,102);//1 specifies the first parameter in the query  
				stmt1.setString(2,"Varsh");  
				 stmt1.setInt(3, 4500); 
				int i=stmt1.executeUpdate();  
				i++;
			System.out.println(i+" records inserted");  
			  
				con.close();  }
catch(Exception e){ 
			System.out.println(e);} 
	}

}
