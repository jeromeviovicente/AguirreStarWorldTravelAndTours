<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<nav>
	<div class="nav-wrapper">
	<a href="index" class="brand-logo">Aguirre Logo Here</a>
		<ul class="right hide-on-med-and-down">
			<li><a href="index">Home</a></li>
			<li>
				<a href="#porfolio" class="dropdown-button" data-activates="tourMenu">Tours 
					<i class="fa fa-chevron-down" aria-hidden="true"></i></a>
			</li>
			<li>
				<a class="dropdown-button" data-activates="servicesMenu">Services
					<i class="fa fa-chevron-down" aria-hidden="true"></i></a>
			</li>
			<li><a href="visa_assistance">Visa Assistance</a></li>
			<li><a href="pay_center">Pay Center</a></li>
			<li><a href="contact_us">Contact Us</a></li>
			<li><a href="login">Account</a></li>
		</ul>
	</div>

	<!-- Tours Menu -->
	<ul id="tourMenu" class="dropdown-content">
		<li><a href="international_tour">International</a></li>
		<li><a href="domestic_tour">Domestic</a></li>
		<li><a href="cruise">Cruise</a></li>
	</ul>

	<!-- Services Menu -->
	<ul id="servicesMenu" class="dropdown-content">
		<li><a href="airline_ticketing">Airline Ticketing</a></li>
		<li><a href="bus_reservation">Bus Reservation</a></li>
		<li><a href="car_rentals">Car Rentals</a></li>
		<li><a href="ferry">Ferry</a></li>
		<li><a href="hotel_accomodation">Hotel Accomodation</a></li>
	</ul>
</nav>