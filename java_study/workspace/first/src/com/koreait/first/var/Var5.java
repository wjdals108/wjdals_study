package com.koreait.first.var;

public class Var5 {

	public static void main(String[] args) {
		//오버플로우, 언더플로우
		
		//오버플로우는 범위보다 큰 값을 선언했을때 한바퀴 돌아서 그 값이 나온다
		//ex) byte 선언했는데 ~127까지 인데 128을 선언하면 한바퀴 돌아서 -128의 값이 나온다.
		//                          129 선언하면 -127
		
		//언더플로우는 반대로
		
		
		
		// 형변환할때는 오버플로우를 조심해야 한다.
		
		
		
		
		byte d1 = (byte)129;
		System.out.println(d1);
		
		byte d2 = (byte)-129;
		System.out.println(d2);
		
		long d3 = 10101010101010L;
		int d4 = (int)d3;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(d4);
		
	}

}
