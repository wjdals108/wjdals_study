package com.koreait.first.method;

public class Method2 {

	public static void main(String[] args) {
		//int r = sum(3,9);
		int r = sum(3, 9);			//이것도 가능
		
		System.out.println("r : " + r);
		System.out.println("값 : " + sum(r,7));
		
	}
	
	public static int sum(int n1, int n2) {			//return type이 void 가 아닌 int니깐 구현부에 return이 반드시 있어야한다.
		int sum = n1 + n2;
		return sum;	
	}
}