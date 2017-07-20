<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp">
	<head>
		<title>International Tours | Aguirre Star Worldwide Travel Corporation</title>
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
	    	<div class="parallax"><img src="<c:url value='/resources/img/banner/1UokUhnzPn_1477228503r.jpg'/>" > </div>
	  </div>
	  <!-- parallax -->
	
	  <!-- gallery -->
	  <h2 class="titleForm center">
	  	International Tours
	  </h2>
		<div class="container">
	    <div class="row center-align">
	      <button class="btn" ng-click="showAsia()" active>Asia</button>
	      <button class="btn" ng-click="showEurope()">Europe</button>
	      <button class="btn" ng-click="showOME()">Oceania & Middle East</button>
	      <button class="btn" ng-click="showAmerica()">America</button>
	      <button class="btn" ng-click="showUD()">Unique Destination</button>
	    </div>
	    <br>
	
			<div class="row" id="selectAsia" ng-show="selectAsia">
		      <div class="col s12">
		        <ul class="tabs tabs-logo">
		            <li class="tab"><a href="#korea"><img src="<c:url value='/resources/img/icons/korea.jpg'/>"></a></li>
		            <li class="tab"><a href="#japan"><img src="<c:url value='/resources/img/icons/japan.jpg'/>"></a></li>
		            <li class="tab"><a href="#china"><img src="<c:url value='/resources/img/icons/china.jpg'/>"></a></li>
		            <li class="tab"><a href="#cam-viet"><img src="<c:url value='/resources/img/icons/cam-viet.jpg'/>"></a></li>
		            <li class="tab"><a href="#india"><img src="<c:url value='/resources/img/icons/india.jpg'/>"></a></li>
		            <li class="tab"><a href="#hkg-macau-taiwan"><img src="<c:url value='/resources/img/icons/hkg-macau-taiwan.jpg'/>"></a></li>
		            <li class="tab"><a href="#singapore"><img src="<c:url value='/resources/img/icons/singapore.jpg'/>"></a></li>
		            <li class="tab"><a href="#thailand"><img src="<c:url value='/resources/img/icons/thailand.jpg'/>"></a></li>
		        	<li class="tab"><a href="#malaysia-indonesia-brunei"><img src="<c:url value='/resources/img/icons/malaysia-indonesia-brunei.jpg'/>"></a></li>
		        </ul>
	
		        <div id="korea" class="row">
		          <div class="col s12">
		            <div class="card">
		              <div class="card-image">
		                <img src="<c:url value='/resources/img/packages/korea1.jpg'/>" width="100%">
		              </div>
		              <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    JUN 10 - SEP 30 
	                    </p>
	                    <br>
	                    <ul type="disc">
	                       <li>Seoul City - the capital of South Korea.
	                       It is a sprawling metropolis where hyper-modern skyscrapers - high-tech subways and pop culture 
	                       meet Buddhist temples - palaces and street markets.</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 499</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
		              </div>
		            </div>
		          </div>
	
		          <div class="col s12">
		            <div class="card">
		              <div class="card-image">
		                <img src="<c:url value='/resources/img/packages/korea2.jpg'/>" width="100%">
		              </div>
		              <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    AUG 02, 17, 24
	                    </p>
	                    <br>
	                    <ul type="disc">
	                      	<li> Nami Island</li>
	                      	<li> Bukchon Hanok Village</li>
	                      	<li> Cheonggyecheon Stream</li>
	                      	<li> Everland Theme Park</li>
	                      	<li> Gyeongbok Palace</li>
	                      	<li> National Folklore Museum</li>
	                      	<li> Pass by The Presidential Blue House</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 699</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
		              </div>
		            </div>
		          </div>	
		        </div>
		        <div id="japan" class="col s12">
		          <div class="col s12">
		            <div class="card">
		              <div class="card-image">
		                <img src="<c:url value='/resources/img/packages/japan1.jpg'/>" width="100%">
		              </div>
		              <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    JUN 01 - DEC 20 
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      	<li>Tokyo Morning Tour: Tokyo Tower</li>
	                      	<li>Meiji Shrine</li>
	                     	<li>Imperial Palace and Ginza District</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 858</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
		              </div>
		            </div>
		          </div>
	
		          <div class="col s12">
		            <div class="card">
		              <div class="card-image">
		                <img src="<c:url value='/resources/img/packages/japan2.jpg'/>" width="100%">
		              </div>
		              <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    JUN 01 - DEC 20 
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      	<li>Fushimi Inari Shrine</li>
	                      	<li>Kiyomizu Temple</li>
	                     	<li>Kinkakuji Temple</li>
	                     </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 898</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
		              </div>
		            </div>
		          </div>
		        </div>
		        <div id="china" class="col s12">
		          <div class="col s12">
		            <div class="card">
		              <div class="card-image">
		                <img src="<c:url value='/resources/img/packages/china1.jpg'/>" width="100%">
		              </div>
		              <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Jul 27 | Aug 24 | Sep 21 | Oct 26 | Nov 01 | Dec 23, 29
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      	<li>Flower City Square</li>
	                      	<li>Safari Park</li>
	                      	<li>International Circus Show</li>
	                      	<li>Chimelong Paradise</li>
	                     	<li>Haixinsha Island</li>
	                      	<li>Canton Fair</li>
	                      	<li>Beijing Road</li>
	                      	<li>Yuexiu Park</li>
	                      	<li>Five-Ram Statue</li>
	                      	<li>Chen Clan Academy</li>
	                      	<li>Wanning Square</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 722</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
		              </div>
		            </div>
		          </div>
	
		          <div class="col s12">
		            <div class="card">
		              <div class="card-image">
		                <img src="<c:url value='/resources/img/packages/china2.jpg'/>" width="100%">
		              </div>
		              <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Jul 27 | Aug 24 | Sep 21 | Oct 26 | Nov 02 | Dec 23, 30 
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>Hulishan Fortress</li>
	                      <li>Zhongzhan Road</li>
	                      <li>Night cruise at Xiamen Port</li>
	                      <li>Gulangyu Islet</li>
	                      <li>Shuzhuang Garden</li>
	                      <li>Piano Museum</li>
	                      <li>Jewelry Tea Shop</li>
	                      <li>Hakka Earth Building Tour</li>
	                      <li>International Acrobatic Show</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 755</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
		              </div>
		            </div>
		          </div>
		        </div>
		        <div id="cam-viet" class="col s12">
		          <div class="col s12">
		            <div class="card">
		              <div class="card-image">
		                <img src="<c:url value='/resources/img/packages/cam-viet.jpg'/>" width="100%">
		              </div>
		              <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Jul 12 | Aug 17 | Sep 21 | Oct 31 | Dec 26
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>Tonle Sap Lake</li>
	                      <li>Floating Village</li>
	                      <li>Wat Damnak Buddhist Monastery</li>
	                      <li>Angkor Thom</li>
	                      <li>Angkor Wat Temple</li>
	                      <li>Thien Hau Temple</li>
	                      <li>Phnom Bakheng Temple</li>
	                      <li>Artisans D' Angkor</li>
	                      <li>Cu Chi Tunnel</li>
	                      <li>War Museum</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 998</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
		              </div>
		            </div>
		          </div>
		        </div>
		        <div id="india" class="col s12">
		          <div class="col s12">
		            <div class="card ">
		              <div class="card-image">
		                <img src="<c:url value='/resources/img/packages/india.jpg'/>" width="100%">
		              </div>
		              <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Sep 23 | Oct 28 | Nov 25 | Dec 26
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>India Gate</li>
	                      <li>Rashtrapati Bhavan</li>
	                      <li>Parliament House</li>
	                      <li>Qutab Minar</li>
	                      <li>Taj Mahal</li>
	                      <li>Agra Fort</li>
	                      <li>Mohabatey Taj Show</li>
	                      <li>Fatehpur Sikri</li>
	                      <li>Johri Bazaar</li>
	                      <li>Amber Fort with Jeepney and Elephant Ride</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 1,388</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
		              </div>
		            </div>
		          </div>
		        </div>
	          <div id="hkg-macau-taiwan" class="col s12">
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/hmt1.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Jan 01 - Dec 31
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>Taipei</li>
	                      <li>the capital of Taiwan</li>
	                      <li>is a modern metropolis with Japanese colonial lanes</li>
	                      <li>busy shopping streets and contemporary buildings</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 488</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/hmt2.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Jul 27 | Aug 18 | Sep 21 | Oct 26, 28, 29, 30 | Nov 23 | Dec 21, 23, 26, 27, 28, 29
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>Sun Moon Lake</li>
	                      <li>Wen Wu Temple</li>
	                      <li>Ita Thao Indigeous Village</li>
	                      <li>Holy Monk Shrine</li>
	                      <li>Taipei 101</li>
	                      <li>Wu Fen Pu Cloth Market</li>
	                      <li>Rao Ho Night Market</li>
	                      <li>National Palace Museum</li>
	                      <li>Experience making Pineapple Cake</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 677</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	          </div>
	          <div id="singapore" class="col s12">
	          </div>
	          <div id="thailand" class="col s12">
	          </div>
	          <div id="malaysia-indonesia-brunei" class="col s12">
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/mib1.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Jul 01 - Nov 30
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>Half Day Brunei City Tour</li>
	                      <li>Ubud Palace</li>
	                      <li>Monkey Forest</li>
	                      <li>Tegalalang Rice Terraces </li>
	                      <li>Ubud Art Market</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 365</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/mib2.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Jul 01 - Nov 30
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      Half Day Brunei City Tour</li>
	                      <li>Ubud Palace</li>
	                      <li>Monkey Forest</li>
	                      <li>Tegalalang Rice Terraces </li>
	                      <li>Ubud Art Market</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 365</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	          </div>
		      </div>  
		    </div> 
	    <div class="row" id="selectEurope" ng-show="selectEurope">
	        <div class="col s12">
	          <ul class="tabs tabs-logo">
	            <li class="tab"><a href="#SingleCountry"><img src="<c:url value='/resources/img/icons/SingleCountry.jpg'/>"></a></li>
	            <li class="tab"><a href="#MultipleCountries"><img src="<c:url value='/resources/img/icons/MultipleCountries.jpg'/>"></a></li>
	            <li class="tab"><a href="#ScandinaviaIcelandRussia"><img src="<c:url value='/resources/img/icons/Scandinavia,Iceland&Russia.jpg'/>"></a></li>
	            <li class="tab"><a href="#GreatBritainIreland"><img src="<c:url value='/resources/img/icons/GreatBritain&Ireland.jpg'/>"></a></li>
	            <li class="tab"><a href="#SpainPortugalMorocco"><img src="<c:url value='/resources/img/icons/Spain,Portugal&Morocco.jpg'/>"></a></li>
	            <li class="tab"><a href="#EasternMediterranean"><img src="<c:url value='/resources/img/icons/EasternMediterranean.jpg'/>"></a></li>
	          </ul>
	
	          <div id="SingleCountry" class="row">
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/single1.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Jul 21 | Aug 18 | Sep 15 | Oct 20
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>Bosphorus Cruise Trip</li>
	                      <li>Blue Mosque</li>
	                      <li>Hippodrome of Constantinople</li>
	                      <li>St. Sophia Church</li>
	                      <li>Topkapi Palace</li>
	                      <li>Ruins City of Troy Wooden Trojan Horse and Museum</li>
	                      <li>Ruins of Asklepion</li>
	                      <li>Ephesus</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 1,588</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/single2.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Apr 01 - Dec 31
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>Champs Elysees</li>
	                      <li>Arc de Triumph</li>
	                      <li>Concorde Square</li>
	                      <li>Invalides</li>
	                      <li>Eiffel Tower</li>
	                      <li>Trocadero</li>
	                      <li>Opera</li>
	                      <li>Notre Dame Cathedral</li>
	                      <li>Louvre Museum</li>
	                      <li>Orsay Museum</li>
	                      <li>Madeleine Church</li>
	                      <li>Versailles Palace</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 1,822</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>  
	          </div>
	          <div id="MultipleCountries" class="col s12">
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/multiple1.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Aug 17 | Sep 19 | Oct 23 | Nov 17 | Dec 21 | Jan 24 | Feb 21 | Mar 28 | Apr 18 | May 23 | Jun 20
	                    </p>
	                    <br>
	                  	<ul style="list-style-type: disc">
	                      <li>ITALY (ROME): Vatican Museum & Sistine Chapel</li>
	                      <li>Colosseum</li>
	                      <li>Trevi Fountain</li>
	                      <li>St. Peter's Basilica</li>
	                      <li>ITALY (PISA): Leaning Tower of Pisa</li>
	                      <li>ITALY (VENICE): Venice Island</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 3,588</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/multiple2.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Sep 20 | Oct 25 | Dec 20
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>LITHUANIA:</li>
	                      <li>Gediminas Tower</li>
	                      <li>Vilnius University Museum</li>
	                      <li>Trakai Island Castle</li>
	                      <li>Kaunas Castle</li>
	                      <li>Klaipeda Old Town</li>
	                      <li>Curonian Spit</li>
	                      <li>LATVIA: </li>
	                      <li>Hill of Crosses</li>
	                      <li>Rundale Palace</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 2,688</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	          </div>
	          <div id="ScandinaviaIcelandRussia" class="col s12">
	
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/sir1.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Sep 20 | Oct 25 | Dec 20
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>LITHUANIA:</li>
	                      <li>Gediminas Tower</li>
	                      <li>Vilnius University Museum</li>
	                      <li>Trakai Island Castle</li>
	                      <li>Kaunas Castle</li>
	                      <li>Klaipeda Old Town</li>
	                      <li>Curonian Spit</li>
	                      <li>LATVIA: </li>
	                      <li>Hill of Crosses</li>
	                      <li>Rundale Palace</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 2,688</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/sir2.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Aug 25 | Sep 22 | Oct 27
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>MOSCOW: Kremlin Cathedrals</li>
	                      <li>Red Square</li>
	                      <li>Christ Cathedral the Savior</li>
	                      <li>Gorky Park</li>
	                      <li>Novodevichiy Convent</li>
	                      <li>Sparrow Hills</li>
	                      <li>Moscow State University</li>
	                      <li>White House</li>
	                      <li>Kolomenskoe</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 3,255</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	          </div>
	          <div id="GreatBritainIreland" class="col s12">
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/greatbritain.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Jun 11 - Dec 31
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>Parliament Square</li>
	                      <li>Westminster Abbey</li>
	                      <li>Buckingham Palace</li>
	                      <li>St Paul's Cathedral</li>
	                      <li>The Whispering Gallery</li>
	                      <li>Tower of London</li>
	                      <li>Windsor Castle</li>
	                      <li>Stonehenge</li>
	                      <li>Roman Baths</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 2,255</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	          </div>
	          <div id="SpainPortugalMorocco" class="col s12">
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/spain1.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Sep 21 | Oct 26 | Dec 21
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>Puerta De Alcala</li>
	                      <li>Cibeles Puerta Del Sol</li>
	                      <li>Plaza dela Villa</li>
	                      <li>Plaza Mayor</li>
	                      <li>Carrera De San Jeronimo</li>
	                      <li>Calle Atocha</li>
	                      <li>Reina Sofia Museum</li>
	                      <li>Atocha Main Railway Station</li>
	                      <li>Ministry of Agriculture</li>
	                      <li>Prado Museum</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 2,988</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/spain2.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Sep 23 | Oct 21 | Dec 23
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>PORTUGAL (FATIMA): The Chapel of the Apparitions</li>
	                      <li>The Church of the Holy Trinity</li>
	                      <li>Aljustrel</li>
	                      <li>Stations of the Cross and the Calvary</li>
	                      <li>Our Lady of Ortiga  SPAIN PORTUGAL (FATIMA): The Chapel of the Apparitions</li>
	                      <li>The Church of the Holy Trinity</li>
	                      <li>Aljustrel</li>
	                      <li>Stations of the Cross and the Calvary</li>
	                      <li>Our Lady of Ortiga  SPAIN </li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 3,444</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	          </div>
	          <div id="EasternMediterranean" class="col s12">
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/mediterranean1.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Jul 21 | Aug 18 | Sep 15 | Oct 20
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>Bosphorus Cruise Trip</li>
	                      <li>Blue Mosque</li>
	                      <li>Hippodrome of Constantinople</li>
	                      <li>St. Sophia Church</li>
	                      <li>Topkapi Palace</li>
	                      <li>Ruins City of Troy Wooden Trojan Horse and Museum</li>
	                      <li>Ruins of Asklepion</li>
	                      <li>Ephesus</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 1,588</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/mediterranean2.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Nov 22 | Dec 20
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>Blue Mosque</li>
	                      <li>Hippodrome of Constantinople</li>
	                      <li>St. Sophia Church</li>
	                      <li>Topkapi Palace</li>
	                      <li>Ruins City of Troy Wooden Trojan Horse and Museum</li>
	                      <li>Ruins of Asklepion</li>
	                      <li>Ephesus</li>
	                      <li>House of Virgin Mary</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 1,688</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	          </div>
	        </div>  
	    </div>  
	    <div class="row" id="selectOME" ng-show="selectOME">
	        <div class="col s12">
	          <ul class="tabs tabs-logo">
	            <li class="tab"><a href="#australia"><img src="<c:url value='/resources/img/icons/australia-newzealand.jpg'/>"></a></li>
	            <li class="tab"><a href="#dubai"><img src="<c:url value='/resources/img/icons/dubai.jpg'/>"></a></li>
	            <li class="tab"><a href="#holyland"><img src="<c:url value='/resources/img/icons/holyland.jpg'/>"></a></li>
	          </ul>
	
	          <div id="australia" class="row">
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/australia1.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Sep 18 | Oct 16 | Nov 13 | Dec 18
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>Brisbane: Cathedral Square</li>
	                      <li>The Wheel of /liisbane</li>
	                      <li>River Cruise Goldcoast: Dreamworld</li>
	                      <li>Seaworld</li>
	                      <li>Warner /lios. Movieworld</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 1,888</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/australia2.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Sep 13 | Oct 18 | Nov 15 | Dec 27
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>Sydney: Bondi Beach</li>
	                      <li>The Gap</li>
	                      <li>Double and Rose Bay</li>
	                      <li>Kings Cross</li>
	                      <li>Sydney Opera House </li>
	                      <li>Sydney Tower Eye
	                      <li>Sydney SeaLife</li>
	                      <li>Power House Museum </li>
	                      <li>Blue Mountains</li>
	                    </span>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 2,188</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>  
	          </div>
	          <div id="dubai" class="col s12">
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/dubai.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Oct 28 | Nov 27 | Dec 25
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>Sheikh Mohammed Bin Rashid Al Maktoum Palace</li>
	                      <li>Dubai Museum</li>
	                      <li>Spice Souq</li>
	                      <li>Gold Souq</li>
	                      <li>Dubai Monorail Ride Palm Jumeirah Island</li>
	                      <li>Sheikh Zayed Grand Mosque</li>
	                      <li>Heritage Village</li>
	                      <li>Abu Dhabi Skyline</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 1,888</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	          </div>
	          <div id="holyland" class="col s12">
	
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/holyland1.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Sep 22 | Oct 20 | Nov 03 | Dec 14
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
		                    <li>Caesarea</li>
		                    <li>Muchraka</li>
		                    <li>Haifa</li>
		                    <li>Nazareth</li>
		                    <li>Church of Annunciation</li>
		                    <li>Cana</li>
		                    <li>Sea of Galilee</li>
		                    <li>Capernaum</li>
		                    <li>Tabgha</li>
		                    <li>Church of Multiplication</li>
		                    <li>Mt. Tabot</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 2,188</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/holyland2.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Sep 19 | Nov 20 | Dec 18
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>Mt</li>
	                      <li>Nebo</li>
	                      <li>Madaba</li>
	                      <li>Petra</li>
	                      <li>Al Maghtas</li>
	                      <li>Rose City</li>
	                      <li>Nazareth</li>
	                      <li>Church of Agony</li>
	                      <li>Mt. of Beatitudes</li>
	                      <li>St. Peter's Primacy</li>
	                      <li>Capernaum</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 2,688</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details.php">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	          </div>
	        </div>  
	    </div>  
	    <div class="row" id="selectAmerica" ng-show="selectAmerica">
	        <div class="col s12">
	          <ul id="domesticTour" class="tabs tabs-logo">
	            <li class="tab"><a href="#usaCanada"><img src="<c:url value='/resources/img/icons/usa-canada.jpg'/>"></a></li>
	            <li class="tab"><a href="#hawaiiGuam"><img src="<c:url value='/resources/img/icons/hawaii-guam.jpg'/>"></a></li>
	          </ul>
	
	          <div id="usaCanada" class="row">
	            <div class="col s12">
	            </div>
	          </div>
	          <div id="hawaiiGuam" class="col s12">
	            <div class="col s12">
	            </div>
	          </div>
	        </div>  
	    </div>  
	    <div class="row" id="selectUD" ng-show="selectUD">
	        <div class="col s12">
	          <ul id="domesticTour" class="tabs tabs-logo">
	            <li class="tab active"><a href="#africa"><img src="<c:url value='/resources/img/icons/south-africa.jpg'/>"></a></li>
	            <li class="tab"><a href="#himalayas"><img src="<c:url value='/resources/img/icons/himalayas.jpg'/>"></a></li>
	            <li class="tab"><a href="#maldives"><img src="<c:url value='/resources/img/icons/maldives.jpg'/>"></a></li>
	            <li class="tab"><a href="#laosMyanmar"><img src="<c:url value='/resources/img/icons/laos-myanmar.jpg'/>"></a></li>
	          </ul>
	
	          <div id="africa" class="row">
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/africa1.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Jun 01 - Nov 30
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
		                    <li>Lisbon Falls</li>
		                    <li>God's Window</li>
		                    <li>Moholoholo Wildlife Rehabilitation Centre</li>
		                    <li>Safari 4x4 Game Drive</li>
		                    <li>Karongwe Game Reserve</li>
		                    <li>Blyde River Canyon and Three Rondavels (Panoramic Route)</li>
		                    <li>Diamond Supply Wholesaler</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 1,899</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>
	
	            <div class="col s12">
	              <div class="card">
	                <div class="card-image">
	                  <img src="<c:url value='/resources/img/packages/africa2.jpg'/>" width="100%">
	                </div>
	                <div class="card-stacked">
	                <div class="card-content">
	                  <div class="left-align">
	                    <p>
	                    Jun 01 - Aug 31
	                    </p>
	                    <br>
	                    <ul style="list-style-type: disc">
	                      <li>Table Mountain</li>
	                      <li>Malay Quarter</li>
	                      <li>Houses of Parliament</li>
	                      <li>City Hall</li>
	                      <li>Castle of Good Hope</li>
	                      <li>Cape Peninsula (Sea Point</li>
	                      <li>Clifton</li>
	                      <li>Camps Bay</li>
	                      <li>Hout Bay)</li>
	                      <li>Mineral World</li>
	                    </ul>
	                  </div>
	                  <div class="right-align">
	
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 30px;">$ 3,088</span>
	                    <br>
	                    <span style="color: #ff9800; font-weight: 600; font-family: Verannda; font-size: 11px; padding-top: 19px; padding-right: 2px;">(Rate per person)</span>
	
	                  </div> 
	                    
	                </div>
	                <div class="card-action right-align">
	                  <a type="btn" href="tour_details">see more details <i class="fa fa-chevron-right" aria-hidden="true"></i></a>
	                </div>
	                </div>
	              </div>
	            </div>  
	          </div>
	          <div id="himalayas" class="col s12">
	            <div class="col s12">
	            </div>
	          </div>
	          <div id="maldives" class="col s12">
	            <div class="col s12">
	            </div>
	          </div>
	          <div id="laosMyanmar" class="col s12">
	            <div class="col s12">
	            </div>
	          </div>
	        </div>  
	    </div>  
	
	
	
		</div> 
		<br>   
	    <!-- gallery -->
	
		<jsp:include page="/WEB-INF/views/includes/footer.jsp" />
	
	</body>
</html>