package ch21_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AddressDAO {
	
	public int delete(String name) {
		int result=0;
		Connection con = null;
		PreparedStatement pstmt=null;
		try {
			con=DB.dbConn();
			String sql="delete from address where name=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name);
			result= pstmt.executeUpdate();
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
		}
		return result;
	}//end delete
	
	public List<AddressDTO> list(){
		List<AddressDTO> list= new ArrayList<>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DB.dbConn();
			String sql="select * from address";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				String hp=rs.getString("hp");
				String email=rs.getString("email");
				AddressDTO dto = new AddressDTO(name, addr, hp, email);
				list.add(dto);
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
		}
		return list;
	}
	
	public void insert(AddressDTO dto) {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=DB.dbConn();
			String sql="insert into address values(?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, dto.getEmail());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getAddr());
			pstmt.setString(4, dto.getHp());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
		}
	}

}
