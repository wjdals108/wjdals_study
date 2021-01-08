package com.koreait.webfirst;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hobby")
public class HobbyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<HobbyEntity> list = DAO.selHobbyList();
		System.out.println();
		request.setAttribute("list", list);						//list를 set할건데 이름을 "list"로
		
		String jsp = "/WEB-INF/jsp/hobby.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
