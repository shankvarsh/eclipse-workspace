package assignment45;
import java.sql.*;
import java.util.*;
public class Q51insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java?autoReconnect=True&useSSL=false","root","root");
	PreparedStatement ps= con.prepareStatement("insert into Students values(?,?,?)");
Scanner ip=new Scanner(System.in);		
for(int i=1;i<=6;i++) {
	System.out.println("Enter sname");
	String sn=ip.next();
	System.out.println("Enter srollnumber");
	int sr=ip.nextInt();
	System.out.println("Enter smarks");
	int sm=ip.nextInt();
	ps.setString(1,sn);
	ps.setInt(2, sr);
	ps.setInt(3, sm);
	int rs1=ps.executeUpdate();
	System.out.println("Affected rows "+rs1);
}
con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
