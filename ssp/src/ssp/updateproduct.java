package ssp;
import java.sql.*;
import java.io.*;
import java.util.*;
public class updateproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pid, price, i;
		String pname;
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");  
		Scanner ip=new Scanner(System.in);
		System.out.println("enter pid");
		pid =ip.nextInt();
		System.out.println("enter price");
		price=ip.nextInt();
		System.out.println("enter pname");
		pname =ip.next();
		String sql="update product set price= ?, pname=? where pid=?";
			PreparedStatement ps=con.prepareStatement(sql); 
			ps.setInt(1, price);
			ps.setString(2,pname);
			ps.setInt(3, pid);
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
