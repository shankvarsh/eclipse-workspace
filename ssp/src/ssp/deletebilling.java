package ssp;
import java.sql.*;
import java.io.*;
import java.util.*;
public class deletebilling {

	private static boolean useSSL;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int billingid,i;
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu?useSSL=false","root","root");  
		Scanner ip=new Scanner(System.in);
		System.out.println("enter billingid");
		billingid =ip.nextInt();
		String sql="delete from billing where billingid=?";
		PreparedStatement ps=con.prepareStatement(sql); 
		ps.setInt(1, billingid);
		i=ps.executeUpdate();
		i++;
		if(i>0)
		{
			System.out.println("Data deleted successfully");
			con.close();
		}
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}

}
