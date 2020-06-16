<%--
  Created by IntelliJ IDEA.
  User: Mr Sugar
  Date: 6/16/2020
  Time: 8:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/translate">
    <fieldset>
        <legend>Dictionary</legend>
        <table>
            <tr>
                <td>Input English word</td>
                <td><input type="text" name = "english"></td>
            </tr>
            <tr>
                <td><button>Translate</button></td>
            </tr>
            <tr>
                <td><p>Vietnamese: ${vietnamese}</p></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
