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
import com.alhidaya.beans.Eleve;

/**
 * Servlet implementation class TousLesEleves
 */
@WebServlet(urlPatterns="/tousLesEleves" , loadOnStartup=1)
public class TousLesEleves extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TousLesEleves() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Vector<Eleve> tousLesEleves= EleveDAO.allEleves();
			request.setAttribute("v1", tousLesEleves);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		request.getRequestDispatcher("/tousLesEleves.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nomEleve");
		try {
			Vector<Eleve> eleveTrouve = EleveDAO.rechercherEleveNom(nom);
			request.setAttribute("v1", eleveTrouve);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/tousLesEleves.jsp").forward(request, response);
	}

}
