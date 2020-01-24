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
    <title>GAVNO</title>
</head>
<body>
<table>
    <tr>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Возраст</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${user.mail}</td>
            <center><td>${user.age}</td></center>
        </tr>
    </c:forEach>
</table>
</body>
</html>
