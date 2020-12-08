package com.koreait.first.obj;

public class ObjTest {												//파일명과 같은 class 앞에만 public을 붙일 수 있다.

	public static void main(String[] args) {
		int mNum = 10;
		
		NumberBox nbx = new NumberBox();					//레퍼런스 변수는 무조건 주소값을 저장
		nbx.num = 10;
		nbx.str = "Hello";
		
		changeVal(mNum);
		changeVal(nbx);
		
		System.out.println("mNum : " + mNum);
		System.out.println("nbx.num : " + nbx.num);
		System.out.println("nbx.str: " + nbx.str);
		
	}
	
	public static void changeVal(int num) {				//라인12을 보면 10인 mNum 값을 받아오기는하지만 복사해서 가져오는것이기 때문에 mNum과 num은 다른 변수이다. 그러므로 num의 값을 변경해도 mNum의 값은 바뀌지 않는다.
		num = 20;
	}
	
	public static void changeVal(NumberBox pNbx) {		//라인 13를 보면 nbx의 주소를 받아오는것이다. nbx의 주소를 받아와서 그 주소의 .num값을 바꾸는 거니깐 그 주소에 있는 .num값은 변하게 된다. 그러므로 nbx.num의 값도 바뀌는것이다. 
		pNbx.num = 20;
		pNbx.str = "ddd";
	}
}

class NumberBox{
	int num;
	String str;
}