package com.koreait.su;

public abstract class TV {							//abstract 붙이면 객체를 만들 수 없고 상속만 해줄수있다. 추상메소드가 없는데 abstract있으면 객체화 안 시킬려고 하는거로 생각하자.
	private final int maxChannel;
	private final int maxVolume;
	
	private int currentChannel;
	private int currentVolume;
	
	private Speaker speaker;					//이 BossSpeaker랑 TV는 직접적인 관계라서 수정은 어렵다
	
	public TV(int maxChannel, int maxVolume) {
		this.maxChannel = maxChannel; 
		this.maxVolume = maxVolume;
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void voluumeUp() {
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
