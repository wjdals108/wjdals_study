package com.koreait.first;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LgTV extends TV {
	public LgTV() {
		super(20, 10);
		System.out.println("LGTV 생성");
	}
}