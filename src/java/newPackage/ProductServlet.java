/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author dillo
 */
  @MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
        maxFileSize=1024*1024*10,      // 10MB
        maxRequestSize=1024*1024*50)   // 50MB
@WebServlet(name = "ProductServlet", urlPatterns = {"/ProductServlet"})
public class ProductServlet extends HttpServlet {

  
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        int ID = Integer.parseInt(request.getParameter("pid"));
        String ProductName = request.getParameter("pname");
        String Brand = request.getParameter("pBrand");
        double Price = Double.parseDouble(request.getParameter("pPrice"));
        String Category = request.getParameter("pCategory");
        String Description = request.getParameter("pDescription");
        Part filePart =request.getPart("pImage");
        
        
        String uploadDirectory = "C:\\Users\\dillo\\OneDrive\\Documents\\NetBeansProjects\\store\\web\\images";
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
        try (InputStream fileContent = filePart.getInputStream()) {
            Files.copy(fileContent, Paths.get(uploadDirectory, fileName), StandardCopyOption.REPLACE_EXISTING);
          }
       
        addProduct product = new addProduct();
        product.Insertdata(ID, ProductName, Brand, Price, Category, Description, fileName);
        
        response.sendRedirect("Products.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
