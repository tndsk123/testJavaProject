package project2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import ch21_jdbc.DB;

public class MovieDAO {
	
	public Vector list() {
		Vector items = new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select * from movie";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector rows=new Vector();
				rows.add(rs.getString("movie"));
				rows.add(rs.getString("type"));
				rows.add(rs.getDouble("grade"));
				rows.add(rs.getDate("open"));
				rows.add(rs.getString("director"));
				rows.add(rs.getInt("audience"));
				items.add(rows);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(pstmt!=null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return items;
	}
	
	public int insert(MovieDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="insert into movie values(?,?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getMovie());
			pstmt.setString(2, dto.getType());
			pstmt.setDouble(3, dto.getGrade());
			pstmt.setDate(4, dto.getOpen());
			pstmt.setString(5, dto.getDirector());
			pstmt.setInt(6, dto.getAudience());
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(pstmt!=null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	public int update(MovieDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="update movie set type=?, grade=?, open=?, director=?, audience=? where movie=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getType());
			pstmt.setDouble(2, dto.getGrade());
			pstmt.setDate(3, dto.getOpen());
			pstmt.setString(4, dto.getDirector());
			pstmt.setInt(5, dto.getAudience());
			pstmt.setString(6, dto.getMovie());
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(pstmt!=null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	public int delete(String movie) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="delete from movie where movie=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, movie);
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(pstmt!=null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	public MovieDTO view(String movie) {
		MovieDTO dto=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select * from movie where movie=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, movie);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				String type=rs.getString("type");
				double grade=rs.getDouble("grade"); 
				Date open=rs.getDate("open"); 
				String director=rs.getString("director"); 
				int audience=rs.getInt("audience");
				dto=new MovieDTO(movie, type, grade, open, director, audience);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(pstmt!=null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}

}
