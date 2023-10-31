package ssp1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiddenServlet1
 */
@WebServlet("/HiddenServlet1")
public class HiddenServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HiddenServlet1() {
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
		      out.print("<h1>Welcome from servlet 1 "+n+"</h1>");  
					          
			//creating form that have invisible textfield  
			out.print("<form action='HiddenServlet2'>");  
			out.print("<input type='hidden' name='uname' value='"+n+"'>");  
			out.print("<input type='submit' value='go'>");  
			out.print("</form>");  
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
