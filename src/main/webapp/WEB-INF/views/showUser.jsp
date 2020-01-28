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
</head>
<body>
<center>
           <center><h2>Info about ${user.name}</h2></center>
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
        <a href="/users">Back to Users</a>
</center>
</body>
</html>
