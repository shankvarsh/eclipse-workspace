package ssp1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.lang.NullPointerException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginc1
 */
@WebServlet("/Loginc1")
public class Loginc1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginc1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 PrintWriter out = response.getWriter();  
	        
	    String v=request.getParameter("userName");  
	    String p=request.getParameter("userPass");  
	    
	    try
	    {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu?autoReconnect=true&useSSL=false","root","root");
			PreparedStatement ps = con.prepareStatement("select * from login where uname=? and pwd=?");
			ps.setString(1,v);
			ps.setString(2,p);
			ResultSet rs=ps.executeQuery();
			 Cookie ck1=new Cookie("uname",v);//creating cookie object  
			    response.addCookie(ck1);
			
			if(rs.next())
			{
				RequestDispatcher rd=request.getRequestDispatcher("Loginc2");
				rd.forward(request,response);
				
			}
			else
			{
				out.println("<h1>Sorry username or password error<h2>");
				RequestDispatcher rd=request.getRequestDispatcher("Loginc.html");
				rd.include(request, response);

			}
	    }
		catch(Exception k)
		{
			k.printStackTrace();
		}
	}

}
