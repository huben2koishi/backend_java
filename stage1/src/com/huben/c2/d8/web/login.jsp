<%--
  Created by IntelliJ IDEA.
  User: Koishi
  Date: 2019/7/24
  Time: 23:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>

<form id="form" action="/check">
    <table>
        <tr>
            <td>
                <label for="username">用户名</label>
            </td>
            <td class="td-right">
                <input id="username" name="username" type="text" placeholder="请输入账号">
                <span id="error_username"> </span>
            </td>
        </tr>
        <tr>
            <td>
                <label for="password">密码</label>
            </td>
            <td class="td-right">
                <input id="password" name="password" type="password" placeholder="请输入密码">
                <span id="error_password"> </span>
            </td>
        </tr>
        <tr>
            <td>
                <label for="code">验证码</label>
            </td>
            <td>
                <input id="code" name="code" type="text">
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <img id="img" src="/code" alt="验证码">
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <input id="submit" type="submit" value="登录">
            </td>
        </tr>
    </table>
</form>

<div><%= request.getAttribute("msg_err") == null ? "" : request.getAttribute("msg_err") %>
</div>
<div><%= request.getAttribute("login_err") == null ? "" : request.getAttribute("login_err") %>
</div>


<script>
    // document.getElementById("form").onsubmit = function () {
    //     return checkName() && checkPassword();
    // };
    //
    // document.getElementById("username").onblur = checkName;
    // document.getElementById("password").onblur = checkPassword;
    //
    // function checkName() {
    //     let username = document.getElementById("username").value;
    //     let reg = /^\w{6,12}$/;
    //     let error = document.getElementById("error_username");
    //     if (reg.test(username)) {
    //         error.innerHTML = "格式正确";
    //         error.style.color = "green";
    //     } else {
    //         error.innerHTML = "格式错误";
    //         error.style.color = "red";
    //     }
    //     return error;
    // }
    //
    // function checkPassword() {
    //     let password = document.getElementById("password").value;
    //     let reg = /^\w{10,20}$/;
    //     let error = document.getElementById("error_password");
    //     if (reg.test(password)) {
    //         error.innerHTML = "格式正确";
    //         error.style.color = "green";
    //     } else {
    //         error.innerHTML = "格式错误";
    //         error.style.color = "red";
    //     }
    //     return error;
    // }

    document.getElementById("img").onclick = function () {
        this.src = "/code?time=" + new Date().getTime();
    }

</script>

</body>
</html>
