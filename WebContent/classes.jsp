<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
		
		<title>CLASSES</title>
		<style>
			body {
				  background-image: url('./image/tableau-noir-ecole-vide-marques-craie_279525-4589.jpg');
				  background-image: no-repeat;
				  background-attachment: fixed;
  				  background-size: 100% 100%;
				}
		</style>
	</head>
<body>

	<%@ include file="navigation.jsp" %>
	<br><br>
	
	<div class='container col-sm-6'>
		<div class="btn-group-vertical">
		  <button type="button" class="btn btn-warning" onclick="window.location.href = 'classe?classe=PS';">PETITE SECTION</button>
		  <button type="button" class="btn btn-warning" onclick="window.location.href = 'classe?classe=MS';">MOYENNE SECTION</button>
		  <button type="button" class="btn btn-warning" onclick="window.location.href = 'classe?classe=GS';">GRANDE SECTION</button>
		  <button type="button" class="btn btn-primary" onclick="window.location.href = 'classe?classe=CI';">CI</button>
		  <button type="button" class="btn btn-primary" onclick="window.location.href = 'classe?classe=CP';">CP</button>
		  <button type="button" class="btn btn-primary" onclick="window.location.href = 'classe?classe=CE1';"">CE1</button>
		  <button type="button" class="btn btn-success" onclick="window.location.href = 'classe?classe=CE2';"">CE2</button>
		  <button type="button" class="btn btn-success" onclick="window.location.href = 'classe?classe=CM1';">CM1</button>
		  <button type="button" class="btn btn-success" onclick="window.location.href = 'classe?classe=CM2';">CM2</button>
		  

	</div>
	</div>

</body>
</html>