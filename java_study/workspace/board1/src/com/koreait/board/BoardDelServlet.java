package com.koreait.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.board.dao.BoardDAO;
import com.koreait.board.model.BoardEntity;

/**
 * Servlet implementation class BoardDelServlet
 */
@WebServlet("/del")
public class BoardDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strI_board = request.getParameter("i_board");
		int i_board = Integer.parseInt(strI_board);
		
		//TODO: DB 삭제처리
		BoardEntity param = new BoardEntity();
		param.setI_board(i_board);
		
		BoardDAO.delBoard(param);
		
		
		response.sendRedirect("/list");
		
	}


}
