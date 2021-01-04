package com.koreait.first.study;

public class Reapper implements OverWatch{
	@Override
	public void lclick() {
		System.out.println("샷건을 쏜다");
	}
	@Override
	public void shift_click() {
		System.out.println("망령화");
	}
	@Override
	public void q_button() {
		System.out.println("죽음의 꽃 (궁극기)");
	}
	@Override
	public void e_button() {
		System.out.println("그림자 밟기");
	}
	public void faceReaper() {
		System.out.println("나는 유령이다");
	}
}
