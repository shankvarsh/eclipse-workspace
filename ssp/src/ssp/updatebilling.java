package ssp;
import java.sql.*;
import java.io.*;
import java.util.*;
public class updatebilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int billingid, qty, pid, i;
		String customername;
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");  
		Scanner ip=new Scanner(System.in);
		System.out.println("enter billingid");
		billingid =ip.nextInt();
		System.out.println("enter customername");
		customername =ip.next();
		System.out.println("enter qty");
		qty =ip.nextInt();
		System.out.println("enter pid");
		pid =ip.nextInt();
		String sql="update billing set customername=?, qty=?, pid=? where billingid=?";
			PreparedStatement ps=con.prepareStatement(sql); 
			ps.setInt(4,billingid);
			ps.setString(1,customername);
			ps.setInt(2, qty);
			ps.setInt(3,pid);
			i=ps.executeUpdate();
			i++;
			if(i>0)
			{
				System.out.println("Data updated successfully");
				con.close();
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
