package com.koreait.sboard;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.koreait.sboard.model.BoardEntity;

@Mapper
public interface BoardMapper {
	int insBoard(BoardEntity p);
	List<BoardEntity> selBoardList();						//interface는 public abstract가 무조건 들어가기 때문에 굳이 public 안써줘도 상관없다
	BoardEntity selBoard(BoardEntity p);
	int updBoard(BoardEntity p);
	int delBoard(BoardEntity p);
}
