package com.koreait.first.loop;

public class For5_1 {

	public static void main(String[] args) {
		int star = 6;
		
		String result = "";
		
		for(int j=0; j<star; j++) {
			for(int i=0; i<star; i++) {
				result = result + "*";
			}
			result = result + "\n";
		}
						
		System.out.println(result);
	}
}