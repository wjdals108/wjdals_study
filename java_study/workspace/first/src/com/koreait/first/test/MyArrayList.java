package com.koreait.first.test;

public class MyArrayList {
	private int[] intArr = new int[0];
	

	public int get(int idx) {
		return intArr[idx];
	}
	
	public void add(int val) {
		int[] temp = new int[intArr.length+1];
		for(int i=0;i<intArr.length;i++) {
			temp[i] = intArr[i];
		}
		temp[intArr.length] = val;
		intArr = temp;
	}
	
	public int remove(int idx) {
		int delVal = intArr[idx];
		int[] temp = new int[intArr.length-1];
		
		for(int i=0; i<temp.length; i++) {
			if(i<idx) {
				temp[i] = intArr[i];
			}
			else {
				temp[i] = intArr[i+1];
			}
			// temp[i] = intArr[i < idx? i : i+1];
		}
		intArr = temp;
		
		return delVal;
	}
	
	public void add(int num, int val) {
		int[] temp = new int[intArr.length+1];
		
		temp[num] = val;
		for(int i=0; i<intArr.length; i++) {
			if(i<num) {
				temp[i] = intArr[i];
			}
			else {
				temp[i+1] = intArr[i];
			}
			// temp[i < num? i : i+1 ] = intArr[i];
		}
		intArr = temp;
		
		/*
		for(int i=0;i<temp.length;i++) {
			if(i>num) {
				temp[i] = intArr[i-1];
			}
			else if(i==num){
				temp[i] = val;
			}
			else {
				temp[i] = intArr[i];
			}
		}
		intArr = temp;
		*/
		
		/*
		for(int i=0;i<num;i++) {
			temp[i] = intArr[i];
		}
		temp[num] = val;
		for(int i=num+1;i<temp.length;i++) {
			temp[i] = intArr[i-1];
		}
		intArr = temp;
		*/
		
	}
	
	/*
	@Override
	public String toString() {
		String str = "[";
		for(int i=0; i<intArr.length; i++) {
			str += intArr[i];
			if(i<intArr.length-1) {
				str += ", ";
			}
			//str += intArr[i] + ( i < intArr.length-1? ", " : "" );
		}
		str += "]";
		return str;
	}
	*/
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for(int i=0; i<intArr.length; i++) {
			sb.append(intArr[i]);
			
			if(i<intArr.length-1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
}
