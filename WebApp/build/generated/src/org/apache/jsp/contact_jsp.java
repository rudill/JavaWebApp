package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Contact Page</title>\n");
      out.write("        <style>\n");
      out.write("            #main-title{\n");
      out.write("                color:#222831;\n");
      out.write("                font-family: arial;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 40px;\n");
      out.write("            }   \n");
      out.write("            \n");
      out.write("            #sub-title{\n");
      out.write("                text-align: center;\n");
      out.write("                color: #73777B;\n");
      out.write("                font-family: arial;\n");
      out.write("                font-weight: 500;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #section-one{\n");
      out.write("                padding-top: 100px;\n");
      out.write("                padding-left: 200px;\n");
      out.write("                padding-right: 200px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #phone{\n");
      out.write("                color: black;\n");
      out.write("                font-family: arial;\n");
      out.write("                size: 18px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #mail{\n");
      out.write("               color: black;\n");
      out.write("                font-family: arial;\n");
      out.write("                size: 18px; \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #address{\n");
      out.write("                color: black;\n");
      out.write("                font-family: arial;\n");
      out.write("                size: 18px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #form-section{\n");
      out.write("                margin-left: 450px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <h1 id=\"main-title\"> Contact Us</h1>\n");
      out.write("            <p id=\"sub-title\">Welcome to WebApp contact us section. If you need any help please reach out to us. Our 24/7 suport team is here to answer your all the questions.</p>\n");
      out.write("            <div id=\"section-one\"> \n");
      out.write("            \n");
      out.write("            <div id=\"contact-section\"> \n");
      out.write("                <p id=\"phone\">Phone Number : (+94) 764648419</p>\n");
      out.write("                <p id=\"mail\">Email : webapp@example.com</p>\n");
      out.write("                <p id=\"address\">Address : 147, pitipana Road, Kottawa, Homagama</p>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("            <div id=\"form-section\"> \n");
      out.write("            <form name=\"Contact Form\" action=\"contact.jsp\" method=\"GET\">\n");
      out.write("            Fist Name :<input type=\"text\" name=\"First Name \" value=\"Ruvinda\" /><br><br>\n");
      out.write("            Last Name : <input type=\"text\" name=\"Last Name \" value=\"Dilshan\" /><br><br>\n");
      out.write("            Email : <input type=\"text\" name=\"email\" value=\"email\" /><br><br>\n");
      out.write("            \n");
      out.write("            Message : <textarea name=\"text\"> </textarea><br><br>\n");
      out.write("\n");
      out.write("<button type =\"submit\">Submit</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
