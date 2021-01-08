package com.koreait.webfirst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbUtils {
//	public static void main(String[] args) {
//		try {
//			getCon();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	//접속성공했는지 알기위해 메인메소드 실행해봄
	public static Connection getCon() throws Exception{
		final String URL = "jdbc:mysql://localhost/javadev";
		final String USER = "root";
		final String PW = "koreait2020";
		
		Class.forName("com.mysql.cj.jdbc.Driver");//에러남 mysql라이브러리를 아파치 라이브러리에 집어넣어야 에러 안터짐
		Connection con = DriverManager.getConnection(URL,USER,PW);
		return con;
	}
	
	public static void close(Connection con, PreparedStatement ps) {
		if(ps != null) {
			try { ps.close(); } catch(Exception e) {}
		}
		if(con != null) {
			try { con.close(); } catch(Exception e) {}
		}
	}
	
	public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
		if(rs != null) {
			try { rs.close(); } catch(Exception e) {}
		}
		close(con, ps);
	}
	
}
