package com.alhidaya.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alhidaya.DAO.EleveDAO;
import com.alhidaya.DAO.EnseignantDAO;
import com.alhidaya.beans.Eleve;
import com.alhidaya.beans.Enseignant;

/**
 * Servlet implementation class Classe
 */
@WebServlet(urlPatterns="/classe" , loadOnStartup=1)
public class Classe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Classe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String classe = request.getParameter("classe");
		try {
			@SuppressWarnings("unused")
			Vector<Enseignant> professeurs = EnseignantDAO.rechercherEnseignantClasse(classe);
			Vector<Eleve> eleves = EleveDAO.rechercherEleveClasse(classe);
			
			request.setAttribute("classe", classe);
			request.setAttribute("v1", eleves);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			request.getRequestDispatcher("/classe.jsp").forward(request , response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/classe.jsp").forward(request , response);
	}

}
