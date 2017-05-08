package com.atmecs.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.atmecs.dao.TechTalkDao;

/**
 * Servlet implementation class InterestedInTeckTalkController
 */
@WebServlet("/InterestedInTechTalk")
public class InterestedInTeckTalkController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession hs;
	TechTalkDao dao=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	hs=request.getSession();
	try {
	dao=new TechTalkDao();
	
		hs.setAttribute("List", dao.interestedEmployees());
		response.sendRedirect("Interested.jsp");
	
	} catch (Exception e) {
		
	e.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
