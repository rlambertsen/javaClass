package User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import db.AccountDB;
import db.userdb;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rylan
 */
public class NewCustomerServlet extends HttpServlet {

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
        
        //get user entered info and store in User object
        
        String email = request.getParameter("email");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zip = request.getParameter("zip");
        String pass = request.getParameter("password");
        String password = null;
        try {
            password = PassUtl.hashPassword(pass);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(NewCustomerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        String message;
        String url;
        
        
        
        
        if (email == null || email.isEmpty() || firstName == null || lastName == null || phone == null || address == null || city == null || state == null || zip == null || firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() || city.isEmpty() || state.isEmpty() || zip.isEmpty()) {
            message = "Please fill out the entire form";
            request.setAttribute("message", message);
            url = "/New_customer.jsp";
        } else {
            User user = new User();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(email);
            user.setPhone(phone);
            user.setAddress(address);
            user.setCity(city);
            user.setState(state);
            user.setZip(zip);
            user.setUserName(lastName + zip);
            user.setPassword(password);
            url = "/Success.jsp";
            //save the user in the session
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            userdb.insert(user);
            Account checking = new Account("CHECKING", 0.00, user);
            Account savings = new Account("SAVINGS", 25.00, user);
            AccountDB.insert(checking);
            AccountDB.insert(savings);
        }
        
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }
}
