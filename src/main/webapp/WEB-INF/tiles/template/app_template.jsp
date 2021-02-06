<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<c:set var="appRoot" value="${pageContext.servletContext.contextPath}"/>
<!DOCTYPE html>
<html>
<head> 
  <meta charset="UTF-8">
  <title></title>
  
<link rel="stylesheet" type="text/css" href="${appRoot}//node_modules/bootstrap/dist/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
	
		<tiles:insertAttribute name="header"/>
	
		<div id="main">
			<tiles:insertAttribute name="body"/>
		</div>
	
	</div>
	<script src="${appRoot}/node_modules/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>