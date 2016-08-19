<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management <decorator:title /></title>
	<decorator:head />
</head>
<body>
	<!-- 헤더시작 -->
	<header>
		<jsp:include page="header.jsp" />
	</header>
	<!-- 헤더 끝 -->
	
	<decorator:body />
	
	<div class="clear"></div>
	<!-- 푸터 시작 -->
	<footer>	
		<jsp:include page="footer.jsp" />
	</footer>
	<!-- 푸터 끝 -->
</body>
</html>