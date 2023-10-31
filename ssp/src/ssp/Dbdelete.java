package ssp;
import java.sql.*;
import java.io.*;
import java.util.*;
public class Dbdelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eid, sal,i;
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");  
		Scanner ip=new Scanner(System.in);
		System.out.println("enter eid");
		eid =ip.nextInt();
		String sql="delete from employee where eid=?";
		PreparedStatement ps=con.prepareStatement(sql); 
		ps.setInt(1, eid);
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
