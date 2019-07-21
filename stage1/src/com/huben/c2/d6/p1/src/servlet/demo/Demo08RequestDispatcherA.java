package servlet.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo08a")
public class Demo08RequestDispatcherA extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo08 part a");

        req.setAttribute("msg", "hello, part b!");

        req.getRequestDispatcher("/demo08b").forward(req, resp);
    }


}
