<%--
  Created by IntelliJ IDEA.
  User: Роман
  Date: 24.01.2020
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
    <style>
        <%@include file="/WEB-INF/css/styles.css" %>
    </style>
</head>
<body>
<center>
    <div class="form-style-2">
        <div class="form-style-2-heading">
            <h2>
                <center>Welcome</center>
            </h2>
        </div>
        <br>
        <input type="button" value="Hello Page" onClick='location.href="hello"'></p>
        <br>
        <input type="button" value="Список юзеров" onClick='location.href="users"'></p>
    </div>
</center>
</body>
</html>
