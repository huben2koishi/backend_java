<%@ page import="com.el.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Koishi
  Date: 2019/7/26
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL2</title>
</head>
<body>

<%
    User p1 = new User("张三",18,new Date());
    pageContext.setAttribute("user",p1);
%>

${pageScope.user} <br>
${user.birthdayStr} <br>


<%
    ArrayList<Integer> list = new ArrayList<>();
    list.add(123);
    list.add(456);
    list.add(789);
    pageContext.setAttribute("list",list);
%>

${list} <br>
${list[0]} <br>
${list[1]} <br>
${list[2]} <br>

<%
    HashMap<String,String> map = new HashMap<>();
    map.put("first","aaa");
    map.put("second","bbb");
    pageContext.setAttribute("map",map);
%>

${map} <br>
${map.first} <br>
${map["second"]} <br>

</body>
</html>
