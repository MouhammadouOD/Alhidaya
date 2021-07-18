package com.alhidaya.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alhidaya.DAO.EleveDAO;
import com.alhidaya.beans.Eleve;

/**
 * Servlet implementation class Inscrire
 */
@WebServlet(urlPatterns="/inscrire" , loadOnStartup=1)
public class Inscrire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inscrire() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/inscrire.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String dateNaiss = request.getParameter("dateNaiss");
		String adresse = request.getParameter("adresse");
		String sexe = request.getParameter("sexe");
		String nomTuteur = request.getParameter("nomTuteur");
		String telTuteur = request.getParameter("telTuteur");
		String classe = request.getParameter("classe");
		String particularite = request.getParameter("particularite");
		
		try {
			Eleve ELeveAjoute = EleveDAO.ajouterEleve( nom, prenom, sexe, dateNaiss, adresse, nomTuteur, telTuteur, classe , particularite  );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("/inscrire.jsp").forward(request, response);
		
	}

}
