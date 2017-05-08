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
 * Servlet implementation class AddTechTalkController
 */
@WebServlet("/AddTechTalkController")
public class AddTechTalkController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpSession hs;
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		hs=request.getSession();
		
		String presentationDate=request.getParameter("presentationDate"); 
		String presentationTitle=request.getParameter("presentationTitle");
		String presentationDescription=request.getParameter("presentationDescription");
		String presenterName=request.getParameter("presenterName");
		TechTalkDao dao=null;
		
		/*TechTalkDao dao=(TechTalkDao) hs.getAttribute("dao");*/
		
		try {
		dao= new TechTalkDao();
				if(dao.addTechTalk(presentationDate, presentationTitle, presentationDescription, presenterName)){
					hs.setAttribute("techList",dao.fetchTechToniDetails());
					response.sendRedirect("AtmecsTechTalk.jsp");
				}
				else{
					hs.setAttribute("techList",dao.fetchTechToniDetails());
					response.sendRedirect("AddTechTalk.jsp");
				
				}
		} catch (Exception e) {
					e.printStackTrace();
			
			// TODO Auto-generated catch block
			}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
