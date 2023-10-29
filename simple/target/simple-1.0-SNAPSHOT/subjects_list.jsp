<%--
  Created by IntelliJ IDEA.
  User: AomAPJ
  Date: 8/9/2023 AD
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr style="...">
        <td> Subject Code</td>
        <td> Titile </td>
        <td> Credit </td>
    </tr>
    <c:forEach items="${subjects}" var="subjects">
        <tr>
            <td>${subjects.id}</td>
            <td>${subjects.title}</td>
            <td>${subjects.credit}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
