package com.koreait.webfirst;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//DAO는 static을 써도 안써도 상관없음 안쓰면 싱글톤하는게 좋음
public class DAO {
	
	public static List<HobbyEntity> selHobbyList(){									//이름 sel은 select의미 Hobby는 테이블이름 의미 List는 여러줄 나올때
		List<HobbyEntity> list = new ArrayList();					//HobbyEntity 객체를 여러개 저장하기 위해 List를 쓰는거다	 	이 객체에는 Hobby테이블의 data값들이 저장되어 있겠찌
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;							//얘는 select때만 필요함
		
		
		
		String sql2 = "SELECT i_hobby, nm FROM t_hobby";
		
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql2);						//얘 prepareStatement 임  위의 ps랑 다르게 d 빠져있음		얘는 쿼리문을 실제로 실행하는 친구이다.
			//ps.execute();			//boolean								//얘는 안쓸꺼임
			//ps.executeUpdate();		//int가 리턴, 몇개의 줄이 영향받았는지가 나옴			- update, delete, insert때 쓴다!!!!!!!!!!!!!!!!!!!!!!!!
			//ps.executeQuery();		//ResultSet 객체가 리턴됨					- 100% select용!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			rs = ps.executeQuery();
			//rs.next();									//이거 할때마다 다음줄을 가르킨다. 처음에는 가르키는 줄이 없다고 생각하자. 근데 리턴타입은 boolean이니깐 다음타입에 값이 있으면 true 없으면 false  //그래서 while문이랑 궁합이 좋다.
			while(rs.next()) {
				int i_hobby = rs.getInt("i_hobby");
				String nm = rs.getString("nm");

				HobbyEntity vo = new HobbyEntity();
				vo.setI_hobby(i_hobby);
				vo.setNm(nm);
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(con, ps, rs);					//얘는 필수다. 반드시 써야한다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		}
		
		return list;
	}
	
	public static int insHobby(HobbyEntity param) {
		Connection con = null;							//얘를 try 안에서 안쓰고 여기서 쓰는 이유는 try문에서 선언하면 finally문에서는 못쓰기 때문에 여기서 선언하는거임
		PreparedStatement ps = null;
		
		//String sql = "INSERT INTO t_hobby (i_hobby, nm) VALUES (" + param.getI_hobby() + ", '" + param.getNm() + "')";	//예전에 Statement ps 일때는 이렇게 썼다.
		String sql = "INSERT INTO t_hobby"
				+ "(i_hobby, nm)"
				+ " VALUES "
				+ "(?, ?)";
		
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);				//prepareStatement는 쿼리문과 같이, 얘는 쿼리문을 실행해주는거임, 근데 위에서 쿼리문에서 물음표를 썼으니깐
			ps.setInt(1, param.getI_hobby());			//요렇게 물음표를 다 정해줘야한다. 1은 물음표의 순서, param.getI_hobby()는 들어갈꺼
			ps.setString(2, param.getNm());
			
			System.out.println(ps);
			return ps.executeUpdate();
			
		} catch(Exception e) {
			
		} finally {
			DbUtils.close(con, ps);
		}
		return 0;
	}
	
	public static int delHobby(HobbyEntity param) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "DELETE "
				+ "FROM t_hobby "
				+ "WHERE "
				+ "i_hobby = "
				+ "?";
		
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			
			ps.setInt(1,  param.getI_hobby());
			System.out.println(ps);
			return ps.executeUpdate();
		} catch(Exception e) {
			
		} finally {
			DbUtils.close(con, ps);
		}
		return 0;
	}
	
	public static int updHobby(HobbyEntity param) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "UPDATE "
				+ "t_hobby "
				+ "SET "
				+ "nm = "
				+ "?"
				+ "WHERE "
				+ "i_hobby = "
				+ "?";
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, param.getNm());
			ps.setInt(2, param.getI_hobby());
			return ps.executeUpdate();
		} catch(Exception e) {
			
		} finally {
			DbUtils.close(con, ps);
		}
		
		return 0;
	}

	/*
	public static void insHobby(){
		Connection con = null;
		PreparedStatement ps = null;
		
		
		String sql = "INSERT INTO t_hobby (i_hobby, nm) VALUES (8, '테스트')";
		
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			
		} catch(Exception e) {
			
		} finally {
			DbUtils.close(con, ps);
		}
	}
	*/
	
	/*
	public static void delHobby() {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "DELETE FROM t_hobby WHERE i_hobby = 8";
		
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
		} catch(Exception e) {
			
		} finally {
			DbUtils.close(con, ps);
		}
	}
	*/
}