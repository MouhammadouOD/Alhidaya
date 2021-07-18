package com.alhidaya.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.alhidaya.DAO.DAOContext;
import com.alhidaya.beans.Eleve;

public class EleveDAO extends DAOContext{
	
	public static EleveDAO supprimerEleve( String idEleve)  throws SQLException {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			//String strSql = "SELECT * FROM T_Users WHERE pseudo='" + pseudo + "' AND password='" + mdp + "'";
			String strSql = "DELETE FROM T_Eleves WHERE idEleve ='"+idEleve+"' ";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				statement.executeUpdate();
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
	
		}
	}
		return null;
  }
	
	public static Eleve ajouterEleve( String Nom, String Prenom, String Sexe, String DateNaissance, String Adresse, String NomTuteur,
			String TelTuteur, String Classe , String Particularite  ) throws SQLException {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			//String strSql = "SELECT * FROM T_Users WHERE pseudo='" + pseudo + "' AND password='" + mdp + "'";
			String strSql = "INSERT INTO T_Eleves ( Nom, Prenom, Sexe, DateNaissance, Adresse, NomTuteur, TelTuteur, Classe, Particularite) VALUES (?,?,?,?,?,?,?,?,?)";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				
				statement.setString( 1, Nom );
				statement.setString( 2, Prenom );
				statement.setString( 3, Sexe );
				statement.setString( 4, DateNaissance );
				statement.setString( 5, Adresse );
				statement.setString( 6, NomTuteur );
				statement.setString( 7, TelTuteur );
				statement.setString( 8, Classe );
				statement.setString( 9, Particularite );
				statement.executeUpdate();
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
	
		}
	 }
		return new Eleve(Nom, Prenom, Sexe, DateNaissance, Adresse, NomTuteur, TelTuteur, Classe , Particularite);
   }
	
	public static Eleve misAjourEleve(String idELeve, String Nom, String Prenom, String Sexe, String DateNaissance, String Adresse, String NomTuteur,
			String TelTuteur, String Classe , String Particularite  ) throws SQLException {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			//String strSql = "SELECT * FROM T_Users WHERE pseudo='" + pseudo + "' AND password='" + mdp + "'";
			String strSql = "UPDATE T_Eleves SET Nom ='"+Nom+"', Prenom ='"+Prenom+"', Sexe='"+Sexe+"', DateNaissance = '"+DateNaissance+"', Adresse ='"+Adresse+"', NomTuteur = '"+NomTuteur+"', TelTuteur = '"+TelTuteur+"', Classe = '"+Classe+"', Particularite = '"+Particularite+"' WHERE IdEleve='"+idELeve+"'";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				
				statement.executeUpdate();
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
	
		}
	 }
		return null ;
   }
	
	public static Eleve rechercherEleveId(String idEleve) throws SQLException{

		 Eleve eleveTrouve=new Eleve();
		 
	     try ( Connection connection = DriverManager.getConnection(dbURL, dbLogin, dbPassword ) ) {
	    	 String strSql = "SELECT * FROM T_Eleves WHERE idEleve ='"+idEleve+"' ";
	    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
	    		 try ( ResultSet resultSet = statement.executeQuery() ) {
						
							
							
							
							eleveTrouve.setIdEleve(resultSet.getInt( "IdEleve" ));
							eleveTrouve.setNom(resultSet.getString( "Nom" ));
							eleveTrouve.setPrenom(resultSet.getString( "Prenom" ));
							eleveTrouve.setSexe(resultSet.getString( "Sexe" ));
							eleveTrouve.setDateNaissance(resultSet.getString( "DateNaissance" ));
							eleveTrouve.setAdresse(resultSet.getString( "Adresse" ));
							eleveTrouve.setNomTuteur(resultSet.getString( "NomTuteur" ));
							eleveTrouve.setTelTuteur(resultSet.getString( "TelTuteur" ));
							eleveTrouve.setClasse(resultSet.getString( "Classe" ));
							eleveTrouve.setParticularite(resultSet.getString( "Particularite" ));
							
							
						
					return eleveTrouve;
	    	 }
	    	 
	     }
	    }     
	 }
	
	
	
	public static Vector<Eleve> rechercherEleveNom(String prenom) throws SQLException{

		 Vector<Eleve> v1=new Vector<Eleve>();
		 
	     try ( Connection connection = DriverManager.getConnection(dbURL, dbLogin, dbPassword ) ) {
	    	 String strSql = "SELECT * FROM T_Eleves WHERE prenom LIKE'%"+prenom+"%' ";
	    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
	    		 try ( ResultSet resultSet = statement.executeQuery() ) {
						while ( resultSet.next() ) {
							
							Eleve eleveTrouve = new Eleve();
							
							eleveTrouve.setIdEleve(resultSet.getInt( "IdEleve" ));
							eleveTrouve.setNom(resultSet.getString( "Nom" ));
							eleveTrouve.setPrenom(resultSet.getString( "Prenom" ));
							eleveTrouve.setSexe(resultSet.getString( "Sexe" ));
							eleveTrouve.setDateNaissance(resultSet.getString( "DateNaissance" ));
							eleveTrouve.setAdresse(resultSet.getString( "Adresse" ));
							eleveTrouve.setNomTuteur(resultSet.getString( "NomTuteur" ));
							eleveTrouve.setTelTuteur(resultSet.getString( "TelTuteur" ));
							eleveTrouve.setClasse(resultSet.getString( "Classe" ));
							eleveTrouve.setParticularite(resultSet.getString( "Particularite" ));
							
							v1.addElement(eleveTrouve);
							
						} 
						
					return v1;
	    	 }
	    	 
	     }
	    }     
	 }
	
	public static Vector<Eleve> allEleves() throws SQLException{
		 Vector<Eleve> v1=new Vector<Eleve>();

			try ( Connection connection = DriverManager.getConnection( DAOContext.dbURL, DAOContext.dbLogin, DAOContext.dbPassword ) ) {
		    	 String strSql = "SELECT * FROM T_Eleves ";
		    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
		    		 try ( ResultSet resultSet = statement.executeQuery() ) {
							while ( resultSet.next() ) {
								Eleve eleveTrouve = new Eleve();
								
								eleveTrouve.setIdEleve(resultSet.getInt( "IdEleve" ));
								eleveTrouve.setNom(resultSet.getString( "Nom" ));
								eleveTrouve.setPrenom(resultSet.getString( "Prenom" ));
								eleveTrouve.setSexe(resultSet.getString( "Sexe" ));
								eleveTrouve.setDateNaissance(resultSet.getString( "DateNaissance" ));
								eleveTrouve.setAdresse(resultSet.getString( "Adresse" ));
								eleveTrouve.setNomTuteur(resultSet.getString( "NomTuteur" ));
								eleveTrouve.setTelTuteur(resultSet.getString( "TelTuteur" ));
								eleveTrouve.setClasse(resultSet.getString( "Classe" ));
								eleveTrouve.setParticularite(resultSet.getString( "Particularite" ));
								
								v1.addElement(eleveTrouve);
								
							} 
							
		    		 	}
		    	     }
	   	 	}
			return v1;
	 }
	 
	
	public static Vector<Eleve> rechercherEleveClasse(String classe) throws SQLException{

		 Vector<Eleve> v1=new Vector<Eleve>();
		 
	     try ( Connection connection = DriverManager.getConnection(dbURL, dbLogin, dbPassword ) ) {
	    	 String strSql = "SELECT * FROM T_Eleves WHERE classe ='"+classe+"'";
	    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
	    		 try ( ResultSet resultSet = statement.executeQuery() ) {
						while ( resultSet.next() ) {
							
							Eleve eleveTrouve = new Eleve();
							
							eleveTrouve.setIdEleve(resultSet.getInt( "IdEleve" ));
							eleveTrouve.setNom(resultSet.getString( "Nom" ));
							eleveTrouve.setPrenom(resultSet.getString( "Prenom" ));
							eleveTrouve.setSexe(resultSet.getString( "Sexe" ));
							eleveTrouve.setDateNaissance(resultSet.getString( "DateNaissance" ));
							eleveTrouve.setAdresse(resultSet.getString( "Adresse" ));
							eleveTrouve.setNomTuteur(resultSet.getString( "NomTuteur" ));
							eleveTrouve.setTelTuteur(resultSet.getString( "TelTuteur" ));
							eleveTrouve.setClasse(resultSet.getString( "Classe" ));
							eleveTrouve.setParticularite(resultSet.getString( "Particularite" ));
							
							v1.addElement(eleveTrouve);
							
						} 
						
					return v1;
	    	 }
	    	 
	     }
	    }     
	 }
	
	
	
}
