package assignment45;
import java.sql.*;
public class Q51select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java?autoReconnect=true&useSSL=false","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("Select * from Students");
while(rs.next())
{
	System.out.println("Sname: " +rs.getString("sname"));
	System.out.println("Srollnumber: " +rs.getInt("srollno"));
	System.out.println("Smarks: " +rs.getString("smarks"));
}
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
