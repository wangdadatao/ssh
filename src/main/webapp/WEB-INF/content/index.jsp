<%--
  Created by IntelliJ IDEA.
  User: 海涛
  Date: 2016/5/17
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主页</title>
    <link rel="stylesheet" href="/res/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th>作者</th>
            <th>书名</th>
            <th>出版社</th>
            <th>价钱</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${books}" var="book">
            <tr>
                <td><a href="/book/show?id=${book.id}">${book.title}</a></td>
                <td>${book.author}</td>
                <td>${book.publishing}</td>
                <td>${book.price}</td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>


</body>
</html>
