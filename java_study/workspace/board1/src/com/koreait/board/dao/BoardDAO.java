package com.koreait.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.koreait.board.model.BoardEntity;

public class BoardDAO {
	public static void insBoard(BoardEntity vo) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "INSERT INTO t_board"
				+ " (title, ctnt)"
				+ " VALUES"
				+ " (?, ?)";
		
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setNString(1, vo.getTitle());
			ps.setNString(2, vo.getCtnt());
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(con, ps);
		}
	}
	
	public static BoardEntity selBoard(BoardEntity param) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT title, ctnt, r_dt FROM t_board WHERE i_board = ?";
		
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, param.getI_board());
			rs = ps.executeQuery();
			if(rs.next()) {
				String title = rs.getString("title");
				String ctnt = rs.getString("ctnt");
				String r_dt = rs.getString("r_dt");
				
				BoardEntity vo = new BoardEntity();
				vo.setTitle(title);
				vo.setCtnt(ctnt);
				vo.setR_dt(r_dt);
				return vo;
			}
		} catch(Exception e) {
			
		} finally {
			DbUtils.close(con, ps, rs);
		}
		
		return null;
	}
	
	public static List<BoardEntity> selBoardList(){
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<BoardEntity> list = new ArrayList();
		
		String sql = "SELECT i_board, title, r_dt FROM t_board";

		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				int i_board = rs.getInt("i_board");
				String title = rs.getString("title");
				String r_dt = rs.getString("r_dt");
				
				BoardEntity vo = new BoardEntity();
				vo.setI_board(i_board);
				vo.setTitle(title);
				vo.setR_dt(r_dt);
				list.add(vo);
			}
		} catch(Exception e) {
			
		} finally {
			DbUtils.close(con, ps, rs);
		}
		
		return list;
	}
	
	public static void updBoard(BoardEntity vo) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "UPDATE "
				+ "t_board "
				+ "SET "
				+ "title = "
				+ "?, "
				+ "ctnt = "
				+ "?"
				+ "WHERE "
				+ "i_board = "
				+ "?";
		
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getCtnt());
			ps.setInt(3, vo.getI_board());
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch(Exception e) {
			
		} finally {
			DbUtils.close(con, ps);
		}
	}
	
	public static void delBoard(BoardEntity vo) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "DELETE FROM t_board WHERE i_board = "
				+ "?";
		
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setInt(1, vo.getI_board());
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch(Exception e) {
			
		} finally {
			DbUtils.close(con, ps);
		}
	}
}