package com.koreait.first;

public class Mod {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 3;
		
		System.out.println(n1/n2);						//몫
		System.out.println(n1%n2);						//나머지값
		
		int n3 = 8;
		int n4 = 7;
		int n5 = 6;
		int n6 = 5;
		
		
		System.out.println(n3 % 2);
		System.out.println(n4 % 2);
		System.out.println(n5 % 2);
		System.out.println(n6 % 2);
		
														//Mod(%)는 홀,짝 구분할때 많이 쓰인다.
		
		// 1~100 짝수값만 출력해주세요
		/* 													//내가 짠 코드	(왜 이렇게 해놨지)
		for(int i=1; i<31; i++) {
			if(i%2==0 && i==30) {
				System.out.printf("%d " , i);
			}
			else if(i%2==0) {
				System.out.printf("%d, " , i);
			}
		}
		*/
		
		/*													//방법은 많다
		for(int i=2; i<31; i+=2) {
			System.out.print(i);
			
			if(i<30) {
				System.out.print(", ");
			}
			
		}
		*/
			
		
		
		for(int i=1; i<31; i++) {
			if(i==1) {
				continue;
			}
			System.out.print(i%2==0 ? i : ", ");			//삼항식
		}
		
		
		
		
	}

}
