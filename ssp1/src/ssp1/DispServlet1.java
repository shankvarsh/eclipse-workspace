package ssp1;

import java.io.*;
import java.sql.*;
import javax.servlet.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispServlet1
 */
@WebServlet("/DispServlet1")
public class DispServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispServlet1() {
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
	        String uname,pwd;  
	    String n=request.getParameter("userName");  
	    String p=request.getParameter("userPass");  
	    
	    try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root");
			PreparedStatement ps = con.prepareStatement("select * from login where uname=? and pwd=?");
			ps.setString(1,n);
			ps.setString(2,p);
			ResultSet rs=ps.executeQuery();
			
			
			if(rs.next())
			{
				RequestDispatcher rd=request.getRequestDispatcher("DispServlet2");
				rd.forward(request,response);
				
			}
			else
			{
				out.println("<h1>Sorry username or password error<h2>");
				RequestDispatcher rd=request.getRequestDispatcher("DispServlet1.html");
				rd.include(request, response);

			}
		}
		catch(Exception k)
		{
			k.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
