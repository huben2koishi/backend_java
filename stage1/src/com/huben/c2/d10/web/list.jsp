<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>用户信息管理系统</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
    <script>
        function deleteUser(id) {
            if (confirm("确定要删除吗？")) {
                location.href = "${pageContext.request.contextPath}/deleteUserServlet?id=" + id;
            }
        }

        window.onload = function () {
            document.getElementById("deleteSelected").onclick = function () {
                if (confirm("确定要删除吗？")) {
                    let flag = false;
                    let checkBox = document.getElementsByName("uid");
                    for (let i = 0; i < checkBox.length; i++) {
                        if (checkBox[i].checked) {
                            flag = true;
                        }
                    }
                    if (flag) {
                        document.getElementById("form").submit();
                    } else {
                        alert("没有条目被选中！")
                    }
                }
            };

            document.getElementById("selectAll").onclick = function () {
                let checkBox = document.getElementsByName("uid");
                for (let i = 0; i < checkBox.length; i++) {
                    checkBox[i].checked = this.checked;
                }
            };
        }
    </script>
</head>
<body>
<div class="container">
    <h3 style="text-align: center">用户信息列表</h3>


    <div style="float: left;">
        <form class="form-inline" action="${pageContext.request.contextPath}/findUserByPageServlet" method="post">
            <div class="form-group">
                <label for="name">姓名</label>
                <input type="text" id="name" name="name" value="${condition.name[0]}">
            </div>
            <div class="form-group">
                <label for="address">籍贯</label>
                <input type="text" id="address" name="address" value="${map.address[0]}">
            </div>
            <div class="form-group">
                <label for="email">邮箱</label>
                <input type="text" id="email" name="email" value="${map.email[0]}">
            </div>
            <button type="submit" class="btn btn-default">查询</button>
        </form>
    </div>

    <div style="float: right;margin: 5px;">
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/add.jsp">添加联系人</a>
        <a class="btn btn-primary" href="javascript:void(0)" id="deleteSelected">删除选中</a>
    </div>

    <form id="form" action="${pageContext.request.contextPath}/deleteSelectedServlet" method="post">
        <table border="1" class="table table-bordered table-hover">
            <tr class="success">
                <th><input type="checkbox" id="selectAll"></th>
                <th>编号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>年龄</th>
                <th>籍贯</th>
                <th>QQ</th>
                <th>邮箱</th>
                <th>操作</th>
            </tr>

            <c:forEach items="${pageBean.list}" var="user" varStatus="s">
                <tr>
                    <th><input name="uid" type="checkbox" value="${user.id}"></th>
                    <td>${s.count}</td>
                    <td>${user.name}</td>
                    <td>${user.gender}</td>
                    <td>${user.age}</td>
                    <td>${user.address}</td>
                    <td>${user.qq}</td>
                    <td>${user.email}</td>
                    <td>
                        <a class="btn btn-default btn-sm"
                           href="${pageContext.request.contextPath}/findUserServlet?id=${user.id}">修改</a>&nbsp
                        <a class="btn btn-default btn-sm" href="javascript:deleteUser(${user.id})">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>

    </form>

    <div>
        <nav>
            <ul class="pagination">
                <c:if test="${pageBean.currentPage == 1}">
                <li class="disabled">
                    <a href="javascript:void(0)">
                        </c:if>
                        <c:if test="${pageBean.currentPage != 1}">
                <li>
                    <a href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${pageBean.currentPage-1}&rows=5&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}">
                        </c:if>
                        <span>&laquo;</span>
                    </a>
                </li>

                <c:forEach begin="1" end="${pageBean.totalPage}" var="i">
                    <c:if test="${pageBean.currentPage == i}">
                        <li class="active">
                    </c:if>
                    <c:if test="${pageBean.currentPage != i}">
                        <li>
                    </c:if>
                    <a href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${i}&rows=5&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}">${i}</a>
                    </li>
                </c:forEach>

                <c:if test="${pageBean.currentPage == 8}">
                <li class="disabled">
                    <a href="javascript:void(0)">
                        </c:if>
                        <c:if test="${pageBean.currentPage != 8}">
                <li>
                    <a href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=${pageBean.currentPage+1}&rows=5&name=${condition.name[0]}&address=${condition.address[0]}&email=${condition.email[0]}">

                        </c:if>
                        <span>&raquo;</span>
                    </a>
                </li>

                <span style="font-size: 25px;margin-left: 5px;">
                  共${pageBean.totalCount}条记录, 共${pageBean.totalPage}页
                </span>
            </ul>

        </nav>
    </div>
</div>
</body>
</html>
