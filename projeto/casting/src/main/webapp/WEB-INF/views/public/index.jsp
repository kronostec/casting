<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html >
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="resources/js/lib/kube/css/kube.min.css" />
		<title>Project</title>		
		<script data-main="resources/js/main.js" src="resources/js/lib/require/require.js" ></script>		
	</head>
	<body>
		<div ng-view></div>
	</body>
</html>