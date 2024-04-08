package com.example.webapp;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.servlet.http.Part;
import javax.servlet.annotation.MultipartConfig;

import static com.example.webapp.dbConnection.fetchAllFromDb;

@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
        maxFileSize=1024*1024*10,      // 10MB
        maxRequestSize=1024*1024*50)   // 50MB

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        List<Map<String, Object>> data = fetchAllFromDb();
        request.setAttribute("data", data);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//
        try {
            String Name = request.getParameter("name");
            String brand = request.getParameter("brand");
            String price = request.getParameter("price");
            String description = request.getParameter("description");


            Part filePart = request.getPart("image");
            String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
            InputStream fileContent = filePart.getInputStream();
            String uploadDirectory = "D:\\javaWebApps\\webApp\\src\\main\\webapp\\images\\";

            Files.copy(fileContent, Paths.get(uploadDirectory + fileName));

            dbConnection.insertToDb(Name, brand, price, description, fileName);

           // response.sendRedirect("index.jsp");




        } catch (IOException e) {
            e.printStackTrace();
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>File Upload Error</h1>");
            out.println("<p>" + e.getMessage() + "</p>");
            out.println("</body></html>");
        } catch (Exception e) {
            e.printStackTrace();
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Unexpected Error</h1>");
            out.println("<p>" + e.getMessage() + "</p>");
            out.println("</body></html>");
        }




    }

    public void destroy() {
    }
}