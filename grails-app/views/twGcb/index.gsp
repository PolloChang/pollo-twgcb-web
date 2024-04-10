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
    <script>

        /**
         * 執行資料查詢
         */
        function doFilter(){
            document.getElementById("search-form").submit();
        }

        /**
         * 查詢
         */
        function searchBtn() {
            document.getElementById("offset").value = 0;
            doFilter();
        }


        /**
         * 下一頁
         */
        function nextPage(){
            let offset = document.getElementById("offset").value;
            let defaultPageCount = Number(document.getElementById('max').value);
            document.getElementById("offset").value = checkNumber(Number(offset) + defaultPageCount, defaultPageCount);
            doFilter();
        }


        /**
         * 上一頁
         */
        function prevPage() {
            let offset = document.getElementById("offset").value;
            let defaultPageCount = Number(document.getElementById('max').value);
            document.getElementById("offset").value = checkNumber(Number(offset) - defaultPageCount, defaultPageCount);
            doFilter();
        }


        /**
         * 計算下一分頁資料起數筆數
         * @param sourceNumber 原始數值
         * @param pageMaxCount 一頁呈現筆數
         * @returns {number} 下一分頁資料起數筆數
         */
        function checkNumber(sourceNumber, pageMaxCount) {

            sourceNumber = Number(sourceNumber);
            let totalCount = Number(document.getElementById('total-count').value);

            if (sourceNumber < 0) {
                return 0;
            } else if (sourceNumber > totalCount) {
                return sourceNumber - pageMaxCount;
            } else {
                return sourceNumber;
            }
        }


        /**
         * 計算總頁數
         * @param totalCount 資料總筆數
         * @param pageMaxCount 一頁呈現筆數
         * @returns {number} 總頁數
         */
        function getToTalPageCount(totalCount, pageMaxCount) {
            return Math.floor(totalCount/pageMaxCount) + 1;
        }


        /**
         * 計算當前頁數
         * @param offset 目前資料起始筆數
         * @param pageMaxCount 一頁呈現筆數
         * @returns {number} 目前頁數
         */
        function getCurrentPageNumber(offset, pageMaxCount) {
            return Math.floor(offset/pageMaxCount) + 1;
        }

        window.onload = function () {
            let pageMaxCount = document.getElementById('max').value;
            let totalCount = document.getElementById('total-count').value;
            let offset = document.getElementById('offset').value;
            let totalPageCount = getToTalPageCount(totalCount,pageMaxCount);

            document.getElementById('current-page-number').innerText = getCurrentPageNumber(offset, pageMaxCount, totalPageCount);
            document.getElementById('total-page-count').innerText = totalPageCount;
        }
    </script>
</head>

<body>
<div>
    <g:form name="search-form" controller="twGcb" action="index">
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
            <span>
                <label for="cname">${message(code: "twgcb.cname.label")}</label>
                <g:textField name="cname" value="${params?.cname}"/>
            </span>
        </div>
        <div>
            <g:hiddenField name="offset" value="${params?.offset?: "0"}"/>
            <g:hiddenField name="max" value="${params?.max?: "10"}"/>
            <g:hiddenField id="total-count"  name="totalCount" value="${totalCount?:0}"/>
            <button type="button" onclick="prevPage()" >${message(code: "default.paginate.prev")}</button>
            <button type="button" onclick="nextPage()" >${message(code: "default.paginate.next")}</button>
            <span>筆數總計: ${totalCount?:0} 筆</span>
            <span>共: <span id="total-page-count"></span> 頁</span>
            <span>目前為第: <span id="current-page-number"></span> 頁</span>
        </div>
        <button type="button" onclick="searchBtn()" >${message(code: "default.button.search.label")}</button>
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
        </tr>
        </thead>
        <tbody>
        <g:each in="${twgcbL}" var="twgcbI">
            <tr>
                <td>
                    ${twgcbI?.twgcbId}
                </td>
                <td>
                    ${twgcbI?.typeDesc}
                </td>
                <td>
                    ${twgcbI?.cname}
                </td>
            </tr>
        </g:each>
        </tbody>
    </table>

</div>
</body>
</html>