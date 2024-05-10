package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html class=\"h-full\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Admin Dashboard</title>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/daisyui@4.10.1/dist/full.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <script src=\"https://cdn.tailwindcss.com\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        function showEditModal(id, name, brand, price, category, description, image) {\r\n");
      out.write("            // Populate the form fields\r\n");
      out.write("            document.getElementById('upName').value = name;\r\n");
      out.write("            document.getElementById('upBrand').value = brand;\r\n");
      out.write("            document.getElementById('upPrice').value = price;\r\n");
      out.write("            document.getElementById('upCategory').value = category;\r\n");
      out.write("            document.getElementById('upDescription').value = description;\r\n");
      out.write("\r\n");
      out.write("            document.getElementById('upImage').src = image;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            // Set the form action to update the product with the correct ID\r\n");
      out.write("            document.getElementById('editForm').action = \"hello-servlet?method=update&ID=\" + id;\r\n");
      out.write("\r\n");
      out.write("            // Show the modal\r\n");
      out.write("            my_modal_4.showModal();\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function showDeleteAlert() {\r\n");
      out.write("            alert(\"Are you sure you want to delete this product?\");\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"h-full\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"min-h-full\">\r\n");
      out.write("    <nav class=\"bg-gray-800\">\r\n");
      out.write("        <div class=\"mx-auto max-w-7xl px-4 sm:px-6 lg:px-8\">\r\n");
      out.write("            <div class=\"flex h-16 items-center justify-between\">\r\n");
      out.write("                <div class=\"flex items-center\">\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("                    <div class=\"hidden md:block\">\r\n");
      out.write("                        <div class=\"ml-10 flex items-baseline space-x-4\">\r\n");
      out.write("                            <!-- Current: \"bg-gray-900 text-white\", Default: \"text-gray-300 hover:bg-gray-700 hover:text-white\" -->\r\n");
      out.write("                            <a href=\"#\" class=\"bg-gray-900 text-white rounded-md px-3 py-2 text-sm font-medium\" aria-current=\"page\">Dashboard</a>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Mobile menu, show/hide based on menu state. -->\r\n");
      out.write("        <div class=\"md:hidden\" id=\"mobile-menu\">\r\n");
      out.write("            <div class=\"space-y-1 px-2 pb-3 pt-2 sm:px-3\">\r\n");
      out.write("                <!-- Current: \"bg-gray-900 text-white\", Default: \"text-gray-300 hover:bg-gray-700 hover:text-white\" -->\r\n");
      out.write("                <a href=\"index.jsp\" class=\"bg-gray-900 text-white block rounded-md px-3 py-2 text-base font-medium\" aria-current=\"page\">Dashboard</a>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <main>\r\n");
      out.write("        <div class=\"mx-auto max-w-7xl py-6 sm:px-6 lg:px-8\">\r\n");
      out.write("            <section class=\"p-3 sm:p-5\">\r\n");
      out.write("                <div class=\"mx-auto max-w-screen-xl px-4 lg:px-12\">\r\n");
      out.write("                    <!-- Start coding here -->\r\n");
      out.write("                    <div class=\"bg-white dark:bg-gray-800 relative shadow-md sm:rounded-lg overflow-hidden\">\r\n");
      out.write("                        <div class=\"flex flex-col md:flex-row items-center justify-between space-y-3 md:space-y-0 md:space-x-4 p-4\">\r\n");
      out.write("                            <div class=\"w-full md:w-1/2\">\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"w-full md:w-auto flex flex-col md:flex-row space-y-2 md:space-y-0 items-stretch md:items-center justify-end md:space-x-3 flex-shrink-0\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <button type=\"button\"\r\n");
      out.write("                                        class=\"  btn btn-outline btn-accent  flex items-center justify-center text-white bg-primary-700 hover:bg-primary-800 focus:ring-4 focus:ring-primary-300 font-medium rounded-lg text-sm px-4 py-2 dark:bg-primary-600 dark:hover:bg-primary-700 focus:outline-none dark:focus:ring-primary-800\"\r\n");
      out.write("                                        onclick=\"my_modal_3.showModal()\">\r\n");
      out.write("                                    <svg class=\"h-3.5 w-3.5 mr-2\" fill=\"currentColor\" viewbox=\"0 0 20 20\"\r\n");
      out.write("                                         xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\">\r\n");
      out.write("                                        <path clip-rule=\"evenodd\" fill-rule=\"evenodd\"\r\n");
      out.write("                                              d=\"M10 3a1 1 0 011 1v5h5a1 1 0 110 2h-5v5a1 1 0 11-2 0v-5H4a1 1 0 110-2h5V4a1 1 0 011-1z\"/>\r\n");
      out.write("                                    </svg>\r\n");
      out.write("                                    Add product\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <form method=\"get\" action=\"hello-servlet\">\r\n");
      out.write("\r\n");
      out.write("                                   <input type=\"submit\" value=\"Refresh\">\r\n");
      out.write("\r\n");
      out.write("                                </form>\r\n");
      out.write("                                <dialog id=\"my_modal_3\" class=\"modal\">\r\n");
      out.write("                                    <div class=\"modal-box\">\r\n");
      out.write("                                        <h2 class=\"mb-4 text-xl font-bold text-gray-900 dark:text-white\">Add\r\n");
      out.write("                                            product</h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <form action=\"hello-servlet\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"grid gap-4 mb-4 sm:grid-cols-2 sm:gap-6 sm:mb-5\">\r\n");
      out.write("                                                <div class=\"sm:col-span-2\">\r\n");
      out.write("                                                    <label for=\"name\"\r\n");
      out.write("                                                           class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Product\r\n");
      out.write("                                                        Name</label>\r\n");
      out.write("                                                    <input type=\"text\" name=\"name\" id=\"name\"\r\n");
      out.write("                                                           class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500\"\r\n");
      out.write("                                                           placeholder=\"Type product name\" required=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"w-full\">\r\n");
      out.write("                                                    <label for=\"brand\"\r\n");
      out.write("                                                           class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Brand</label>\r\n");
      out.write("                                                    <input type=\"text\" name=\"brand\" id=\"brand\"\r\n");
      out.write("                                                           class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500\"\r\n");
      out.write("                                                           placeholder=\"Product brand\" required=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"w-full\">\r\n");
      out.write("                                                    <label for=\"price\"\r\n");
      out.write("                                                           class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Price</label>\r\n");
      out.write("                                                    <input type=\"number\" name=\"price\" id=\"price\"\r\n");
      out.write("                                                           class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500\"\r\n");
      out.write("                                                           placeholder=\"$299\" required=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"w-full\">\r\n");
      out.write("                                                    <label for=\"quantity\"\r\n");
      out.write("                                                           class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Quantity</label>\r\n");
      out.write("                                                    <input type=\"number\" name=\"quantity\" id=\"quantity\"\r\n");
      out.write("                                                           class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500\"\r\n");
      out.write("                                                           placeholder=\"$299\" required=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <label for=\"category\"\r\n");
      out.write("                                                           class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Category</label>\r\n");
      out.write("                                                    <select id=\"category\" name=\"category\"\r\n");
      out.write("                                                            class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-500 focus:border-primary-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500\">\r\n");
      out.write("                                                        <option selected=\"smartphone\">Smart phone</option>\r\n");
      out.write("                                                        <option value=\"Smartwatch\">Smart watch</option>\r\n");
      out.write("                                                        <option value=\"Earphones And Headphones\">Earphone & Headphones</option>\r\n");
      out.write("                                                        <option value=\"chargers&cables\">Chargers & Cables</option>\r\n");
      out.write("                                                        <option value=\"powerbanks\">Power banks</option>\r\n");
      out.write("                                                    </select>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"w-full\">\r\n");
      out.write("                                                    <label for=\"image\"\r\n");
      out.write("                                                           class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white \">Image</label>\r\n");
      out.write("                                                    <input type=\"file\" name=\"image\" id=\"image\"\r\n");
      out.write("                                                           class=\"file-input file-input-bordered w-full max-w-xs\"\r\n");
      out.write("                                                           required=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"sm:col-span-2\">\r\n");
      out.write("                                                    <label for=\"description\"\r\n");
      out.write("                                                           class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Description</label>\r\n");
      out.write("                                                    <textarea id=\"description\" name=\"description\" rows=\"8\"\r\n");
      out.write("                                                              class=\"block p-2.5 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-primary-500 focus:border-primary-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500\"\r\n");
      out.write("                                                              placeholder=\"Write a product description here...\"></textarea>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"flex items-center space-x-4\">\r\n");
      out.write("                                                <button type=\"submit\"\r\n");
      out.write("                                                        class=\"text-white bg-primary-700 hover:bg-primary-800 focus:ring-4 focus:outline-none focus:ring-primary-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-primary-600 dark:hover:bg-primary-700 dark:focus:ring-primary-800\">\r\n");
      out.write("                                                    Add product\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                                <button type=\"reset\"\r\n");
      out.write("                                                        class=\"text-red-600 inline-flex items-center hover:text-white border border-red-600 hover:bg-red-600 focus:ring-4 focus:outline-none focus:ring-red-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:border-red-500 dark:text-red-500 dark:hover:text-white dark:hover:bg-red-600 dark:focus:ring-red-900\">\r\n");
      out.write("                                                    <svg class=\"w-5 h-5 mr-1 -ml-1\" fill=\"currentColor\"\r\n");
      out.write("                                                         viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("                                                        <path fill-rule=\"evenodd\"\r\n");
      out.write("                                                              d=\"M9 2a1 1 0 00-.894.553L7.382 4H4a1 1 0 000 2v10a2 2 0 002 2h8a2 2 0 002-2V6a1 1 0 100-2h-3.382l-.724-1.447A1 1 0 0011 2H9zM7 8a1 1 0 012 0v6a1 1 0 11-2 0V8zm5-1a1 1 0 00-1 1v6a1 1 0 102 0V8a1 1 0 00-1-1z\"\r\n");
      out.write("                                                              clip-rule=\"evenodd\"></path>\r\n");
      out.write("                                                    </svg>\r\n");
      out.write("                                                    Clear\r\n");
      out.write("                                                </button>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"modal-action\">\r\n");
      out.write("                                            <form method=\"dialog\">\r\n");
      out.write("                                                <!-- if there is a button, it will close the model -->\r\n");
      out.write("                                                <button class=\"btn\">Close</button>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </dialog>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <dialog id=\"my_modal_4\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"modal-box\">\r\n");
      out.write("                                        <h2 class=\"mb-4 text-xl font-bold text-gray-900 dark:text-white\">Update\r\n");
      out.write("                                            product</h2>\r\n");
      out.write("                                        <form id=\"editForm\" action=\"#\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"grid gap-4 mb-4 sm:grid-cols-2 sm:gap-6 sm:mb-5\">\r\n");
      out.write("                                                <div class=\"sm:col-span-2\">\r\n");
      out.write("                                                    <label for=\"name\"\r\n");
      out.write("                                                           class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Product\r\n");
      out.write("                                                        Name</label>\r\n");
      out.write("                                                    <input type=\"text\" name=\"name\" id=\"upName\"\r\n");
      out.write("                                                           class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500\"\r\n");
      out.write("                                                           placeholder=\"Type product name\" required=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"w-full\">\r\n");
      out.write("                                                    <label for=\"brand\"\r\n");
      out.write("                                                           class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Brand</label>\r\n");
      out.write("                                                    <input type=\"text\" name=\"brand\" id=\"upBrand\"\r\n");
      out.write("                                                           class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500\"\r\n");
      out.write("                                                           placeholder=\"Product brand\" required=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"w-full\">\r\n");
      out.write("                                                    <label for=\"price\"\r\n");
      out.write("                                                           class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Price</label>\r\n");
      out.write("                                                    <input type=\"number\" name=\"price\" id=\"upPrice\"\r\n");
      out.write("                                                           class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500\"\r\n");
      out.write("                                                           placeholder=\"$299\" required=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <label for=\"category\"\r\n");
      out.write("                                                           class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Category</label>\r\n");
      out.write("                                                    <select id=\"upCategory\" name=\"category\"\r\n");
      out.write("                                                            class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-500 focus:border-primary-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500\">\r\n");
      out.write("                                                        <option selected=\"smartphone\">Smart phone</option>\r\n");
      out.write("                                                        <option value=\"Smartwatch\">Smart watch</option>\r\n");
      out.write("                                                        <option value=\"Earphones And Headphones\">Earphone & Headphones</option>\r\n");
      out.write("                                                        <option value=\"chargers&cables\">Chargers & Cables</option>\r\n");
      out.write("                                                        <option value=\"powerbanks\">Power banks</option>\r\n");
      out.write("                                                    </select>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"w-full\">\r\n");
      out.write("                                                    <label for=\"image\"\r\n");
      out.write("                                                           class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Image</label>\r\n");
      out.write("                                                    <input type=\"file\" name=\"upImage\" id=\"upImage\"\r\n");
      out.write("                                                           class=\"bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500\"\r\n");
      out.write("                                                           required=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"sm:col-span-2\">\r\n");
      out.write("                                                    <label for=\"description\"\r\n");
      out.write("                                                           class=\"block mb-2 text-sm font-medium text-gray-900 dark:text-white\">Description</label>\r\n");
      out.write("                                                    <textarea id=\"upDescription\" name=\"description\" rows=\"8\"\r\n");
      out.write("                                                              class=\"block p-2.5 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-primary-500 focus:border-primary-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500\"\r\n");
      out.write("                                                              placeholder=\"Write a product description here...\"></textarea>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"flex items-center space-x-4\">\r\n");
      out.write("                                                <button type=\"submit\"\r\n");
      out.write("                                                        class=\"text-white bg-primary-700 hover:bg-primary-800 focus:ring-4 focus:outline-none focus:ring-primary-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-primary-600 dark:hover:bg-primary-700 dark:focus:ring-primary-800\">\r\n");
      out.write("                                                    Update product\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                                <button type=\"reset\"\r\n");
      out.write("                                                        class=\"text-red-600 inline-flex items-center hover:text-white border border-red-600 hover:bg-red-600 focus:ring-4 focus:outline-none focus:ring-red-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:border-red-500 dark:text-red-500 dark:hover:text-white dark:hover:bg-red-600 dark:focus:ring-red-900\">\r\n");
      out.write("                                                    <svg class=\"w-5 h-5 mr-1 -ml-1\" fill=\"currentColor\"\r\n");
      out.write("                                                         viewBox=\"0 0 20 20\" xmlns=\"http://www.w3.org/2000/svg\">\r\n");
      out.write("                                                        <path fill-rule=\"evenodd\"\r\n");
      out.write("                                                              d=\"M9 2a1 1 0 00-.894.553L7.382 4H4a1 1 0 000 2v10a2 2 0 002 2h8a2 2 0 002-2V6a1 1 0 100-2h-3.382l-.724-1.447A1 1 0 0011 2H9zM7 8a1 1 0 012 0v6a1 1 0 11-2 0V8zm5-1a1 1 0 00-1 1v6a1 1 0 102 0V8a1 1 0 00-1-1z\"\r\n");
      out.write("                                                              clip-rule=\"evenodd\"></path>\r\n");
      out.write("                                                    </svg>\r\n");
      out.write("                                                    Clear\r\n");
      out.write("                                                </button>\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"modal-action\">\r\n");
      out.write("                                            <form method=\"dialog\">\r\n");
      out.write("                                                <!-- if there is a button, it will close the model -->\r\n");
      out.write("                                                <button class=\"btn\">Close</button>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </dialog>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div role=\"tablist\" class=\"tabs tabs-bordered\" >\r\n");
      out.write("                            <input type=\"radio\" name=\"my_tabs_1\" role=\"tab\" class=\"tab\" aria-label=\"Products\" checked/>\r\n");
      out.write("\r\n");
      out.write("                            <div role=\"tabpanel\" class=\"tab-content p-10\" style=\"padding: 0\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"overflow-x-auto sm:overflow-auto md:overflow-auto lg:overflow-auto xl:overflow-auto\">\r\n");
      out.write("\r\n");
      out.write("                                    <table class=\"w-full text-sm text-left text-gray-500 dark:text-gray-400 \">\r\n");
      out.write("                                    <thead class=\"text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400\">\r\n");
      out.write("                                    <tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <th scope=\"col\" class=\"px-4 py-3\">Image</th>\r\n");
      out.write("                                        <th scope=\"col\" class=\"px-4 py-3\" style=\"width: 50px\">Product name</th>\r\n");
      out.write("                                        <th scope=\"col\" class=\"px-4 py-3\">Category</th>\r\n");
      out.write("                                        <th scope=\"col\" class=\"px-4 py-3\">Brand</th>\r\n");
      out.write("                                        <th scope=\"col\" class=\"px-4 py-3\">Description</th>\r\n");
      out.write("                                        <th scope=\"col\" class=\"px-4 py-3\">Price</th>\r\n");
      out.write("                                        <th scope=\"col\" class=\"px-4 py-3\">Quantity</th>\r\n");
      out.write("                                        <th scope=\"col\" class=\"px-4 py-3\">\r\n");
      out.write("                                            <span class=\"sr-only\">Actions</span>\r\n");
      out.write("                                        </th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tbody>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <input type=\"radio\" name=\"my_tabs_1\" role=\"tab\" class=\"tab\" aria-label=\"Users\"/>\r\n");
      out.write("                            <div role=\"tabpanel\" class=\"tab-content p-10\">\r\n");
      out.write("                                <div class=\"overflow-x-auto\">\r\n");
      out.write("                                    <table class=\"w-full text-sm text-left text-gray-500 dark:text-gray-400 \">\r\n");
      out.write("                                        <!-- head -->\r\n");
      out.write("                                        <thead class=\"text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400\">\r\n");
      out.write("                                        <tr>\r\n");
      out.write("\r\n");
      out.write("                                            <th scope=\"col\" class=\"px-4 py-3\">User Name</th>\r\n");
      out.write("                                            <th scope=\"col\" class=\"px-4 py-3\">Email</th>\r\n");
      out.write("                                            <th scope=\"col\" class=\"px-4 py-3\">First Name</th>\r\n");
      out.write("                                            <th scope=\"col\" class=\"px-4 py-3\">Last Name</th>\r\n");
      out.write("                                            <th scope=\"col\" class=\"px-4 py-3\"></th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                        <!-- foot -->\r\n");
      out.write("\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <input type=\"radio\" name=\"my_tabs_1\" role=\"tab\" class=\"tab\" aria-label=\"Orders\"/>\r\n");
      out.write("                            <div role=\"tabpanel\" class=\"tab-content p-10\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"overflow-x-auto\">\r\n");
      out.write("                                    <table class=\"w-full text-sm text-left text-gray-500 dark:text-gray-400 \">\r\n");
      out.write("                                        <!-- head -->\r\n");
      out.write("                                        <thead class=\"text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400\">\r\n");
      out.write("                                        <tr>\r\n");
      out.write("\r\n");
      out.write("                                            <th scope=\"col\" class=\"px-4 py-3\">User Name</th>\r\n");
      out.write("                                            <th scope=\"col\" class=\"px-4 py-3\">Product</th>\r\n");
      out.write("                                            <th scope=\"col\" class=\"px-4 py-3\">Quantity</th>\r\n");
      out.write("                                            <th scope=\"col\" class=\"px-4 py-3\">Total Price</th>\r\n");
      out.write("                                            <th scope=\"col\" class=\"px-4 py-3\"></th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                     </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("product");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <tr class=\"border-b dark:border-gray-700\">\r\n");
          out.write("                                        <td class=\"px-4 py-3\">\r\n");
          out.write("                                            <div class=\"flex items\r\n");
          out.write("                                        -center space-x-3\">\r\n");
          out.write("                                                <img src=\"images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getFileName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Product image\"\r\n");
          out.write("                                                     class=\"w-8 h-8 rounded-lg mask mask-squircle\">\r\n");
          out.write("                                                <th scope=\"row\"\r\n");
          out.write("                                                    class=\"px-4 py-3 font-medium text-gray-900 whitespace-nowrap dark:text-white\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                </th>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td class=\"px-4 py-3\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getCategory()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td class=\"px-4 py-3\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getBrand()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td class=\"px-4 py-3\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td class=\"px-4 py-3\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                        <td class=\"px-4 py-3\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getQuantity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td class=\"px-4 py-3 flex items-center justify-end\">\r\n");
          out.write("                                            <form style=\"padding: 5px\">\r\n");
          out.write("                                                <button class=\"btn btn-success\" type=\"button\"\r\n");
          out.write("                                                        onclick=\"showEditModal('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getProductName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getBrand()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("',\r\n");
          out.write("                                                                '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getCategory()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getFileName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\"\r\n");
          out.write("                                                >Edit\r\n");
          out.write("                                                </button>\r\n");
          out.write("                                            </form>\r\n");
          out.write("                                            <form action=\"hello-servlet?method=delete&ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("                                                  method=\"post\" style=\"padding: 5px\">\r\n");
          out.write("                                                <button class=\"btn btn-error\" type=\"submit\" onclick=\"showDeleteAlert()\">\r\n");
          out.write("                                                    Delete\r\n");
          out.write("                                                </button>\r\n");
          out.write("                                            </form>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("user");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <tr>\r\n");
          out.write("                                            <td class=\"px-4 py-3\" style=\"font-weight: bold\">\r\n");
          out.write("                                                <div class=\"badge badge-accent\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                            <td class=\"px-4 py-3\">\r\n");
          out.write("                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                            <td class=\"px-4 py-3\">\r\n");
          out.write("                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getFirstName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                            <td class=\"px-4 py-3\">\r\n");
          out.write("                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getLastName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                            <td class=\"px-4 py-3\">\r\n");
          out.write("                                                <form action=\"user-servlet?method=delete&UID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getUID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("                                                      method=\"post\">\r\n");
          out.write("                                                    <button class=\"btn btn-error btn-xs\">Remove</button>\r\n");
          out.write("                                                </form>\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                        </tr>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("order");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <tr>\r\n");
          out.write("\r\n");
          out.write("                                            <td class=\"px-4 py-3\" style=\"font-weight: bold\">\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                                <div class=\"badge badge-accent\">\r\n");
          out.write("\r\n");
          out.write("                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getOrderUserName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                </div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                            </td>\r\n");
          out.write("\r\n");
          out.write("                                            <td class=\"px-4 py-3\">\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getOrderProductName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                            <td class=\"px-4 py-3\">\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getOrderQuantity() }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                            </td>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                            <td class=\"px-4 py-3\">\r\n");
          out.write("\r\n");
          out.write("                                                ");
          if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                            </td>\r\n");
          out.write("\r\n");
          out.write("                                            <td class=\"px-4 py-3\">\r\n");
          out.write("\r\n");
          out.write("                                                <button class=\"btn btn-error btn-xs\">Remove</button>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                            </td>\r\n");
          out.write("                                        </tr>\r\n");
          out.write("\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_set_0.setVar("totalPrice");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.getOrderPrice() * order.getOrderQuantity()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
