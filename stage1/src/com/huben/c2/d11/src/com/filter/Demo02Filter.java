package com.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class Demo02Filter implements Filter {
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init...");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filter...a");
        chain.doFilter(req, resp);
        System.out.println("filter...b");
    }

    public void destroy() {
        System.out.println("destroy...");
    }
}
