package com.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/check")
public class Check extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String codeGet = req.getParameter("code");

        HttpSession session = req.getSession();
        String code = (String) session.getAttribute("code");
        session.removeAttribute("code");

        if (codeGet != null && codeGet.equalsIgnoreCase(code)) {
            if ("zhangsan".equals(username) && "123456".equals(password)) {
                session.setAttribute("username", username);
                resp.sendRedirect(req.getContextPath() + "/success.jsp");
            } else {
                req.setAttribute("login_err", "用户名或密码错误");
                req.getRequestDispatcher("/login.jsp").forward(req, resp);
            }
        } else {
            req.setAttribute("msg_err", "验证码错误");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
