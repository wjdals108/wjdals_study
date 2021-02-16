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
		p.setsIdx(p.getRowCnt() * (p.getPage() - 1));
		return mapper.selBoardList(p);
	}
	
	public int selMaxPageNum(BoardDTO p) {
		return mapper.selMaxPageNum(p);
	}
	
	/*
	public BoardDomain selBoard(BoardDTO p, HttpSession hs) {
		if(sUtils.getLoginUserPk(hs) != -1) {
			mapper.updHits(p);
		}
		return mapper.selBoard(p);
	}
	*/
	
	public BoardDomain selBoard(BoardDTO p) {
		return mapper.selBoard(p);
	}
	
	public BoardDomain selBoardWithHits(BoardDTO p, HttpSession hs) {
		if(sUtils.getLoginUser(hs) != null) {
			mapper.updHits(p);
		}
		return mapper.selBoard(p);
	}
	
	public int delBoard(BoardEntity p) {
		p.setIsDel(1);
		return updBoard(p);
	}
	
	public int updBoard(BoardEntity p) {
		return mapper.updBoard(p);
	}
}
