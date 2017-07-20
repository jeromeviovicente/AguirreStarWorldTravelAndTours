<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<% 
	String email = "";
	boolean activeSession = false;
	if( (String)session.getAttribute("email") != null ){
		email =(String)session.getAttribute("email");
		activeSession = true;
	}
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Aguirre Star Worldwide Travel Corporation</title>
	    <jsp:include page="/WEB-INF/views/includes/header.jsp" />
	</head>
	<body>
		<!-- Hero -->
	    <section class="hero">
	      <div class="container text-center">
	        <div class="row">
	          <div class="col s12">
	            <a>Logo Here</a>
	          </div>
	        </div>
	
	        <div class="col s12">
	          <h1>
	           Aguirre Star World
	          </h1>
	
	          <p class="tagline">
	              Travel and Tours
	          </p>
	          <a class="btn btn-large" href="#about">Get Started Now</a>
	        </div>
	      </div>
	      
	    </section>
	    <!-- /Hero -->
	
	    <!-- nav bar -->
		<div>
	
		    <jsp:include page="/WEB-INF/views/includes/navbar.jsp" />
		</div>  
	 	<!-- nav bar -->
		
		<!-- about section -->
		<section class="about" id="about">
			<div class="container center">
				<h2>
					About Aguirre Star World Tours Corporation
				</h2>
	
				<p>
					Description Here
				</p>
	
				<div class="row">
	
				</div>
			</div>
		</section>
	    <!-- about section -->
	
	    <!-- parallax -->
	    <div class="parallax-container center block bg-primary block-pd-lg block-bg-overlay">
	
	  		<h2>
	  			Welcome to Aguirre Star World Tour
	  		</h2>
	
	  		<p>
	  			(Description)
	  		</p>
	      	<div class="parallax"><img src="<c:url value='/resources/img/parallax-bg.jpg'/>"></div>
	    </div>
	    <!-- parallax -->
	
	    <!-- Features -->
	    <section class="features" id="features">
	    	<div class="container">
	    		<h2 class="center">
	    			TOURS
	    		</h2>
	
	    		<div class="row">
	    			<a href="international_tour.php">
	                    <div class="feature-col col l4 s12 center theme-color">
	    					<div class="row">
	    						<div class="col s10 push-s1">
	                                <br>
	                                <br>
	    							<img src="<c:url value='/resources/img/international-new.jpg'/>" width="100%">
	    						</div>
	    					</div>
	
	    					<div>
	    						<h3 class="white-text">
	    							International Tours
	    						</h3>
	
	    						<p class="white-text">
	    							See packages...
	    						</p>
	    					</div>
	        			</div>
	                </a>
	
	    			<a href="domestic_tour.php">
	                    <div class="feature-col col l4 s12 center">
	                        <div class="row">
	                            <div class="col s10 push-s1">
	                                <br>
	                                <br>
	                                <img src="<c:url value='/resources/img/domestic-new.jpg'/>" width="100%">
	                            </div>
	                        </div>
	
	    					<div>
	    						<h3>
	    							Domestic Tours
	    						</h3>
	
	    						<p>
	    							See packages...
	    						</p>
	    					</div>
	        			</div>
	                </a>
	
	                <a href="cruise.php">
	        			<div class="feature-col col l4 s12 center theme-color">
	                        <div class="row">
	                            <div class="col s10 push-s1">
	                                <br>
	                                <br>
	                                <img src="<c:url value='/resources/img/cruise-new.jpg'/>" width="100%">
	                            </div>
	                        </div>
	
	    					<div>
	    						<h3 class="white-text">
	    							Cruise
	    						</h3>
	
	    						<p class="white-text">
	    							See packages...
	    						</p>
	    					</div>
	        			</div>
	                </a>
	    		</div>
	
	    		<div class="row">
	
	    		</div>
	    	</div>
	    </section>
	    <!-- /Features -->
	
	    <!-- Portfolio -->
	
	    <section class="portfolio" id="portfolio">
	    	<div class="container center">
	    		<h2>
	    			Our Tour Package
	    		</h2>
	
	    		<p>
	    			Sample Tour
	    		</p>
	    	</div>
	
	    	<div class="portfolio-grid">
	    		<div class="row">
	    			<div class="col l4 m6 s12">
	    				<div class="card card-block">
	    					<a href="#"><img alt="" src="<c:url value='/resources/img/packages/africa1.jpg'/>" width="100%">
	    						<div class="portfolio-over">
	    							<div>
	    								<h3 class="card-title">
	    									Aguirre Star Tour Package
	    								</h3>
	
	    								<p class="card-text">
	    									Lorem ipsum dolor sit amet, eu sed suas eruditi honestatis.
	    								</p>
	    							</div>
	    						</div>
	    					</a>
	    				</div>
	    			</div>
	
	    			<div class="col l4 m6 s12">
	    				<div class="card card-block">
	    					<a href="#"><img alt="" src="<c:url value='/resources/img/packages/hmt1.jpg'/>">
	    						<div class="portfolio-over">
	    							<div>
	    								<h3 class="card-title">
	    									Aguirre Star Tour Package
	    								</h3>
	
	    								<p class="card-text">
	    									Lorem ipsum dolor sit amet, eu sed suas eruditi honestatis.
	    								</p>
	    							</div>
	    						</div>
	    					</a>
	    				</div>
	    			</div>
	
	    			<div class="col l4 m6 s12">
	    				<div class="card card-block">
	    					<a href="#"><img alt="" src="<c:url value='/resources/img/packages/dubai.jpg'/>">
	    						<div class="portfolio-over">
	    							<div>
	    								<h3 class="card-title">
	    									Aguirre Star Tour Package
	    								</h3>
	
	    								<p class="card-text">
	    									Lorem ipsum dolor sit amet, eu sed suas eruditi honestatis.
	    								</p>
	    							</div>
	    						</div>
	    					</a>
	    				</div>
	    			</div>
	
	    			<div class="col l4 m6 s12">
	    				<div class="card card-block">
	    					<a href="#"><img alt="" src="<c:url value='/resources/img/packages/dreamcruise1.jpg'/>">
	    						<div class="portfolio-over">
	    							<div>
	    								<h3 class="card-title">
	    									Aguirre Star Tour Package
	    								</h3>
	
	    								<p class="card-text">
	    									Lorem ipsum dolor sit amet, eu sed suas eruditi honestatis.
	    								</p>
	    							</div>
	    						</div>
	    					</a>
	    				</div>
	    			</div>
	
	    			<div class="col l4 m6 s12">
	    				<div class="card card-block">
	    					<a href="#"><img alt="" src="<c:url value='/resources/img/packages/holyland2.jpg'/>">
	    						<div class="portfolio-over">
	    							<div>
	    								<h3 class="card-title">
	    									Aguirre Star Tour Package
	    								</h3>
	
	    								<p class="card-text">
	    									Lorem ipsum dolor sit amet, eu sed suas eruditi honestatis.
	    								</p>
	    							</div>
	    						</div>
	    					</a>
	    				</div>
	    			</div>
	
	    			<div class="col l4 m6 s12">
	    				<div class="card card-block">
	    					<a href="#"><img alt="" src="<c:url value='/resources/img/packages/single1.jpg'/>">
	    						<div class="portfolio-over">
	    							<div>
	    								<h3 class="card-title">
	    									Aguirre Star Tour Package
	    								</h3>
	
	    								<p class="card-text">
	    									Lorem ipsum dolor sit amet, eu sed suas eruditi honestatis.
	    								</p>
	    							</div>
	    						</div>
	    					</a>
	    				</div>
	    			</div>
	
	    			<div class="col l4 m6 s12">
	    				<div class="card card-block">
	    					<a href="#"><img alt="" src="<c:url value='/resources/img/packages/multiple1.jpg'/>">
	    						<div class="portfolio-over">
	    							<div>
	    								<h3 class="card-title">
	    									Aguirre Star Tour Package
	    								</h3>
	
	    								<p class="card-text">
	    									Lorem ipsum dolor sit amet, eu sed suas eruditi honestatis.
	    								</p>
	    							</div>
	    						</div>
	    					</a>
	    				</div>
	    			</div>
	
	    			<div class="col l4 m6 s12">
	    				<div class="card card-block">
	    					<a href="#"><img alt="" src="<c:url value='/resources/img/packages/spain2.jpg'/>">
	    						<div class="portfolio-over">
	    							<div>
	    								<h3 class="card-title">
	    									Aguirre Star Tour Package
	    								</h3>
	
	    								<p class="card-text">
	    									Lorem ipsum dolor sit amet, eu sed suas eruditi honestatis.
	    								</p>
	    							</div>
	    						</div>
	    					</a>
	    				</div>
	    			</div>
	
	                <div class="col l4 m6 s12">
	                    <div class="card card-block">
	                        <a href="#"><img alt="" src="<c:url value='/resources/img/packages/starcruise1.jpg'/>">
	                            <div class="portfolio-over">
	                                <div>
	                                    <h3 class="card-title">
	                                        Aguirre Star Tour Package
	                                    </h3>
	
	                                    <p class="card-text">
	                                        Lorem ipsum dolor sit amet, eu sed suas eruditi honestatis.
	                                    </p>
	                                </div>
	                            </div>
	                        </a>
	                    </div>
	                </div>
	
	    		</div>
	    	</div>
	    </section>
	    <!-- /Portfolio -->
	
	    <section id="contact">
	    	<div class="container">
	    		<div class="row">
	    			<div class="col m12 center">
	    				<h2 class="section-title">Contact Us</h2>
	    			</div>
	    		</div>
	
	    		<div class="row">
	    			<div class="col l3 push-l3">
	    				<div class="info">
	    					<div>
	    						<i class="fa fa-map-marker"></i>
	    						<p>Lucban,Quezon</p>
	    					</div>
	
	    					<div>
	    						<i class="fa fa-envelope"></i>
	    						<p>sample@yahoo.com</p>
	    					</div>
	
	    					<div>
	    						<i class="fa fa-phone"></i>
	    						<p>0910-3404-737</p>
	    					</div>
	
	    				</div>
	    			</div>
	
	    			<div class="col l5 push-l3">
	    				<div class="form">
	    					<div id="sendmessage">Your message has been sent. Thank you!</div>
	    					<div id="errormessage"></div>
	    					<form action="" method="post" role="form" class="contactForm">
	    						<div class="form-group">
	    							<input type="text" name="name" class="form-control" id="name" placeholder="Your Name" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
	    							<div class="validation"></div>
	    						</div>
	    						<div class="form-group">
	    							<input type="email" class="form-control" name="email" id="email" placeholder="Your Email" data-rule="email" data-msg="Please enter a valid email" />
	    							<div class="validation"></div>
	    						</div>
	    						<div class="form-group">
	    							<input type="text" class="form-control" name="subject" id="subject" placeholder="Subject" data-rule="minlen:4" data-msg="Please enter at least 8 chars of subject" />
	    							<div class="validation"></div>
	    						</div>
	    						<div class="form-group">
	    							<textarea class="form-control" name="message" rows="5" data-rule="required" data-msg="Please write something for us" placeholder="Message"></textarea>
	    							<div class="validation"></div>
	    						</div>
	    						<div class="center"><button type="submit">Send Message</button></div>
	    					</form>
	    				</div>
	    			</div>
	
	    		</div>
	    	</div>
	    </section>
	
		<jsp:include page="/WEB-INF/views/includes/footer.jsp" />
	</body>
</html>