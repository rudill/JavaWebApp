package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import javax.sql.*;

public final class Products_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Product List</title>\n");
      out.write("     <link href=\"https://cdn.jsdelivr.net/npm/daisyui@4.10.1/dist/full.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("        <style>\n");
      out.write(".card-container {\n");
      out.write("    display: flex;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("    justify-content: space-between;\n");
      out.write("    gap: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card {\n");
      out.write("    width: calc(25% - 20px); /* 25% width for each card with 20px gap */\n");
      out.write("    /* Adjust the width and other styles of each card as needed */\n");
      out.write("}\n");
      out.write(".main {\n");
      out.write("    margin-top: 50px;    /* Adds 10 pixels of margin to the top */\n");
      out.write("    margin-right: 20px;  /* Adds 20 pixels of margin to the right */\n");
      out.write("    margin-bottom: 15px; /* Adds 15 pixels of margin to the bottom */\n");
      out.write("    margin-left: 25px;   /* Adds 25 pixels of margin to the left */\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <html data-theme=\"nord\"></html>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Nav.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"main\">\n");
      out.write("        <h1>Product List</h1>\n");
      out.write("\n");
      out.write("<div class=\"card-container\">\n");
      out.write("    ");
 
        try {
            // Establish database connection
            String url = "jdbc:mysql://localhost:3306/store";
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, "root", "");
            
            // Prepare SQL query
            String query = "SELECT * FROM product";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            
            // Execute query
            ResultSet rs = preparedStatement.executeQuery();
            
            // Iterate over result set and display data
            while (rs.next()) { 
    
      out.write("\n");
      out.write("    <div class=\"card card-compact bg-base-100 shadow-xl\">\n");
      out.write("        <figure><img src=\"images/");
      out.print( rs.getString("Image") );
      out.write("\" width=\"180\" height=\"180\" alt=\"image\"/></figure>\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <h2 class=\"card-title\">");
      out.print( rs.getString("ProductName") );
      out.write("</h2>\n");
      out.write("            <p>");
      out.print( rs.getString("Brand") );
      out.write("</p>\n");
      out.write("            <p>Category: ");
      out.print( rs.getString("Category") );
      out.write("</p>\n");
      out.write("            <p><b>Price: ");
      out.print( rs.getDouble("Price") );
      out.write("</b></p>\n");
      out.write("            <div class=\"card-actions justify-end\">\n");
      out.write("                \n");
      out.write("             \n");
      out.write("                <form action=\"addToCart\" method=\"post\"> \n");
      out.write("                        <input type=\"hidden\" name=\"productId\" value=\"");
      out.print( rs.getInt("ID") );
      out.write("\"> \n");
      out.write("                        <input type=\"hidden\" name=\"productName\" value=\"");
      out.print( rs.getString("ProductName") );
      out.write("\"> \n");
      out.write("                        <input type=\"hidden\" name=\"Category\" value=\"");
      out.print( rs.getString("Category") );
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" name=\"Price\" value=\"");
      out.print( rs.getDouble("Price") );
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" name=\"Image\" value=\"");
      out.print( rs.getString("Image") );
      out.write("\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">ADD CART</button>\n");
      out.write("                    </form>\n");
      out.write("                <button class=\"btn btn-primary\">Buy Now</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
 
            }
            
            // Close resources
            rs.close();
            preparedStatement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
