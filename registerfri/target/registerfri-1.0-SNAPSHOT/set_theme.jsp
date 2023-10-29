<%--
  Created by IntelliJ IDEA.
  User: AomAPJ
  Date: 6/10/2023 AD
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Select Your theme</title>
</head>
<body>
<h2> Select Your Theme</h2>
<form action="set-theme" method="post">
    <p>
        <input type="radio" name="bgColor" value=" darkcyan">
        <button style="background-color: darkcyan "> Darkcyan</button>

    </p>

    <p>
        <input type="radio" name="bgColor" value="lightskyblue">
        <button style="background-color: lightskyblue ">Lightskyblue</button>
    </p>

    <p>
        <input type="radio" name="bgColor" value="olivedrab">
        <button style="background-color: olivedrab">Olivedrab</button>

    </p>

    <p>

        <input type="radio" name="bgColor" value="purple">
        <button style="background-color: mediumpurple"> Purple</button>

    </p>

    <hr>
    <input type="submit" value="OK">
</form>
</body>
</html>
