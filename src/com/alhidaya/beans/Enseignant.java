package com.alhidaya.beans;

public class Enseignant {
	private int IdEnseignant;
	private String Nom;
	private String Prenom;
	private String Sexe;
	private String DateNaissance;
	private String Adresse;
	private String Langue;
	private String Tel;
	private String Classes;
	private String Diplome;
	private String Salaire;
	
	public Enseignant() {
		this( 1, "Cisse", "Maty", "M", "19970714", "thies","français", "772806246","CI" ,"BACCALAUREAT" , "50000");
	}
	
	public Enseignant(int IdEnseignant, String Nom, String Prenom, String Sexe, String DateNaissance, String Adresse, String Langue,
			String Tel, String Classes, String Diplome, String Salaire) {
		
		this.setIdEnseignant(IdEnseignant);
		this.setNom(Nom);
		this.setPrenom(Prenom);
		this.setSexe(Sexe);
		this.setDateNaissance(DateNaissance);
		this.setAdresse(Adresse);
		this.setLangue(Langue);
		this.setTel(Tel);
		this.setClasses(Classes);
		this.setDiplome(Diplome);
		this.setSalaire(Salaire);
	}
	
	public Enseignant(String nom2, String prenom2, String sexe2, String dateNaissance2, String adresse2, String langue2,
			String tel2, String classes2, String diplome2, String salaire2) {
		// TODO Auto-generated constructor stub
	}

	public int getIdEnseignant() {
		return IdEnseignant;
	}
	public void setIdEnseignant(int idEnseignant) {
		IdEnseignant = idEnseignant;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getSexe() {
		return Sexe;
	}
	public void setSexe(String sexe) {
		Sexe = sexe;
	}
	public String getDateNaissance() {
		return DateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		DateNaissance = dateNaissance;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getLangue() {
		return Langue;
	}
	public void setLangue(String langue) {
		Langue = langue;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public String getClasses() {
		return Classes;
	}
	public void setClasses(String classes) {
		Classes = classes;
	}
	public String getDiplome() {
		return Diplome;
	}
	public void setDiplome(String diplome) {
		Diplome = diplome;
	}
	public String getSalaire() {
		return Salaire;
	}
	public void setSalaire(String salaire) {
		Salaire = salaire;
	}
	
	
	
	
	
}
