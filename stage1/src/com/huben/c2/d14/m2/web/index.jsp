<%--
  Created by IntelliJ IDEA.
  User: Koishi
  Date: 2019/8/3
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jedis</title>
</head>
<body>

<select name="province" id="province">
    <option>--请选择省份--</option>
</select>


<script>
    window.onload = function () {
        fetch("${pageContext.request.contextPath}/findProvinceServlet")
            .then(data => data.text())
            .then(data => JSON.parse(data))
            .then(data => {
                console.log(data);

                let select = document.getElementById("province");

                for (let i = 0; i < data.length; i++) {
                    let optionElement = document.createElement("option");
                    let text = document.createTextNode(data[i].name);
                    optionElement.appendChild(text);
                    optionElement.setAttribute("name", data[i].id);

                    select.appendChild(optionElement);
                }


            });
    }
</script>
</body>
</html>
