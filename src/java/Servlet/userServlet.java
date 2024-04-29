package Servlet;
import Dao.userTableConnection;
import model.userData;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "userServlet", value = "/user-servlet")

public class userServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        try {
            userData DeleteUser = new userData();
            String method = request.getParameter("method");
            if (method.equals("delete")) {
                DeleteUser.setUID(Integer.parseInt(request.getParameter("UID")));
                userTableConnection.deleteFromUsers(String.valueOf(DeleteUser.getUID()));
                response.sendRedirect("admin.jsp");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
