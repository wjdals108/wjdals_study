package com.koreait.first.var;

public class Var4 {

	public static void main(String[] args) {
		int n1 = 10;		//10, 20, 10.1 이런 값들을 리터럴 Literal 값이라 한다.
		int n2 = 20;
		int n3 = n1 + n2;
		
		System.out.println(n3);
		
		//float f1 = 10.1;					//실수는 형번환 안하면 에러가 뜬다
		float f1a = (float)10.1;			//앞에 (float)하거나 숫자 뒤에 F 붙이면 float 형태로 형변환 시키는거다,   double은 (double) or 숫자 뒤에 D
		float f1b = 10.1F;
		double f2 = 10.1;
		
		int n4 = (int)f2;
		System.out.println(n4);
		
		//-----------------------
		
		System.out.println("---------------");
		
		int num1 = 10;
		int num2 = 3;
		
		double num3 = (double)num1 / num2;					//형변환 num1만 해주면 num2는 큰거 따라가니깐 자동으로 double형으로 형변환 된다.
		
		System.out.println(num3);
		
	}
}
