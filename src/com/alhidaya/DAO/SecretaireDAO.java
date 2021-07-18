package com.alhidaya.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.alhidaya.beans.Secretaire;

public class SecretaireDAO extends DAOContext{
	
	public static Secretaire isValidLogin( String login, String mdp ) {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			//String strSql = "SELECT * FROM T_Users WHERE Pseudo='" + pseudo + "' AND Mdp='" + mdp + "'";
			String strSql = "SELECT * FROM T_Secretaires WHERE Login='"+login+"' AND Mdp='"+mdp+"' ";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				try ( ResultSet resultSet = statement.executeQuery() ) {
					if ( resultSet.next() ) {
						return new Secretaire(
								resultSet.getInt( "IdSecretaire" ),
								resultSet.getString( "Nom" ),
								resultSet.getString( "Prenom" ),
								resultSet.getString( "Login" ),
								resultSet.getString( "Mdp" )
							
						);
					} else {
						return null;
					}
				}
			}
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
		}
	}
	

}
