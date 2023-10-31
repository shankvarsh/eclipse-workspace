package ssp1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Selectempp
 */
@WebServlet("/Selectempp")
public class Selectempp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Selectempp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
PrintWriter out = response.getWriter();  
        
		int empid=Integer.parseInt(request.getParameter("roll"));  
	  		          
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");  
		              
		PreparedStatement ps=con.prepareStatement("select * from empp where empid=?");  
		ps.setInt(1,empid);  
		              
		out.print("<table width=50% border=1>");  
		out.print("<caption>Result:</caption>");  
		  
		ResultSet rs=ps.executeQuery();  
		              
		/* Printing column names */  
		ResultSetMetaData rsmd=rs.getMetaData();  
		int total=rsmd.getColumnCount();  
		out.print("<tr>");  
		for(int i=1;i<=total;i++)  
		{  
		out.print("<th>"+rsmd.getColumnName(i)+"</th>");  
		}  
		  
		out.print("</tr>");  
		              
		/* Printing result */  
		  
		while(rs.next())  
		{  
		out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"  </td><td>"+rs.getInt(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+ "</td></tr>");  
		                  
		}  
		  
		out.print("</table>");  
		              
		}catch (Exception e2) {e2.printStackTrace();}  
		          
		finally{out.close();}  

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
