package com.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/checkUsernameServlet")
public class CheckUsernameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8");

        Map<String,Object> map = new HashMap<>();
        String username = req.getParameter("username");

        if ("tom".equals(username)) {
            map.put("userExist", true);
            map.put("userMsg","该用户名已注册");
        }else{
            map.put("userExist", false);
            map.put("userMsg","该用户名可用");
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(resp.getWriter(),map);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
