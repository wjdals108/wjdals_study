package com.koreait.community.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koreait.community.SecurityUtils;
import com.koreait.community.model.BoardDTO;
import com.koreait.community.model.BoardDomain;
import com.koreait.community.model.BoardEntity;

@Service
public class BoardService {
	@Autowired
	private BoardMapper mapper;
	
	@Autowired
	private SecurityUtils sUtils;
	
	public int insBoard(BoardEntity p) {
		return mapper.insBoard(p);
	}
	
	public List<BoardDomain> selBoardList(BoardDTO p) {
		
		return mapper.selBoardList(p);
	}
	
	/*
	public BoardDomain selBoard(BoardDTO p, HttpSession hs) {
		if(sUtils.getLoginUserPk(hs) != -1) {
			mapper.updHits(p);
		}
		return mapper.selBoard(p);
	}
	*/
	
	public BoardDomain selBoard(BoardDTO p, HttpSession hs) {
		if(sUtils.getLoginUser(hs) != null) {
			BoardEntity p2 = new BoardEntity();
			p2.setBoardPk(p.getBoardPk());
			p2.setHits(1);
			mapper.updBoard(p2);
		}
		return mapper.selBoard(p);
	}
	
	public int updBoard(BoardEntity p) {
		p.setIsDel(1);
		return mapper.updBoard(p);
	}
}
