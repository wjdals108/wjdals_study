package com.koreait.first.obj3;

public class OverrideTest {

	public static void main(String[] args) {
		ClassA ca = new ClassA("A",10);
		//ca.name = "BV";			//ClassA의 전역변수 name이 private이니깐 에러
		ca.setName("A");
		ca.setAge(10);
		ca.print();
		
		ClassB cb = new ClassB("B", 20);
		cb.print();
		
		ClassC cc = new ClassC("C", 30);
		cc.print();
		
		
	}
}
