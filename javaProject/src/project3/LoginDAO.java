package project3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import ch21_jdbc.DB;
import project2.CustomerDTO;

public class LoginDAO {
	
	public Vector list() {
		Vector items=new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select * from login";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector rows=new Vector();
				rows.add(rs.getString("id"));
				rows.add(rs.getString("pwd"));
				rows.add(rs.getString("name"));
				rows.add(rs.getString("birth"));
				rows.add(rs.getString("email"));
				rows.add(rs.getString("phone"));
				rows.add(rs.getString("address"));
				items.add(rows);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return items;
	}
	
	public int insert(LoginDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="insert into login values(?,?,?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPwd());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getBirth());
			pstmt.setString(5, dto.getEmail());
			pstmt.setString(6, dto.getPhone());
			pstmt.setString(7, dto.getAddress());
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	public int delete(String id) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="delete from login where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	public int update(LoginDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="update login set pwd=?, name=?, brith=?, email=?, phone=?, address=? where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getPwd());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getBirth());
			pstmt.setString(4, dto.getEmail());
			pstmt.setString(5, dto.getPhone());
			pstmt.setString(6, dto.getAddress());
			pstmt.setString(7, dto.getId());
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
	
	public LoginDTO view(String id) {
		LoginDTO dto=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select * from login where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {			
				String pwd=rs.getString("pwd"); 
				String name=rs.getString("name");
				String birth=rs.getString("birth");
				String email=rs.getString("email");
				String phone=rs.getString("phone");
				String address=rs.getString("address"); 
			    dto = new LoginDTO(id, pwd, name, birth, email, phone, address);
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
