
package Servlet;

import Dao.Product;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "productServlet", urlPatterns = {"/Product"})
public class productServlet extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

  String category = request.getParameter("Category");
  
  Product product = new Product();
  
  if ("all".equals(category))
  {
   List<String> all = product.All();
   request.setAttribute("Product", all);
   RequestDispatcher rdAll = request.getRequestDispatcher("Product.jsp");
   rdAll.forward(request, response);
  } 
  else if("chargers".equals(category))
  {
    List<String> chargers = product.Chargers();
    request.setAttribute("Product", chargers);
    RequestDispatcher rdChargers = request.getRequestDispatcher("Product.jsp");
    rdChargers.forward(request, response);
  }
  else if ("headphone".equals(category))
  {
      List <String> headphone =product.Headphones();
      request.setAttribute("Product", headphone);
      RequestDispatcher rdHeadphone =request.getRequestDispatcher("Product.jsp");
      rdHeadphone.forward(request, response);
  }
  else if ("phone".equals(category))
  {
      List <String> phone= product.Phone();
      request.setAttribute("Product", phone);
      RequestDispatcher rdPhone =request.getRequestDispatcher("Product.jsp");
      rdPhone.forward(request, response);
  }
  else if ("powerbank".equals(category))
  {
      List <String> powerbank = product.powerbanks();
      request.setAttribute("Product", powerbank);
      RequestDispatcher rdPowerbank =request.getRequestDispatcher("Product.jsp");
      rdPowerbank.forward(request, response);
  }
  
  else if("smartwatch".equals(category))
  {
      List <String> samrtwatch = product.smartwatches();
      request.setAttribute("Product",samrtwatch );
      RequestDispatcher rdWatch =request.getRequestDispatcher("Product.jsp");
      rdWatch.forward(request, response);
  }
      
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
