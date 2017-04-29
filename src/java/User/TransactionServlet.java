package User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import db.AccountDB;
import db.TransDB;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TransactionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/Transaction.jsp";

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        String action = request.getParameter("action");
        Account checking = AccountDB.selectAccount(user, "CHECKING");
        Account savings = AccountDB.selectAccount(user, "SAVINGS");
        String from = request.getParameter("From");
        String to = request.getParameter("To");
        String amount = request.getParameter("Amount");

        if (action == null) {
            action = "transfer";
        }

        if (action.equals("transfer")) {

            if (from.equals(checking.getAccountType()) && to.equals(savings.getAccountType())) {
                if (Double.parseDouble(amount) <= checking.getStartingBal()) {
                    checking.Debit(Double.parseDouble(amount));
                    savings.Credit(Double.parseDouble(amount));
                    UserTransaction trans1 = new UserTransaction(Double.parseDouble(amount), checking.getAccountType(), "Debit", checking);
                    UserTransaction trans2 = new UserTransaction(Double.parseDouble(amount), savings.getAccountType(), "Credit", savings);
                    TransDB.insert(trans1);
                    TransDB.insert(trans2);
                    checking.addTransaction(trans1);
                    savings.addTransaction(trans2);
                    url = "/Account_activity.jsp";
                }
            } else if (from.equals(savings.getAccountType()) && to.equals(checking.getAccountType())) {
                if (Double.parseDouble(amount) <= savings.getStartingBal()) {
                    savings.Debit(Double.parseDouble(amount));
                    checking.Credit(Double.parseDouble(amount));
                    UserTransaction trans1 = new UserTransaction(Double.parseDouble(amount), savings.getAccountType(), "Debit", savings);
                    UserTransaction trans2 = new UserTransaction(Double.parseDouble(amount), checking.getAccountType(), "Credit", checking);
                    TransDB.insert(trans1);
                    TransDB.insert(trans2);
                    savings.addTransaction(trans1);
                    checking.addTransaction(trans2);
                    url = "/Account_activity.jsp";

                }
            }
            AccountDB.update(checking);
            AccountDB.update(savings);

        }

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);

    }
}
