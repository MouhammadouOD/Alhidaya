package com.alhidaya.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.alhidaya.beans.Enseignant;

public class EnseignantDAO extends DAOContext {
	
	public static void supprimerEnseignant( String idEnseignant)  throws SQLException {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			//String strSql = "SELECT * FROM T_Users WHERE pseudo='" + pseudo + "' AND password='" + mdp + "'";
			String strSql = "DELETE FROM T_Enseignants WHERE idEnseignant ='"+idEnseignant+"' ";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				statement.executeUpdate();
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
	
		}
	}
		return;
  }
	
	public static Enseignant ajouterEnseignant( String Nom, String Prenom, String Sexe, String DateNaissance, String Adresse, String Langue,
			String Tel, String Classes , String Diplome, String Salaire   ) throws SQLException {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			
			String strSql = "INSERT INTO T_Enseignants ( Nom, Prenom, Sexe, DateNaissance, Adresse, Langue, Tel, Classes, Diplome , Salaire) VALUES (?,?,?,?,?,?,?,?,?,?)";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				
				statement.setString( 1, Nom );
				statement.setString( 2, Prenom );
				statement.setString( 3, Sexe );
				statement.setString( 4, DateNaissance );
				statement.setString( 5, Adresse );
				statement.setString( 6, Langue );
				statement.setString( 7, Tel );
				statement.setString( 8, Classes );
				statement.setString( 9, Diplome );
				statement.setString( 10, Salaire );
				statement.executeUpdate();
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
	
		}
	 }
		return new Enseignant(Nom, Prenom, Sexe, DateNaissance, Adresse, Langue, Tel, Classes, Diplome , Salaire);
   }
	
	public static Vector<Enseignant> rechercherEnseignantNom(String prenom) throws SQLException{

		 Vector<Enseignant> v1=new Vector<Enseignant>();
		 
	     try ( Connection connection = DriverManager.getConnection(dbURL, dbLogin, dbPassword ) ) {
	    	 String strSql = "SELECT * FROM T_Enseignants WHERE prenom LIKE '%"+prenom+"%' ";
	    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
	    		 try ( ResultSet resultSet = statement.executeQuery() ) {
						while ( resultSet.next() ) {
							
							Enseignant enseignantTrouve = new Enseignant();
							
							enseignantTrouve.setIdEnseignant(resultSet.getInt( "IdEnseignant" ));
							enseignantTrouve.setNom(resultSet.getString( "Nom" ));
							enseignantTrouve.setPrenom(resultSet.getString( "Prenom" ));
							enseignantTrouve.setSexe(resultSet.getString( "Sexe" ));
							enseignantTrouve.setDateNaissance(resultSet.getString( "DateNaissance" ));
							enseignantTrouve.setAdresse(resultSet.getString( "Adresse" ));
							enseignantTrouve.setLangue(resultSet.getString( "Langue" ));
							enseignantTrouve.setTel(resultSet.getString( "Tel" ));
							enseignantTrouve.setClasses(resultSet.getString( "Classes" ));
							enseignantTrouve.setDiplome(resultSet.getString( "Diplome" ));
							enseignantTrouve.setSalaire(resultSet.getString( "Salaire" ));
							
							v1.addElement(enseignantTrouve);
							
						} 
						
					return v1;
	    	 }
	    	 
	     }
	    }     
	 }
	
	public static Vector<Enseignant> allEnseignants() throws SQLException{
		 Vector<Enseignant> v1=new Vector<Enseignant>();

			try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
		    	 String strSql = "SELECT * FROM T_Enseignants ";
		    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
		    		 try ( ResultSet resultSet = statement.executeQuery() ) {
							while ( resultSet.next() ) {
								Enseignant enseignantTrouve = new Enseignant();
								
								enseignantTrouve.setIdEnseignant(resultSet.getInt( "IdEnseignant" ));
								enseignantTrouve.setNom(resultSet.getString( "Nom" ));
								enseignantTrouve.setPrenom(resultSet.getString( "Prenom" ));
								enseignantTrouve.setSexe(resultSet.getString( "Sexe" ));
								enseignantTrouve.setDateNaissance(resultSet.getString( "DateNaissance" ));
								enseignantTrouve.setAdresse(resultSet.getString( "Adresse" ));
								enseignantTrouve.setLangue(resultSet.getString( "Langue" ));
								enseignantTrouve.setTel(resultSet.getString( "Tel" ));
								enseignantTrouve.setClasses(resultSet.getString( "Classes" ));
								enseignantTrouve.setDiplome(resultSet.getString( "Diplome" ));
								enseignantTrouve.setSalaire(resultSet.getString( "Salaire" ));
								
								v1.addElement(enseignantTrouve);
								
							} 
							
		    		 	}
		    	     }
	   	 	}
			return v1;
	 }
	 
	
	public static Vector<Enseignant> rechercherEnseignantClasse(String classe) throws SQLException{

		 Vector<Enseignant> v1=new Vector<Enseignant>();
		 
	     try ( Connection connection = DriverManager.getConnection(dbURL, dbLogin, dbPassword ) ) {
	    	 String strSql = "SELECT * FROM T_Enseignants WHERE classes LIKE '%"+classe+"%' ";
	    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
	    		 try ( ResultSet resultSet = statement.executeQuery() ) {
						while ( resultSet.next() ) {
							
							Enseignant enseignantTrouve = new Enseignant();
							
							enseignantTrouve.setIdEnseignant(resultSet.getInt( "IdEnseignant" ));
							enseignantTrouve.setNom(resultSet.getString( "Nom" ));
							enseignantTrouve.setPrenom(resultSet.getString( "Prenom" ));
							enseignantTrouve.setSexe(resultSet.getString( "Sexe" ));
							enseignantTrouve.setDateNaissance(resultSet.getString( "DateNaissance" ));
							enseignantTrouve.setAdresse(resultSet.getString( "Adresse" ));
							enseignantTrouve.setLangue(resultSet.getString( "Langue" ));
							enseignantTrouve.setTel(resultSet.getString( "Tel" ));
							enseignantTrouve.setClasses(resultSet.getString( "Classes" ));
							enseignantTrouve.setDiplome(resultSet.getString( "Diplome" ));
							enseignantTrouve.setSalaire(resultSet.getString( "Salaire" ));
							
							v1.addElement(enseignantTrouve);
							
						} 
						
					return v1;
	    	 }
	    	 
	     }
	    }     
	 }

}
