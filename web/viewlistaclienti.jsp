<%@ page import="psw.esempiojpa.model.Cliente" %>
<%--
  Created by IntelliJ IDEA.
  User: sfles
  Date: 25/03/2020
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="lc" class="java.util.List<Cliente>" scope="request"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% for(Cliente c: lc) { %>
<p><%=c.getId()%>, <%=c.getNome()%></p>
<% } %>
</body>
</html>
