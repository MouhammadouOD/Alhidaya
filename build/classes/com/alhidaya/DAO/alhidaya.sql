-- ------------------------------------------------------------------------------
-- - Reconstruction de la base de données                                     ---
-- ------------------------------------------------------------------------------
DROP DATABASE IF EXISTS Alhidaya;
CREATE DATABASE Alhidaya;
USE Alhidaya;

-- -----------------------------------------------------------------------------
-- - Construction de la table des Elèves                               ---
-- -----------------------------------------------------------------------------
CREATE TABLE T_Eleves (
	IdEleve		int	PRIMARY KEY AUTO_INCREMENT,
	Nom				varchar(20)				  ,
	Prenom			varchar(30)				  ,
	Sexe			CHAR(5)     			  ,
	DateNaissance	varchar(20) 		  			  ,
	Adresse			varchar(100)			  ,
	NomTuteur		varchar(50)				  ,
	TelTuteur		varchar(20)				  ,
	Classe			varchar(20)				  ,
	Particularite   varchar(20)
)ENGINE = InnoDB;

INSERT INTO T_Eleves (IdEleve, Nom, Prenom, Sexe, DateNaissance, Adresse, NomTuteur, TelTuteur, Classe, Particularite) VALUES (1, 'Niang', 'Lamine', 'M', '19970714', 'thies', 'mod', '772806246','PS', 'DEMI-PENSIONNAT');

SELECT * FROM T_Eleves;


-- -----------------------------------------------------------------------------
-- - Construction de la table des Enseignants                               ---
-- -----------------------------------------------------------------------------

CREATE TABLE T_Enseignants (
	IdEnseignants		int	PRIMARY KEY AUTO_INCREMENT,
	Nom					varchar(20)				  ,
	Prenom				varchar(30)				  ,
	Sexe				CHAR(1)     			  ,
	DateNaissance		DATE 		  			  ,
	Adresse				varchar(100)			  ,
	Langue				varchar(20)				  ,
	Tel					varchar(9)				  ,
	Classes				varchar(20)				  ,
	Diplome				varchar(20)				  ,
	Salaire				varchar(20)
)ENGINE = InnoDB;

INSERT INTO T_Enseignants (IdEnseignants, Nom, Prenom, Sexe, DateNaissance, Adresse, Langue, Tel, Classes,Diplome, Salaire) VALUES (1, 'Cisse', 'Maty', 'M', '19970714', 'thies','français', '772806246','CI', 'BACCALAUREAT', '50000');

SELECT * FROM T_Enseignants;


-- -----------------------------------------------------------------------------
-- - Construction de la table des Sécrétaires                                ---
-- -----------------------------------------------------------------------------

CREATE TABLE T_Secretaires (
	IdSecretaire	int PRIMARY KEY AUTO_INCREMENT,
	Nom         	varchar(20)					  ,
	Prenom 			varchar(20)					  ,
	Login			varchar(20)					  ,
	Mdp				varchar(20)					  
)ENGINE = InnoDB;

INSERT INTO T_Secretaires (IdSecretaire , Nom , Prenom , Login , Mdp) VALUES (1,'Gaye', 'Fatou' , 'toto' , 'passer');

SELECT * FROM T_Secretaires;

