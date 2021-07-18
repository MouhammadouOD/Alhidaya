<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
		
		<title>NOUVEAU PROFESSEUR</title>
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
	<form method="post" action="ajouterProfesseur" class="was-validated">

 						<div class="form-group">
    						<label for="nom">Nom:</label>
    						<input type="text" class="form-control" id="nom"  name="nom" required>
    						<div class="valid-feedback">Valid.</div>
    						<div class="invalid-feedback">veuillez remplir cette case.</div>
  						</div>

  						<div class="form-group">
    						<label for="prenom">Prenom:</label>
    						<input type="text" class="form-control" id="prenom" name="prenom" required>
    						<div class="valid-feedback">Valid.</div>
    						<div class="invalid-feedback">veuillez remplir cette case.</div>
  						</div>
  						
  						<div class="form-group">
    						<label for="dateNaiss">Date de naissance:</label>
    						<input type="date" class="form-control" id="dateNaiss" name="dateNaiss" required>
    						<div class="valid-feedback">Valid.</div>
    						<div class="invalid-feedback">veuillez remplir cette case.</div>
  						</div>
  						
  						<div class="form-group">
    						<label for="adresse">Adresse:</label>
    						<input type="text" class="form-control" id="adresse" name="adresse" required>
    						<div class="valid-feedback">Valid.</div>
    						<div class="invalid-feedback">veuillez remplir cette case.</div>
  						</div>
  						
  						<div class="form-group">
    						<label for="sexe">Sexe:</label>
    						<select class="form-control" id="sexe" name="sexe">
    								<option>M</option>
							        <option>F</option>
							    </select>
  						</div>
  						
  						
  						<div class="form-group">
    						<label for="tel">Tel:</label>
    						<input type="tel" class="form-control" id="tel" name="tel" required>
    						<div class="valid-feedback">Valid.</div>
    						<div class="invalid-feedback">veuillez remplir cette case.</div>
  						</div>
  						
  						<div class="form-group">
  						<label for="classes">Classes:</label>
  						<div class="form-check-inline">
					      <label class="form-check-label" for="ps">
					        <input type="checkbox" class="form-check-input" id="ps" name="classes" value='PS'>PS
					      </label>
					    </div>
					    <div class="form-check-inline">
					      <label class="form-check-label" for="ms">
					        <input type="checkbox" class="form-check-input" id="ms" name="classes" value='MS'>MS
					      </label>
					    </div>
					    <div class="form-check-inline">
					      <label class="form-check-label" for="gs">
					        <input type="checkbox" class="form-check-input" id="gs" name="classes" value='GS'>GS
					      </label>
					    </div>
					    <div class="form-check-inline">
					      <label class="form-check-label" for="ci">
					        <input type="checkbox" class="form-check-input" id="ci" name="classes" value='CI'>CI
					      </label>
					    </div>
					    <div class="form-check-inline">
					      <label class="form-check-label" for="cp">
					        <input type="checkbox" class="form-check-input" id="cp" name="classes" value='CP'>CP
					      </label>
					    </div>
					    <div class="form-check-inline">
					      <label class="form-check-label" for="ce1">
					        <input type="checkbox" class="form-check-input" id="ce1" name="classes" value='CE1'>CE1
					      </label>
					    </div>
					    <div class="form-check-inline">
					      <label class="form-check-label" for="ce2">
					        <input type="checkbox" class="form-check-input" id="ce2" name="classes" value='CE2'>CE2
					      </label>
					    </div>
					    <div class="form-check-inline">
					      <label class="form-check-label" for="cm1">
					        <input type="checkbox" class="form-check-input" id="cm1" name="classes" value='CM1'>CM1
					      </label>
					    </div>
					    <div class="form-check-inline">
					      <label class="form-check-label" for="cm2">
					        <input type="checkbox" class="form-check-input" id="cm2" name="classes" value='CM2'>CM2
					      </label>
					    </div>
					   </div>
					    
  						
  						<div class="form-group">
    						<label for="diplome">Diplome:</label>
    						<select class="form-control" id="diplome" name="diplome">
    								<option>BREVET</option>
							        <option>BACCALAUREAT</option>
							        <option>LICENCE1</option>
							        <option>LICENCE2</option>
							        <option>LICENCE3</option>
							    </select>
    						
  						</div>
  						
  						<div class="form-group">
    						<label for="salaire">Salaire:</label>
    						<input type="number" class="form-control" id="salaire" name="salaire" required>
    						<div class="valid-feedback">Valid.</div>
    						<div class="invalid-feedback">veuillez remplir cette case.</div>
  						</div>
  						
  						<div class="form-group">
    						<label for="langue">Langue:</label>
    						<select class="form-control" id="langue" name="langue">
    								<option>FRANCAIS</option>
							        <option>ARABE</option>
							        
							    </select>
    						
  						</div>
  						
  						<button type="submit" class="btn btn-primary">Ajouter</button>
	</form>
	</div>

</body>
</html>