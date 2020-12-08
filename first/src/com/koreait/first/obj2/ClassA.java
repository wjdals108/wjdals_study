package com.koreait.first.obj2;

public class ClassA {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class ClassB extends ClassA{
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

class ClassC extends ClassB{
	
	public ClassC() {
		
	}
	
	public ClassC(String name, int age) {
		setName(name);				//this.name 은 name이 private형태이기때문에 못쓴다.
		setAge(age);
	}
	
	public void print() {
		System.out.printf("저는 %s이고, 나이는 %d살 입니다.\n", getName(), getAge());
	}	
}

class ClassD extends ClassC{
	public ClassD(String name, int age) {
		super(name, age);
	}
	@Override						//애노테이션, 밑의 메소드에서 오버라이딩을 안하게되면은 에러를 내준다. 오버라이딩을 정확히 하면은 안적어도 오버라이딩이 제대로 되는데 실수방지용으로 좋다.
	public void print() {
		System.out.printf("I'm %s, My age is %d\n", getName(), getAge());
	}
	
	public void ddd() {
		System.out.println("ddd");
	}
}
