package com.atmecs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.atmecs.dao.TechTalkDao;
import com.atmecs.pojo.TechTonicsDetails;

/**
 * Servlet implementation class UpdateTechTalk
 */
@WebServlet("/UpdateTechTalk")
public class UpdateTechTalk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       HttpSession hs;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		hs=request.getSession();
		try {
			TechTalkDao dao=new TechTalkDao();
			TechTonicsDetails tech=(TechTonicsDetails) hs.getAttribute("tech");
			int id=tech.getId();
			System.out.println("techid"+id);
			String presentationDate=request.getParameter("presentationDate");
			String presentationTitle=request.getParameter("presentationTitle");
			String presentationDescription=request.getParameter("presentationDescription");
			String presenterName=request.getParameter("presenterName");
			
			if(dao.updateTechTalk(id, presentationDate, presentationTitle, presentationDescription, presenterName)){
				hs.setAttribute("techList", dao.fetchTechToniDetails());
				response.sendRedirect("AtmecsTechTalk.jsp");
			}
			else{
				response.sendRedirect("UpdateTechTalk.jsp");
			}
				
			
		} catch (Exception e) {
e.printStackTrace();			}
		}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
