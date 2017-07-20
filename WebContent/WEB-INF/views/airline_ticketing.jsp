<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<%
	boolean activeSession = false;

	if((String)session.getAttribute("activeSession") != null){
		activeSession = true;
	}

%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Airline Ticketing | Aguirre Star Worldwide Travel Corporation</title>
	    <jsp:include page="/WEB-INF/views/includes/header.jsp" />
	</head>
	<body>
		<!-- navbar -->
		<div class="navbar-fixed">	
		   	<jsp:include page="/WEB-INF/views/includes/navbar.jsp" />
		</div>
		<!-- navbar -->
	
		<!-- search -->
	    <section class="hero">
	      <div class="container text-center">
	        <div class="row">
	        	<div class="col s10 l4 push-s1 push-l4">
	        		
	              <div class="card grey lighten-5">
	                <form class="card-content black-text" action="${pageContext.request.contextPath}/airline_ticketing" method="post">
						<p class="center teal-text">Plan</p>
	                    <!--plan-->
	                    <div class="row">
	                      <div class="col s3 l4 push-l2">
	                        <input class="form-group with-gap" name="plan" type="radio" value="oneway" id="oneway" checked/>
	                        <label for="oneway">One Way</label>
	                      </div>
	                      <div class="col s3 l4 push-l2 push-s4">
	                        <input class="form-group with-gap" name="plan" type="radio" id="roundtrip" value="roundtrip"/>
	                        <label for="roundtrip">Round Trip</label>
	                      </div>
	                    </div>
	                    <br>	
	
	                    <!--no of adult-->
	                    <div class="row">
	                      <div class="col s4 l5 push-l1">
	                        <p class="teal-text darken-4">No. of pax Adult</p>
	                      </div>
	                      <div class="form-group input-field inline col s8 l5 push-l1">
	                        <input name="adult" id="lastname" ng-model="account.lastName" type="number" mix="1" max="7"  required>
	                        <label for="lastname"></label>
	                      </div>
	                    </div>
	
	                    <!--no of Children-->
	                    <div class="row">
	                      <div class="col s4 l5 push-l1">
	                        <p class="teal-text darken-4">No. of pax Children</p>
	                      </div>
	                      <div class="form-group input-field inline col s8 l5 push-l1">
	                        <input name="children" id="lastname" ng-model="account.lastName" type="number" mix="0" max="6" required>
	                        <label for="lastname"></label>
	                      </div>
	                    </div>
	
	                    <!--no of Infant-->
	                    <div class="row">
	                      <div class="col s4 l5 push-l1">
	                        <p class="teal-text darken-4">No. of pax Infant</p>
	                      </div>
	                      <div class="form-group input-field inline col s8 l5 push-l1">
	                        <input name="infant" id="lastname" ng-model="account.lastName" type="number" mix="0" max="1"  required>
	                        <label for="lastname"></label>
	                      </div>
	                    </div>
	
	                    <!--origin-->
	                    <div class="row">
	                      <div class="col s4 l5 push-l1"><p class="teal-text darken-4">Place of Origin</p></div>
	                      <div class="form-group input-field col s8 l5 push-l1"  >
	                        <select name="origin" ng-model="account.status">
	                        	<option value="" disabled>Choose your option</option>
	                        	<c:forEach items="${originlist}" var="data">
		                        	<option value="${data.originValue}" >${data.originName}</option>
		                        </c:forEach>
	                        </select>
	                      </div>
	                    </div>
	
	                    <!--destination-->
	                    <div class="row">
	                      <div class="col s4 l5 push-l1"><p class="teal-text darken-4">Place of Destination</p></div>
	                      <div class="form-group input-field col s8 l5 push-l1"  >
	                        <select name="destination" ng-model="account.status">
	                          <option value="" disabled>Choose your option</option>
	                          <c:forEach items="${destinationlist}" var="data">
		                        	<option value="${data.destinationValue}" >${data.destinationName}</option>
		                      </c:forEach>
	                        </select>
	                      </div>
	                    </div>
	
						<!--Class-->
	                    <div class="row">
	                      <div class="col s4 l5 push-l1"><p class="teal-text darken-4">Class Flight</p></div>
	                      <div class="form-group input-field col s8 l5 push-l1"  >
	                        <select name="classFlight" ng-model="account.status">
	                          <option value="" disabled>Choose your option</option>
	                          <c:forEach items="${classlist}" var="data">
		                        	<option value="${data.classFlightValue}" >${data.classFlightName}</option>
		                      </c:forEach>
	                        </select>
	                      </div>
	                    </div>
	
	                    <!--departure-->
	                    <div class="row">
	                      <div class="col s4 l5 push-l1">
	                        <p class="teal-text darken-4">Departure Date</p>
	                      </div>
	                      <div class="col s8 l5 push-l1 form-group">
	                        <input type="date" name="onwardDate" ng-model="account.birthdate" id="birthdate" class="datepicker" placeholder="Pick a date" required />
	                      </div> 
	                    </div>
	                    <!--arrival-->
	                    <div class="row">
	                      <div class="col s4 l5 push-l1">
	                        <p class="teal-text darken-4">Arrival Date</p>
	                      </div>
	                      <div class="col s8 l5 push-l1 form-group">
	                        <input type="date" name="returnDate" ng-model="account.birthdate" id="birthdate" class="datepicker" placeholder="Pick a date" required />
	                      </div> 
	                    </div>
						
						<!--Senior-->
	                    <div class="row">
	                      <div class="col s4 l5 push-l1">
	                        <input class="form-group with-gap" name="senior" type="checkbox" value="senior"/>
	                        <label for="senior">Senior</label>
	                      </div>
	                    </div>
						<br>
						
						
						<c:choose>
						    <c:when test="<%=activeSession%>">
						     	<input type="submit" class="btn" value="Search Now!">
						    </c:when>
						    <c:otherwise>
						     	<input type="button" class="btn" value="Search Now!" onclick="alert('You need to log-in first')">
						    </c:otherwise>
						</c:choose>
	                </form>
	              </div>
	        	</div>          
	        </div>
	      </div>
	      
	    </section>
		<!-- search -->
	
		<!-- result -->
		<section id="results">
			
	        <div id="batanes" class="col s12">
	          <div class="col s12">
	            <div class="card horizontal">
	              <div class="card-image">
	                <img src="<c:url value='/resources/img/packages/batanes1.jpg'/>" width="100%">
	              </div>
	              <div class="card-stacked">
	                <div class="card-content">
	                  <h3>
	                    BATANES: THE DISTANT NORTH & HOME OF THE WINDS (BUDGET) [3N4D]
	                  <br>
	                    MARFEL'S LODGE (A/C)
	                  </h3>
	                  <p>
	                  Selling Period  JUL 03 2017 - NOV 27 2017
	                  <br>
	                  Travel Date JUL 03 2017 - NOV 30 2017
	                  </p>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">PHP  8,550 /PAX</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">Minimum 2Pax </span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	              </div>
	            </div>
	          </div>
	
	          <div class="col s12">
	            <div class="card horizontal">
	              <div class="card-image">
	                <img src="<c:url value='/resources/img/packages/batanes2.jpg'/>" width="100%">
	              </div>
	              <div class="card-stacked">
	                <div class="card-content">
	                  <h3>
	                    BATANES: THE DISTANT NORTH & HOME OF THE WINDS (STANDARD) [3N4D]
	                  <br>
	                    BATANES SEASIDE (A/C)
	                  </h3>
	                  <p>
	                  Selling Period  JUL 03 2017 - NOV 27 2017
	                  <br>
	                  Travel Date JUL 03 2017 - NOV 30 2017
	                  </p>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">PHP 8,550 /PAX</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">Minimum 2Pax </span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	              </div>
	            </div>
	          </div>
	        </div>
		</section>
		<!-- result -->
	
	
	
	
	
		
	
	
	
	
		<jsp:include page="/WEB-INF/views/includes/footer.jsp" />
	
	</body>
</html>