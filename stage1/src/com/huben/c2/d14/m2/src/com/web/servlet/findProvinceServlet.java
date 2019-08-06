package com.web.servlet;

import com.service.impl.ProvinceServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/findProvinceServlet")
public class findProvinceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        ProvinceServiceImpl provinceService = new ProvinceServiceImpl();
        // List<Province> province = provinceService.findProvince();
        String json = provinceService.findProvinceJSON();

        // ObjectMapper mapper = new ObjectMapper();
        // String json = mapper.writeValueAsString(province);

        resp.getWriter().write(json);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
