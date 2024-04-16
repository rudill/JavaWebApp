package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import newPackage.Cart;
import java.util.List;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            .carttable {\n");
      out.write("    margin-top: 30px;    /* Adds 10 pixels of margin to the top */\n");
      out.write("    margin-right: 30px;  /* Adds 20 pixels of margin to the right */\n");
      out.write("    margin-bottom: 15px; /* Adds 15 pixels of margin to the bottom */\n");
      out.write("    margin-left: 30px;   /* Adds 25 pixels of margin to the left */\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Nav.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"cart\">\n");
      out.write("            \n");
      out.write("    ");
 if (session.getAttribute("cartList") == null) { 
      out.write("\n");
      out.write("        <p>No products available.</p>\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("    ");

    double subtotal = (Double) session.getAttribute("subtotal");
     
      out.write("\n");
      out.write("    <div class=\"stat\">\n");
      out.write("    <div class=\"stat-title\">SUB TOTAL</div>\n");
      out.write("    <div class=\"stat-value\">Rs");
      out.print( subtotal );
      out.write("  <button class=\"btn btn-sm\">Check Out</button> </div>  \n");
      out.write("   \n");
      out.write("  </div>\n");
      out.write(" <div class=\"carttable\">  \n");
      out.write("<div class=\"overflow-x-auto\">\n");
      out.write("  <table class=\"table\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("        <th>Product</th>\n");
      out.write("        <th>Quantity</th>\n");
      out.write("        <th>Total</th>\n");
      out.write("        <th></th>\n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("            ");
 
               List<Cart> cartList = (List<Cart>) session.getAttribute("cartList");
                for (int i = 0; i < cartList.size(); i++) {
                    Cart cart = cartList.get(i);
            
      out.write("\n");
      out.write("            <tbody>\n");
      out.write("      <tr>\n");
      out.write("        <td>\n");
      out.write("          <div class=\"flex items-center gap-3\">\n");
      out.write("            <div class=\"avatar\">\n");
      out.write("              <div class=\"mask mask-squircle w-20 h-20\">\n");
      out.write("                <img src=\"images/");
      out.print( cart.getImage() );
      out.write("\" alt=\"Avatar Tailwind CSS Component\" />\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("              <div class=\"font-bold\">");
      out.print( cart.getProductName() );
      out.write("</div>\n");
      out.write("              <div class=\"text-sm opacity-50\">");
      out.print( cart.getCategory() );
      out.write("</div>\n");
      out.write("            </div>\n");
      out.write("  \n");
      out.write("            \n");
      out.write("            \n");
      out.write("          <td>\n");
      out.write("    <form action=\"\" method=\"\" class=\"form-inline\">\n");
      out.write("        \n");
      out.write("        <div class=\"form-group d-flex justify-content-between\">\n");
      out.write("            <a class=\"btn btn-sm btn-decre\" href=\"addToCart?action=decrease&id=");
      out.print( cart.getID() );
      out.write("\" style=\"background-color: transparent; border: none;\"><i class=\"fas fa-minus-square\"></i></a>\n");
      out.write("            <input type=\"text\" name=\"quantity\" class=\"form-control\" value=\"");
      out.print( cart.getQuantity() );
      out.write("\"> \n");
      out.write("            <a class=\"btn bnt-sm btn-incre\" href=\"addToCart?action=increase&id=");
      out.print( cart.getID() );
      out.write("\" style=\"background-color: transparent; border: none;\"><i class=\"fas fa-plus-square\"></i></a> \n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</td>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        <td>");
      out.print( cart.getPrice()* cart.getQuantity() );
      out.write("</td>\n");
      out.write("        <th>\n");
      out.write("            <form action=\"removeCart\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"index\" value=\"");
      out.print( i );
      out.write("\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-error btn-xs\">Remove</button>\n");
      out.write("             </form>\n");
      out.write("        </th>      \n");
      out.write("       </td>\n");
      out.write("     </div>\n");
      out.write("      </tr>\n");
      out.write("    </tbody>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </table>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    \n");
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
