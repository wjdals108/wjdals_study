package com.koreait.first.obj3;

public class ClassC extends ClassB {
	public ClassC(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void print() {
		System.out.println("C: " + getName() + "-" + getAge());
	}

}
