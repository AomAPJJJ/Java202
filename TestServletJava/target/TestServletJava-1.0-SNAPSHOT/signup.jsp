<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sorra
  Date: 28/10/2566
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Sing Up</title>
</head>
<body>
<h3>Sing Up</h3>
<c:if test ="${message != null}"> <p style="color: red">${message}</p> </c:if>
<form action="signUp" method="post">
  Name:<input type="text" name="Name"> <br>
  Email:<input type="email" name="Email"> <br>
  Username:<input type="text" name="Username"> <br>
  Password:<input type="password" name="Password"> <br>
  <input type="submit" value="Sign Up">
  <a href="login.jsp">Login</a>
</form>
</body>
</html>