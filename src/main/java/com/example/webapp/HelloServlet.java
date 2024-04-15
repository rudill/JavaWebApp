package com.example.webapp;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
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

        getSetData getData = new getSetData();

        try {
                getData.getProductName(request.getParameter("name"));
                getData.getBrand(request.getParameter("brand"));
                getData.getPrice(request.getParameter("price"));
                getData.getCategory(request.getParameter("category"));
                getData.getDescription(request.getParameter("description"));


            Part filePart = request.getPart("image");
            getData.getFileName(Paths.get(filePart.getSubmittedFileName()).getFileName().toString());
            InputStream fileContent = filePart.getInputStream();
            String uploadDirectory = "D:\\javaWebApps\\webApp\\src\\main\\webapp\\images\\";

            Files.copy(fileContent, Paths.get(uploadDirectory + getData.setFileName()), StandardCopyOption.REPLACE_EXISTING);


            dbConnection.insertToDb(getData.setProductName(), getData.setBrand(), getData.setPrice(), getData.setCategory(), getData.setDescription(), getData.setFileName());

            response.sendRedirect("index.jsp");



            //response.sendRedirect("index.jsp");

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

        try {
            String method = request.getParameter("method");
            if("delete".equals(method)){
                String ID = request.getParameter("ID");
                dbConnection.deleteFromDb(ID);
                response.sendRedirect("index.jsp");
            }
            else if("update".equals(method)){

                getSetData updateData = new getSetData();

                Part filePart = request.getPart("upImage");
                updateData.getFileName(Paths.get(filePart.getSubmittedFileName()).getFileName().toString());
                InputStream fileContent = filePart.getInputStream();
                String uploadDirectory = "D:\\javaWebApps\\webApp\\src\\main\\webapp\\images\\";
                Files.copy(fileContent, Paths.get(uploadDirectory + updateData.setFileName()), StandardCopyOption.REPLACE_EXISTING);


                updateData.getID(request.getParameter("ID"));
                updateData.getProductName(request.getParameter("name"));
                updateData.getBrand(request.getParameter("brand"));
                updateData.getPrice(request.getParameter("price"));
                updateData.getCategory(request.getParameter("category"));
                updateData.getDescription(request.getParameter("description"));
                dbConnection.updateToDb(updateData.setID(), updateData.setProductName(), updateData.setBrand(), updateData.setPrice(), updateData.setCategory(), updateData.setDescription(), updateData.setFileName());
                response.sendRedirect("index.jsp");
            }

        }
        catch (IOException e) {
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