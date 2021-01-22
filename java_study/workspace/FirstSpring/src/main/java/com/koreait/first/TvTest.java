package com.koreait.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		
		//LgTV tv2 = (LgTV)ctx.getBean("lg");				//spring은 무조건 싱글톤이기때문에 같은 주소값을 가져온다.		//이거 막으려면 aplication.xml에서 scope="prototype"주면 싱글톤으로 안하고 여러개 만들 수 있음 
		//tv2.volumeUp();
		
		TV tv = (TV)ctx.getBean("lg");
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		
		TV sTv = (TV)ctx.getBean("samsung");
		sTv.volumeUp();
		sTv.volumeUp();
		System.out.println("tv : " + tv);				//그래서 위에서 주석안했으면 여기서 volume은 3이 찍힘
		System.out.println("tv : " + sTv);
	}

}
