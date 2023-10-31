package ssp;
import java.sql.*;
public class totalcostprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");  
			String sql="update billing inner join product on billing.pid=product.pid set totalcost=billing.qty*product.price";
			PreparedStatement ps=con.prepareStatement(sql); 
			
			int i=ps.executeUpdate();
			i++;
			if(i>0)
			{
				System.out.println("Data updated successfully");
				con.close();
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
