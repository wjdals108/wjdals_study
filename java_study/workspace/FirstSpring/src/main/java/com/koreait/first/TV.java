package com.koreait.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class TV {							//abstract 붙이면 객체를 만들 수 없고 상속만 해줄수있다. 추상메소드가 없는데 abstract있으면 객체화 안 시킬려고 하는거로 생각하자.
	private final int maxChannel;
	private final int maxVolume;
	
	private int currentChannel;
	private int currentVolume;
	
	@Autowired											//speaker가 unique하기만 하면 에러 안터짐
	//@Qualifier("boss")								//잘 안쓴다
	private Speaker speaker;
	
	public TV(int maxChannel, int maxVolume) {
		this.maxChannel = maxChannel; 
		this.maxVolume = maxVolume;
	}
	
	public TV(int maxChannel, int maxVolume, Speaker speaker) {
		this.maxChannel = maxChannel; 
		this.maxVolume = maxVolume;
		this.speaker = speaker;
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void volumeUp() {
		if(currentVolume < maxVolume) {
			currentVolume++;
			speaker.soundPowerUp();
		}
	}
	
	public void volumeDown() {
		if(currentVolume > 0) {
			currentVolume--;
			speaker.soundPowerDown();
		}
	}
	
	@Override
	public String toString() {
		return String.format("volume: %d", currentVolume);
	}
}
