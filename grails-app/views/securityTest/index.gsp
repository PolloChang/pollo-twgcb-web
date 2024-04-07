<%--
  Created by IntelliJ IDEA.
  User: pollochang
  Date: 4/7/24
  Time: 10:25 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<g:form controller="securityTest" action="index">
  <g:select name="actionType"
            from="${[
                    [val: 0, sDesc: '加密'],
                    [val: 1, sDesc: '解密']
            ]}"
            optionKey="val"
            optionValue="sDesc"
            noSelection="['':'- Select -']"
            value="${params?.actionType}"
  />
  <g:textField name="secret" placeholder="輸入鹽巴" value="${params?.secret}" />
  <g:textField name="strToEncrypt" placeholder="輸入要加密的文字" value="${params?.strToEncrypt}"/>
  <g:textField name="strToDecrypt" placeholder="輸入要解密的文字" value="${params?.strToDecrypt}" />
  <g:submitButton name="submit" value="轉資料" />
</g:form>
<div>
    <h2>結果</h2>
    <span>${params?.returnVal}</span>
</div>
</body>
</html>