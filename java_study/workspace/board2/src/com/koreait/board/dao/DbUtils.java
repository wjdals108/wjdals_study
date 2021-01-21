package com.koreait.board.dao;

import java.sql.*;

public class DbUtils {
	public static Connection getCon() throws Exception {
		final String URL = "jdbc:mysql://localhost/javaboard1?serverTimezone=UTC&useUnicode=true&characterEncoding=UTF-8";
		final String USER = "root";
		final String PW = "1234";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL, USER, PW);
		System.out.println("연결성공");
		
		return con;
	}
	
	public static void close(Connection con, PreparedStatement ps) {
		if(con != null) {
			try {con.close();} catch(Exception e) {}
		}
		if(ps != null) {
			try {ps.close();} catch(Exception e) {}
		}
	}
	public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
		if(rs != null) {
			try {rs.close();} catch(Exception e) {}
		}
		close(con, ps);
	}
}
