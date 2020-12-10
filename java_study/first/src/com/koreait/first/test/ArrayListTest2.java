package com.koreait.first.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		/*
		List list = new ArrayList();														//ArrayList는 배열로 이루어져 있다. ArrayList는 주로 읽기 위주로 하는게 유리하다 LinkedList는 노드라는 애들로 이루어져있다. LinkedList는 수정이 잦을때 쓰는게 유리하다.
		list.add(1);								//add의 파라미터는 object 타입이다.
		list.add("1");
		list.add(true);
		list.add(1.1);
		
		Object obj = 1;
		obj = "1";
		obj = true;
		obj = 1.1;
		
		list.get(3);								//1.1이 나오는데 나올때도 object 타입으로 나온다. 그래서 안좋음
		*/
		
		List<Integer> list = new ArrayList();		//위의 꺼랑 다른거는 int만 받는다는 말이다.
		list.add(1);
		
		int a = list.get(0);						//나올때도 당연히 int형으로 나온다.
		
		System.out.println("a : " + a);
		
	}

}
