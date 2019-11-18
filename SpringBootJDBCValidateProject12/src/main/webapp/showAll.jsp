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

<table>
    <a href="/save.jsp">添加学生</a><br/>
    <form action="/userController/findById">
        id:<input name="id">
        <input type="submit" value="查找"/>
    </form>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>score</td>
        <td>操作</td>
    </tr>
     <c:forEach items="${collection}" var="user">
         <tr>
             <td>${user.id}</td>
             <td>${user.name}</td>
             <td>${user.score}</td>
             <td>
                 <a href="http://localhost:8080/userController/deleteById/${user.id}">删除</a>
                 <a href="http://localhost:8080/userController/findById/${user.id}">更新</a>
             </td>
         </tr>
     </c:forEach>
</table>
</body>
</html>