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
 * Servlet implementation class fetchTechTalk
 */
@WebServlet("/fetchTechTalk")
public class fetchTechTalk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	HttpSession hs;
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		hs=request.getSession();
		
		TechTalkDao dao=null;
		try {
			dao = new TechTalkDao();
			hs.setAttribute("techList", dao.fetchTechToniDetails());
			response.sendRedirect("AtmecsTechTalk.jsp");
		} catch (Exception e) {
			
					e.printStackTrace();
			
		}
		
		
    	
    	}
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
