package ssp;
import java.sql.*;
import java.io.*;
import java.util.*;
public class insertatruntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");  
			
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)"); 
			Scanner ip= new Scanner (System.in);
			for(int j=1;j<=3;j++) 
			{
	System.out.println("enter eid");
	int eid =ip.nextInt();
	System.out.println("enter name");
	String ename =ip.next();
	System.out.println("enter sal");
	int sal =ip.nextInt();
	ps.setInt(1,eid);
	ps.setString(2,ename);
	ps.setInt(3,sal);
	int rs1 = ps.executeUpdate();
			
			System.out.println("effected rows"+rs1);
			}
			con.close();
			
		}
		catch(Exception e){ 
			System.out.println(e);} 
	}

}
