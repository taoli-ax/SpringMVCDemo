<%--
  Created by IntelliJ IDEA.
  User: deuta
  Date: 2023/4/7
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  isELIgnored="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>validate</p>
<form action="cupValidator/validate" method="post">
    <input name="name">
    <input name="brand">
    <button>submit</button>
</form>

<p>validate2</p>
<form action="cupValidator/validate2" method="post">
    <input name="name">${nameMessage}


    <input name="brand">${brandMessage}
    <button>submit</button>
</form>
</body>
</html>
