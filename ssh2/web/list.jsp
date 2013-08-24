<%--
  Created by IntelliJ IDEA.
  User: Lorin
  Date: 13-8-24
  Time: 下午11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h1>Users List</h1>
    <table border="1" width="80%" align="center">
        <tr>
            <td>
                id
            </td>
            <td>
                firstname
            </td>
            <td>
                lastname
            </td>
            <td>
                age
            </td>
            <td>
                delete
            </td>
            <td>
                update
            </td>
        </tr>

        <s:iterator value="#request.list" id="us">


            <tr>
                <td>
                    <s:property value="#us.id"/>
                </td>
                <td>
                    <s:property value="#us.firstname"/>
                </td>
                <td>
                    <s:property value="#us.lastname"/>
                </td>
                <td>
                    <s:property value="#us.age"/>
                </td>
                <td>
                    delete
                </td>
                <td>
                    update
                </td>
            </tr>
        </s:iterator>

    </table>
</body>
</html>