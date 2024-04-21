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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danuka
 */
@WebServlet(name = "ecomservlet", urlPatterns = {"/ecomservlet"})
public class ecomservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
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
        
        
        String Username = request.getParameter("firstname");
        String Lastname = request.getParameter("lastname");
        String emai = request.getParameter("email");
        String psw = request.getParameter("password");
        
        
        loginclass log = new loginclass();
        log.insertuser(Username,Lastname,emai,psw);
        
        response.sendRedirect("welcome.jsp");
        
        
       
                        
        
    }
    
    

   
    

}
