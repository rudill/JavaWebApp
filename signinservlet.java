/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecompackage;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Danuka
 */
@WebServlet(name = "signinservlet", urlPatterns = {"/signinservlet"})
public class signinservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet signinservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet signinservlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
            
    {
        String name = request.getParameter("fname");
        String password = request.getParameter("passw");
       
        loginclass login = new loginclass();
        
        boolean isValid = login.validateCus(name,password);
        
        if (isValid)
        {
            HttpSession session = request.getSession();
            session.setAttribute("loggeduser",name);
            
            Cookie cookie = new Cookie("name",name);
            cookie.setMaxAge(60*60*60);
            
            response.getWriter();
            response.sendRedirect("welcome.jsp");
        }
        
        else
        {
            PrintWriter out = response.getWriter();
            out.println("Login Faild, Please Check Your Username and Password");
            
            //response.sendRedirect("index.jsp");
    }
    }
}
        
      


