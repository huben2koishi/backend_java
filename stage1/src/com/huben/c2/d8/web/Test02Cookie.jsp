<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.nio.charset.StandardCharsets" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Test02Cookie</title>
</head>
<body>
<%
    Cookie[] cookies = request.getCookies();
    boolean flag = false;
    if (cookies != null && cookies.length > 0) {
        for (Cookie cookie : cookies) {
            if ("lastLogin".equals(cookie.getName())) {
                flag = true;
                String time = URLDecoder.decode(cookie.getValue(), StandardCharsets.UTF_8);
%>

欢迎回来, 您上次访问时间为: <%= time %>

<%

                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
                time = URLEncoder.encode(sdf.format(date), StandardCharsets.UTF_8);
                cookie.setValue(time);
                cookie.setMaxAge(300);

                response.addCookie(cookie);
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

        response.addCookie(cookie);
%>

您好, 欢迎首次访问！

<%
    }
%>

</body>
</html>
