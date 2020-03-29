<%--
  Created by IntelliJ IDEA.
  User: sfles
  Date: 29/03/2020
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="InserisciCategoria" action="inscat" method="POST">
    <table style="width: 100%" border="0">
        <tbody>
        <tr>
            <td>Nome</td>
            <td>
                <input name="nome" placeholder="Inserisci Il nome del Prodotto" size="25" type="text"><br>
            </td>
        </tr>
        </tbody>
    </table>
    <input name="Inserisci" value="Inserisci" type="submit">
    <input name="Azzera" value="Azzera" type="reset"> <br>
</form>
</body>
</html>
