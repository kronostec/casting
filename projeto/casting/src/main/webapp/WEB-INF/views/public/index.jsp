<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html >
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<title>Project</title>		
		<link rel="stylesheet" href="resources/css/default.css">	
		<link rel="stylesheet" href="resources/js/lib/lumX-0.3.25/dist/bootstrap.css">	
		<link rel="stylesheet" href="resources/js/lib/bower_components/lumx/dist/lumx.css">
		<link rel="stylesheet" href="resources/css/lumx.css">	
		<link rel="stylesheet" href="resources/js/lib/bower_components/mdi/css/materialdesignicons.css">
		<link rel="stylesheet" href="resources/js/lib/lumX-0.3.25/dist/googleFonts.css">
		<link rel="stylesheet" href="resources/js/lib/flexnav-master/css/flexnav.css">	
		<link rel="stylesheet" href="resources/js/lib/sidr-package-1.2.1/stylesheets/jquery.sidr.dark.css">
		<script data-main="resources/js/main.js" src="resources/js/lib/require/require.js" ></script>	
	</head>
	<body ng-controller="PageCtrl" ng-init="init()" >		
		<header ng-include="'menu'"  fixed-top="{{scrollTop}}" ></header>
		<div class="container-fluid content" ng-if="pageLoaded" >
			<section ng-view   ></section>	
		</div>		
		<footer ng-include="'footer'" ng-if="pageLoaded" ></footer>				
	</body>
</html>