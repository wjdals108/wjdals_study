package com.koreait.first.obj3;

public class ClassB extends ClassA{
	public ClassB(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void print() {
		//super.print();				//부모의 print()메소드도 가지고와서 출려 가능
		System.out.println("B: " + getName() + "/" + getAge());
	}
	
	public void drive() {
		System.out.println("driving!!");
	}
	
	

}
