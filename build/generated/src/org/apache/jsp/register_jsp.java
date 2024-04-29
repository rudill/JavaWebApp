package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Register</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"newstyle.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"newstyle2.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"img-holder\">\n");
      out.write("            <div class=\"bg\"></div>\n");
      out.write("            <div class=\"info-holder\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-holder\">\n");
      out.write("            <div class=\"form-content\">\n");
      out.write("                <div class=\"form-items\">\n");
      out.write("                    <h3>Get more things done with Loggin Our Site.</h3>\n");
      out.write("                    <div class=\"page-links\">\n");
      out.write("                        <a href=\"login2.jsp\">Login</a><a href=\"register2.jsp\" class=\"active\">Register</a>\n");
      out.write("                    </div>\n");
      out.write("                    <form method=\"post\" action=\"ecomservlet\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"username\" placeholder=\"User Name\" required>\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"firstname\" placeholder=\"First Name\" required>\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"lastname\" placeholder=\"Last Name\" required>\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"email\" placeholder=\"E-Mail\" required>\n");
      out.write("                        <input class=\"form-control\" type=\"password\" name=\"password\" placeholder=\"Password\" required>\n");
      out.write("                        <input class=\"form-control\" type=\"password\" name=\"Retypepassword\" placeholder=\"Retype Password\" required>\n");
      out.write("                        <div class=\"form-button\">\n");
      out.write("                            <button id=\"submit\" type=\"submit\" class=\"ibtn\">Register</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
