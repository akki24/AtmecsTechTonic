package com.atmecs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.atmecs.dao.TechTalkDao;

/**
 * Servlet implementation class SignUpController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs=request.getSession();
	
		try {
			TechTalkDao dao=new TechTalkDao();
			hs.setAttribute("dao", dao);
			String email=request.getParameter("email");
	
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			if(dao.registerUser(email, username, password)){
				hs.setAttribute("status", "You Have SuccessFully Registered");
				response.sendRedirect("Login.jsp");
			}
			else{
				hs.setAttribute("status", "Duplicate Email Id");
				response.sendRedirect("Signup.jsp");
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
	}

}
