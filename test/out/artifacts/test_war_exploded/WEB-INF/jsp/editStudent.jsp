<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>EditStudent</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/editStudent">
            <input name="stuId" value="${requestScope.id}" hidden>
            <label for="name">Name:</label> <input id="name" type="text" name="name" value="${requestScope.name}">
            <br>
            <label for="sex">Sex:</label> <input id="sex" type="text" name="sex" value="${requestScope.sex}">
            <br>
            <label for="age">Age:</label> <input id="age" type="text" name="age" value="${requestScope.age}">
            <br>
            <input type="submit" value="保存">
        </form>
    </body>
</html>
