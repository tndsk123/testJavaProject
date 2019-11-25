package ch21_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class EmpDAO {
	
	//지우기
	public int deleteEmp(int empno) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn = DB.dbConn();
			String sql="delete from emp where empno=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
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
		}//finally
		return result;
	}//end deleteEmp()
	
	//목록보기
	public Vector listEmp(){
		Vector items=new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select * from emp";
			System.out.println(sql);
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {//다음 레코드가 존재하면 true
				//결과셋.get자료형("필드명")
				Vector vc=new Vector();
				vc.add(rs.getInt("empno"));
				vc.add(rs.getString("ename"));
				vc.add(rs.getDate("hiredate"));
				vc.add(rs.getInt("sal"));
				items.add(vc);
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
		}//finally
		return items;
	}//end listEmp()
	
	//추가
	public int insertEmp(EmpDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="INSERT INTO emp(empno, ename, hiredate, sal) "
					+ " VALUES (?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getEmpno());
			pstmt.setString(2, dto.getEname());
			pstmt.setDate(3, dto.getHiredate());
			pstmt.setInt(4, dto.getSal());
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
		}//finally
		return result;
	}//end insertEmp()
	
	public int updateEmp(EmpDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="update emp set empno=?, ename=?, hiredate=?, sal=? where empno=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getEmpno());
			pstmt.setString(2, dto.getEname());
			pstmt.setDate(3, dto.getHiredate());
			pstmt.setInt(4, dto.getSal());
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
	
	public Vector searchEmp(int empno) {
		Vector items = new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select * from emp where empno=?";
			System.out.println(sql);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector vc=new Vector();
				vc.add(rs.getInt("empno"));
				vc.add(rs.getString("ename"));
				vc.add(rs.getDate("hiredate"));
				vc.add(rs.getInt("sal"));
				items.add(vc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
