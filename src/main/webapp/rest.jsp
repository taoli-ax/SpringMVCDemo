<%--
  Created by IntelliJ IDEA.
  User: lt
  Date: 2023/4/7
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<img src="image/demo.png">
<form id="update" action="cups" method="post">
    <input type="hidden" name="_method" value="put">
    <input name="name">
    <input name="brand">
    <button>update</button>
</form>

<form id="delete" action="cups/102" method="post">
    <input type="hidden" name="_method" value="delete">
    <button>delete</button>
</form>
</body>
</html>
