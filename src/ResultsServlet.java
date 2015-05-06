import database.DataSource;
import database.dao.UserDao;
import database.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResultsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Last id has to be got from database
        int id = 0;
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        User user = new User(id, name, lastname, password, email);

        UserDao userDao = new UserDao();
        userDao.connect(new DataSource());
        userDao.save(user);

        request.getRequestDispatcher("results.jsp").forward(request, response);
    }
}
