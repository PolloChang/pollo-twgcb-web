<%--
  Created by IntelliJ IDEA.
  User: pollochang
  Date: 4/7/24
  Time: 5:51 PM
--%>
<%@page import="work.pollochang.bs.*" %>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<div>
    <g:form controller="twGcb" action="index">
        <div>
            <span>
                <label for="twgcbId">${message(code: "twgcb.twgcbId.label")}</label>
                <g:textField name="twgcbId" value="${params?.twgcbId}"/>
            </span>
            <span>
                <label for="type">${message(code: "twgcb.type.label")}</label>
                <g:select name="type" value="${params?.type}"
                          from="${BsSelect.findAllByType('twgcb_type')}"
                          optionValue="cdesc" optionKey="code"
                          noSelection="['': '---']"
                />
            </span>
        </div>
        <g:submitButton name="search" value="${message(code: "default.button.search.label")}" />
    </g:form>
</div>
<div>
    <table>
        <thead>
        <tr>
            <th>
                ${message(code: "twgcb.twgcbId.label")}
            </th>
            <th>
                ${message(code: "twgcb.type.label")}
            </th>
            <th>
                ${message(code: "twgcb.cname.label")}
            </th>
            <th>
                ${message(code: "twgcb.explanation.label")}
            </th>
            <th>
                ${message(code: "twgcb.instructions.label")}
            </th>
            <th>
                ${message(code: "twgcb.defaultValue.label")}
            </th>
            <th>
                ${message(code: "twgcb.remark.label")}
            </th>
        </tr>
        </thead>
        <tbody>
        <g:each in="${twgcbL}" var="twgcbI">
            <tr>
                <td>
                    ${twgcbI?.twgcbId}
                </td>
                <td>
                    ${twgcbI?.type}
                </td>
                <td>
                    ${twgcbI?.explanation}
                </td>
                <td>
                    ${twgcbI?.instructions}
                </td>
                <td>
                    ${twgcbI?.defaultValue}
                </td>
                <td>
                    ${twgcbI?.remark}
                </td>
            </tr>
        </g:each>
        </tbody>
    </table>

</div>
</body>
</html>