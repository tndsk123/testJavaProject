package ch21_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LolDAO {
	
	public List<LolDTO> list(){
		List<LolDTO> list = new ArrayList<>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rst=null;
		try {
			con=DB.dbConn();
			String sql="select * from lol";
			pstmt=con.prepareStatement(sql);
			rst=pstmt.executeQuery();
			while(rst.next()) {
				String champ=rst.getString("champ");
				String qs=rst.getString("qs");
				String ws=rst.getString("ws");
				String es=rst.getString("es");
				String rs=rst.getString("rs");
				LolDTO dto = new LolDTO(champ, qs, ws, es, rs);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rst!=null) rst.close();
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
	
	public void insert(LolDTO dto) {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=DB.dbConn();
			String sql="insert into lol values(?,?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, dto.getChamp());
			pstmt.setString(2, dto.getQs());
			pstmt.setString(3, dto.getWs());
			pstmt.setString(4, dto.getEs());
			pstmt.setString(5, dto.getRs());
			pstmt.executeUpdate();
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
	}
	
	public int delete(String champ) {
		int result=0;
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=DB.dbConn();
			String sql="delete from lol where champ=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, champ);
			result=pstmt.executeUpdate();
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
		return result;
	}

}
