package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import newPackage.Order;
import newPackage.OrderDetails;

public final class Orders_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("       <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js\"/>\n");
      out.write("       <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"/>\n");
      out.write("       <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.2/css/all.css\"/>\n");
      out.write("       <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Nav.jsp", out, false);
      out.write("\n");
      out.write("            \n");
      out.write("   <div class=\"container\">\n");
      out.write("    <article class=\"card\">\n");
      out.write("        <header class=\"card-header\"> My Orders  </header>\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            \n");
      out.write("            ");
  int userid = (Integer) session.getAttribute("auth");
      out.write("\n");
      out.write("            \n");
      out.write("            ");
 
            try {
                Order order = new Order();
                List<OrderDetails> orders = order.getOrders(userid); // Replace 2 with actual user ID
                for (OrderDetails D : orders) {
            
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("   \n");
      out.write("            <h1><b>Order ID: ");
      out.print( D.getOrderID() );
      out.write("</b></h1>\n");
      out.write("            <article class=\"card\">\n");
      out.write("                <div class=\"card-body row\">\n");
      out.write("                    <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> <strong>Ordered Date:</strong> <br>");
      out.print( D.getDate() );
      out.write(" </td>\n");
      out.write("                         <td> <strong>Subtotal</strong> <br> Rs.");
      out.print( D.getSubtotal() );
      out.write(" </td>\n");
      out.write("                        <td> <strong>Customer PhoneNO:</strong> <br> <i class=\"fa fa-phone\"></i> ");
      out.print( D.getPhoneno() );
      out.write(" </td>\n");
      out.write("                        <td> <strong>Delivery Address</strong> <br> ");
      out.print( D.getAddress() );
      out.write("</td>\n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                </div>\n");
      out.write("            </article>\n");
      out.write("           \n");
      out.write("            <hr>\n");
      out.write("            <ul class=\"row\">\n");
      out.write("                <li class=\"col-md-4\">\n");
      out.write("                    <figure class=\"itemside mb-3\">\n");
      out.write("                        <div class=\"aside\"><img src=\"images/");
      out.print( D.getImage() );
      out.write("\" class=\"img-sm border\"></div>\n");
      out.write("                        <figcaption class=\"info align-self-center\">\n");
      out.write("                            <p class=\"title\">");
      out.print( D.getProductName() );
      out.write(" </p>\n");
      out.write("                            <span class=\"text-muted\">Quantity: ");
      out.print( D.getQuantity() );
      out.write("</span><br>\n");
      out.write("                            <span class=\"text-muted\">Rs. ");
      out.print( D.getProductPrice() );
      out.write("</span>\n");
      out.write("                        </figcaption>\n");
      out.write("                    </figure>\n");
      out.write("                </li>\n");
      out.write("               \n");
      out.write("            </ul>\n");
      out.write("            <hr>\n");
      out.write("             <div class=\"track\">\n");
      out.write("                <div class=\"step active\"> <span class=\"icon\"> <i class=\"fa fa-spinner\"></i> </span> <span class=\"text\">Processing</span> </div>\n");
      out.write("                <div class=\"step \"> <span class=\"icon\"> <i class=\"fa fa-check\"></i> </span> <span class=\"text\"> Order confirmed</span> </div>\n");
      out.write("                <div class=\"step\"> <span class=\"icon\"> <i class=\"fa fa-truck\"></i> </span> <span class=\"text\"> Shiping </span> </div>\n");
      out.write("                <div class=\"step\"> <span class=\"icon\"> <i class=\"fa fa-box\"></i> </span> <span class=\"text\">Delivered</span> </div>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("            ");
 
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
      out.write("\n");
      out.write("       <a href=\"Products.jsp\" class=\"btn btn-warning\" data-abc=\"true\"> <i class=\"fa fa-chevron-left\"></i> Back to Shoping</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </article>\n");
      out.write("</div>\n");
      out.write("            \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
