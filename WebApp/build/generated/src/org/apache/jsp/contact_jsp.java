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
      out.write("          body {\n");
      out.write("  font-family: Arial, sans-serif;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  background-color: #f5f5f5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-us {\n");
      out.write("  background-color: #fff;\n");
      out.write("  padding: 80px 0;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-us h1 {\n");
      out.write("  font-size: 2.5em;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-us p {\n");
      out.write("  font-size: 18px;\n");
      out.write("  color: #666;\n");
      out.write("  line-height: 1.5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-info-form {\n");
      out.write("  display: flex;\n");
      out.write("  justify-content: space-between;\n");
      out.write("  padding: 50px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-info-form .container {\n");
      out.write("  width: 50%;\n");
      out.write("  margin: 0 auto; /* Center the content within the container */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-info {\n");
      out.write("  background-color: #f0f0f0;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  padding: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-info h2 {\n");
      out.write("  font-size: 1.8em;\n");
      out.write("  margin-bottom: 15px;\n");
      out.write("  color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-info p {\n");
      out.write("  font-size: 16px;\n");
      out.write("  color: #666;\n");
      out.write("  line-height: 1.5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-info ul {\n");
      out.write("  list-style: none;\n");
      out.write("  padding: 0;\n");
      out.write("  margin: 20px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-info li {\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-info li i {\n");
      out.write("  margin-right: 10px;\n");
      out.write("  color: #333;\n");
      out.write("  font-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-form {\n");
      out.write("  background-color: #fff;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  padding: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-form h2 {\n");
      out.write("  font-size: 1.8em;\n");
      out.write("  margin-bottom: 15px;\n");
      out.write("  color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group {\n");
      out.write("  margin-bottom: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group label {\n");
      out.write("  display: block;\n");
      out.write("  margin-bottom: 5px;\n");
      out.write("  font-size: 16px;\n");
      out.write("  color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group input,\n");
      out.write(".form-group textarea {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 12px 15px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 3px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  font-size: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group textarea {\n");
      out.write("  height: 100px;\n");
      out.write("  resize: vertical;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-form button {\n");
      out.write("  background-color: #333;\n");
      out.write("  color: #fff;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 3px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-size: 16px;\n");
      out.write("  transition: background-color 0.2s ease-in-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-form button:hover {\n");
      out.write("  background-color: #222;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <script src=\"https://kit.fontawesome.com/your_fontawesome_kit_id.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("     <section class=\"contact-us\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h1>Thanks for Connecting with Us!</h1>\n");
      out.write("      <p>Our 24/7 support service is always here to assist you with any questions or concerns you may have.</p>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <section class=\"contact-info-form\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"contact-info\">\n");
      out.write("        <h2>Contact Info</h2>\n");
      out.write("        <p>Feel free to reach out to us using the information below.</p>\n");
      out.write("        <ul>\n");
      out.write("          <li><i class=\"fas fa-envelope\"></i> contact@webapp.com</li>\n");
      out.write("          <li><i class=\"fas fa-phone\"></i> 0764648419</li>\n");
      out.write("          <li><i class=\"fas fa-map-marker-alt\"></i> 147, Pitipana Road, Homagama</li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"contact-form\">\n");
      out.write("        <h2>Contact Form</h2>\n");
      out.write("        <form action=\"your_form_handler.jsp\">\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"firstName\">First Name:</label>\n");
      out.write("            <input type=\"text\" id=\"firstName\" name=\"firstName\" required>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"lastName\">Last Name:</label>\n");
      out.write("            <input type=\"text\" id=\"lastName\" name=\"lastName\" required>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"email\">Email:</label>\n");
      out.write("            <input type=\"email\" id=\"email\" name=\"email\" required>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"message\">Message:</label>\n");
      out.write("            <textarea id=\"message\" name=\"message\" required></textarea>\n");
      out.write("          </div>\n");
      out.write("          <button type=\"submit\">Send Message</button>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <script src=\"https://kit.fontawesome.com/your_fontawesome_kit_id.js\" crossorigin=\"anonymous\"></script>\n");
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
