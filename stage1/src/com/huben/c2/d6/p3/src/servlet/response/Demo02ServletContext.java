package servlet.response;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo02")
public class Demo02ServletContext extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext1 = req.getServletContext();
        ServletContext servletContext2 = this.getServletContext();

        System.out.println(servletContext1);
        System.out.println(servletContext2);
        System.out.println(servletContext1 == servletContext2);

        String filename = "a.jpg";
        String mimeType = servletContext1.getMimeType(filename);
        System.out.println(mimeType);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
