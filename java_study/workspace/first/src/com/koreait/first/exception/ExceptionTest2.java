package com.koreait.first.exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		div(10,0);
	}
	
	public static int div(int n1, int n2) {
		try {
			return n1 / n2;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("완료!");							// 무조건 실행된다. 19번째 줄이랑 다른점 확인해보기
		}
		System.out.println("--종료--");							//try에서 에러가 안터졌으면 실행되지 않는다.
		return 0;
	}

}
