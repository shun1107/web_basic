<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Addition Result</title>
</head>
<body>
    <h2>計算結果:</h2>
    <p>入力された数値の足し算結果は：<%= request.getAttribute("result") %></p>
</body>
</html>
