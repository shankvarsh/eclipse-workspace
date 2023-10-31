package ssp1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insertemp
 */
@WebServlet("/Insertemp")
public class Insertemp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insertemp() {
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
	        int empid=Integer.parseInt(request.getParameter("t1"));
	        String empname = request.getParameter("t2");
	        int salary=Integer.parseInt(request.getParameter("t3"));
	        String gender = request.getParameter("r1");
	        String job=request.getParameter("designation");
	        
			try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root"); 
			PreparedStatement ps=con.prepareStatement("insert into empp values(?,?,?,?,?)");
			ps.setInt(1, empid);
			ps.setString(2, empname);
			ps.setInt(3,salary);
			ps.setString(5, job);
			ps.setString(4,gender);
		    ps.executeUpdate(); 
				              
			out.print("<html><body><h1>");
			out.println("Record Inserted Successfully");  
			out.print("</h1></body></html>");
			}
			catch (Exception e2) {e2.printStackTrace();}  
	          
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
