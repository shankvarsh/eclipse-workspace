package ssp;
import java.sql.*;
import java.io.*;
public class create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");  
			Statement stmt=con.createStatement();
			String str="create table employee( eid int primary key,ename varchar(20), sal int)";
			//ResultSet rs=stmt.execute Update(str);
			System.out.println("Table created");
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
			
	}

}
