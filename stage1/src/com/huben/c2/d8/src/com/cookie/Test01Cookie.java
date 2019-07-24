package com.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/test01")
public class Test01Cookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");

        Cookie[] cookies = req.getCookies();
        boolean flag = false;
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                if ("lastLogin".equals(cookie.getName())) {
                    flag = true;
                    String time = URLDecoder.decode(cookie.getValue(),StandardCharsets.UTF_8);
                    resp.getWriter().write("欢迎回来, 您上次访问时间为: " + time);

                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
                    time = URLEncoder.encode(sdf.format(date), StandardCharsets.UTF_8);
                    cookie.setValue(time);
                    cookie.setMaxAge(300);

                    resp.addCookie(cookie);
                    break;
                }
            }
        }
        if (cookies == null || cookies.length == 0 || !flag) {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
            String time = URLEncoder.encode(sdf.format(date), StandardCharsets.UTF_8);

            Cookie cookie = new Cookie("lastLogin", time);
            cookie.setMaxAge(300);

            resp.addCookie(cookie);
            resp.getWriter().write("您好, 欢迎首次访问！");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
