package assignment45;

import java.sql.*;
public class Q51update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java?autoReconnect=true&useSSL=false","root","root");
Statement st=con.createStatement();
String sql="update Students set smarks=smarks+4 where smarks<50";
int i=st.executeUpdate(sql);
i++;
if(i>0) {
	System.out.println("Data updated successfully");
	
}
ResultSet rs=st.executeQuery("Select * from Students where smarks<50");
while(rs.next())
{
	System.out.println("Sname: " +rs.getString("sname"));
	System.out.println("Srollnumber: " +rs.getInt("srollno"));
	System.out.println("Smarks: " +rs.getString("smarks"));
}
con.close();
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}


