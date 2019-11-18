<html>
<head>
    <title>Title</title>
</head>
<body><%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="/userController/insert">
        id:<input name="id">
        name:<input name="name">
        score:<input name="score">
        <input type="submit" value="添加"/>
    </form>

</body>
</html>