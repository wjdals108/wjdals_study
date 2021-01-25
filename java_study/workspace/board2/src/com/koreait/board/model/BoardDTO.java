package com.koreait.board.model;

public class BoardDTO {
	private int startIDX;
	private int rowCountPerPage;
	
	public int getStartIDX() {
		return startIDX;
	}
	public void setStartIDX(int startIDX) {
		this.startIDX = startIDX;
	}
	public int getRowCountPerPage() {
		return rowCountPerPage;
	}
	public void setRowCountPerPage(int rowCountPerPage) {
		this.rowCountPerPage = rowCountPerPage;
	}
}
