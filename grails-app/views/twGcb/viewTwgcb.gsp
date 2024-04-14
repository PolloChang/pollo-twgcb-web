<%--
  Created by IntelliJ IDEA.
  User: pollochang
  Date: 4/14/24
  Time: 2:46 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <script>
        document.addEventListener("DOMContentLoaded", function() {
            let originalText,newText
            originalText = document.getElementById("instructions").innerText;
            newText = originalText.replace(/\n/g, "<br>");
            document.getElementById("instructions").innerHTML = newText;

            originalText = document.getElementById("explanation").innerText;
            newText = originalText.replace(/\n/g, "<br>");
            document.getElementById("explanation").innerHTML = newText;
        });
    </script>
</head>

<body>
<header>
    <div>
        <a href="${createLink(controller: "twGcb", action: "index")}">
            回查詢頁面
        </a>
    </div>
    <h1>${twgcbI?.twgcbId}</h1>
</header>
<main>
    <div>
        <div>
            <h2 for="twgcbId">${message(code: "twgcb.twgcbId.label")}</h2>
            <span id="twgcbId">${twgcbI?.twgcbId}</span>
        </div>
        <div>
            <h3 for="type">${message(code: "twgcb.type.label")}</h3>
            <p id="type">${twgcbI?.typeDesc}</p>
        </div>
        <div>
            <h3 for="cname">${message(code: "twgcb.cname.label")}</h3>
            <p id="cname">${twgcbI?.cname}</p>
        </div>
        <div>
            <h3 for="explanation">${message(code: "twgcb.explanation.label")}</h3>
            <p id="explanation">${twgcbI?.explanation}</p>
        </div>
        <div>
            <h3 for="instructions">${message(code: "twgcb.instructions.label")}</h3>
            <p id="instructions">${twgcbI?.instructions}</p>
        </div>
        <div>
            <h3 for="default-value">${message(code: "twgcb.defaultValue.label")}</h3>
            <p id="default-value" >${twgcbI?.defaultValue}</p>
        </div>
        <div>
            <h3 for="remark">${message(code: "twgcb.remark.label")}</h3>
            <p id="remark">${twgcbI?.remark}</p>
        </div>
    </div>
</main>
<footer>
    <div>
        <a href="${createLink(controller: "twGcb", action: "index")}">
            回查詢頁面
        </a>
    </div>
</footer>
</body>
</html>