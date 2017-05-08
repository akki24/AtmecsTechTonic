<%@ page language="java" contentType="text/html;"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
  <title>Sparrow | Travel Agency</title>
  <meta name="description" content="" />
  <meta name="keywords" content="" />
  <meta charset="utf-8" /><link rel="icon" href="favicon.png" />
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"> 
  <link rel="stylesheet" href="http://ajax.aspnetcdn.com/ajax/jquery.ui/1.10.3/themes/sunny/jquery-ui.css">
  <link rel="stylesheet" href="css/owl.carousel.css">
  <link rel="stylesheet" href="css/idangerous.swiper.css">
  <link rel="stylesheet" href="css/style.css" />
  <link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
  <link href='http://fonts.googleapis.com/css?family=Lora:400,400italic' rel='stylesheet' type='text/css'>
  <link href='http://fonts.googleapis.com/css?family=Raleway:100,200,300,400,600,700,800' rel='stylesheet' type='text/css'>
  <link href='http://fonts.googleapis.com/css?family=Raleway:400,600' rel='stylesheet' type='text/css'>
  <link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700&amp;subset=latin,cyrillic' rel='stylesheet' type='text/css'>	
  <link href='http://fonts.googleapis.com/css?family=Lato:400,700&amp;subset=latin,latin-ext' rel='stylesheet' type='text/css'>
  <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,600,700&amp;subset=latin,cyrillic' rel='stylesheet' type='text/css'>

</head>  
<body class="index-page">  
<!-- // authorize // -->
	<div class="overlay"></div>
	<div class="autorize-popup">
		<div class="autorize-tabs">
			<a href="#" class="autorize-tab-a current">Sign in</a>
			<a href="#" class="autorize-tab-b">Register</a>
			<a href="#" class="autorize-close"></a>
			<div class="clear"></div>
		</div>
		<section class="autorize-tab-content">
			<div class="autorize-padding">
				<h6 class="autorize-lbl">Welocome! Login in to Your Accont</h6>
				<input type="text" value="" placeholder="Name">
				<input type="text" value="" placeholder="Password">
				<footer class="autorize-bottom">
					<button class="authorize-btn">Login</button>
					<a href="#" class="authorize-forget-pass">Forgot your password?</a>
					<div class="clear"></div>
				</footer>
			</div>
		</section>
		<section class="autorize-tab-content">
			<div class="autorize-padding">
				<h6 class="autorize-lbl">Register for Your Account</h6>
				<input class="reg" type="text" value="" placeholder="First Name">
				<input class="reg" type="text" value="" placeholder="Last Name">
				<input class="reg" type="text" value="" placeholder="birthdate (mm/dd/yy)"><br>
				<input class="reg" type="textarea" value="" placeholder="Address">
				<input class="reg" type="tel" value="" placeholder="Contact Number">
				<input type="radio" name="gender" value="male" >Male
				<input type="radio" name="gender" value="female" >Female
				<input class="reg" type="email" value="" placeholder="Example@gmail.com">
				<input class="reg" type="text" value="" placeholder="Password">
				<footer class="autorize-bottom">
					<button class="authorize-btn">Registration</button>
					<button class="authorize-close-btn">Close</button>
					<div class="clear"></div>
				</footer>
			</div>
		</section>
	</div>
<!-- \\ authorize \\-->

<header id="top">
	<div class="header-a">
		<div class="wrapper-padding">			
			<div class="header-account">
				<a href="#">My account</a>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<div class="header-b">
		<!-- // mobile menu // -->
			<div class="mobile-menu">
				<nav>
					<ul>
						<li><a class="has-child" href="#">HOME</a>
												
						</li>
						<li><a class="has-child" href="#">Hotels</a>
							
						</li>						
						<li><a class="has-child" href="#">Flights</a>
							
						</li>
									
						<li><a href="contacts.html">CONTACTS</a></li>
					</ul>
				</nav>	
			</div>
		<!-- \\ mobile menu \\ -->
			
		<div class="wrapper-padding">
			<div class="header-logo"><a href="index.html"><img alt="" src="img/logo.jpg" /></a></div>
			<div class="header-right">
				
				<nav class="header-nav">
					<ul>
						<li><a href="#">Home</a></li>
						<li><a href="Login.jsp">Log in</a></li>
						<li><a href="Signup.jsp">Sign Up</a></li>
						<li><a href="http://www.atmecs.com">Contacts</a></li>
					</ul>
				</nav>
			</div>
			<div class="clear"></div>
		</div>
	</div>	
</header>


<!-- main-cont -->
<div class="main-cont">
<div class="body-padding">
	<div class="mp-slider">
		<!-- // slider // -->
		<div class="mp-slider-row">
			<div class="swiper-container">
			    <div class="swiper-preloader-bg"></div>
			    <div id="preloader">
			    	<div id="spinner"></div>
			    </div>
			    
				<a href="#" class="arrow-left"></a>
				<a href="#" class="arrow-right"></a>
				<div class="swiper-pagination"></div>
  				<div class="swiper-wrapper">  				
      				<div class="swiper-slide">
						<div class="slide-section" style="background:url(img/aspire.jpg) center top no-repeat;">
							
						</div>
      				</div>
      				<div class="swiper-slide"> 
						<div class="slide-section slide-b" style="background:url(img/think.jpg) center top no-repeat;">
							
						</div>
      				</div>
      				<div class="swiper-slide"> 
						<div class="slide-section slide-b" style="background:url(img/manage.jpg) center top no-repeat;">
							
						</div>
      				</div> 
      				<div class="swiper-slide"> 
						<div class="slide-section slide-b" style="background:url(img/engage.jpg) center top no-repeat;">
							
						</div>
      				</div> 
      				<div class="swiper-slide"> 
						<div class="slide-section slide-b" style="background:url(img/create.jpg) center top no-repeat;">
							
						</div>
      				</div> 
      				<div class="swiper-slide"> 
						<div class="slide-section slide-b" style="background:url(img/suceed.jpg) center top no-repeat;">
							
						</div>
      				</div>            
  				</div>
			</div>
		</div>
		<!-- \\ slider \\ -->
	</div>	
	<!-- search -->
	<div class="wrapper-a-holder">
	<div class="wrapper-a">
	<div class="page-search search-type-a">
		
		<!-- // offer // -->
		<div class="special-offer-b">
			<div class="weather-block">
				<div class="weather-block-padding">
					
			</div>
		</div>
		<!-- \\ offer \\ -->
		<div class="clear"></div>	
	</div>
	</div>

/main-cont
 --> -->
<footer class="footer-a">
	<div class="wrapper-padding">
		<div class="section">
	
			<div class="footer-lbl">Get In Touch</div>
			<div class="footer-adress">Address: 2nd Floor, 99LH,<br/>Lanco Hills Technology Park (P) Ltd.,<br />Manikonda, Hyderabad – 89</div>
			<div class="footer-phones">Telephones: +91 40 6768-1233</div>
			<div class="footer-email">E-mail:info@atmecs.com</div>
			
		</div>
			<div class="footer-tour">
				<div class="footer-tour-l"><a href="#"><img alt="" src="img/f-tour-02.jpg" /></a></div>
				<div class="clear"></div>
			</div>
			<!-- \\ -->			
			<!-- // -->
			<div class="footer-tour">
				<div class="footer-tour-l"><a href="#"><img alt="" src="img/f-tour-03.jpg" /></a></div>
				<div class="clear"></div>
			</div>
			<!-- \\ -->
			</div>
		</div>
		<div class="section">
			<div class="footer-lbl">Twitter widget</div>
			<div class="twitter-wiget">
				<div id="twitter-feed"></div>
			</div>
		</div>

	</div>
	<div class="clear"></div>
</footer>
    
<footer class="footer-b">
	<div class="wrapper-padding">
		<div class="footer-left">© Copyright 2015 by weblionmedia. All rights reserved.</div>
		<div class="footer-social">
			<a href="#" class="footer-twitter"></a>
			<a href="#" class="footer-facebook"></a>
			<a href="#" class="footer-vimeo"></a>
			<a href="#" class="footer-pinterest"></a>
			<a href="#" class="footer-instagram"></a>
		</div>
		<div class="clear"></div>
	</div>
</footer>

<!-- // scripts // -->
  <script src="js/jquery.1.7.1.js"></script>
  <script src="js/idangerous.swiper.js"></script>
  <script src="js/slideInit.js"></script>
  <script src="js/jqeury.appear.js"></script>  
  <script src="js/script.js"></script>
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/custom.select.js"></script>  
  <script src="http://ajax.aspnetcdn.com/ajax/jquery.ui/1.10.3/jquery-ui.min.js"></script>  
  <script type="text/javascript" src="js/twitterfeed.js"></script>
  
  <script>
  	$(document).ready(function(){
  		$('.date-inpt').datepicker();
		$('.custom-select').customSelect();
		$(function() {
  			$(document.body).on('appear', '.fly-in', function(e, $affected) {
    			$(this).addClass("appeared");
  			});
  			$('.fly-in').appear({force_process: true});
		});

     	$(".owl-slider").owlCarousel({
    		loop:true,
    		margin:28,
    		responsiveClass:true,
    		responsive:{
        0:{
            items:1,
            nav:true
        },
        620:{
            items:2,
            nav:true
        },
        900:{
            items:3,
            nav:false
        },
        1120:{
            items:4,
            nav:true,
            loop:false
        }
    }
		});
		$slideHover();
  	});
  </script>
<!-- \\ scripts \\ --> 
 
</body>  
</html> 