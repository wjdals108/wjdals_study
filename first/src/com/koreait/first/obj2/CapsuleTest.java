package com.koreait.first.obj2;

public class CapsuleTest {
	public static void main(String[] args) {
		//접근지시어
		//private, default, protected, public
		
		//private : class
		//default : class, package
		//protected : class, package, 상속관계
		//public : ALL
		
		Animal2 ani2 = new Animal2();
		//ani.name = "ddddd";				Animal2 클래스에서 name을 private으로 선언했기때문에 못쓴다.
		//ani.age = 3;
		
		ani2.setName("철철이");
		ani2.setAge(10);
		ani2.crying();
		
		String ani2Name = ani2.getName();
		System.out.println(ani2Name);
		
		int getNumber = ani2.getAge();
		System.out.println("ani2의 name : "+ani2.getName());
		System.out.println("ani2의 age : "+ani2.getAge());
		System.out.println("ani2의 age : "+getNumber);
		
		//Animal2 ani3 = new Animal2("aaa", 2);
		//ani3.crying();
	}

}