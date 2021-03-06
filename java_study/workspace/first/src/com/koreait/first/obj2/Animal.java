package com.koreait.first.obj2;

public class Animal {
	String name;
	int age;
	
	public Animal() {						//기본생성자 작성하지 않아도 컴파일러가 자동으로 넣어준다.
		//super();									//super()는 생략가능하다.
		this("바둑이");						//this() 요거는 생성자 호출한거다
		System.out.println("-- Animal 기본 생성자() --");
	}
	public Animal(int age) {
		this("바둑이", age);
	}
	public Animal(String name) {
		this(name, 2);
	}
	public Animal(String name, int age) {		//전역변수와 지역변수의 이름이 다른경우는 this를 안써도 상관없다.
		this.name = name;
		this.age = age;
	}
	public void crying() {
		System.out.printf("%d살의 %s가 운다.\n",age,name);
	}

}
