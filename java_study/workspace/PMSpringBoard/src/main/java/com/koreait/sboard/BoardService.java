package com.koreait.sboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koreait.sboard.model.BoardEntity;

@Service
public class BoardService {
	
	@Autowired									//자동으로 연결시켜주는거 뭐를? bean등록한 애 중에 밑에꺼 BoardMapper 타입이 가르킬수있는 객체가 있다면 주소값을 자동으로 연결하는거
	private BoardMapper mapper;
	
	public int insBoard(BoardEntity p) {
		return mapper.insBoard(p);
	}
	
	public List<BoardEntity> selBoardList() {
		return mapper.selBoardList();						//logic들은 다 여기서 넣어주자. controller는 controller일만 하도록
	}
	
	public BoardEntity selBoard(BoardEntity p) {
		return mapper.selBoard(p);
	}
	
	public int updBoard(BoardEntity p) {
		return mapper.updBoard(p);
	}
	
	public int delBoard(BoardEntity p) {
		return mapper.delBoard(p);
	}
}
