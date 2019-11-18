<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/userController/findAll">
    id:<input name="id" value="${user.id}"/>
    name:<input name="name" value="${user.name}"/>
    score:<input name="score" value="${user.score}"/>
    <input type="submit" value="返回"/>
</form>

</body>
</html>