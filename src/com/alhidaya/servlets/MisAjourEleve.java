package com.alhidaya.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.alhidaya.DAO.EleveDAO;
import com.alhidaya.beans.Eleve;

/**
 * Servlet implementation class MisAjourEleve
 */
@WebServlet(urlPatterns="/misAjourEleve" , loadOnStartup=1)
public class MisAjourEleve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MisAjourEleve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idEleve = request.getParameter("idEleve");
		HttpSession session = request.getSession(true);
		session.setAttribute( "idEleve", idEleve );
		Eleve eleveTrouve = new Eleve();
		
		try {
			eleveTrouve = EleveDAO.rechercherEleveId(idEleve);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String nom = eleveTrouve.getNom();
		String prenom = eleveTrouve.getPrenom();
		String dateNaiss = eleveTrouve.getDateNaissance();
		String adresse = eleveTrouve.getAdresse();
		String sexe = eleveTrouve.getSexe();
		String nomTuteur = eleveTrouve.getNomTuteur();
		String telTuteur = eleveTrouve.getTelTuteur();
		String classe = eleveTrouve.getClasse();
		String particularite = eleveTrouve.getParticularite();
		
		request.setAttribute("idEleve", idEleve);
		request.setAttribute("nom", nom);
		request.setAttribute("prenom", prenom);
		request.setAttribute("dateNaiss", dateNaiss);
		request.setAttribute("adresse", adresse);
		request.setAttribute("sexe", sexe);
		request.setAttribute("nomTuteur", nomTuteur);
		request.setAttribute("telTuteur", telTuteur);
		request.setAttribute("classe", classe);
		request.setAttribute("particularite", particularite);
		
		
		request.getRequestDispatcher("/misAjourEleve.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String idEleve = (String) session.getAttribute("idEleve");
		
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
			@SuppressWarnings("unused")
			Eleve eleveTrouve = EleveDAO.misAjourEleve(idEleve, nom, prenom, sexe, dateNaiss, adresse, nomTuteur, telTuteur, classe , particularite  );
			//EleveDAO.supprimerEleve(idEleve);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("/tousLesEleves").forward(request, response);
	}

}
