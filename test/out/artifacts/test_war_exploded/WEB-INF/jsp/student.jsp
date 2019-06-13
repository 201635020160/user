<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <a href="${pageContext.request.contextPath}/add">添加</a>
        <table>
            <tr>
                <th>id</th>
                <th>name</th>
                <th>sex</th>
                <th>age</th>
            </tr>
            <c:forEach items="${requestScope.studentList}" var="student">
                <tr>
                    <td>${student.stuId}</td>
                    <td>${student.name}</td>
                    <td>${student.sex}</td>
                    <td>${student.age}</td>
                    <td><a href="${pageContext.request.contextPath}/edit?id=${student.stuId}
                                &name=${student.name}
                                &sex=${student.sex}
                                &age=${student.age}"
                    >编辑</a></td>
                    <td><a href="${pageContext.request.contextPath}/deleteStudent?stuId=${student.stuId}">删除</a> </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
