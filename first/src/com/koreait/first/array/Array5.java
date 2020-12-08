package com.koreait.first.array;

public class Array5 {

	public static void main(String[] args) {
		int[] arr = {9, 7, 4, 5, 1, 3, 0};
		
		int temp = 0;
		for(int i=0; i<arr.length-1; i++) {		//선택정렬
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
}