package ssp;
import java.sql.*;
import java.io.*;
import java.util.*;
public class deleteproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pid,i;
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");  
		Scanner ip=new Scanner(System.in);
		System.out.println("enter pid");
		pid =ip.nextInt();
		String sql="delete from product where pid=?";
		PreparedStatement ps=con.prepareStatement(sql); 
		ps.setInt(1, pid);
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
