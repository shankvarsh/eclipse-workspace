package jntu;
import java.sql.*;
public class selectstmt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Student");
		while(rs.next())
		{
			System.out.print("ID: " + rs.getInt("rollnumber"));
			 System.out.print(", Name: " + rs.getString("name"));
            System.out.print(", Marks: " + rs.getInt("marks"));
		}
		con.close();
	}

}
