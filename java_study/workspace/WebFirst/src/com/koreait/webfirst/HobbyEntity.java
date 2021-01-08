package com.koreait.webfirst;

//테이블이름 뒤에 주는거는 Entity, DTO, Domain 요게 있다.
//DB랑 1:1 매칭되는건 보통 Entity 쓰고
//Domain은 보통 select할 때 씀
//DTO는 파라미터랑 넘어갈때 쓰는거

//lombok 라이브러리 사용하면 set/get 안만들어도됨
public class HobbyEntity {
	private int i_hobby;
	private String nm;
	
	public int getI_hobby() {
		return i_hobby;
	}
	public void setI_hobby(int i_hobby) {
		this.i_hobby = i_hobby;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	
	
}
