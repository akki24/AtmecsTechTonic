package com.atmecs.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.atmecs.dao.TechTalkDao;
import com.atmecs.pojo.TechTonicsDetails;

/**
 * Servlet implementation class InterestedEmployeesController
 */
@WebServlet("/InterestedEmployees")
public class InterestedEmployeesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession hs;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		hs=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		String email=(String) hs.getAttribute("userEmail");
		try {
			TechTalkDao dao=new TechTalkDao();
			if(dao.registerForTechtalk(email, id))
				response.sendRedirect("User.jsp");
		}
		 catch (Exception e){
			if(e instanceof Exception){
				response.sendRedirect("User.jsp");
			}
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
