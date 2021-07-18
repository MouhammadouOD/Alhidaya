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
		
		<title>CLASSE</title>
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
	<br><br><br>
	
	<div class='container text-light'>
		<h3>Classe:${classe}</h1>
		
	</div>
	
	
	<div class="table-responsive">
    			<table class="table table-bordered table-secondary">
      				<thead>
        				<tr>
        				<th>ID_élève</th>
        				<th>Nom</th>
        				<th>Prenom</th>
        				<th>Sexe</th>
        				<th>Date_De_Naissance</th>
        				<th>Nom_Tuteur</th>
        				<th>Tel_Tuteur</th>
        				</tr>
      				</thead>
      				
      				<tbody>
      				<c:forEach items="${v1}" var="line">
      					<tr>
          				<td>${line.getIdEleve()}</td>
          				<td>${line.getNom()}</td>
          				<td>${line.getPrenom()}</td>
          				<td>${line.getSexe()}</td>
          				<td>${line.getDateNaissance()}</td>
          				<td>${line.getNomTuteur()}</td>
          				<td>${line.getTelTuteur()}</td>
          				
	  					
          				</tr>
      				</c:forEach>
      				</tbody>
      			</table>
			</div>
</body>
</html>