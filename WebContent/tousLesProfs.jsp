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
		
		<title>Professeurs</title>
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
	
		<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	 		<form class="form-inline" method="post" action="tousLesProfs">
	   			<input class="form-control mr-sm-2" type="search" placeholder="tapez le nom d'un élève" name="nomProfesseur">
	    		<button class="btn btn-info" type="submit">rechercher</button>
	  		</form>
		</nav>
		
		<div class="table-responsive">
    			<table class="table table-bordered table-secondary">
      				<thead>
        				<tr>
        				<th>ID_Prof</th>
        				<th>Nom</th>
        				<th>Prenom</th>
        				<th>Classes</th>
        				<th>Sexe</th>
        				<th>Date_De_Naissance</th>
        				<th>Adresse</th>
        				<th>Diplome</th>
        				<th>Tel</th>
        				<th>Langue</th>
        				<th>Salaire</th>
        				</tr>
      				</thead>
      				
      				<tbody>
      				<c:forEach items="${tousLesProfs}" var="line">
      					<tr>
          				<td>${line.getIdEnseignant()}</td>
          				<td>${line.getNom()}</td>
          				<td>${line.getPrenom()}</td>
          				<td>${line.getClasse()}</td>
          				<td>${line.getSexe()}</td>
          				<td>${line.getDateNaissance()}</td>
          				<td>${line.getAdresse()}</td>
          				<td>${line.getDiplome()}</td>
          				<td>${line.getTel()}</td>
          				<td>${line.getLangue()}</td>
          				<td>${line.getSalaire()}</td>
          				<td>
     						
	   						<button class="btn btn-primary" onclick="window.location.href = 'misAjourProf?idEnseignant=${line.getIdEleve()}';" >Mettre à jour</button>
	   					</td>
	   					
	   					<td>
     						
	   						<button class="btn btn-primary" onclick="window.location.href = 'supprimerProf?idEnseignant=${line.getIdEleve()}';" >Supprimer</button>
	   					</td>
	   					
	  					
          				</tr>
      				</c:forEach>
      				</tbody>
      			</table>
			</div>
		
		
</body>
</html>