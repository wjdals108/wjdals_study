package com.koreait.first.abst;

public abstract class AbstA {						//추상메서드가 한개라도 있으면 클래스도 abstract를 붙여줘야한다. 추상클래스는 객체화를 할 수가 없다.
	public abstract void bark();					//추상메서드
	public void print() {							//메서드의 선언부
		System.out.println("Hi I'm A");				//메서드의 구현부
	}
	
}
