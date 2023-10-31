package assignment45;

import java.sql.*;

public class Q51{
public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java?autoReconnect=true&useSSL=false","root","root");
Statement st=con.createStatement();
String query="create table Students(sname varchar(20),srollno int, smarks int)";
st.executeUpdate(query);
System.out.println("Succesfully created table");
}}

 