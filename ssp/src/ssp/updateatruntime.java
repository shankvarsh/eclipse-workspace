package ssp;
import java.sql.*;
import java.io.*;
import java.util.*;
public class updateatruntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int eid, sal,i;
try {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");  
Scanner ip=new Scanner(System.in);
System.out.println("enter eid");
eid =ip.nextInt();
System.out.println("enter sal");
sal=ip.nextInt();
String sql="update employee set sal= ? where eid=?";
	PreparedStatement ps=con.prepareStatement(sql); 
	ps.setInt(1, sal);
	ps.setInt(2, eid);
	i=ps.executeUpdate();
	i++;
	if(i>0)
	{
		System.out.println("Data updated successfully");
		con.close();
	}}
catch(Exception e) {
	System.out.println(e);
}
	}

}
