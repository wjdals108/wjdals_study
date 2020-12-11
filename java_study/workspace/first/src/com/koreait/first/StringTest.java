package com.koreait.first;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("안녕");
		String s2 = new String("안녕");
		String s3 = s2;
		
		System.out.println(s1 == s2);			//String은 == 비교 하면 안된다 why? 레퍼런스 변수의 ==비교는 주소값 비교이다.  대문자로 시작하는 변수는 레퍼런스변수ex)String, Scanner
		System.out.println(s2 == s3);
		
		System.out.println(s1.equals(s2));			//문자열 비교는 equal 메소드를 활용하여서 해야한다.
		System.out.println(s2.equals(s1));
		System.out.println("안녕".equals(s1));
		System.out.println("안녕".equals(s2));
		System.out.println("Hello".equals(s2));
		
		
	}

}
