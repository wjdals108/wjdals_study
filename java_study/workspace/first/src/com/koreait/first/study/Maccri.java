package com.koreait.first.study;

public class Maccri implements OverWatch{
	@Override
	public void lclick() {
		System.out.println("피스키퍼");
	}
	@Override
	public void shift_click() {
		System.out.println("구르기");
	}
	@Override
	public void q_button() {
		System.out.println("황야의 무법자 (궁극기)");
	}
	@Override
	public void e_button() {
		System.out.println("섬광탄");
	}
	public void faceMaccri() {
		System.out.println("사막에서 총쏘는 듯하게 생겼다");
	}
}
