package com.koreait.first.study;

public class Mei implements OverWatch{
	@Override
	public void lclick() {
		System.out.println("냉각총");
	}
	@Override
	public void shift_click() {
		System.out.println("급속 빙결");
	}
	@Override
	public void q_button() {
		System.out.println("눈보라(궁극기)");
	}
	@Override
	public void e_button() {
		System.out.println("빙벽");
	}
	public void faceMei() {
		System.out.println("안경 쓴 여자이다");
	}
}
