package jntu;
import java.sql.*;
public class Thirdprogram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","root");
		Statement st=con.createStatement();
		PreparedStatement stmt1=con.prepareStatement("insert into Student values(?,?,?)");  
		stmt1.setInt(1,220110004);//1 specifies the first parameter in the query  
		stmt1.setString(2,"Varsh");  
		 stmt1.setInt(3,80 );
		 if(stmt1.executeUpdate()>=0)
		 {
			 System.out.println("inserted");
		 }
		 con.close();
	}

}
