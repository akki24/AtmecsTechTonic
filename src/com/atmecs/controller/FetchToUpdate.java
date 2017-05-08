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
 * Servlet implementation class FetchToUpdate
 */
@WebServlet(name = "FetchTechTalkToUpdate", urlPatterns = { "/FetchTechTalkToUpdate" })
public class FetchToUpdate extends HttpServlet {
	HttpSession hs;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		hs=request.getSession();
		TechTalkDao dao=null;
		try {
			dao=new TechTalkDao();
			int id=Integer.parseInt(request.getParameter("id"));
			 
			 
				hs.setAttribute("tech",dao.fetchTechTalkToUpdate(id));
				response.sendRedirect("UpdateTechTalk.jsp");
			 
			
		} catch (Exception e) {
					e.printStackTrace();
			
		}
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
