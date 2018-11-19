<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700" rel="stylesheet">


<title>Online shopping cart</title>
<style>
* {
	box-sizing: border-box;
}

body {
	margin: 0;
	font-family: 'Montserrat', sans-serif;
}

.header {
	overflow: hidden;
	background-color: #66cdaa;
	padding: 10px;
	box-shadow: 5px 2px 2px rgba(102, 205, 170, .65);
}

.header a {
	color: black;
	text-align: center;
	padding: 12px;
	text-decoration: none;
	font-size: 18px;
	line-height: 25px;
	border-radius: 4px;
}

.header a.logo {
	font-size: 25px;
	font-weight: bold;
}

.header-search {
	position: relative;
}

.header-search .btn-search-ico {
	border-radius: 0 3px 3px 0;
    position: absolute;
    right: 0;
    padding: 10px 15px;
    background-color: #DEDEDE;
    color: #111111;
    border: 0;
}


</style>
</head>

<body align="center" >

<header class="header">
	<div class="container-fluid">
		<div class="row">
		<div class="col-sm-4">
			<a href="#default" class="logo">Shopping World</a>
			
		</div>
		<div class="col-sm-8">
			<ul class="list-unstyled mb-0 float-right">
			<li class="list-inline-item">
				<form class="form-inline" action="getproduct" method="get" name="myForm">
				<div class="form-group header-search">
			 	<label class="sr-only">Search</label>
				<input type="text" class="form-control" name="product" placeholder="search for product" />
				<button class="btn-link btn-search-ico">
					<i class="fa fa-search" aria-hidden="true"></i>					
				</button>
				</div>
			</form>
			</li>
				<li class="list-inline-item">
					<a class="active" href="#home">Home</a> 
				</li>
				<li class="list-inline-item">
					<a href="#about">About</a>
				</li>
				<li class="list-inline-item">
					<a href="#contact">Contact</a>
				</li>
			</ul>
		</div>
		</div>
	</div>
</header>

</body>
</html>
