package com.koreait.first.control;

public class If {

	public static void main(String[] args) {
		//분기문, 조건문
		//알고리즘 : 문제를 해결하기 위한 방법
		
		int n1 = 10;
		int n2 = 10;
		//같은지 다른지
		System.out.println("n1 == n2 : " + (n1 == n2));
		System.out.println("n1 != n2 : " + (n1 != n2));		//!는 not을 의미
		
		//큰지 작은지
		System.out.println("n1 > n2 : " + (n1 > n2));		//초과
		System.out.println("n1 >= n2 : " + (n1 >= n2));		//이상
		System.out.println("n1 < n2 : " + (n1 < n2));		//미만
		System.out.println("n1 <= n2 : " + (n1 <= n2));		//이하
		
		
		if(true) {
			System.out.println("안녕");
		}
		System.out.println("하세요");
		
	}

}
