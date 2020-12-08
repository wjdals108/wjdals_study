package com.koreait.first.obj2;

public class Animal2 {
	private String name;
	private int age;
	private int[] arr;
	
	public void setName(String name) {					//name의 setter, 이러면 장점이 이상한 값이 주입되지 않도록 막는것도 가능하다. 값을 넣어주는거니깐 굳이 return값이 필요하지 않다. 그니깐 리턴타입은 void
		this.name = name;
	}
	
	public String getName() {							//name getter, get은 외부에 주는거(빼는거) 그러니깐 return type이 있어야한다. 여기서 String인 이유는 위의 전연변수 name이 String 값이니깐
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	/*
	public Animal2() {
		
	}
	
	public Animal2(String name, int age) {				//생성자를 써도 상관이 없긴 하지만 getter/setter를 쓰면 그 메소드 안에서 막아줄 수 있는 기능을 넣어줄 수 있으니 getter/setter를 쓰는게 더 좋은방법 
		setName(name);
		setAge(age);
	}
	*/
	

	public void crying() {
		System.out.printf("%d살의 %s가 운다.\n",age,name);
	}
}
