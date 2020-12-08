package com.koreait.first.array;

import java.util.Arrays;

public class Array5_1 {

	public static void main(String[] args) {
		int[] arr = {9, 7, 4, 5, 1, 3, 0};
		
		int count = 0;
		
		int temp = 0;
		for(int i=0; i<arr.length-1; i++) {		//선택정렬
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					count++;
				}
				System.out.println(Arrays.toString(arr) + "swap 한 횟수 : " + count);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
}