<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.el.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.GregorianCalendar" %>
<%@ page import="java.util.Calendar" %><%--
  Created by IntelliJ IDEA.
  User: Koishi
  Date: 2019/7/27
  Time: 0:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>

<%
    ArrayList<User> users = new ArrayList<>();
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.set(1995, Calendar.MAY, 14);
    users.add(new User("张三", 18, calendar.getTime()));
    calendar.set(1994, Calendar.AUGUST, 24);
    users.add(new User("李四", 16, calendar.getTime()));
    calendar.set(1998, Calendar.FEBRUARY, 15);
    users.add(new User("王二", 15, calendar.getTime()));
    pageContext.setAttribute("list", users);
%>

<table>
    <tr>
        <th>姓名</th>
        <th>年龄</th>
        <th>出生年月日</th>
    </tr>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.birthdayStr}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
