package com.koreait.first.test;

import java.util.List;

public class ArrayListTest3 {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(1,530);
		
		System.out.println(list);
		
		System.out.println("del : " + list.remove(1));
		
		System.out.println(list.toString());
		
	}
}
