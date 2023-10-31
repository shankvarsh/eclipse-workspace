package ssp1;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;
/**
 * Servlet implementation class insertbook
 */
@WebServlet("/insertbook")
public class insertbook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertbook() {
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
		int bookid=Integer.parseInt(request.getParameter("t1"));
        String bktitle = request.getParameter("t2");
        String author = request.getParameter("t3");
        int bkyear=Integer.parseInt(request.getParameter("t4"));
        String publisher = request.getParameter("t5");
        int price=Integer.parseInt(request.getParameter("t6"));
      
         
        try{  
Class.forName("com.mysql.jdbc.Driver");  
    		
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rdbms","root","root"); 
    		PreparedStatement ps=con.prepareStatement("insert into book2 values(bookid, bktitle,author,bkyear,publisher,price) values(?,?,?,?,?,?)");
    		ps.setInt(1,bookid );
    		ps.setString(2,bktitle);
    		ps.setString(3,author);
    		ps.setInt(4, bkyear);
    		ps.setString(5,publisher);
    		ps.setInt(6, price);
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
