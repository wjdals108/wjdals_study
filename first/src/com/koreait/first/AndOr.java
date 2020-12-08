package com.koreait.first;

public class AndOr {

	public static void main(String[] args) {
		boolean r1 = true && true && true;					//  && AND 연산자, AND 연산자는 전부 true 일때만 true, true 만들기가 힘들다
		System.out.println("r1: " + r1);					// &&에서는 앞쪽에 최대한 false가 생길 가능성이 높은거를 놔두면 코드 퍼포먼스가 좋아진다. (앞쪽에 false가 나오면 무조건 false이기 때문에)
		
		boolean r2 = true && true && false;
		System.out.println("r2: " + r2);
		
		boolean r3 = true || false || false;				// || OR 연산자, OR 연산자는 하나라도 true 있으면 true, false 만들기가 힘들다
		System.out.println("r3: " + r3);					// || 같은 이유로 앞쪽에 true가 생길 가능성이 높은 거를 놔두는게 좋다.
		
		boolean r4 = false || false || false;
		System.out.println("r4: " + r4);
		
	}

}
