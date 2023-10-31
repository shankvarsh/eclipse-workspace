package jntu;
import java.sql.*;
public class firstone {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
Statement st=con.createStatement();
String query="create database java";
st.executeUpdate(query);
System.out.println("successful");
	}

}
