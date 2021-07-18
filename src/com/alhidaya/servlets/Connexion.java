package com.alhidaya.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alhidaya.DAO.DAOContext;
import com.alhidaya.DAO.SecretaireDAO;
import com.alhidaya.beans.Secretaire;

/**
 * Servlet implementation class Connexion
 */
@WebServlet(urlPatterns="/connexion" , loadOnStartup=1)
public class Connexion extends HttpServlet {
private static final long serialVersionUID = -1204635336479052777L;
	
	@Override
	public void init() throws ServletException {
		DAOContext.init( this.getServletContext() );
	}
      
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("login", "");
		request.setAttribute("mdp", "");
		request.setAttribute("errorMessage", "");
		
		request.getRequestDispatcher("/connexion.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter( "login" );
		String mdp = request.getParameter( "mdp" );
		
		request.setAttribute( "login", login );
		request.setAttribute( "mdp", mdp );
		
		Secretaire connectedUser = SecretaireDAO.isValidLogin( login, mdp );
		if ( connectedUser != null ) {
			
			HttpSession session = request.getSession( true );
			session.setAttribute( "connectedUser", connectedUser );
			
			
			
			String pageRedirige = "/Ahidaya/accueil";
			
			request.setAttribute( "pageRedirige", pageRedirige);
			
			//request.getRequestDispatcher( pageRedirige ).forward( request, response );
			response.sendRedirect(pageRedirige);
		
		} else {
		
			request.setAttribute( "errorMessage", "Bad identity" );			
			request.getRequestDispatcher( "/connexion.jsp" ).forward( request, response );
			
		}
		
	}
	}


