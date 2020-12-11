package com.koreait.first.array;

public class Array4 {

	public static void main(String[] args) {
		int[] arr = {7, 4, 5, 1, 3};
		
		int temp = 0;
		for(int i=arr.length-1; i>0; i--) {		//버블정렬
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
}