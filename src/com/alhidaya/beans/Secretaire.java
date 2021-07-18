package com.alhidaya.beans;

public class Secretaire {
	
	private int IdSecretaire ;
	private String Nom ;
	private String Prenom ;
	private String Login ;
	private String Mdp ;
	
	public Secretaire() {
		this(1,"Gaye", "Fatou" , "toto" , "passer");
	}
	
	
	public Secretaire(int IdSecretaire, String Nom, String Prenom, String Login, String Mdp) {
		// TODO Auto-generated constructor stub
		this.setIdSecretaire(IdSecretaire);
		this.setNom(Nom);
		this.setPrenom(Prenom);
		this.setLogin(Login);
		this.setMdp(Mdp);
		
	}
	
	


	public Secretaire(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}


	public int getIdSecretaire() {
		return IdSecretaire;
	}
	public void setIdSecretaire(int idSecretaire) {
		IdSecretaire = idSecretaire;
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
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getMdp() {
		return Mdp;
	}
	public void setMdp(String mdp) {
		Mdp = mdp;
	}
		

}
