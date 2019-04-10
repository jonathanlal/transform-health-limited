<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <!-- VIEWPORT FOR RESPONSIVENESS - https://developer.mozilla.org/en-US/docs/Mozilla/Mobile/Viewport_meta_tag -->
<!-- <meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    
    <c:if test="${empty metaShare}">
    <title>Transform Health Limited - Get back to being you!</title>
    <meta name="description" content="Transform Health Limited designs, manufactures, and distributes, products to aid the rehabilitation of many illnesses and injuries. We cater for physical rehabilitation specialising in mobility assistance, general health, fitness and weight loss.">
    <meta property="og:type" content="website">
    <meta property="og:url" content="https://www.transformationpod.com/">
    <meta name="twitter:card" content="summary_large_image">
<!--     <meta name="twitter:site" content="@"> -->
<!--     <meta name="twitter:creator" content="@"> -->
    <meta property="og:title" content="Transform Health Limited">
    <meta name="twitter:title" content="Transform Health Limited">
    <meta property="og:description" content="Get back to being you!">
    <meta name="twitter:description" content="Get back to being you!">
    <meta property="og:image" content="https://storage.googleapis.com/transformationpod.appspot.com/logo.png">
    <meta name="twitter:image" content="https://storage.googleapis.com/transformationpod.appspot.com/logo.png">
	</c:if>
	
	<!-- GENERATED META SHARING TAGS -->
	<c:if test="${not empty metaShare}">${metaShare}</c:if>
	<!-- CANONICAL -->
<%-- 	<c:if test="${not empty canonical}">${canonical}</c:if> --%>
<%-- 	<c:if test="${empty canonical}"><link rel="canonical" href="https://domain.com${requestScope['javax.servlet.forward.request_uri']}" /></c:if> --%>

    <!-- GOOGLE VERIFICATION -->
<!-- 	<meta name="google-site-verification" content="xOZtJiKTj_b6gC5Z_4aCH7aTeRD1rW73cGlpJ7-pspI" />	 -->
		
	<!-- FAVICONS AND COLOURS -->
	<link rel="apple-touch-icon" sizes="180x180" href="/apple-touch-icon.png">
	<link rel="icon" type="image/png" sizes="32x32" href="/favicon-32x32.png">
	<link rel="icon" type="image/png" sizes="16x16" href="/favicon-16x16.png">
	<link rel="manifest" href="/site.webmanifest">
	<link rel="mask-icon" href="/safari-pinned-tab.svg" color="#5bbad5">
	<meta name="msapplication-TileColor" content="#2b5797">
	<meta name="theme-color" content="#ffffff">
	
	<!-- OTHER -->
<!-- 	<meta content="https://www.facebook.com/pg/PageURL/about/" property="fb:profile_id"> -->
    <meta name="referrer" content="unsafe-url">
<!--     <link href="https://domain.com/" rel="home"> -->
    <meta name="referrer" content="no-referrer-when-downgrade">
    <meta name="robots" content="all">