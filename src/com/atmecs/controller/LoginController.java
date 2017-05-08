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
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession hs;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		hs=request.getSession();
		TechTalkDao dao;
		try {
			dao = new TechTalkDao();
			hs.setAttribute("dao", dao);
		String email=request.getParameter("email");
		System.out.println(email);
		String password=request.getParameter("password");
		hs.setAttribute("userEmail",email);
		
		if(email.equalsIgnoreCase("admin@atmecs.com")){
			if(dao.fetchAdminLoginDetails(email, password)){
				//System.out.println(dao.fetchLoginDetails(email, password));
				hs.setAttribute("techList",dao.fetchTechToniDetails());
				
				response.sendRedirect("AtmecsTechTalk.jsp");
				}
			else{
				response.sendRedirect("Login.jsp");
		
			}
		}
		else{
			if(dao.fetchLoginDetails(email, password)){
				hs.setAttribute("techList",dao.fetchTechToniDetails());
				hs.setAttribute("userEmail",email);
				System.out.println("ak");
				response.sendRedirect("User.jsp");
				
			}
			else{
				hs.setAttribute("status", "Duplicate Email Id");
				response.sendRedirect("Login.jsp");
			}
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
