package com.koreait.su;

public class TvTest {
	public static void main(String[] args) {
		TV tv = Factory.makeTv(args[0]);
		tv.setSpeaker(Factory.makeSpeaker(args[1]));
		for(int i=0; i<100; i++) {
			tv.voluumeUp();
		}
		System.out.println(tv.toString());
		
		for(int i=0; i<7; i++) {
			tv.volumeDown();
		}
		System.out.println(tv.toString());
	}
}
