<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/login">
            <label for="username">Username:</label>
            <input id="username" name="username" type="text">
            <br>
            <label for="password">Password:</label>
            <input id="password" name="password">
            <br>
            <input type="submit" value="Login">
        </form>

        <script>
            <c:if test="${requestScope.error eq 'error'}">
                alert("您还没有登录,请先登录!");
            </c:if>
        </script>
    </body>
</html>
