package com.alhidaya.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alhidaya.DAO.EnseignantDAO;
import com.alhidaya.beans.Enseignant;

/**
 * Servlet implementation class TousLesEleves
 */
@WebServlet(urlPatterns="/tousLesProfs" , loadOnStartup=1)
public class TousLesProfs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TousLesProfs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		try {
			Vector<Enseignant> tousLesProfs= EnseignantDAO.allEnseignants();
			request.setAttribute("tousLesProfs", tousLesProfs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		request.getRequestDispatcher("/tousLesProfs.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nomProfesseur = request.getParameter("nomProfesseur");
		try {
			Vector<Enseignant> enseignantTrouve = EnseignantDAO.rechercherEnseignantNom(nomProfesseur);
			request.setAttribute("tousLesProfs", enseignantTrouve);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/tousLesProfs.jsp").forward(request, response);
	}

}
