package com.koreait.first;

import org.springframework.stereotype.Component;

//@Component("boss")
public class BossSpeaker implements Speaker{
	private int maxSoundPower;
	private int currentSoundPower;
	
	public BossSpeaker() {
		maxSoundPower = 10;
		System.out.println("-- BossSpeaker 생성");
	}
	
	public void soundPowerUp() {
		currentSoundPower++;
	}
	
	public void soundPowerDown() {
		currentSoundPower--;
	}
}
