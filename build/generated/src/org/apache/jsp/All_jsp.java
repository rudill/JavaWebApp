package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import javax.sql.*;
import model.Cart;
import java.util.List;

public final class All_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Components/common_css_js.jsp");
    _jspx_dependants.add("/Components/navbar.jsp");
  }

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
      out.write("    ");
      out.write("<!--CSS-->\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\n");
      out.write("<!--font awesome-->\n");
      out.write("<!--<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("-->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/homepage.css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--JavaScript-->\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"JS/script.js\"></script>\n");
      out.write("\n");
      out.write("<!--jQuery-->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.0.min.js\" integrity=\"sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=\" crossorigin=\"anonymous\"></script>\n");
      out.write("<!--sweet alert-->\n");
      out.write("<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>");
      out.write("\n");
      out.write("    <title>Product List</title>\n");
      out.write("    \n");
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
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .navbar {\n");
      out.write("        font-weight: 500;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .nav-link {\n");
      out.write("        color: rgb(255 255 255/ 100%) !important;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .dropdown-menu {\n");
      out.write("        background-color: #ffffff !important;\n");
      out.write("        border-color: #949494;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .dropdown-menu li a:hover {\n");
      out.write("        background-color: #808080 !important;\n");
      out.write("        color: white;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg custom-color\" data-bs-theme=\"dark\">\n");
      out.write("    <!-- User navigation bar -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\"><i class=\"fa-sharp fa-solid fa-house\" style=\"color: #ffffff;\"></i>&ensp;TechGadgets</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\n");
      out.write("            aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                <!-- Products link -->\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\" role=\"button\" aria-expanded=\"false\"> Products </a>\n");
      out.write("                </li>\n");
      out.write("                <!-- Category dropdown -->\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Category </a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <!-- All Products -->\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"./All.jsp\">All Products</a></li>\n");
      out.write("                        <!-- Hardcoded categories -->\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"./phone.jsp\">Smartphones</a></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"./headphones.jsp\">Headphones/Earbuds</a></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"./smartwatches.jsp\">Smartwatches</a></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"./chargers.jsp\">Chargers & Cables</a></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"./powerbanks.jsp\">Power banks</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            <!-- User actions -->\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                <!-- Cart link -->\n");
      out.write("                <li class=\"nav-item active pe-3\">\n");
      out.write("   ");

    // Retrieve product list from session
    List<Cart> CL = (List<Cart>) session.getAttribute("cartList");
    // Get size of the product list
    int cartSize = (CL != null) ? CL.size() : 0;

  
      out.write("\n");
      out.write("                    \n");
      out.write("                   <span class=\"badge badge-sm indicator-item\">");
      out.print( cartSize  );
      out.write("</span> <a class=\"nav-link position-relative\" aria-current=\"page\" href=\"Cart.jsp\">\n");
      out.write("                        <i class=\"fa-solid fa-cart-shopping\" style=\"color: #ffffff;\"></i> &nbsp;Cart\n");
      out.write("                        \n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("            </ul>\n");
      out.write("         \n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End of User navigation bar -->\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("    <div class=\"main\">\n");
      out.write("        <h1>Product List</h1>\n");
      out.write("\n");
      out.write("<div class=\"card-container\">\n");
      out.write("    ");
 
        List data = (List) request.getAttribute("all");
        
        if(data != null)
        {
            for(int i=0; i< data.size();i+= 7)
            {
    
      out.write("\n");
      out.write(" <div class=\"card card-compact bg-base-100 shadow-xl\">\n");
      out.write("        <figure><img src=\"images/");
      out.print( data.get(i) );
      out.write("\" width=\"180\" height=\"180\" alt=\"image\"/></figure>\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <h2 class=\"card-title\">");
      out.print( data.get(i + 1) );
      out.write("</h2>\n");
      out.write("            <p>");
      out.print( data.get(i + 2) );
      out.write("</p>\n");
      out.write("            <p>Category: ");
      out.print( data.get(i + 3) );
      out.write("</p>\n");
      out.write("            <p><b>Price: ");
      out.print( data.get(i + 4) );
      out.write("</b></p>\n");
      out.write("            <p>");
      out.print( data.get(i + 5) );
      out.write("</p>\n");
      out.write("            <div class=\"card-actions justify-end\">\n");
      out.write("                <form action=\"addToCart\" method=\"post\"> \n");
      out.write("                    <input type=\"hidden\" name=\"productId\" value=\"");
      out.print( data.get(i + 6) );
      out.write("\"> \n");
      out.write("                    <input type=\"hidden\" name=\"productName\" value=\"");
      out.print( data.get(i + 1) );
      out.write("\"> \n");
      out.write("                    <input type=\"hidden\" name=\"Category\" value=\"");
      out.print( data.get(i + 3) );
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"Price\" value=\"");
      out.print( data.get(i + 4) );
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"Image\" value=\"");
      out.print( data.get(i) );
      out.write("\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">ADD CART</button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("\n");
      out.write("    ");
 
            }
            
        }
    
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("     <form method=\"post\" action=\"productServlet\" >\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"goo\">\n");
      out.write("    </form>\n");
      out.write("   \n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Components/Footer.jsp", out, false);
      out.write("\n");
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
