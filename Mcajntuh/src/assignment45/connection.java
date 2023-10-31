package assignment45;
import java.sql.*;
public class connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java?autoReconnect=true&useSSL=false","root","root");
	System.out.println("connection established");
	con.close();
	
}
catch(Exception e){
	System.out.println(e);
}
	}

}
