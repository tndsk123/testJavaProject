package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import ch21_jdbc.DB;

public class ProjectDAO2 {
	
	public Vector list() {
		Vector items=new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="SELECT student_no,name,attendance,late,early,go_out,absence,floor(absence+(late+early+go_out)/3.0) sum FROM attendlist2";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector rows=new Vector();
				rows.add(rs.getString("student_no"));
				rows.add(rs.getString("name"));
				rows.add(rs.getInt("attendance"));
				rows.add(rs.getInt("late"));
				rows.add(rs.getInt("early"));
				rows.add(rs.getInt("go_out"));
				rows.add(rs.getInt("absence"));
				rows.add(rs.getInt("sum"));
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
	
	public int insert(ProjectDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="insert into attendlist2 values(?,?,?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getStudent_no());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getAttendance());
			pstmt.setInt(4, dto.getLate());
			pstmt.setInt(5, dto.getEarly());
			pstmt.setInt(6,dto.getGo_out());
			pstmt.setInt(7, dto.getAbsence());
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
		return result;
	}
	
	public int update(ProjectDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="update attendlist2 set name=?,attendance=?,late=?,early=?,go_out=?,absence=? where student_no=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAttendance());
			pstmt.setInt(3, dto.getLate());
			pstmt.setInt(4, dto.getEarly());
			pstmt.setInt(5,dto.getGo_out());
			pstmt.setInt(6, dto.getAbsence());
			pstmt.setString(7, dto.getStudent_no());
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
		return result;
	}
	
	public int delete(String student_no) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="delete from attendlist2 where student_no=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, student_no);
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
		return result;
	}
	
	public ProjectDTO view(String student_no) {
		ProjectDTO dto=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="SELECT student_no,name,attendance,late,early,go_out,absence,floor(absence+(late+early+go_out)/3.0)absence FROM attendlist2 where student_no=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, student_no);
			rs=pstmt.executeQuery();
			if(rs.next()){
				String name=rs.getString("name"); 
				int attendance=rs.getInt("attendance");
				int late=rs.getInt("late");
				int early=rs.getInt("early");
				int go_out=rs.getInt("go_out");
				int absence=rs.getInt("absence");
				dto=new ProjectDTO(student_no, name, attendance, late, early, go_out, absence);
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
	public Vector per() {
		Vector items=new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="SELECT student_no,name,attendance,floor(absence+(late+early+go_out)/3.0) SUM, ROUND(((attendance+floor(absence+(late+early+go_out)/3.0))/180)*100, 2) a, round((attendance/180)*100,2) b FROM attendlist2";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector rows=new Vector();
				rows.add(rs.getString("student_no"));
				rows.add(rs.getString("name"));
				rows.add(rs.getInt("attendance"));
				rows.add(rs.getInt("sum"));
				rows.add(rs.getFloat("a"));
				rows.add(rs.getFloat("b"));
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

}
