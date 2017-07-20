<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp">
	<head>
	  <title>Visa Assistance | Aguirre Star Worldwide Travel Corporation</title>
	  <jsp:include page="/WEB-INF/views/includes/header.jsp" />
	</head>
	<body ng-controller="tourController" ng-init="init()">
	  <!-- navbar -->
	  <div class="navbar-fixed">  
	      <jsp:include page="/WEB-INF/views/includes/navbar.jsp" />
	  </div>
	  <!-- navbar -->
	
	  <!-- parallax -->
	  <div class="parallax-container">
	    <div class="parallax"><img src="<c:url value='/resources/img/banner/13925172.jpg'/>"> </div>
	  </div>
	  <!-- parallax -->
	
	  <!-- gallery -->
	    <h2 class="titleForm center">
	      Visa Assistance
	    </h2>
	  <div class="container">
	
	    <div class="row">
	      
	      <div class="col s12">
	        <ul class="tabs tabs-logo">
	          <li class="tab"><a href="#Australia">Australia</a></li>
	          <li class="tab"><a href="#Austria">Austria</a></li>
	          <li class="tab"><a href="#Cambodia">Cambodia</a></li>
	          <li class="tab"><a href="#Canada">Canada</a></li>
	          <li class="tab"><a href="#China">China</a></li>
	          <li class="tab"><a href="#CzechRepublic">Czech Republic</a></li>
	          <li class="tab"><a href="#Egypt">Egypt</a></li>
	          <li class="tab"><a href="#France">France</a></li>
	          <li class="tab"><a href="#Germany">Germany</a></li>
	          <li class="tab"><a href="#Greece">Greece</a></li>
	          <li class="tab"><a href="#India">India</a></li>
	          <li class="tab"><a href="#Italy">Italy</a></li>
	          <li class="tab"><a href="#Japan">Japan</a></li>
	          <li class="tab"><a href="#Netherlands">Netherlands</a></li>
	          <li class="tab"><a href="#NewZeland">New Zeland</a></li>
	          <li class="tab"><a href="#Russia">Russia</a></li>
	          <li class="tab"><a href="#Singapore">Singapore</a></li>
	          <li class="tab"><a href="#SouthAfrica">South Africa</a></li>
	          <li class="tab"><a href="#SouthKorea">South Korea</a></li>
	          <li class="tab"><a href="#Spain">Spain</a></li>
	          <li class="tab"><a href="#Switzerland">Switzerland</a></li>
	          <li class="tab"><a href="#Taiwan">Taiwan</a></li>
	          <li class="tab"><a href="#Turkey">Turkey</a></li>
	          <li class="tab"><a href="#UAE">UAE</a></li>
	          <li class="tab"><a href="#UnitedKingdom">United Kingdom</a></li>
	          <li class="tab"><a href="#USA">USA</a></li>
	          <li class="tab"><a href="#Vietnam">Vietnam</a></li>
	        </ul>
	      </div> 
	
	      <div class="row" id="Australia"></div> 
	      <div class="row" id="Austria"></div> 
	      <div class="row" id="Cambodia"></div> 
	      <div class="row" id="Canada"></div> 
	      <div class="row" id="China"></div> 
	      <div class="row" id="CzechRepublic"></div> 
	      <div class="row" id="Egypt"></div> 
	      <div class="row" id="France"></div> 
	      <div class="row" id="Germany"></div> 
	      <div class="row" id="Greece"></div> 
	      <div class="row" id="India"></div> 
	      <div class="row" id="Italy"></div> 
	      <div class="row" id="Japan"></div> 
	      <div class="row" id="Netherlands"></div> 
	      <div class="row" id="NewZeland"></div> 
	      <div class="row" id="Russia"></div> 
	      <div class="row" id="Singapore"></div> 
	      <div class="row" id="SouthAfrica"></div> 
	      <div class="row" id="SouthKorea"></div> 
	      <div class="row" id="Spain"></div> 
	      <div class="row" id="Switzerland"></div> 
	      <div class="row" id="Taiwan"></div> 
	      <div class="row" id="Turkey"></div> 
	      <div class="row" id="UAE"></div> 
	      <div class="row" id="UnitedKingdom"></div> 
	      <div class="row" id="USA"></div> 
	      <div class="row" id="Vietnam"></div> 
	    </div>  
	
	  </div> 
	  <br>   
	    <!-- gallery -->
	
	  <jsp:include page="/WEB-INF/views/includes/footer.jsp" />
	
	</body>
</html>