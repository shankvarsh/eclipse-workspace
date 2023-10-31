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
 * Servlet implementation class Updateempp
 */
@WebServlet("/Updateempp")
public class Updateempp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updateempp() {
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
	        int salary=Integer.parseInt(request.getParameter("t2"));
	        String job=request.getParameter("designation");
	        try{  
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shalu","root","root"); 
				PreparedStatement ps=con.prepareStatement("update empp set salary=?, job=? where empid=?");
				ps.setInt(1,salary);
				ps.setString(2, job);
				ps.setInt(3,empid);
			    ps.executeUpdate(); 
					              
				out.print("<html><body><h1>");
				out.println("Record Updated Successfully");  
				out.print("</h1></body></html>");
				              
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
