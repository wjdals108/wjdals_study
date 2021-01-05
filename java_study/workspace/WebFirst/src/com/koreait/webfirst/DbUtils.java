package com.koreait.webfirst;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtils {
	/*public static void main(String[] args) {
		try {
			getCon();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	//접속성공했는지 알기위해 메인메소드 실행해봄
	public static Connection getCon() throws Exception{
		final String URL = "jdbc:mysql://localhost/javadev";
		final String USER = "root";
		final String PW = "koreait2020";
		
		Class.forName("com.mysql.cj.jdbc.Driver");//에러남 mysql라이브러리를 아파치 라이브러리에 집어넣어야 에러 안터짐
		Connection con = DriverManager.getConnection(URL,USER,PW);
		System.out.println("clear");
		return con;
	}
}
