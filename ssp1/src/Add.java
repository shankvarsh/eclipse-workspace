
import java.io.*;
import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 int a,b,c;
		  response.setContentType("text/plain");
		  PrintWriter out=response.getWriter();
		   
		    a=50;
		    b=30;
		    c=a+b;
		  
		  out.print("the sum of" + a + "and" + b + "is" + c);
	}

}
