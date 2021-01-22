package com.koreait.first;

import org.springframework.stereotype.Component;

//@Component("apple")
public class AppleSpeaker implements Speaker{
	private int maxSoundPower;
	private int currentSoundPower;
	
	public AppleSpeaker() {
		maxSoundPower = 15;
		System.out.println("-- AppleSpeaker 생성");
	}
	
	public void soundPowerUp() {
		currentSoundPower++;
	}
	
	public void soundPowerDown() {
		currentSoundPower--;
	}
}
