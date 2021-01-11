package com.koreait.webfirst;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DelHobby")
public class DelHobbyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i_hobby = Integer.parseInt(request.getParameter("i_hobby"));
		
		System.out.println("i_hobby : " + i_hobby);
		
		HobbyEntity param = new HobbyEntity();
		param.setI_hobby(i_hobby);
		
		//TODO : 삭제처리
		int result = DAO.delHobby(param);
		
		response.sendRedirect("/hobby");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
