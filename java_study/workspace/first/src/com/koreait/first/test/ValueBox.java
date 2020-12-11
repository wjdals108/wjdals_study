package com.koreait.first.test;

public class ValueBox {
	private int value;
	
	public ValueBox() {
	}
	
	public ValueBox(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		return value==((ValueBox)obj).getValue();
		//return value==((ValueBox)obj).value;			//이것도 됨, obj가 같은 ValueBox 형태니깐 private값 쓸 수 있다.
	}
}
