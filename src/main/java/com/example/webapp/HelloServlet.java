package Servlet;

import Dao.productTableConnection;
import model.orders;
import model.productData;
import model.userData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import static Dao.fetchOrder.fetchFromOrders;
import static Dao.productTableConnection.fetchFromProduct;
import static Dao.userTableConnection.fetchFromInformation;

@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
        maxFileSize=1024*1024*10,      // 10MB
        maxRequestSize=1024*1024*50)   // 50MB

@WebServlet(name = "helloServlet", value = "/hello-servlet"
        , urlPatterns = {"/hello-servlet"}
)
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


        List<productData> products = fetchFromProduct();
        List <userData> user = fetchFromInformation();
        List <orders> order = fetchFromOrders();

        request.setAttribute("products", products);
        request.setAttribute("user" , user);
        request.setAttribute("order", order);


        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException  {

        productData getData = new productData();

        try {
                getData.setProductName(request.getParameter("name"));
                getData.setBrand(request.getParameter("brand"));
                getData.setPrice(request.getParameter("price"));
                getData.setCategory(request.getParameter("category"));
                getData.setDescription(request.getParameter("description"));
                getData.setQuantity(request.getParameter("quantity"));


            Part filePart = request.getPart("image");
            getData.setFileName(Paths.get(filePart.getSubmittedFileName()).getFileName().toString());
            InputStream fileContent = filePart.getInputStream();
            String uploadDirectory = "D:\\javaWeb\\Store\\src\\main\\webapp\\images\\";


            Files.copy(fileContent, Paths.get(uploadDirectory + getData.getFileName()), StandardCopyOption.REPLACE_EXISTING);


            productTableConnection.insertTopProduct(getData.getProductName(), getData.getBrand(), getData.getPrice(), getData.getCategory(),
                    getData.getDescription(), getData.getFileName(), getData.getQuantity());

            response.sendRedirect("index.jsp");





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
                productTableConnection.deleteFromProduct(ID);
                response.sendRedirect("index.jsp");
            }
            else if("update".equals(method)){

                productData updateData = new productData();

                Part filePart = request.getPart("upImage");
                updateData.setFileName(Paths.get(filePart.getSubmittedFileName()).getFileName().toString());
                InputStream fileContent = filePart.getInputStream();
                String uploadDirectory = "D:\\javaWeb\\Store\\src\\main\\webapp\\images";
                Files.copy(fileContent, Paths.get(uploadDirectory + updateData.getFileName()), StandardCopyOption.REPLACE_EXISTING);


                updateData.setID(request.getParameter("ID"));
                updateData.setProductName(request.getParameter("name"));
                updateData.setBrand(request.getParameter("brand"));
                updateData.setPrice(request.getParameter("price"));
                updateData.setCategory(request.getParameter("category"));
                updateData.setDescription(request.getParameter("description"));
                productTableConnection.updateToProduct(updateData.getID(), updateData.getProductName(), updateData.getBrand(), updateData.getPrice(), updateData.getCategory(), updateData.getDescription(), updateData.getFileName());
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
