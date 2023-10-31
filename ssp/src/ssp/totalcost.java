package ssp;
import java.sql.*;
import java.io.*;
import java.util.*;


public class totalcost {


	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		int qty, pid, price, billingid, totalcost;

String s1,s2,s3;

try {

	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");  

	
	Scanner ip=new Scanner(System.in);



for(int j=1;j<=2;j++) 
{
System.out.println("enter pid");
pid=ip.nextInt();
s1="Select price from product where pid= ?";
PreparedStatement ps=con.prepareStatement(s1);
ps.setInt(1, pid);
ResultSet rs= ps.executeQuery();
rs.next();
price=rs.getInt(1);


System.out.println("enter billingid");
billingid=ip.nextInt();
s2="Select qty from billing where billingid= ?";
PreparedStatement ps1=con.prepareStatement(s2);
ps1.setInt(1, billingid);
ResultSet rs1= ps1.executeQuery();
rs1.next();
qty=rs1.getInt(1);

totalcost=price*qty;

s3="Update billing set totalcost=? where billingid=?";
PreparedStatement ps2=con.prepareStatement(s3);
ps2.setInt(1,totalcost);
ps2.setInt(2,billingid);

int rs2= ps2.executeUpdate();

rs2++;
if(rs2>0)
{
	System.out.println("Data updated successfully");
	
}

}
con.close();
}
catch(Exception e) {
	System.out.println(e);
}
	}

}
