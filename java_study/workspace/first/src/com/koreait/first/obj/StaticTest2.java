package com.koreait.first.obj;

public class StaticTest2 {

	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		
		tv1.country = "korea";
		tv1.brand = "Samsung";
		tv1.inch = 50;
		tv1.printMe();
		
		Tv tv2 = new Tv();
		tv2.country = "USA";
		tv2.brand = "Apple";
		tv2.inch = 40;

		Tv.country = "France";					//static이 있는 멤버변수는 이렇게 쓴다.
		
		tv2.printMe();
		tv1.printMe();
		
	}

}

class Tv {
	static String country;
	String brand;
	int inch;
	
	void printMe() {									//brand와 inch에 static이 안붙었기때문에 printMe()메소드 앞에 static을 붙일 수가 없다.
		System.out.printf("%s나라의 %s회사의 %d인치 Tv입니다.\n", country,brand,inch);
	}
	
	static String whereCountry() {
		return country;
	}
	
	static int sum(int n1, int n2) {
		return n1+n2;
	}
	
}
