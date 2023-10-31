package ssp;
import java.sql.*;
import java.io.*;
import java.util.*;
public class productinsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rs=0;
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");  
			
			PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?)"); 
			Scanner ip= new Scanner (System.in);
			for(int j=1;j<=6;j++) 
			{
	System.out.println("enter pid");
	int pid =ip.nextInt();
	System.out.println("enter pname");
	String pname =ip.next();
	System.out.println("enter price");
	int price =ip.nextInt();
	ps.setInt(1,pid);
	ps.setString(2,pname);
	ps.setInt(3,price);
	int rs1 = ps.executeUpdate();
			
			System.out.println("effected rows"+rs1);
			}
			con.close();
			
		}
		catch(Exception e){ 
			System.out.println(e);} 
	}

}
