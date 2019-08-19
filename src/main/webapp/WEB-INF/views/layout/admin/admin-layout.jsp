<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">

<title><tiles:getAsString name="title" /></title>

<!-- Fontfaces CSS-->
<link href="<c:url value="/resources/admin/css/font-face.css" />"
	rel="stylesheet" media="all">
<link
	href="<c:url value="/resources/admin/font-awesome-5/css/fontawesome-all.min.css" />"
	rel="stylesheet" media="all">
<link
	href="<c:url value="/resources/admin/font-awesome-4.7/css/font-awesome.min.css" />"
	rel="stylesheet" media="all">
<link
	href="<c:url value="/resources/admin/mdi-font/css/material-design-iconic-font.min.css" />"
	rel="stylesheet" media="all">

<!-- Bootstrap CSS-->
<link
	href="<c:url value="/resources/admin/bootstrap-4.1/bootstrap.min.css" />"
	rel="stylesheet" media="all">

<link
	href="<c:url value="/resources/admin/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css" />"
	rel="stylesheet" media="all">
<link href="<c:url value="/resources/admin/wow/animate.css" />"
	rel="stylesheet" media="all">
<link
	href="<c:url value="/resources/admin/css-hamburgers/hamburgers.min.css" />"
	rel="stylesheet" media="all">
<link href="<c:url value="/resources/admin/slick/slick.css" />"
	rel="stylesheet" media="all">
<link href="<c:url value="/resources/admin/select2/select2.min.css" />"
	rel="stylesheet" media="all">
<link
	href="<c:url value="/resources/admin/perfect-scrollbar/perfect-scrollbar.css" />"
	rel="stylesheet" media="all">

<!-- Main CSS-->
<link href="<c:url value="/resources/admin/css/theme.css" />"
	rel="stylesheet" media="all">

<!-- Jquery JS-->
<script src="<c:url value="/resources/admin/jquery-3.2.1.min.js" />"></script>
<!-- Bootstrap JS-->
<script
	src="<c:url value="/resources/admin/bootstrap-4.1/popper.min.js" />"></script>
<script
	src="<c:url value="/resources/admin/bootstrap-4.1/bootstrap.min.js" />"></script>
<!-- Vendor JS       -->
<script src="<c:url value="/resources/admin/slick/slick.min.js"/>">
	
</script>
<script src="<c:url value="/resources/admin/wow/wow.min.js" />"></script>
<script
	src="<c:url value="/resources/admin/animsition/animsition.min.js" />"></script>
<script
	src="<c:url value="/resources/admin/bootstrap-progressbar/bootstrap-progressbar.min.js" />">
	
</script>
<script
	src="<c:url value="/resources/admin/counter-up/jquery.waypoints.min.js" />"></script>
<script
	src="<c:url value="/resources/admin/counter-up/jquery.counterup.min.js" />">
	
</script>
<script
	src="<c:url value="/resources/admin/circle-progress/circle-progress.min.js"/>"></script>
<script
	src="<c:url value="/resources/admin/perfect-scrollbar/perfect-scrollbar.js" />"></script>
<script
	src="<c:url value="/resources/admin/chartjs/Chart.bundle.min.js" />"></script>
<script src="<c:url value="/resources/admin/select2/select2.min.js" />">
	
</script>

<!-- Main JS-->
<script src="<c:url value="/resources/admin/js/main.js" />"></script>

</head>
<body class="animsition">
	<div class="page-wrapper">
		<tiles:insertAttribute name="menu" />
		<div class="page-container">
			<tiles:insertAttribute name="header" />
			<tiles:insertAttribute name="body" />
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>