package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpRequest;

@WebFilter("/*")
public class LoginFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;

        String uri = request.getRequestURI();
        if (uri.contains("/login.jsp") || uri.contains("/loginServlet") || uri.contains("/css/")
                || uri.contains("/js/") || uri.contains("/checkCodeServlet")) {
            chain.doFilter(req, resp);
        } else {
            if (request.getSession().getAttribute("user") != null) {
                chain.doFilter(req, resp);
            } else {
                request.setAttribute("login_msg", "您尚未登陆, 请先登录");
                request.getRequestDispatcher("/login.jsp").forward(request, resp);
            }
        }


        // chain.doFilter(req, resp);
    }

    public void destroy() {

    }
}
