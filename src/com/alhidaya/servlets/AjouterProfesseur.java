package com.alhidaya.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alhidaya.DAO.EnseignantDAO;
import com.alhidaya.beans.Enseignant;

/**
 * Servlet implementation class AjouterProfesseur
 */
@WebServlet(urlPatterns="/ajouterProfesseur" , loadOnStartup=1)
public class AjouterProfesseur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterProfesseur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/ajouterProfesseur.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
				String nom = request.getParameter("nom");
				String prenom = request.getParameter("prenom");
				String dateNaiss = request.getParameter("dateNaiss");
				String adresse = request.getParameter("adresse");
				String sexe = request.getParameter("sexe");
				String salaire = request.getParameter("salaire");
				String tel = request.getParameter("tel");
				String[] classe = (String[]) request.getParameterValues("classes");
				String diplome = request.getParameter("diplome");
				String langue = request.getParameter("langue");
				
				String classes = "";
				
				if(classe != null) {
					for (int i = 0; i < classe.length; i++) { 
						classes = classe[i]+" "+classes;
						
					}
				}
				

				try {
					@SuppressWarnings("unused")
					Enseignant EnseignantAjoute = EnseignantDAO.ajouterEnseignant( nom, prenom, sexe, dateNaiss, adresse, langue, tel, classes , diplome, salaire );
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		request.getRequestDispatcher("/ajouterProfesseur.jsp").forward(request, response);

	}

}
