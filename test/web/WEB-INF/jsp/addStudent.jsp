<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>AddStudent</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/addNewStudent">
            <label for="name">Name:</label> <input id="name" type="text" name="name">
            <br>
            <label for="sex">Sex:</label> <input id="sex" type="text" name="sex">
            <br>
            <label for="age">Age:</label> <input id="age" type="text" name="age">
            <br>
            <input type="submit" value="添加">
        </form>
    </body>
</html>
