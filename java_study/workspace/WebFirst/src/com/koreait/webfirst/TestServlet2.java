package com.koreait.webfirst;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet2
 */
@WebServlet("/test2")
public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    /*public TestServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String msg = request.getParameter("msg"); //get방식은 자동으로 utf-8로 적용됨을 보여주는것
		//System.out.println(msg);
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("get method");
		String jsp = "WEB-INF/jsp/test2.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setCharacterEncoding("UTF-8"); //web.xml에서 적용시키면 안적어도 적용
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("post method");
		//response.getWriter().append("hi");//그냥 화면에 hi찍기
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		String msg = request.getParameter("msg");
		System.out.println("msg = " + msg); //post에서도 get방식으로 가져올수 있음 test2의 action을 쿼리문으로 작성하면가능함
		System.out.println(title);
		System.out.println(ctnt);
		
		response.sendRedirect("/test1");
	}

}
