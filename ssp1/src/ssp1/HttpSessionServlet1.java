package ssp1;
import java.io.*;
import javax.servlet.http.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpSessionServlet1
 */
@WebServlet("/HttpSessionServlet1")
public class HttpSessionServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpSessionServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try{  
			  
		      response.setContentType("text/html");  
			PrintWriter out = response.getWriter();  
			String n=request.getParameter("userName");  
			out.print("<h1>Welcome from HttpSession Servlet 1"+n+"</h1>");  
			HttpSession session=request.getSession();  
			session.setAttribute("uname",n);  
		      out.print("<h3><a href='HttpSessionServlet2'>visit</a></h3>");  
			out.close();  
			}   catch(Exception e){System.out.println(e);} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
