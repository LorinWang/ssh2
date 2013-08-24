<%--
  Created by IntelliJ IDEA.
  User: Lorin
  Date: 13-8-25
  Time: 上午12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h1>Update User</h1>

    <s:form action="updateUser">
    <table>
        <tr>
            <td>
                <s:hidden name="user.id" value="%{user.id}"></s:hidden>
            </td>
        </tr>
        <tr>
            <td>
                <s:textfield name="user.firstname" value="%{user.firstname}" label="firstname"></s:textfield>
            </td>
        </tr>
        <tr>
            <td>
                <s:textfield name="user.lastname" value="%{user.lastname}" label="lastname"></s:textfield>
            </td>
        </tr>
        <tr>
            <td>
                <s:textfield name="user.age" value="%{user.age}" label="age"></s:textfield>
            </td>
        </tr>
        <tr>
            <td>
                <s:submit value="submit"></s:submit>
            </td>
        </tr>

    </table>

    </s:form>
</body>
</html>