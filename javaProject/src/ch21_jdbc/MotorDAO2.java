package ch21_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MotorDAO2 {
	
	public MotorDTO2 Search(String li_number) {
		MotorDTO2 dto=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=DB.dbConn();
			String sql="select * from motor where li_number=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, li_number);
			rs=pstmt.executeQuery();
			if(rs.next()){
				
				String company=rs.getString("company");
				int year=rs.getInt("year");
				int eff=rs.getInt("eff");
				dto=new MotorDTO2(li_number, company, year, eff);
				
			}
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
	}//finally
	return dto;		
  }//end search()
}
