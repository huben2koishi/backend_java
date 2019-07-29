package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.charset.Charset;
import java.util.ArrayList;

@WebFilter("/*")
public class SensitiveWordsFilter implements Filter {
    private ArrayList<String> list = new ArrayList<>();

    public void init(FilterConfig config) throws ServletException {
        ServletContext context = config.getServletContext();
        String path = context.getRealPath("/WEB-INF/classes/敏感词.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path,Charset.forName("utf-8")));
            String line;
            while ((line = reader.readLine())!=null){
                list.add(line);
            }
            reader.close();
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        ServletRequest proxy_req = (ServletRequest)Proxy.newProxyInstance(req.getClass().getClassLoader(), req.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if ("getParameter".equals(method.getName())){
                    String value = (String)method.invoke(req, args);
                    if (value!=null){
                        for (String s : list) {
                            if (value.contains(s)){
                                value= value.replaceAll(s,"***");
                            }
                        }
                    }
                    return value;
                }
                return method.invoke(req, args);
            }
        });


        chain.doFilter(proxy_req, resp);
    }

    public void destroy() {

    }
}
