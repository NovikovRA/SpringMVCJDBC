<%--
  Created by IntelliJ IDEA.
  User: Роман
  Date: 24.01.2020
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page isELIgnored ="false" %>
<html>
<head>
    <title>List</title>
    <%--<link href="styles.css" rel="stylesheet" type="text/css">--%>
    <style>
        <%@include file="/WEB-INF/css/styles.css" %>
    </style>
</head>
<body>
<center>
<div class="form-style-2">
    <div class="form-style-2-heading">
        <center>Список пользователей</center>
    </div>
<table>
    <tr>
        <th>Id</th>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Возраст</th>
        <th> </th>
        <th> </th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td><a href="/user/${user.id}">${user.id}</a></td>
            <td>${user.name}</td>
            <td>${user.mail}</td>
            <td>${user.age}</td>
            <td><a href="/delete/${user.id}">Delete</a></td>
            <td><a href="/update/${user.id}">Update</a></td>
        </tr>
    </c:forEach>
</table>
<p align="center" style="color:#0c0c0c; font-size:25px">
    <input type="button" value="Добавить юзера" onClick='location.href="/addUser"'></p>
</div>
</center>
</body>
</html>
