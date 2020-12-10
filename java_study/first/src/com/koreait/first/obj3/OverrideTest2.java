package com.koreait.first.obj3;

public class OverrideTest2 {

	public static void main(String[] args) {
		ClassA ca = new ClassB("B", 20);				//다형성 1번
//안됨	ClassB cb = new ClassA("A", 10);				//다형성 2번
		ca.print();
		
		ClassB cb = (ClassB)ca;
		
		((ClassB)ca).drive();
		cb.drive();
		
	}
}
