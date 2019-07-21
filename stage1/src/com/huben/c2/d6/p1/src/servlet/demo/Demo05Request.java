package servlet.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo05")
public class Demo05Request extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("请求方法: " + req.getMethod());
        System.out.println("虚拟路径: " + req.getContextPath());
        System.out.println("Servlet路径: " + req.getServletPath());
        System.out.println("Get请求参数： " + req.getQueryString());
        System.out.println("请求URI: " + req.getRequestURI());
        System.out.println("请求URL: " + req.getRequestURL());
        System.out.println("请求协议: " + req.getProtocol());
        System.out.println("客户端IP: " + req.getRemoteAddr());
    }

}
