package ch21_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MotorDAO3 {
	
	public int insert(MotorDTO dto) {
		int result=0;
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=DB.dbConn();
			String sql="insert into motor values(?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, dto.getLi_number());
			pstmt.setString(2, dto.getCompany());
			pstmt.setInt(3, dto.getYear());
			pstmt.setInt(4, dto.getEff());
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
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}//finally
		return result;
	}
	
	public int delete(String li_number) {
		int result=0;
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=DB.dbConn();
			String sql="delete from motor where li_number=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, li_number);
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
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}//finally
		return result;
	}
	public int update(MotorDTO dto) {
		int result=0;
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=DB.dbConn();
			String sql="update motor set li_number=?, company=?, year=?, eff=? where li_number=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, dto.getLi_number());
			pstmt.setString(2, dto.getCompany());
			pstmt.setInt(3, dto.getYear());
			pstmt.setInt(4, dto.getEff());
			pstmt.setString(5, dto.getLi_number());
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
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}//finally
		return result;
	}
	public Vector search(String li_number) {
		Vector items = new Vector();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DB.dbConn();
			String sql="select * from motor where li_number like ?";
			System.out.println(sql);
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, "%"+li_number+"%");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector row = new Vector();
				row.add(rs.getString("li_number"));
				row.add(rs.getString("company"));
				row.add(rs.getInt("year"));
				row.add(rs.getInt("eff"));
				items.add(row);
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
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}//finally
		return items;
	}
	public Vector list() {
		Vector items = new Vector();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DB.dbConn();
			String sql = "select * from motor";
			System.out.println(sql);
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector row = new Vector();
				row.add(rs.getString("li_number"));
				row.add(rs.getString("company"));
				row.add(rs.getInt("year"));
				row.add(rs.getInt("eff"));
				items.add(row);
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
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}//finally
		return items;
	}
}
