package ssp1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Que2
 */
@WebServlet("/Que2")
public class Que2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Que2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());		

		String cname=request.getParameter("t2");
		String source=request.getParameter("t3");
		String d=request.getParameter("t4");
		String tdate=request.getParameter("t7");

		int bid=Integer.parseInt(request.getParameter("t1"));
		int nad=Integer.parseInt(request.getParameter("t5"));
		int nch=Integer.parseInt(request.getParameter("t6"));
		int price=Integer.parseInt(request.getParameter("t8"));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int total=nad*price+nch*(price/2);
		 out.println("<html><body><h1>");

		 out.println("Booking id:"+bid);
		 out.println("<br>");

		 out.println("Travel Date:"+tdate);
		 out.println("<br>");

		 out.println("Customer Name:"+cname);
		 out.println("<br>");

		 out.println("Source:"+source);
		 out.println("<br>");

		 out.println("Destination:"+d);
		 out.println("<br>");

		 out.println("Number of Adults:"+nad);
		 out.println("<br>");

		 out.println("Number of Children:"+nch);
		 out.println("<br>");

		 out.println("Total price for Booking Id "+bid+"is "+total);
		 out.println("</h1></body></html>");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
