/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2022-03-10 14:04:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class prodoil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("  <title>Oil</title>\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css\">\r\n");
      out.write("\r\n");
      out.write("  <!-- OWN CSS -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"./css/style1.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"./css/responsive-style.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"margin-bottom:50px;\">\r\n");
String email=session.getAttribute("email").toString(); 
      out.write("\r\n");
      out.write("  <header>\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navigation-wrap\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("          <img src=\"./images/organicLogo.png\" class=\"img-fluid\" style=\"position:absolute;margin-left:10px;\">\r\n");
      out.write("          <img src=\"./images/Viplogo.png\" class=\"img-fluid\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("          <!-- <span class=\"navbar-toggler-icon\"></span> -->\r\n");
      out.write("          <i class=\"fas fa-stream navbar-toggler-icon\"></i>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("          <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"homepage.jsp\">Home</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link active\" aria-current=\"page\" href=\"prodoil.jsp\">Products</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"myCart.jsp\">My Cart</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"myOrders.jsp\">My Orders</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"Logout.jsp\">Logout</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a href=\"#\"><h3 style=\"font-size:1.5rem; color:#380556;\"> ");
out.println(email);
      out.write("</h3></a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("     <nav class=\"navbar  navbar-expand-lg navigation-wrap \" style=\"top:79px;postion:absolute;\">\r\n");
      out.write("    \r\n");
      out.write("     <div class=\"collapse navbar-collapse\" id=\"navbarNav\" >\r\n");
      out.write("     \r\n");
      out.write("          <ul class=\"navbar-nav\" style=\"margin-left:250px;\">\r\n");
      out.write("            <li class=\"nav-item\" >\r\n");
      out.write("              <a class=\"nav-link\" href=\"prodfruits.jsp\" style=\"padding-right:100px;\">Fruits</a>\r\n");
      out.write("            </li>\r\n");
      out.write("             <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link \" href=\"prodvege.jsp\" style=\"padding-right:100px;\">Vegetables</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link  \" href=\"prodgrains.jsp\" style=\"padding-right:100px;\">Grains</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link \" href=\"proddry.jsp\" style=\"padding-right:100px;\">Dry fruits</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link active\" aria-current=\"page\" href=\"prodoil.jsp\" style=\"padding-right:100px;\">Oils</a>\r\n");
      out.write("            </li>\r\n");
      out.write("             <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"prodspices.jsp\" style=\"padding-right:100px;\">Spices</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("    </nav>\r\n");
      out.write("  </header>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("   <!-- Products section -->\r\n");
      out.write("   <section id=\"product\" class=\"product\">\r\n");
      out.write("     <div class=\"headline text-center mb-5\">\r\n");
      out.write("       <h2 class=\"pb-3 position-relative d-inline-block\" style=\"color:#00a149 \">Oils</h2>\r\n");
      out.write("     </div>\r\n");
      out.write("   </section>\r\n");
      out.write("   ");

String msg=request.getParameter("msg");
if("added".equals(msg))
{

      out.write("\r\n");
      out.write("<h3 style=\"margin-left:600px; color:red\">Added successfully to cart!</h3>\r\n");
} 
      out.write('\r');
      out.write('\n');

if("exists".equals(msg))
{

      out.write("\r\n");
      out.write("<h3 style=\"margin-left:650px; color:red\">Quantity increased!</h3>\r\n");
} 
      out.write('\r');
      out.write('\n');
 
if("invalid".equals(msg))
{

      out.write("\r\n");
      out.write("<h3 style=\"margin-left:600px; color:red\" >Error occured! Please try again!</h3>\r\n");
} 
      out.write("\r\n");
      out.write("    <section id=\"products\" class=\"products\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-sm-12\">\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("         <div class=\"col-sm-6 col-lg-4\">\r\n");
      out.write("           <a href=\"#\" class=\"d-block text-center mb-4\">\r\n");
      out.write("             <div class=\"product-list\">\r\n");
      out.write("               <div class=\"product-image position-relative\">\r\n");

try{
	   //Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from products where id=141");
		while(rs.next())
		{

      out.write("\r\n");
      out.write(" <img src=\"./images/img/oil/o1.PNG\" alt=\"products\" class=\"img-fluid product-image-first\" >\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"product-name pt-3\">\r\n");
      out.write("                 <h3 class=\"text-capitalize\">");
      out.print(rs.getString(2) );
      out.write("</h3>\r\n");
      out.write("                 <p class=\"mb-0 amount\">Rs. ");
      out.print(rs.getString(4) );
      out.write("</p>\r\n");
      out.write("                 <div class=\"py-1\">\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                 </div>\r\n");
      out.write("              <a href=\"oilAction.jsp?id=");
      out.print(rs.getString(1) );
      out.write("\">   <button type=\"button\" class=\"add_to_Card\" style=\"margin-left:230px;line-height: 50px;text-align: center; border-radius: 5px;\" >Add to cart </button> </a>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </a>\r\n");
      out.write("         </div>\r\n");
      out.write("        ");

		} }
  catch(Exception e)
	{
		System.out.println(e);
	}

      out.write("\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("        <div class=\"col-sm-6 col-lg-4\">\r\n");
      out.write("           <a href=\"#\" class=\"d-block text-center mb-4\">\r\n");
      out.write("             <div class=\"product-list\">\r\n");
      out.write("               <div class=\"product-image position-relative\">\r\n");

try{
	   //Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from products where id=142");
		while(rs.next())
		{

      out.write("\r\n");
      out.write(" <img src=\"./images/img/oil/o2.PNG\" alt=\"products\" class=\"img-fluid product-image-first\" >\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"product-name pt-3\">\r\n");
      out.write("                 <h3 class=\"text-capitalize\">");
      out.print(rs.getString(2) );
      out.write("</h3>\r\n");
      out.write("                 <p class=\"mb-0 amount\">Rs. ");
      out.print(rs.getString(4) );
      out.write("</p>\r\n");
      out.write("                 <div class=\"py-1\">\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                 </div>\r\n");
      out.write("             <a href=\"oilAction.jsp?id=");
      out.print(rs.getString(1) );
      out.write("\"><button type=\"button\" class=\"add_to_Card\" style=\"margin-left:230px;line-height: 50px;text-align: center; border-radius: 5px;\" >Add to cart </button></a>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </a>\r\n");
      out.write("         </div>\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("  ");

		} }
  catch(Exception e)
	{
		System.out.println(e);
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-sm-6 col-lg-4\">\r\n");
      out.write("           <a href=\"#\" class=\"d-block text-center mb-4\">\r\n");
      out.write("             <div class=\"product-list\">\r\n");
      out.write("               <div class=\"product-image position-relative\">\r\n");

try{
	   //Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from products where id=143");
		while(rs.next())
		{

      out.write("\r\n");
      out.write(" <img src=\"./images/img/oil/o3.PNG\" alt=\"products\" class=\"img-fluid product-image-first\" >\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"product-name pt-3\">\r\n");
      out.write("                 <h3 class=\"text-capitalize\">");
      out.print(rs.getString(2) );
      out.write("</h3>\r\n");
      out.write("                 <p class=\"mb-0 amount\">Rs. ");
      out.print(rs.getString(4) );
      out.write("</p>\r\n");
      out.write("                 <div class=\"py-1\">\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                 </div>\r\n");
      out.write("           <a href=\"oilAction.jsp?id=");
      out.print(rs.getString(1) );
      out.write("\"><button type=\"button\" class=\"add_to_Card\" style=\"margin-left:230px;line-height: 50px;text-align: center; border-radius: 5px;\" >Add to cart </button></a>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </a>\r\n");
      out.write("         </div>\r\n");
      out.write("        ");

		} }
  catch(Exception e)
	{
		System.out.println(e);
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-sm-6 col-lg-4\">\r\n");
      out.write("           <a href=\"#\" class=\"d-block text-center mb-4\">\r\n");
      out.write("             <div class=\"product-list\">\r\n");
      out.write("               <div class=\"product-image position-relative\">\r\n");

try{
	   //Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from products where id=144");
		while(rs.next())
		{

      out.write("\r\n");
      out.write(" <img src=\"./images/img/oil/o4.PNG\" alt=\"products\" class=\"img-fluid product-image-first\" >\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"product-name pt-3\">\r\n");
      out.write("                 <h3 class=\"text-capitalize\">");
      out.print(rs.getString(2) );
      out.write("</h3>\r\n");
      out.write("                 <p class=\"mb-0 amount\">Rs. ");
      out.print(rs.getString(4) );
      out.write("</p>\r\n");
      out.write("                 <div class=\"py-1\">\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                 </div>\r\n");
      out.write("           <a href=\"oilAction.jsp?id=");
      out.print(rs.getString(1) );
      out.write("\"><button type=\"button\" class=\"add_to_Card\" style=\"margin-left:230px;line-height: 50px;text-align: center; border-radius: 5px;\" >Add to cart </button></a>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </a>\r\n");
      out.write("         </div>\r\n");
      out.write("        ");

		} }
  catch(Exception e)
	{
		System.out.println(e);
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-sm-6 col-lg-4\">\r\n");
      out.write("           <a href=\"#\" class=\"d-block text-center mb-4\">\r\n");
      out.write("             <div class=\"product-list\">\r\n");
      out.write("               <div class=\"product-image position-relative\">\r\n");

try{
	   //Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from products where id=145");
		while(rs.next())
		{

      out.write("\r\n");
      out.write(" <img src=\"./images/img/oil/o5.PNG\" alt=\"products\" class=\"img-fluid product-image-first\" >\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"product-name pt-3\">\r\n");
      out.write("                 <h3 class=\"text-capitalize\">");
      out.print(rs.getString(2) );
      out.write("</h3>\r\n");
      out.write("                 <p class=\"mb-0 amount\">Rs. ");
      out.print(rs.getString(4) );
      out.write("</p>\r\n");
      out.write("                 <div class=\"py-1\">\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                 </div>\r\n");
      out.write("           <a href=\"oilAction.jsp?id=");
      out.print(rs.getString(1) );
      out.write("\"><button type=\"button\" class=\"add_to_Card\" style=\"margin-left:230px;line-height: 50px;text-align: center; border-radius: 5px;\" >Add to cart </button></a>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </a>\r\n");
      out.write("         </div>\r\n");
      out.write("        ");

		} }
  catch(Exception e)
	{
		System.out.println(e);
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-sm-6 col-lg-4\">\r\n");
      out.write("           <a href=\"#\" class=\"d-block text-center mb-4\">\r\n");
      out.write("             <div class=\"product-list\">\r\n");
      out.write("               <div class=\"product-image position-relative\">\r\n");

try{
	   //Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from products where id=146");
		while(rs.next())
		{

      out.write("\r\n");
      out.write(" <img src=\"./images/img/oil/o6.PNG\" alt=\"products\" class=\"img-fluid product-image-first\" >\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"product-name pt-3\">\r\n");
      out.write("                 <h3 class=\"text-capitalize\">");
      out.print(rs.getString(2) );
      out.write("</h3>\r\n");
      out.write("                 <p class=\"mb-0 amount\">Rs. ");
      out.print(rs.getString(4) );
      out.write("</p>\r\n");
      out.write("                 <div class=\"py-1\">\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                 </div>\r\n");
      out.write("           <a href=\"oilAction.jsp?id=");
      out.print(rs.getString(1) );
      out.write("\"><button type=\"button\" class=\"add_to_Card\" style=\"margin-left:230px;line-height: 50px;text-align: center; border-radius: 5px;\" >Add to cart </button></a>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </a>\r\n");
      out.write("         </div>\r\n");
      out.write("      \r\n");
      out.write("        ");

		} }
  catch(Exception e)
	{
		System.out.println(e);
	}

      out.write("\r\n");
      out.write("   </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
