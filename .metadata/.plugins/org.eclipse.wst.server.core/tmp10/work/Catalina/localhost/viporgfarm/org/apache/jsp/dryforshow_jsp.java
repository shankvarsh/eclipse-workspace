/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2022-03-29 14:28:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dryforshow_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("  <title>Dry Fruits</title>\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css\">\r\n");
      out.write("\r\n");
      out.write("  <!-- OWN CSS -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"./css/style1.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"./css/responsive-style.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <header>\r\n");
      out.write("    <nav class=\"navbar  navbar-expand-lg navigation-wrap \">\r\n");
      out.write("           <img src=\"images/Viplogo.png\" class=\"img-fluid\" style=\"position:absolute;margin-left:20px;\">\r\n");
      out.write("      <div class=\"container\" >\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\" >\r\n");
      out.write("            <a class=\"main-btn\" href=\"firstpage.jsp\">Home</a>\r\n");
      out.write("          </div>\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("         <img src=\"./images/organicLogo.png\" class=\"img-fluid\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("          <!-- <span class=\"navbar-toggler-icon\"></span> -->\r\n");
      out.write("          <i class=\"fas fa-stream navbar-toggler-icon\"></i>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("          <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("\r\n");
      out.write("            <li><a class=\"main-btn\" href=\"signup.jsp\">Create Account</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <nav class=\"navbar  navbar-expand-lg navigation-wrap \" style=\"top:79px;postion:absolute;\">\r\n");
      out.write("    \r\n");
      out.write("     <div class=\"collapse navbar-collapse\" id=\"navbarNav\" >\r\n");
      out.write("     \r\n");
      out.write("          <ul class=\"navbar-nav\" style=\"margin-left:250px;\">\r\n");
      out.write("            <li class=\"nav-item\" >\r\n");
      out.write("              <a class=\"nav-link \" href=\"fruitsforshow.jsp\" style=\"padding-right:100px;\">Fruits</a>\r\n");
      out.write("            </li>\r\n");
      out.write("             <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"vegeforshow.jsp\" style=\"padding-right:100px;\">Vegetables</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link \" href=\"grainsforshow.jsp\" style=\"padding-right:100px;\">Grains</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link active\" aria-current=\"page\" href=\"dryforshow.jsp\" style=\"padding-right:100px;\">Dry fruits</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link \" href=\"oilforshow.jsp\" style=\"padding-right:100px;\">Oils</a>\r\n");
      out.write("            </li>\r\n");
      out.write("             <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link \" href=\"spicesforshow.jsp\" style=\"padding-right:100px;\">Spices</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("    </nav>\r\n");
      out.write("  </header>\r\n");
      out.write("  <script>\r\n");
      out.write("function myFunction() {\r\n");
      out.write("  alert(\"You need to login, before adding products to cart.\");\r\n");
      out.write("  window.location.href = \"login.jsp\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("   <!-- Products section -->\r\n");
      out.write("   <section id=\"product\" class=\"product\">\r\n");
      out.write("     <div class=\"headline text-center mb-5\">\r\n");
      out.write("       <h2 class=\"pb-3 position-relative d-inline-block\" style=\"color:#00a149 \">Dry Fruits</h2>\r\n");
      out.write("     </div>\r\n");
      out.write("   </section>\r\n");
      out.write("    <section id=\"products\" class=\"products\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-sm-12\">\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("         <div class=\"col-sm-6 col-lg-4\">\r\n");
      out.write("           <a href=\"#\" class=\"d-block text-center mb-4\">\r\n");
      out.write("             <div class=\"product-list\">\r\n");
      out.write("               <div class=\"product-image position-relative\">\r\n");
      out.write("\r\n");
      out.write("   <img src=\"./images/img/dry/d1.PNG\" alt=\"products\" class=\"img-fluid product-image-first\" >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"product-name pt-3\">\r\n");
      out.write("                 <h3 class=\"text-capitalize\">Terra Greens Organic's Almonds</h3>\r\n");
      out.write("                 <p class=\"mb-0 amount\">Rs 240.00</p>\r\n");
      out.write("                 <div class=\"py-1\">\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <button onclick=\"myFunction()\" type=\"button\" class=\"add_to_Card\"  >ADD TO CART</button>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </a>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"col-sm-6 col-lg-4\">\r\n");
      out.write("           <a href=\"#\" class=\"d-block text-center mb-4\">\r\n");
      out.write("             <div class=\"product-list\">\r\n");
      out.write("               <div class=\"product-image position-relative\">\r\n");
      out.write("                   <img src=\"./images/img/dry/d2.PNG\" alt=\"products\" class=\"img-fluid product-image-first\">\r\n");
      out.write("\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"product-name pt-3\">\r\n");
      out.write("                 <h3 class=\"text-capitalize\">Terra Greens Organic's Cashew Whole</h3>\r\n");
      out.write("                 <p class=\"mb-0 amount\">Rs 210.00</p>\r\n");
      out.write("                 <div class=\"py-1\">\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <button onclick=\"myFunction()\" type=\"button\" class=\"add_to_Card\">ADD TO CART</button>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </a>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"col-sm-6 col-lg-4\">\r\n");
      out.write("           <a href=\"#\" class=\"d-block text-center mb-4\">\r\n");
      out.write("             <div class=\"product-list\">\r\n");
      out.write("               <div class=\"product-image position-relative\">\r\n");
      out.write("                   <img src=\"./images/img/dry/d3.PNG\" alt=\"products\" class=\"img-fluid product-image-first\">\r\n");
      out.write("\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"product-name pt-3\">\r\n");
      out.write("                 <h3 class=\"text-capitalize\">Organic's Honey Roasted Walnuts</h3>\r\n");
      out.write("                 <p class=\"mb-0 amount\">Rs 275.00</p>\r\n");
      out.write("                 <div class=\"py-1\">\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <button type=\"button\" onclick=\"myFunction()\" class=\"add_to_Card\">ADD TO CART</button>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </a>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"col-sm-6 col-lg-4\">\r\n");
      out.write("           <a href=\"#\" class=\"d-block text-center mb-4\">\r\n");
      out.write("             <div class=\"product-list\">\r\n");
      out.write("               <div class=\"product-image position-relative\">\r\n");
      out.write("                   <img src=\"./images/img/dry/d4.PNG\" alt=\"products\" class=\"img-fluid product-image-first\">\r\n");
      out.write("\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"product-name pt-3\">\r\n");
      out.write("                 <h3 class=\"text-capitalize\">Terra Greens Organic's Raisins</h3>\r\n");
      out.write("                 <p class=\"mb-0 amount\">Rs 99.00</p>\r\n");
      out.write("                 <div class=\"py-1\">\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <button type=\"button\" onclick=\"myFunction()\" class=\"add_to_Card\">ADD TO CART</button>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </a>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"col-sm-6 col-lg-4\">\r\n");
      out.write("           <a href=\"#\" class=\"d-block text-center mb-4\">\r\n");
      out.write("             <div class=\"product-list\">\r\n");
      out.write("               <div class=\"product-image position-relative\">\r\n");
      out.write("\r\n");
      out.write("                   <img src=\"./images/img/dry/d5.PNG\" alt=\"products\" class=\"img-fluid product-image-first\">\r\n");
      out.write("\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"product-name pt-3\">\r\n");
      out.write("                 <h3 class=\"text-capitalize\">Honey Roasted Cashews</h3>\r\n");
      out.write("                 <p class=\"mb-0 amount\">Rs 250.00</p>\r\n");
      out.write("                 <div class=\"py-1\">\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <button onclick=\"myFunction()\" type=\"button\" class=\"add_to_Card\">ADD TO CART</button>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </a>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"col-sm-6 col-lg-4\">\r\n");
      out.write("           <a href=\"#\" class=\"d-block text-center mb-4\">\r\n");
      out.write("             <div class=\"product-list\">\r\n");
      out.write("               <div class=\"product-image position-relative\">\r\n");
      out.write("                   <img src=\"./images/img/dry/d6.PNG\" alt=\"products\" class=\"img-fluid product-image-first\">\r\n");
      out.write("\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"product-name pt-3\">\r\n");
      out.write("                 <h3 class=\"text-capitalize\">Nourish Organic's NRS Honey Roasted Almonds</h3>\r\n");
      out.write("                 <p class=\"mb-0 amount\">Rs 93.00</p>\r\n");
      out.write("                 <div class=\"py-1\">\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                     <span class=\"ti-star active\"></span>\r\n");
      out.write("                     <span class=\"ti-star\"></span>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <button onclick=\"myFunction()\" type=\"button\" class=\"add_to_Card\">ADD TO CART</button>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           </a>\r\n");
      out.write("         </div>\r\n");
      out.write("       </div>\r\n");
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
