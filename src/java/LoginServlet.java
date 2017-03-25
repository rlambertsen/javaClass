/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rylan
 */
public class LoginServlet extends HttpServlet {

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String success = "/TOBA/Account_activity.html";
        String fail = "/TOBA/Login_failure.html";
        
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        
        if ("jsmith@toba.com".equals(email) && "letmein".equals(pass)) {
            response.sendRedirect(success);
        } else {
            response.sendRedirect(fail);
        }
    }

}
