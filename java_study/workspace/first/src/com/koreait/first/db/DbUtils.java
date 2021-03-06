package com.koreait.first.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
	public static Connection getCon() {
		Connection con = null;
		
		final String URL = "jdbc:mysql://localhost:3306/test";		//3306은 포트번호, test는 DB이름
		final String USER = "root";
		final String PW = "koreait2020";
		
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");				//없어도 연결가능하다.
			con = DriverManager.getConnection(URL, USER, PW);
			System.out.println("접속 완료!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void close(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
