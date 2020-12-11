package com.koreait.first.obj3;

public class PolyTest2 {

	public static void main(String[] args) {

		/*
		ClassA ca = new ClassA("A", 10);
		
//		ClassB cb = (ClassB)ca; 		//실행하면 에러가 뜬다. why? 자식의 객체인 cb는 부모 ca의 주소값(ClassA)를 참조할 수 없기때문에
 * 		*/
		
		ClassB cb = new ClassB("B", 20);
		ClassA ca = cb;
		Object obj = ca;
		ca.print();
		
		ClassC cc = (ClassC)obj;		//실행하면 에러뜬다.obj가 가지고 있는 주소는(ClassB의 주소) 자식클래스타입인 ClassC 타입은 참조할 수 없다.
		
	}

}
