package jntu;
import java.sql.*;
public class CreateTable {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","root");
		Statement st=con.createStatement();
		String query="create table Student(rollnumber int primary key, name varchar(20), marks int)";
		st.executeUpdate(query);
		System.out.println("successful");
	}

}
