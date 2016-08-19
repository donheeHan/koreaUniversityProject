<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script type="text/javascript" src="common/js/login.js"></script>
</head>
<body>
	<form name="formm">
		아이디 : <input type="text" name="id" id="id"><br>
		패스워드 : <input type="password" name="password" id="password"><br>
		<input type="button" value="로그인" onclick="go_login();">
	</form>
</body>
</html>