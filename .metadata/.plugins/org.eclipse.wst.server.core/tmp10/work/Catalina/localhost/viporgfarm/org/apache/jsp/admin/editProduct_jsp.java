/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2022-03-29 14:57:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class editProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("\t<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/style.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/responsive-style.css\">\r\n");
      out.write("\t<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<title>View and edit the products</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t\tbody {\r\n");
      out.write("    color: #000;\r\n");
      out.write("    overflow-x: hidden;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("    background-image: url(\"../images/bg/bgedit1.jpg\");\r\n");
      out.write("    background-repeat: no-repeat;\r\n");
      out.write("    background-size: 100% 110%\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card {\r\n");
      out.write("    padding: 30px 40px;\r\n");
      out.write("    margin-top: 60px;\r\n");
      out.write("    margin-bottom: 60px;\r\n");
      out.write("    border: none !important;\r\n");
      out.write("    box-shadow: 0 6px 12px 0 rgba(0, 0, 0, 0.2)\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".blue-text {\r\n");
      out.write("    color: #00BCD4\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-control-label {\r\n");
      out.write("    margin-bottom: 0\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input,\r\n");
      out.write("textarea,\r\n");
      out.write("button {\r\n");
      out.write("    padding: 8px 15px;\r\n");
      out.write("    border-radius: 5px !important;\r\n");
      out.write("    margin: 5px 0px;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    font-size: 18px !important;\r\n");
      out.write("    font-weight: 300\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input:focus,\r\n");
      out.write("textarea:focus {\r\n");
      out.write("    -moz-box-shadow: none !important;\r\n");
      out.write("    -webkit-box-shadow: none !important;\r\n");
      out.write("    box-shadow: none !important;\r\n");
      out.write("    border: 1px solid #00BCD4;\r\n");
      out.write("    outline-width: 0;\r\n");
      out.write("    font-weight: 400\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-block {\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    font-size: 18px !important;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("    height: 43px;\r\n");
      out.write("    cursor: pointer\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-block:hover {\r\n");
      out.write("    color: #fff !important\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button:focus {\r\n");
      out.write("    -moz-box-shadow: none !important;\r\n");
      out.write("    -webkit-box-shadow: none !important;\r\n");
      out.write("    box-shadow: none !important;\r\n");
      out.write("    outline-width: 0\r\n");
      out.write("}\r\n");
      out.write("h1{\r\n");
      out.write("\tfont-family: cursive;\r\n");
      out.write("}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
String email=session.getAttribute("email").toString(); 
      out.write("\r\n");
      out.write("  <!-- header design -->\r\n");
      out.write("  <header>\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navigation-wrap\" style=\"background:#D6FE97;top:0px;\">\r\n");
      out.write("      <div class=\"container\" >\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"adminHome.jsp\">\r\n");
      out.write("          <img src=\"../images/organicLogo.png\" class=\"img-fluid\" style=\"position:absolute;margin-left:550px;top:7px;\">\r\n");
      out.write("           </a>\r\n");
      out.write("           <a class=\"navbar-brand\" href=\"../finalVIP/start_page.html\">\r\n");
      out.write("          <img src=\"../images/Viplogo.png\" class=\"img-fluid\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("          <!-- <span class=\"navbar-toggler-icon\"></span> -->\r\n");
      out.write("          <i class=\"fas fa-stream navbar-toggler-icon\"></i>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("          <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\"  href=\"adminHome.jsp\" style=\"color:black;\">Home</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link active\" aria-current=\"page\" href=\"allProductEditProduct.jsp\" style=\"color:black;\">Edit products</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"ordersReceived.jsp\" style=\"color:black;\">Orders</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"../Logout.jsp\" style=\"color:black;\">Logout</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\"><h3 style=\"font-size:1.5rem; color:#380556;\"> ");
out.println(email);
      out.write("</h3></a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("  </header>\r\n");
      out.write(" <h1><a class=\"nav-link\" href=\"allProductEditProduct.jsp\" style=\"color:black; font-size:30px;\">Back</a></h1>\r\n");
      out.write(" ");

       String id=request.getParameter("id");
 try{
	   Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/viporg", "root", "root");
		Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select *from products where id='"+id+"'");
	
	while(rs.next())
	{
       
      out.write("\r\n");
      out.write("       <div class=\"container-fluid px-1 py-5 mx-auto\">\r\n");
      out.write("    <div class=\"row d-flex justify-content-center\">\r\n");
      out.write("        <div class=\"col-xl-7 col-lg-8 col-md-9 col-11 text-center\">\r\n");
      out.write("            <h1>Edit</h1>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("<form action=\"editProductsAction.jsp\" class=\"form-card\" method=\"post\" >\r\n");
      out.write("<input type=\"hidden\" name=\"id\" value =\"");
 out.println(id); 
      out.write("\">\r\n");
      out.write("<div class=\"row justify-content-between text-left\">\r\n");
      out.write("                        <div class=\"form-group col-sm-6 flex-column d-flex\"><h4 style=\"color:black\"> <label class=\"form-control-label px-3\" style=\"font-size:2rem; color:purple;\">Product Name<span class=\"text-danger\"> *</span></label></h4> <label style=\"font-size:1.8rem;\">");
      out.print(rs.getString(2));
      out.write("</label> </div>\r\n");
      out.write("                        <div class=\"form-group col-sm-6 flex-column d-flex\"><h4 style=\"color:black\"> <label class=\"form-control-label px-3\" style=\"font-size:2rem; color:purple;\">Product Category<span class=\"text-danger\"> *</span></label> </h4> <label style=\"font-size:1.8rem;\">");
      out.print(rs.getString(3));
      out.write("</label> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row justify-content-between text-left\">\r\n");
      out.write("                        <div class=\"form-group col-sm-6 flex-column d-flex\"> <h4 style=\"color:black\"><label class=\"form-control-label px-3\" style=\"font-size:2rem; color:purple;\"> Product Price<span class=\"text-danger\"> *</span></label> </h4><input type=\"number\" style=\"font-size:1.8rem;\" name=\"price\" value=\"");
      out.print(rs.getString(4));
      out.write("\" required> </div>\r\n");
      out.write("                        <div class=\"form-group col-sm-6 flex-column d-flex\"> <h4 style=\"color:black\"><label class=\"form-control-label px-3\" style=\"font-size:2rem; color:purple;\">Product Availability<span class=\"text-danger\"> *</span></label> </h4><select style=\"font-size:1.8rem;\" name =\"active\" >\r\n");
      out.write("<option value=\"Yes\">Yes</option>\r\n");
      out.write("<option value=\"No\">No</option>\r\n");
      out.write("</select> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write(" \r\n");
      out.write("<input type=\"submit\" class=\"main-btn\" value=\"Update\"/>\r\n");
      out.write(" </form>\r\n");

	}
}
catch(Exception e)
{System.out.println(e);
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
