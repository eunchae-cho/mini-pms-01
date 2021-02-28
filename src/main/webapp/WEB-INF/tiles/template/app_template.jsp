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
<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
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