package com.koreait.first.exception;

public class ExceptionTest3 {

	public static void main(String[] args) {
		try {
			div(10,0);
		}
		catch(ArithmeticException e) {
			System.out.println("수학적인 에러가 발생하였습니다.");
		}
		catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		}
		catch (Exception e) {													//Exception 중에 최상위이니깐 Exception 예외처리가 있는 catch문은 제일 밑에 두거나 혼자 둬야한다. 어차피 위에 놔두면 컴파일 에러가 뜬다.
			e.printStackTrace();
		}
		System.out.println("안녕");
		
	}
	public static void div(int n1, int n2) throws ArithmeticException, ClassNotFoundException {						//throws Exception 에러가 발생할 가능성이 있다고 표시를 해준다. (반드시 예외처리를 해줘야한다. try catch문)
		System.out.println(n1/n2);
	}

}
