package com.koreait.first.obj;

import java.util.Arrays;

public class ObjTest4 {

	public static void main(String[] args) {
		int[] arr = {4,7,1,9,3};
		
		int[] arr2 = copyArr(arr);
		int[] arr3 = arr2;										//얕은복사(주소값을 똑같이 만들어주는거)
		
		orderBy(arr2);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
	
	public static void orderBy(int[] arr) {
		Arrays.sort(arr);
	}
	
	public static int[] copyArr(int[] arr) {					//배열을 복사하는 메소드(깊은 복사)
		//int[] cArr=arr.clone();
		
		int[] cArr = new int[arr.length]; 
		
		for(int i=0; i<arr.length; i++) {
			cArr[i] = arr[i];
		}
		
		return cArr;
	}
}
