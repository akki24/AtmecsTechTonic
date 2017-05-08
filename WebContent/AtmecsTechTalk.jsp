<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="assets/css/form-elements.css">
        <link rel="stylesheet" href="assets/css/style.css">
     <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
    
  
      <link rel="stylesheet" href="tables/css/style.css">
</head>
<body>


	 	
	<nav id="mainNav"
		class="navbar navbar-default navbar-fixed-top navbar-custom">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header page-scroll">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> Menu <i
					class="fa fa-bars"></i>
			</button>
			<a class="navbar-brand" href="#page-top">ATMECS</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li class="hidden"><a href="#page-top"></a></li>
				<li><a href="Home.jsp">Home</a></li>
				
				<li><a href="Logout">Logout</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>


	<!-- /.container-fluid --> </nav>

<br>
<br>
<center>
<h1>ATMECS <span>Tech</span> Talks <span></span></h1></center>
<form action="AddTechTalk.jsp">
<div>
<table class="responstable">
  
  <tr>
  
    <th>Presentation Date</th>
    <th>Presentation Title</th>
    <th>Presentation Description</th>
    <th>Presenter Name</th>
  	<th>update</th>
  	<th>delete</th>
  	<th>interested</th>  
  </tr>
  <c:forEach var="techTalk" items="${techList}">
  <tr>
   <td>${techTalk.presentationDate}</td>
    <td>${techTalk.presentationTitle}</td>
    <td>${techTalk.presentationDescription}</td>
    <td>${techTalk.presenterName}</td>
    <td><a href="FetchTechTalkToUpdate?id=${techTalk.id}">Edit</a>
    <td><a href="delete?id=${techTalk.id}">Delete</a></td>
  	<td><a href="InterestedInTechTalk?id=${techTalk.id}">Interested</a></td>
  
  </tr>
    </c:forEach>
    
    
   
    
</table>
</div>
<center><input type="submit" value="Add Tech Talk"></center>
  </form>
  
  <script src='http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.js'></script>

</body>
</html>