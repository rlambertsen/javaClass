package User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import db.userdb;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String url = "/index.jsp";
        HttpSession session = request.getSession();
        String action = request.getParameter("action");
        
        if (action.equals("login")) {
            String password = request.getParameter("password");
            String userName = request.getParameter("userName");
            if (userdb.userExists(userName)) {
                User user = userdb.selectUser(userName);
                session.setAttribute("user", user);
                if (password.equals(user.getPassword()) && userName.equals(user.getUserName())) {
                    url = "/Account_activity.jsp";
                    
                } else {
                    url = "/Login_failure.jsp";
                    session.invalidate();
                }
            }
        }

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

}
