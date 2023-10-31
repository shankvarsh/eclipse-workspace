package ssp;
import java.sql.*;
import java.io.*;
import java.util.*;
public class billinginsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rs=0;
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");  
			
			PreparedStatement ps=con.prepareStatement("insert into billing values(?,?,?,?,?)"); 
			Scanner ip= new Scanner (System.in);
			for(int j=1;j<=2;j++) 
			{
	System.out.println("enter billingid");
	int billingid =ip.nextInt();
	System.out.println("enter customername");
	String customername =ip.next();
	System.out.println("enter qty");
	int qty =ip.nextInt();
	System.out.println("enter pid");
	int pid =ip.nextInt();
	System.out.println(" total cost is null");
	int totalcost =0;
	ps.setInt(5,totalcost);
	ps.setInt(1,billingid);
	ps.setString(2,customername);
	ps.setInt(3, qty);
	ps.setInt(4,pid);
	int rs1 = ps.executeUpdate();
			
			System.out.println("effected rows"+rs1);
			}
			con.close();
			
		}
		catch(Exception e){ 
			System.out.println(e);} 
	}

}
