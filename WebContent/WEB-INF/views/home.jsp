<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Aguirre Star Worldwide Travel Corporation</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">
    
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
    
    <!-- Facebook Opengraph integration: https://developers.facebook.com/docs/sharing/opengraph -->
    <meta property="og:title" content="">
    <meta property="og:image" content="">
    <meta property="og:url" content="">
    <meta property="og:site_name" content="">
    <meta property="og:description" content="">
		
    <!-- Favicon -->
    <link href="<c:url value='/resources/img/favicon.icon'/>" rel="icon">
    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Raleway:400,500,700|Roboto:400,900" rel="stylesheet">
    <!-- Bootstrap CSS File -->
    <link href="<c:url value='/resources/apifw/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet">
    <!-- Libraries CSS Files -->
    <link href="<c:url value='/resources/apifw/font-awesome/css/font-awesome.min.css'/>" rel="stylesheet">
    <!-- Main Stylesheet File -->
    <link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet">
    
  </head>

	<body>
    <!-- Page Content
    ================================================== -->
    <!-- Hero -->

    <section class="hero">
      <div class="container text-center">
        <div class="row">
          <div class="col-md-12">
            <a>Logo Here</a>
          </div>
        </div>

        <div class="col-md-12">
          <h1>
           Aguirre Star World
          </h1>

          <p class="tagline">
              Travel and Tours
          </p>
          <a class="btn btn-full" href="#about">Get Started Now</a>
        </div>
      </div>
      
    </section>
    <!-- /Hero -->
    
  <!-- Header -->
  		<header id="header">
	    	<div class="container">
		    	<div class="row justify-content-center">
			    	<div id="logo" class="pull-left">
			        	<a href="/index">Aguirre Logo Here</a>
			        	<!-- Uncomment below if you prefer to use a text image -->
			        	<!--<h1><a href="#hero">Bell</a></h1>-->
			      	</div>
		        
		      		<nav id="nav-menu-container">
		        		<ul class="nav-menu">
		          			<li><a href="index">Home</a></li>
				          	<li class="menu-has-children"><a href="">Main Menu</a>
				            	<ul>
				              		<li><a href="#">Menu 1</a></li>
				              		<li><a href="#">Menu 2</a></li>
				            	</ul>
				          	</li>
				          	<li><a href="#features">Airline Ticketing</a></li>
				          	<li class="menu-has-children"><a href="">Passenger Application</a>
				           		<ul>
				              		<li><a href="#">Menu 1</a></li>
				              		<li><a href="#">Menu 2</a></li>
				            	</ul>
		          			</li>
		          			<li><a href="#portfolio">Tours</a></li>
		          			<li><a href="#contact">Contact Us</a></li>
		        			</ul>
		      		</nav><!-- #nav-menu-container -->
		      
				   	<nav class="nav social-nav pull-right hidden-sm-down">
				        <a href="#"><i class="fa fa-twitter"></i></a>
				        <a href="#"><i class="fa fa-facebook"></i></a>
				        <a href="#"><i class="fa fa-linkedin"></i></a>
				        <a href="#"><i class="fa fa-envelope"></i></a>
					</nav>
			    </div>
			</div>
		</header><!-- #header -->
  
  
    <!-- About -->

    <section class="about" id="about">
      <div class="container text-center">
        <h2>
          About Aguirre Star World Tours Corporation
        </h2>

        <p>
         Description Here
        </p>

        <div class="row stats-row">
         
        </div>
      </div>
    </section>
    <!-- /About -->
    <!-- Parallax -->

    <div class="block bg-primary block-pd-lg block-bg-overlay text-center" data-bg-img="img/parallax-bg.jpg" data-settings='{"stellar-background-ratio": 0.6}' data-toggle="parallax-bg">
      <h2>
        Welcome to Aguirre Star World Tour
      </h2>

      <p>
        (Description)
      </p>
      
    </div>
    <!-- /Parallax -->
    <!-- Features -->

    <section class="features" id="features">
      <div class="container">
        <h2 class="text-center">
          Airline Ticketing
        </h2>

        <div class="row">
          <div class="feature-col col-lg-4 col-xs-12">
            <div class="card card-block text-center">
              <div>
                <div class="feature-icon">
                  <span class="fa fa-gear"></span>
                </div>
              </div>

              <div>
                <h3>
                  Sample
                </h3>

                <p>
                  Sample
                </p>
              </div>
            </div>
          </div>

          <div class="feature-col col-lg-4 col-xs-12">
            <div class="card card-block text-center">
              <div>
                <div class="feature-icon">
                  <span class="fa fa-gear"></span>
                </div>
              </div>

              <div>
                <h3>
                  Sample
                </h3>

                <p>
                  Sample
                </p>
              </div>
            </div>
          </div>

          <div class="feature-col col-lg-4 col-xs-12">
            <div class="card card-block text-center">
              <div>
                <div class="feature-icon">
                  <span class="fa fa-gear"></span>
                </div>
              </div>

              <div>
                <h3>
                  Sample
                </h3>

                <p>
                  Sample
                </p>
              </div>
            </div>
          </div>
        </div>

        <div class="row">
          

          

         
          
        </div>
      </div>
    </section>
    <!-- /Features -->
    
    <!-- Portfolio -->

    <section class="portfolio" id="portfolio">
      <div class="container text-center">
        <h2>
          Our Tour Package
        </h2>

        <p>
          Sample Tour
        </p>
      </div>

      <div class="portfolio-grid">
        <div class="row">
          <div class="col-lg-3 col-sm-6 col-xs-12">
            <div class="card card-block">
              <a href="#"><img alt="" src="<c:url value='/resources/img/porf-1.jpg'/>">
              <div class="portfolio-over">
                <div>
                  <h3 class="card-title">
                    Aguirre Star Tour Package
                  </h3>

                  <p class="card-text">
                    Lorem ipsum dolor sit amet, eu sed suas eruditi honestatis.
                  </p>
                </div>
              </div></a>
            </div>
          </div>

          <div class="col-lg-3 col-sm-6 col-xs-12">
            <div class="card card-block">
              <a href="#"><img alt="" src="<c:url value='/resources/img/porf-2.jpg'/>"/>
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

          <div class="col-lg-3 col-sm-6 col-xs-12">
            <div class="card card-block">
              <a href="#"><img alt="" src="<c:url value='/resources/img/porf-3.jpg'/>">
              <div class="portfolio-over">
                <div>
                  <h3 class="card-title">
                    Aguirre Star Tour Package
                  </h3>

                  <p class="card-text">
                    Lorem ipsum dolor sit amet, eu sed suas eruditi honestatis.
                  </p>
                </div>
              </div></a>
            </div>
          </div>

          <div class="col-lg-3 col-sm-6 col-xs-12">
            <div class="card card-block">
              <a href="#"><img alt="" src="<c:url value='/resources/img/porf-4.jpg'/>">
              <div class="portfolio-over">
                <div>
                  <h3 class="card-title">
                    Aguirre Star Tour Package
                  </h3>

                  <p class="card-text">
                    Lorem ipsum dolor sit amet, eu sed suas eruditi honestatis.
                  </p>
                </div>
              </div></a>
            </div>
          </div>
        </div>

        <div class="row">
          <div class="col-lg-3 col-sm-6 col-xs-12">
            <div class="card card-block">
              <a href="#"><img alt="" src="<c:url value='/resources/img/porf-5.jpg'/>">
              <div class="portfolio-over">
                <div>
                  <h3 class="card-title">
                    Aguirre Star Tour Package
                  </h3>

                  <p class="card-text">
                    Lorem ipsum dolor sit amet, eu sed suas eruditi honestatis.
                  </p>
                </div>
              </div></a>
            </div>
          </div>

          <div class="col-lg-3 col-sm-6 col-xs-12">
            <div class="card card-block">
              <a href="#"><img alt="" src="<c:url value='/resources/img/porf-6.jpg'/>">
              <div class="portfolio-over">
                <div>
                  <h3 class="card-title">
                    Aguirre Star Tour Package
                  </h3>

                  <p class="card-text">
                    Lorem ipsum dolor sit amet, eu sed suas eruditi honestatis.
                  </p>
                </div>
              </div></a>
            </div>
          </div>

          <div class="col-lg-3 col-sm-6 col-xs-12">
            <div class="card card-block">
              <a href="#"><img alt="" src="<c:url value='/resources/img/porf-7.jpg'/>">
              <div class="portfolio-over">
                <div>
                  <h3 class="card-title">
                    Aguirre Star Tour Package
                  </h3>

                  <p class="card-text">
                    Lorem ipsum dolor sit amet, eu sed suas eruditi honestatis.
                  </p>
                </div>
              </div></a>
            </div>
          </div>

          <div class="col-lg-3 col-sm-6 col-xs-12">
            <div class="card card-block">
              <a href="#"><img alt="" src="<c:url value='/resources/img/porf-8.jpg'/>">
              <div class="portfolio-over">
                <div>
                  <h3 class="card-title">
                    Aguirre Star Tour Package
                  </h3>

                  <p class="card-text">
                    Lorem ipsum dolor sit amet, eu sed suas eruditi honestatis.
                  </p>
                </div>
              </div></a>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- /Portfolio -->
   
    <!-- @component: footer -->

    <section id="contact">
      <div class="container">
        <div class="row">
          <div class="col-md-12 text-center">
            <h2 class="section-title">Contact Us</h2>
          </div>
        </div>
        
        <div class="row">
          <div class="col-lg-3 offset-lg-2">
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
          
          <div class="col-lg-5">
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
                  <div class="text-center"><button type="submit">Send Message</button></div>
              </form>
            </div>
          </div>
          
        </div>
      </div>
    </section>
      
    <footer class="site-footer">
      <div class="bottom">
        <div class="container">
          <div class="row">

            <div class="col-lg-6 col-xs-12 text-lg-left text-center">
              <p class="copyright-text">
                © Aguirre Star World
              </p>
              <div class="credits">
                  
                Powered by: <a>CWSSTSI</a>
              </div>
            </div>
            
           
            
          </div>
        </div>
      </div>
    </footer>
    <a class="scrolltop" href="#"><span class="fa fa-angle-up"></span></a> 

    <!-- Required JavaScript Libraries -->
   
    <script src="<c:url value='/resources/apifw/jquery/jquery.min.js'/>"></script>
    <script src="<c:url value='/resources/apifw/superfish/hoverIntent.js'/>"></script>
    <script src="<c:url value='/resources/apifw/superfish/superfish.min.js'/>"></script>
    <script src="<c:url value='/resources/apifw/tether/js/tether.min.js'/>"></script>
    <script src="<c:url value='/resources/apifw/stellar/stellar.min.js'/>"></script>
    <script src="<c:url value='/resources/apifw/bootstrap/js/bootstrap.min.js'/>"></script>
    <script src="<c:url value='/resources/apifw/counterup/counterup.min.js'/>"></script>
    <script src="<c:url value='/resources/apifw/waypoints/waypoints.min.js'/>"></script>
    <script src="<c:url value='/resources/apifw/easing/easing.js'/>"></script>
    <script src="<c:url value='/resources/apifw/stickyjs/sticky.js'/>"></script>
    <script src="<c:url value='/resources/apifw/parallax/parallax.js'/>"></script>
    <script src="<c:url value='/resources/apifw/lockfixed/lockfixed.min.js'/>"></script>
   
    
    
    
    <!-- Template Specisifc Custom Javascript File -->
    <script type="text/javascript" src="<c:url value='/resources/js/custom.js'/>"></script>
    
  </body>
</html>