package User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import db.userdb;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import db.AccountDB;
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        
        String action = request.getParameter("action");
        if (action == null) {
            action = "login";
        }
        
        if (action.equals("login")) {

            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
            String url = "";
            
            HttpSession session = request.getSession();

            if (userdb.userExists(userName)) {
                
                User user = userdb.getUserbyID(userName);

                if (password.equals(user.password)) {               
                session.setAttribute("user", user);
                url = "/account_activity.jsp";
                
                getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response); 
                }
                else {
                    url = "/login_error.jsp";
                    
                    getServletContext()
                    .getRequestDispatcher(url)
                    .forward(request, response);
                }
            }
            else {
                url = "/login_error.jsp";

                getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
            }
        }
          
    }
}
