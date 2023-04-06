<%--
  Created by IntelliJ IDEA.
  User: lt
  Date: 2023/4/6
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>pass args</p>
<form action="landing/onLoad" method="post">
    <input type="text" name="PassName">
    <button type="button">提交</button>
</form>
<br>
<p>auto-conversion data type</p>
<form action="landing/onCheck" method="post">
    <input type="text" name="age">
    <button type="button">提交</button>
</form>
<br/>
<form action="landing/cup" method="post">
    <label>CupName:
        <input type="text" name="name">
    </label>
    <label>CupBrand:
        <input type="text" name="brand">
    </label>
    <button>submit</button>
</form>
<br>
<p>auto-encapsulation</p>
<form action="auto-encapsulation" method="post">
    <input type="text" name="name">
    <input type="text" name="brand">
    <button>submit</button>
</form>
<br>
<p>checkbox</p>
<form action="landing/checkbox" method="post">
    <input type="checkbox" name="ids" value="1"/>
    <input type="checkbox" name="ids" value="2"/>
    <input type="checkbox" name="ids" value="3"/>
    <button>submit</button>
</form>
</body>
</html>
