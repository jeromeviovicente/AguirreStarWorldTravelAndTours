<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<title>Insert title here</title>
	</head>
	<body>
		<div class="container">
		
		  	<h2>Choose Package</h2>
		  	<ul class="nav nav-tabs">
		    	<li class="active" ><a data-toggle="tab" href="#gitTab">GIT</a></li>
		    	<li><a data-toggle="tab" href="#fitTab">FIT/LAND</a></li>
		    	<li><a data-toggle="tab" href="#tourTab">TOUR</a></li>
		  	</ul>
	
		  	<div class="tab-content">
			    <div id="gitTab" class="tab-pane  in active">
			    	<br>
			    	<div name="form1">
						<form action="${pageContext.request.contextPath}/git_search" method="post" class="form">
							<div>
								<label for="origin" >From:</label>
								<select name="origin">
									<c:forEach items="${gitFrom}" var="data">
										<option value="${data.value}" >${data.name}</option>
									</c:forEach>
								</select>
							</div>
							<div >
								<label for="destination" >To:</label>
								<select name="destination">
									<c:forEach items="${gitTo}" var="data">
										<option value="${data.value}" >${data.name}</option>
									</c:forEach>
								</select>
							</div>
							<div>
								<label for="country" >Country:</label>
								<select name="country">
									<c:forEach items="${gitCountry}" var="data">
										<option value="${data.value}" >${data.name}</option>
									</c:forEach>
								</select>
							</div>
							<div>
								<label for="date" >Departure Date:</label>
								<input type="date" name="date" required> 
							</div>
							<div>
								<input type="submit" value="Submit"> 
							</div>
						</form>
					</div>
			    </div>
			    
			    <div id="fitTab" class="tab-pane">
			    	<br>
			    	<div name="form2">
						<form action="${pageContext.request.contextPath}/fit_search" method="post" class="form">
							<div>
								<label for="destination" >To:</label>
								<select name="destination">
									<c:forEach items="${fitCountry}" var="data">
										<option value="${data.value}" >${data.name}</option>
									</c:forEach>
								</select>
							</div>
							<div>
								<label for="country" >Country:</label>
								<select name="country">
									<c:forEach items="${fitTo}" var="data">
										<option value="${data.value}" >${data.name}</option>
									</c:forEach>
								</select>
							</div>
							<div>
								<label for="date" >Departure Date:</label>
								<input type="date" name="date" required> 
							</div>
							<div>
								<input type="submit" value="Submit"> 
							</div>
						</form>
					</div>
			    </div>
			    <div id="tourTab" class="tab-pane">
			    	<br>
			    	<div name="form3">
						<form action="${pageContext.request.contextPath}/tour_search" method="post" class="form">
							<div>
								<label for="tourCountry" >Country:</label>
								<select name="tourCountry">
									<c:forEach items="${tourCountry}" var="data">
										<option value="${data.value}" >${data.name}</option>
									</c:forEach>
								</select>
							</div>
							<div>
								<label for="date" >Departure Date:</label>
								<input type="date" name="date" required> 
							</div>
							<div>
								<input type="submit" value="Submit"> 
							</div>
						</form>
					</div>
			    </div>
		  	</div>
		</div>
	</body>
	
							<!-- JavaScripts -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>