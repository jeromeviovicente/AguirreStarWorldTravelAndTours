<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<footer class="site-footer">
  <div class="bottom">
    <div class="container">
      <div class="row">

        <div class="col l6 s12 left">
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

<!-- JQuery lib -->
<script src="<c:url value='/resources/lib/jquery/jquery.min.js'/>"></script>

<!-- Materialize Js -->
<script src="<c:url value='/resources/lib/materialize/js/materialize.min.js'/>"></script>

<!-- angular -->
<script type="text/javascript" src="<c:url value='/resources/lib/angular/angular.js'/>"></script>

<!-- angular application -->
<script type="text/javascript" src="<c:url value='/resources/js/app.js'/>"></script>

<!-- contorller -->
<script type="text/javascript" src="<c:url value='/resources/js/tour_controller.js'/>"></script>

<!-- custom Js -->
<script type="text/javascript">
	$( document ).ready(function(){
		$(".dropdown-button").dropdown();
		$('.parallax').parallax();    
    $('ul.tabs').tabs();
    $('ul.tabs').tabs('select_tab', 'tab_id');
    $('.carousel').carousel();
    $('.carousel.carousel-slider').carousel({fullWidth: true});
    $('.modal').modal();
    $('.datepicker').pickadate({
        selectMonths: true, 
        selectYears: 100,
        close: 'Done'
    });
    $('select').material_select();
    $('.button-collapse').sideNav({
      menuWidth: 300, // Default is 300
      draggable: true, // Choose whether you can drag to open on touch screens,
    }
  );
	});
</script>