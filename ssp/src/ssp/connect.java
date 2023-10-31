package ssp;

import java.sql.*;
import java.io.*;
public class connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	//class.forName("com.mysql.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");  
		System.out.println("Connected to Database");
		con.close();
		
	}
	catch(Exception e){ 
		System.out.println(e);}  
}
	}


