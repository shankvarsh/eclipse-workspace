package ssp;
import java.sql.*;

public class update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");  
	String sql="update emp set sal= ? where eid=?";
	PreparedStatement ps=con.prepareStatement(sql); 
	ps.setInt(1, 2500);
	ps.setInt(2, 111);
	
	int i=ps.executeUpdate();
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