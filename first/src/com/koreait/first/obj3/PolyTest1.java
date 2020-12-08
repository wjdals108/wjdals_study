package com.koreait.first.obj3;

public class PolyTest1 {

	public static void main(String[] args) {
		ClassB cb = new ClassB("B", 10);
		ClassA ca = cb;			//업캐스팅(자식이 부모의 형태로)	문제가없기때문에 자동으로 형변환되는거다
		Object obj = ca;		//업캐스팅 문제없다
		
//		ca.drive();				//안됨  why? ca의 타입은 ClassA 즉 부모인데 drive()메소드는 ClassB인 자식에만 있는거니깐 ca는 자식꺼를 확인불가능
		ca.print();
		ca.ddd();
		
//		ClassA ca2 = obj;		//안된다. why?자식형태가 부모로 못가니깐 이럴때는 다운캐스팅 해줘야함
		ClassA ca2 = (ClassA)obj;
		ca2.print();
		
		
//		String str = (String)ca2; 	//당연히 안된다. String과 ClassA는 관계없다. 최고상위가 Object이긴 하지만 자바에서는 형제관계란건 없다.
		
		ClassB cb2 = (ClassB)ca2;
		cb2.drive();
		cb2.print();
		
	}
	
	float a = 10.3f;
	int b = (int)a;
	
	

}
