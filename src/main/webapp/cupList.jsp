<%--
  Created by IntelliJ IDEA.
  User: lt
  Date: 2023/4/5
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Login</p>
<ul>
    <c:forEach items="${cupList}" var="c">
        <li>${c.name}</li>

    </c:forEach>
</ul>

</body>
</html>
