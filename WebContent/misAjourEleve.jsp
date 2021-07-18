<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
		
		<title>Mis A jour</title>
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
	
	<div class='container col-sm-9 bg-success'>
	<form method="post" action="misAjourEleve" class="was-validated">

 						<div class="form-group">
    						<label for="nom">Nom:</label>
    						<input type="text" class="form-control" id="nom"  name="nom" value="${nom}" required>
    						<div class="valid-feedback">Valid.</div>
    						<div class="invalid-feedback">veuillez remplir cette case.</div>
  						</div>

  						<div class="form-group">
    						<label for="prenom">Prenom:</label>
    						<input type="text" class="form-control" id="prenom" name="prenom" value="${prenom}" required>
    						<div class="valid-feedback">Valid.</div>
    						<div class="invalid-feedback">veuillez remplir cette case.</div>
  						</div>
  						
  						<div class="form-group">
    						<label for="dateNaiss">Date de naissance:</label>
    						<input type="date" class="form-control" id="dateNaiss" name="dateNaiss" value="${dateNaiss}" required>
    						<div class="valid-feedback">Valid.</div>
    						<div class="invalid-feedback">veuillez remplir cette case.</div>
  						</div>
  						
  						<div class="form-group">
    						<label for="adresse">Adresse:</label>
    						<input type="text" class="form-control" id="adresse" name="adresse" value="${adresse}" required>
    						<div class="valid-feedback">Valid.</div>
    						<div class="invalid-feedback">veuillez remplir cette case.</div>
  						</div>
  						
  						<div class="form-group">
    						<label for="sexe">Sexe:</label>
    						<select class="form-control" id="sexe" name="sexe" value="${sexe}">
    								<option>M</option>
							        <option>F</option>
							    </select>
  						</div>
  						
  						<div class="form-group">
    						<label for="nomTuteur">Prenom et nom tuteur:</label>
    						<input type="text" class="form-control" id="nomTuteur" name="nomTuteur" value="${nomTuteur}" required>
    						<div class="valid-feedback">Valid.</div>
    						<div class="invalid-feedback">veuillez remplir cette case.</div>
  						</div>
  						
  						<div class="form-group">
    						<label for="telTuteur">Tel tuteur:</label>
    						<input type="tel" class="form-control" id="telTuteur" name="telTuteur" value="${telTuteur}" required>
    						<div class="valid-feedback">Valid.</div>
    						<div class="invalid-feedback">veuillez remplir cette case.</div>
  						</div>
  						
  						<div class="form-group">
    						<label for="classe">Classe:</label>
    						<select class="form-control" id="classe" name="classe">
    								<option>PS</option>
							        <option>MS</option>
							        <option>GS</option>
							        <option>CI</option>
							        <option>CP</option>
							        <option>CE1</option>
							        <option>CE2</option>
							        <option>CM1</option>
							        <option>CM2</option>
							    </select>
  						</div>
  						
  						<div class="form-group">
    						<label for="particularite">Particularité:</label>
    						<input type="text" class="form-control" id="particularite" name="particularite" value="${particularite}" >
    						
  						</div>
  						
  						
  						<button type="submit" class="btn btn-primary">Mettre A jour</button>
	</form>
	</div>

</body>
</html>