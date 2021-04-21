package hibernateWeb;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernateDao.BankTransactionDao;
import hibernateDao.UserDao;
import hibernateModel.BankTransaction;
import hibernateModel.User;

@WebServlet("/register")
public class UserController extends HttpServlet{
    private static final long serialVersionUID = 1L;
    private UserDao userDao;

    public void init() {
        userDao = new UserDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        register(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("signup.jsp");
    }

    private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String accountNumber = request.getParameter("accountNumber");
        String sortCode = request.getParameter("sortCode");

        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPassword(password);
        user.setAccountNumber(Integer.parseInt(accountNumber));
        user.setSortCode(Integer.parseInt(sortCode));
        
        
        
        
        /** For Testing the Transactions - Users relationship
        User user2 = new User();
        user2.setFirstName("John");
        user2.setLastName("Smith");
        user2.setEmail("g@gmail.com");
        user2.setPassword("qwerty12");
        user2.setAccountNumber(Integer.parseInt("12345"));
        user2.setSortCode(Integer.parseInt("12345"));
        
        BankTransactionDao bankDao= new BankTransactionDao();

        BankTransaction transaction = new BankTransaction();
        transaction.setAmount(300);
        transaction.setSender(user);
        transaction.setReceiver(user2);
        transaction.setDate(new Date());

        
        userDao.saveUser(user2);
        bankDao.saveBankTransaction(transaction);
        **/
        userDao.saveUser(user);

        RequestDispatcher dispatcher = request.getRequestDispatcher("register-success.jsp");
        dispatcher.forward(request, response);
    }
}
