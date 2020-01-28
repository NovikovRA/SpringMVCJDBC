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
        <form name="user" action="/updateUser" method="post">
            <p>Id</p>
            <input title="Name" type="text" name="id" value="${user.id}">
            <p>Name</p>
            <input title="Name" type="text" name="name" value="${user.name}">
            <p>Email</p>
            <input title="Email" type="text" name="mail" value="${user.mail}">
            <p>Age</p>
            <input title="Age" type="text" name="age" value="${user.age}">
            <br>
            <p><input type="submit" value="OK"></p>


        </form>
    </div>
</center>
</body>
</html>
