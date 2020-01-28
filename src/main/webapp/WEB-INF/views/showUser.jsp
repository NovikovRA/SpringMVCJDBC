<%--
  Created by IntelliJ IDEA.
  User: Роман
  Date: 27.01.2020
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info about user</title>
    <style>
        <%@include file="/WEB-INF/css/styles.css" %>
    </style>
</head>
<body>
<center>
    <div class="form-style-2">
        <div class="form-style-2-heading">
            <center>Info about ${user.name}</center>
        </div>
        <table>
            <tr>
                <td>Id</td>
                <td>${user.id}</td>
            </tr>
            <tr>
                <td>Name</td>
                <td>${user.name}</td>
            </tr>
            <tr>
                <td>Mail</td>
                <td>${user.mail}</td>
            </tr>
            <tr>
                <td>Age</td>
                <td>${user.age}</td>
            </tr>
        </table>
        <br>
        <input type="button" value="Назад" onClick='location.href="/users"'></p>
    </div>
</center>
</body>
</html>
