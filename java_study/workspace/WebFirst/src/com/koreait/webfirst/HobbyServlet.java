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
		//DAO.insHobby();
		//DAO.delHobby();
		List<HobbyEntity> list = DAO.selHobbyList();
		System.out.println();
		request.setAttribute("list", list);						//list를 set할건데 이름을 "list"로
		
		String jsp = "/WEB-INF/jsp/hobby.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setCharacterEncoding("UTF-8");
		
		String strI_hobby = request.getParameter("i_hobby");
		String hobby = request.getParameter("hobby");			//html에서 넘어온거는 getParameter다. getAttribute는 html에서 바로넘어왔을때 절대 쓸수없다. 그럼 언제쓰냐? setAttribute 했을때만 getAttribute를 쓸 수 있다. 나머지는 다 getParameter라고 생각하자.
		
		int i_hobby = Integer.parseInt(strI_hobby);
		System.out.println("i_hobby : " + strI_hobby);
		System.out.println("hobby : " + hobby);
		
		
		//TODO: 등록처리
		HobbyEntity param = new HobbyEntity();
		param.setI_hobby(i_hobby);
		param.setNm(hobby);
		
		int result = DAO.insHobby(param);
		System.out.println(result);
		
		/*		//내가 해본거
		if(hobby==null) {
			int delresult = DAO.delHobby(i_hobby);
			System.out.println(delresult);
		} else {
			int result = DAO.insHobby(param);
			System.out.println(result);
		}
		*/
		
		//주소로 화면 띄우기
		//response.sendRedirect("/test1");
		//여기서 dispatcher 쓰지마라 이거는 화면띄우는담당임,(똑같은코드 중복하지마라는얘기다)
		
		//같은 파일 내였다면 메소드 호출로 화면 띄우기도 가능함
		doGet(request, response);
		//response.sendRedirect("/hobby");					//물론 이걸로 해도 됨
		
	}

}
