package com.koreait.first;

public class SamsungTV extends TV{
	public SamsungTV() {
		super(10, 20);
		System.out.println("SamsungTV 생성");
	}
	
	public SamsungTV(int maxChannel, int maxVolume, Speaker speaker) {
		super(maxChannel, maxVolume, speaker);
	}
}
