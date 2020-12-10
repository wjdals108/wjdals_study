package com.koreait.first.obj;

//객체마다 값을 바꾸고 싶으면 static 붙이면 안된다.

public class StaticTest1 {

	public static void main(String[] args) {
		InstCalc ic = new InstCalc();
		ic.n1 = 22;
		ic.n2 = 55;
		
		System.out.println("ic : " + ic.sum());							//인스턴스 객체를 활용하여 계산
		
		StatCalc sc = new StatCalc();
		System.out.println("sum : " + sc.sum(22,55));
		//System.out.println("sum : " + StatCalc.sum(22,55));				//static 메소드를 활용하여 계산
	}
}

class StatCalc {
	int sum(int n1, int n2) {						//static이 없다면		16번째 줄 에러뜸
	//static int sum(int n1, int n2) {
		return n1+n2;
	}
}

class InstCalc {
	int n1;
	int n2;
	
	int sum() {
		return n1+n2;
	}
}