package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Cart;
import java.util.List;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"ISO-8859-1\">\r\n");
      out.write("    <title>Home</title>\r\n");
      out.write("    <!-- Include common CSS and JS files -->\r\n");
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
      out.write("\r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- Navbar -->\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    <!-- Carousel -->\r\n");
      out.write("    <div id=\"carouselAutoplaying\" class=\"carousel slide carousel-dark  mb-1\" data-bs-ride=\"carousel\">\r\n");
      out.write("        <div class=\"carousel-inner\">\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"carousel-item active\">\r\n");
      out.write("                <img src=\"images/banner1.jpg\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"carousel-item\">\r\n");
      out.write("                \r\n");
      out.write("                <img src=\"images/banner2.png\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"carousel-item\">\r\n");
      out.write("                <img src=\"images/banner3.jpg\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselAutoplaying\" data-bs-slide=\"prev\">\r\n");
      out.write("            <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\" style=\"color: black;\"></span>\r\n");
      out.write("            <span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselAutoplaying\" data-bs-slide=\"next\">\r\n");
      out.write("            <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("            <span class=\"visually-hidden\">Next</span>\r\n");
      out.write("        </button>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End of carousel -->\r\n");
      out.write("\r\n");
      out.write("  <!-- latest product listed -->\r\n");
      out.write("\t<div class=\"container-fluid py-3 px-3\" style=\"background: #f2f2f2;\">\r\n");
      out.write("\t\t<div class=\"row row-cols-1 row-cols-md-4 g-3\">\r\n");
      out.write("\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t<div class=\"container text-center px-5 py-5\">\r\n");
      out.write("\t\t\t\t\t<h1>Latest Products</h1>\r\n");
      out.write("\t\t\t\t\t<img src=\"images\\product.png\" class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"max-width: 100%; max-height: 200px; width: auto;\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"images/Smartwatch.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"card-img-top m-2\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"max-width: 100%; max-height: 200px; width: auto;\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"card-title text-center\">Smartwatch</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"real-price\">Rs.5000></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t&ensp;<span class=\"product-price\">Rs.4000\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"images/headphones.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"card-img-top m-2\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"max-width: 100%; max-height: 200px; width: auto;\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"card-title text-center\">Headphones</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"real-price\">Rs.4500></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t&ensp;<span class=\"product-price\">Rs.4000\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"images/charger.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"card-img-top m-2\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"max-width: 100%; max-height: 200px; width: auto;\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"card-title text-center\">Charger</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"real-price\">Rs.1100></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t&ensp;<span class=\"product-price\">Rs.1000\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t  <!-- Site footer -->\r\n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Components/Footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
