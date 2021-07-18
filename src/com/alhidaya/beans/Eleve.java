package com.alhidaya.beans;

public class Eleve {
	private int IdEleve;
	private String Nom;
	private String Prenom;
	private String Sexe;
	private String DateNaissance;
	private String Adresse;
	private String NomTuteur;
	private String TelTuteur;
	private String Classe;
	private String Particularite;
	
	
	public Eleve() {
		this( 1, "Niang", "Lamine", "M", "19970714", "thies", "mod", "772806246","PETITE SECTION", "DEMI-PENSIONNAT");
	}


	public Eleve(int IdEleve, String Nom, String Prenom, String Sexe, String DateNaissance, String Adresse, String NomTuteur,
			String TelTuteur, String Classe, String Particularite) {
		
		this.setIdEleve(IdEleve);
		this.setNom(Nom);
		this.setPrenom(Prenom);
		this.setSexe(Sexe);
		this.setDateNaissance(DateNaissance);
		this.setAdresse(Adresse);
		this.setNomTuteur(NomTuteur);
		this.setTelTuteur(TelTuteur);
		this.setClasse(Classe);
		this.setParticularite(Particularite);
	}


	public Eleve(String nom2, String prenom2, String sexe2, String dateNaissance2, String adresse2, String nomTuteur2,
			String telTuteur2, String classe2, String particularite2) {
		// TODO Auto-generated constructor stub
	}


	public Eleve(String idEleve2, String nom2, String prenom2, String sexe2, String dateNaissance2, String adresse2,
			String nomTuteur2, String telTuteur2, String classe2, String particularite2) {
		// TODO Auto-generated constructor stub
	}


	public int getIdEleve() {
		return IdEleve;
	}


	public void setIdEleve(int idEleve) {
		IdEleve = idEleve;
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


	public String getNomTuteur() {
		return NomTuteur;
	}


	public void setNomTuteur(String nomTuteur) {
		NomTuteur = nomTuteur;
	}


	public String getTelTuteur() {
		return TelTuteur;
	}


	public void setTelTuteur(String telTuteur) {
		TelTuteur = telTuteur;
	}


	public String getClasse() {
		return Classe;
	}


	public void setClasse(String classe) {
		Classe = classe;
	}


	public String getParticularite() {
		return Particularite;
	}


	public void setParticularite(String particularite) {
		Particularite = particularite;
	}


}
