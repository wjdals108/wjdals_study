package com.koreait.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.board.dao.BoardDAO;
import com.koreait.board.model.BoardDTO;

@WebServlet("/list")
public class BoardListServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int page = Utils.getParameterInt(request, "page", 1);
		String str_rowCnt = request.getParameter("rowCnt");
		int rowCnt = 5;
		if(str_rowCnt != null) {
			rowCnt = Integer.parseInt(str_rowCnt);
		}
		
		BoardDTO param = new BoardDTO();
		param.setStartIDX(rowCnt * (page - 1));
		param.setRowCountPerPage(rowCnt);
		
		request.setAttribute("page", BoardDAO.selPageLength(param));
		request.setAttribute("list", BoardDAO.selBoardList(param));
		
		String jsp = "/WEB-INF/jsp/list.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
