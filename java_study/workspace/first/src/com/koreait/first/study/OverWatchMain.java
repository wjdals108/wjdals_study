package com.koreait.first.study;

import java.util.Scanner;

public class OverWatchMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("캐릭터를 선택하세요 : (1~3)");
		int character = scan.nextInt();
		
		OverWatch ow = null;
		
		switch(character) {
		case 1:
			ow = new Reapper();
			break;
		case 2:
			ow = new Mei();
			break;
		case 3:
			ow = new Maccri();
			break;
		default:
				System.out.println("잘못입력");
		}
		if(!(character>3)) {
			print(ow);
		}
	}
	
	public static void print(OverWatch ow) {
		ow.lclick();
		ow.shift_click();
		ow.q_button();
		ow.e_button();
		if(ow instanceof Reapper) {
			((Reapper) ow).faceReaper();
		} else if(ow instanceof Mei) {
			((Mei) ow).faceMei();
		} else if(ow instanceof Maccri) {
			((Maccri) ow).faceMaccri();
		}
	}
}
