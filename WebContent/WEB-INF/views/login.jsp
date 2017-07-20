<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Log In | Aguirre Star Worldwide Travel Corporation</title>
	    <jsp:include page="/WEB-INF/views/includes/header.jsp" />
	</head>
	<body>
		<!-- navbar -->
		<div class="navbar-fixed">	
		   	<jsp:include page="/WEB-INF/views/includes/navbar.jsp" />
		</div>
		<!-- navbar -->
	
		<!-- Hero -->
	    <section class="hero">
	      <div class="container text-center">
	        <div class="row">
	        	<div class="col s10 l4 push-s1 push-l4">
	        		
	              <div class="card grey lighten-5">
	                <form action="${pageContext.request.contextPath}/login" method="post" class="card-content black-text">
	
	                    <!--Logo-->
	                    <div class="center">
	                       <a> Logo Here</a>
	                    </div>  
	                    <!--username-->
	                    <div class="row">
	                        
	                          <div class="col s3 push-s1 margin">
	                              <i class="fa fa-user fa-3x" style="padding:5px" aria-hidden="true"></i>
	                          </div>
	                        
	                          <div class="col s8">
	                              <input id="email" name="email" type="text" class="validate">
	                              <label for="email">Email</label>
	                          </div>
	                    </div>  
	                    <!--password-->
	                    <div class="row">
	                        
	                         <div class="col s3 push-s1 margin">
	                              <i class="fa fa-key fa-3x" style="padding:5px" aria-hidden="true"></i>
	                          </div>
	                        
	                          <div class="col s8" >
	                              <input id="password" name="password" type="password">
	                              <label for="password">Password</label>
	                          </div>
	                    </div> 
	                    <!--buttons-->
	                    <div class="row center">
	
	                      <!--register button-->
	                      <div class="col s6 l5 push-l1">
	                          <a  href="signup" class="waves-effect waves-light btn">Sign Up</a>
	                      </div>
	                      
	                      <!--log in button-->
	                      <div class="col s6 l5 push-l1">
	                          <button class="waves-effect waves-light btn" type="submit">Log In</button>
	                      </div>
	                    </div>
	                </form>
	              </div>
	
	
	        	</div>          
	        </div>
	      </div>
	      
	    </section>
	    <!-- /Hero -->
	
	
		<jsp:include page="/WEB-INF/views/includes/footer.jsp" />
	
	</body>
</html>