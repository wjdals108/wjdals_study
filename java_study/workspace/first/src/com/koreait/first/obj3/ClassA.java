package com.koreait.first.obj3;

public class ClassA {
	private String name;
	private int age;
	
	
	public ClassA(String name, int age) {
		System.out.println("ClassA 생성자");
		this.name = name;
		this.age = age;
//헷갈린다	this.print(); 						//this는 무조건 자기자신, 메소드는 무조건 객체기준
		}
	
	public void ddd() {
		System.out.println("ddd");
	}
	
	public void print() {
		System.out.println("A: " + name + "," + age);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
