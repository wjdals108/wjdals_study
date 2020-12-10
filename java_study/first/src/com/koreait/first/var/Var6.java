package com.koreait.first.var;

public class Var6 {

	public static void main(String[] args) {
		//byte > short > int > long > float > double > (String)

		byte d1 = 100;
		short d2 = d1;
		int d3 = d2;
		long d4 = d3;

		float f1 = d4;
		double f2 = f1;
		
		String s1 = f2 + "입니다";
		System.out.println(s1);
		
		System.out.println("-----------------");
		
		int n1 = 10;
		int n2 = 22;
		
		String result = "10 + 22 = " + n1 + n2;				//출력되는값이 10 + 22 = 32 가 아니라 10 + 22 = 1022
		System.out.println(result);							//앞부분인 "10+22 =" + n1 부터 하기때문에 n1이 "10"로 형변환 되버린다
		
		String result2 = "10 + 22 = " + (n1 + n2);
		System.out.println(result2);
		
		
	}

}
