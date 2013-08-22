<%--
  Created by IntelliJ IDEA.
  User: Lorin
  Date: 13-8-23
  Time: 上午12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Save User</h1>
<s:form action="saveUser">
    <s:textfield name="user.firstname" label="first name"></s:textfield>
    <s:textfield name="user.lastname" label="last name"></s:textfield>
    <s:textfield name="user.age" label="age"></s:textfield>

    <s:submit valut="submit"></s:submit>
</s:form>

</body>
</html>