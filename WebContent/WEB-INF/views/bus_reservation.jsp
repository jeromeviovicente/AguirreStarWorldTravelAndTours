<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Bus Reservation | Aguirre Star Worldwide Travel Corporation</title>
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
	                <form class="card-content black-text">
	                    <!--origin-->
	                    <div class="row">
	                      <div class="col s4 l5 push-l1"><p class="teal-text darken-4">Place of Origin</p></div>
	                      <div class="form-group input-field col s8 l5 push-l1"  >
	                        <select name="origin" ng-model="account.status">
	                          <option value="" disabled>Choose your option</option>
	                          <option value="Philippines" >Philippines</option>
	                          <option value="USA" >USA</option>
	                        </select>
	                      </div>
	                    </div>
	
	                    <!--destination-->
	                    <div class="row">
	                      <div class="col s4 l5 push-l1"><p class="teal-text darken-4">Place of Destination</p></div>
	                      <div class="form-group input-field col s8 l5 push-l1"  >
	                        <select name="destination" ng-model="account.status">
	                          <option value="" disabled>Choose your option</option>
	                          <option value="Philippines" >Philippines</option>
	                          <option value="USA" >USA</option>
	                        </select>
	                      </div>
	                    </div>
	
	                    <!--departure-->
	                    <div class="row">
	                      <div class="col s4 l5 push-l1">
	                        <p class="teal-text darken-4">Departure Date</p>
	                      </div>
	                      <div class="col s8 l5 push-l1 form-group">
	                        <input type="date" name="date" ng-model="account.birthdate" id="birthdate" class="datepicker" placeholder="Pick a date" required />
	                      </div> 
	                    </div>
	                    
	                    <!--no of Pax-->
	                    <div class="row">
	                      <div class="col s4 l5 push-l1">
	                        <p class="teal-text darken-4">No. of Pax</p>
	                      </div>
	                      <div class="form-group input-field inline col s8 l5 push-l1">
	                        <input name="pax" id="birthdate" ng-model="account.lastName" type="number" mix="1" required>
	                        <label for="lastname"></label>
	                      </div>
	                    </div>
	                    
	                    <!--arrival-->
	                    <!-- <div class="row">
	                      <div class="col s4 l5 push-l1">
	                        <p class="teal-text darken-4">Arrival Date</p>
	                      </div>
	                      <div class="col s8 l5 push-l1 form-group">
	                        <input type="date" name="birthdate" ng-model="account.birthdate" id="birthdate" class="datepicker" placeholder="Pick a date" required />
	                      </div> 
	                    </div> -->
	
	
						<a href="#results" class="btn">Search Now!</a>
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