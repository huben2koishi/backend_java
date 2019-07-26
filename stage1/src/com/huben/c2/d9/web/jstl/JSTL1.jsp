<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Koishi
  Date: 2019/7/26
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL1</title>
</head>
<body>

<c:if test="true">
    我是 true
</c:if>

<hr>
<%
    pageContext.setAttribute("number", 3);
%>
<c:choose>
    <c:when test="${number == 1}">星期一</c:when>
    <c:when test="${number == 2}">星期二</c:when>
    <c:when test="${number == 3}">星期三</c:when>
    <c:when test="${number == 4}">星期四</c:when>
    <c:when test="${number == 5}">星期五</c:when>
    <c:when test="${number == 6}">星期六</c:when>
    <c:when test="${number == 7}">星期天</c:when>
    <c:otherwise>输入错误</c:otherwise>
</c:choose>
<hr>

<c:forEach begin="1" end="10" var="i" step="1">${i}&nbsp;</c:forEach>
<hr>

<%
    ArrayList<String> list = new ArrayList<>();
    list.add("hello");
    list.add("world");
    pageContext.setAttribute("list",list);
%>
<c:forEach items="${list}" var="str">${str}&nbsp;</c:forEach>

</body>
</html>
