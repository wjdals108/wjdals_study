package com.koreait.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application2.xml");
		
		TV tv = (TV)ctx.getBean(LgTV.class);
		TV tv2 = (TV)ctx.getBean(LgTV.class);					//@Component로 주는방법때 싱글톤 막으려면 @Component 밑에다가 @Scope("prototype") 해주면 된다
		tv.volumeUp();
		tv.volumeUp();
		tv2.volumeUp();
		System.out.println("tv : " + tv);
	}
}
