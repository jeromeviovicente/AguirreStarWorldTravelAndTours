<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
	
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Admin Login</title>
		
		<!-- CSS -->
		<link rel="stylesheet"
			href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
		<link rel="shortcut icon"
			href="<c:url value='/resources/apifw/bootstrap/css/bootstrap.min.css'/>">
		<link rel="stylesheet"
			href="<c:url value='/resources/apifw/font-awesome/css/font-awesome.min.css'/>">
		<link rel="stylesheet"
			href="<c:url value='/resources/login-api/form/assets/css/form-elements.css'/>">
		<link rel="stylesheet"
			href="<c:url value='/resources/login-api/form/assets/css/style.css'/>">
		
		<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
		            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
		            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
		        <![endif]-->
		
		<!-- Favicon and touch icons -->
		<link rel="shortcut icon"
			href="<c:url value='/resources/login-api/form/assets/ico/favicon.png'/>">
		<link rel="apple-touch-icon-precomposed" sizes="144x144"
			href="<c:url value='/resources/login-api/form/assets/ico/apple-touch-icon-144-precomposed.png'/>">
		<link rel="apple-touch-icon-precomposed" sizes="114x114"
			href="<c:url value='/resources/login-api/form/assets/ico/apple-touch-icon-114-precomposed.png'/>">
		<link rel="apple-touch-icon-precomposed" sizes="72x72"
			href="<c:url value='/resources/login-api/form/assets/ico/apple-touch-icon-72-precomposed.png'/>">
		<link rel="apple-touch-icon-precomposed"
			href="<c:url value='/resources/login-api/form/assets/ico/apple-touch-icon-57-precomposed.png'/>">
		
	</head>
	
	<body style="background-image:url('resources/login-api/form/assets/img/backgrounds/3.jpg')">
		<!-- Top content -->
		<div class="top-content" >
			<div class="container">
				<div class="row justify-content-center">
					<div class="text">
						<h1>
							<strong>Admin</strong> Login
						</h1>
						<div>
							<p>description here.</p>
						</div>
					</div>
					<div class="col-sm-offset-3 col-xs-6 col-sm-6 col-md-6 col-lg-6 form-box">
						<div class="form-top">
							<div class="form-top-left ">
								<h3>Login to our site</h3>
								<p>Enter your username and password to log on:</p>
							</div>
							<div class="form-top-right">
								<i class="fa fa-lock"></i>
							</div>
						</div>
						<div class="form-bottom">
							<form role="form" action="admin-dashboard" method="post"
								class="form-signin">
								<div class="form-group">
									<span class="input-group-addon">Username</span>
									<input type="text" name="form-username" placeholder="Username..."
										class="form-username form-control" id="form-username">
								</div>
								<div class="form-group">
									<span class="input-group-addon">Password</span>
									<input type="password" name="form-password" placeholder="Password..."
										class="form-password form-control" id="form-password">
								</div>
								<div class="form-group">
									<button type="submit" class="btn btn-success form-control">Sign in!</button>
								</div>
							</form>
						</div>
					</div>
					<!-- </div> -->
					<div class="col-sm-6 col-sm-offset-3 social-login">
						<h3>...or login with:</h3>
						<div class="social-login-buttons">
							<a class="btn btn-link-1 btn-link-1-facebook" href="#"> <i
								class="fa fa-facebook"></i> Facebook
							</a> <a class="btn btn-link-1 btn-link-1-twitter" href="#"> <i
								class="fa fa-twitter"></i> Twitter
							</a> <a class="btn btn-link-1 btn-link-1-google-plus" href="#"> <i
								class="fa fa-google-plus"></i> Google Plus
							</a>
						</div>
					</div>
				</div>
			</div>
	
	
			<!-- Javascript -->
			<script src="<c:url value='/resources/apifw/jquery/jquery.min.js'/>"></script>
			<%-- <script src="<c:url value='/resources/login-api/form/assets/js/jquery-1.11.1.min.js'/>"></script> --%>
			<script src="<c:url value='/resources/apifw/bootstrap/js/bootstrap.min.js'/>"></script>
			<%-- <script src="<c:url value='/resources/login-api/form/assets/js/jquery.backstretch.min.js'/>"></script>
	        <script src="<c:url value='/resources/login-api/form/assets/js/scripts.js'/>"></script> --%>
	
			<!--[if lt IE 10]>
	            <script src="assets/js/placeholder.js"></script>
	        <![endif]-->
	</body>

</html>