package fr.diginamic.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/lire")
public class DeuxiemeServlet extends HttpServlet {

	/** serialVersionUID : long */
	private static final long serialVersionUID = -6135644072220311816L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(true);
		String attribute = (String) session.getAttribute("parfum");
		resp.getWriter().write("<p>" + attribute + "</p>");

	}

}
