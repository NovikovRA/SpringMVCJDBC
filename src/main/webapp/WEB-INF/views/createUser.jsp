<%--
  Created by IntelliJ IDEA.
  User: Роман
  Date: 27.01.2020
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create User Page</title>
    <style>
        <%@include file="/WEB-INF/css/styles.css" %>
    </style>
</head>
<body>
<center>
    <div class="form-style-2">
        <form name="user" action="/addUser" method="post">
            <p>Name</p>
            <input title="Name" type="text" name="name">
            <p>Age</p>
            <input title="Age" type="text" name="age">
            <p>Mail</p>
            <input title="Mail" type="text" name="mail">
            <br>
            <p><input type="submit" value="OK"></p>
        </form>
        <br>
        <input type="button" value="Назад" onClick='location.href="/users"'>
    </div>
</center>
</body>
</html>
