package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import newPackage.Cart;

public final class Nav_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/daisyui@4.10.1/dist/full.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navmain\">\n");
      out.write("         <html data-theme=\"nord\"></html>   \n");
      out.write("             ");

    // Retrieve product list from session
    List<Cart> cartList = (List<Cart>) session.getAttribute("cartList");
    // Get size of the product list
    int cartSize = (cartList != null) ? cartList.size() : 0;


      out.write("\n");
      out.write("            <div class=\"navbar bg-base-100\">\n");
      out.write("  <div class=\"flex-1\">\n");
      out.write("      <a  href=\"Products.jsp\"class=\"btn btn-ghost text-xl\">DEA SHOP</a>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"flex-none\">\n");
      out.write("    <div class=\"dropdown dropdown-end\">\n");
      out.write("      <div tabindex=\"0\" role=\"button\" class=\"btn btn-ghost btn-circle\">\n");
      out.write("        <div class=\"indicator\">\n");
      out.write("          <svg xmlns=\"http://www.w3.org/2000/svg\" class=\"h-5 w-5\" fill=\"none\" viewBox=\"0 0 24 24\" stroke=\"currentColor\"><path stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M3 3h2l.4 2M7 13h10l4-8H5.4M7 13L5.4 5M7 13l-2.293 2.293c-.63.63-.184 1.707.707 1.707H17m0 0a2 2 0 100 4 2 2 0 000-4zm-8 2a2 2 0 11-4 0 2 2 0 014 0z\" /></svg>\n");
      out.write("          <span class=\"badge badge-sm indicator-item\">");
      out.print( cartSize );
      out.write("</span>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        ");

    double subtotal = (Double) session.getAttribute("subtotal");
     
      out.write("\n");
      out.write("        \n");
      out.write("      <div tabindex=\"0\" class=\"mt-3 z-[1] card card-compact dropdown-content w-52 bg-base-100 shadow\">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("          <span class=\"font-bold text-lg\">");
      out.print( cartSize );
      out.write(" Items</span>\n");
      out.write("          <span class=\"text-info\">Subtotal: Rs.");
      out.print(subtotal);
      out.write("</span>\n");
      out.write("          <div class=\"card-actions\">\n");
      out.write("              <a href=\"Cart.jsp\">\n");
      out.write("            <button class=\"btn btn-primary btn-block\">View cart</button>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"dropdown dropdown-end\">\n");
      out.write("      <div tabindex=\"0\" role=\"button\" class=\"btn btn-ghost btn-circle avatar\">\n");
      out.write("        <div class=\"w-10 rounded-full\">\n");
      out.write("          <img alt=\"Tailwind CSS Navbar component\" src=\"https://daisyui.com/images/stock/photo-1534528741775-53994a69daeb.jpg\" />\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <ul tabindex=\"0\" class=\"menu menu-sm dropdown-content mt-3 z-[1] p-2 shadow bg-base-100 rounded-box w-52\">\n");
      out.write("        <li>\n");
      out.write("          <a class=\"justify-between\">\n");
      out.write("            Profile\n");
      out.write("            <span class=\"badge\">New</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li><a>Settings</a></li>\n");
      out.write("        <li><a>Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
