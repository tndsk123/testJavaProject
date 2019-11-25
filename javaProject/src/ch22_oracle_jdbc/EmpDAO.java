package ch22_oracle_jdbc;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class EmpDAO {

		public int insert(EmpDTO dto) {
			int result = 0;
			Connection conn=null;
			PreparedStatement pstmt=null;
			try {
				conn=DB.dbConn();
				String sql="insert into emp values (?,?,?,?)";
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, dto.getEmpno());
				pstmt.setString(2, dto.getEname());
				pstmt.setDate(3, dto.getHiredate());
				pstmt.setInt(4, dto.getSal());
				result = pstmt.executeUpdate();
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
		
		public int update(EmpDTO dto) {
			int result = 0;
			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				conn = DB.dbConn();
				String sql = "update emp set ename=?, hiredate=?, sal=? where empno=?";
				pstmt = conn.prepareStatement(sql);				
				pstmt.setString(1, dto.getEname());
				pstmt.setDate(2, dto.getHiredate());
				pstmt.setInt(3, dto.getSal());
				pstmt.setInt(4, dto.getEmpno());
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
		
		public int delete(String ename) {
			int result=0;
			Connection conn=null;
			PreparedStatement pstmt=null;
			try {
				conn = DB.dbConn();
				String sql="delete from emp where ename=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, ename);
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
		
		public Vector search(String ename) {
			Vector items = new Vector();
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				conn=DB.dbConn();
				String sql = "select empno,ename,hiredate,sal from emp where ename like ?";
				System.out.println(sql);
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "%"+ename+"%");
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Vector row = new Vector();
					row.add(rs.getInt("empno"));
					row.add(rs.getString("ename"));
					row.add(rs.getDate("hiredate"));
					row.add(rs.getInt("sal"));
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
					if(conn!=null) conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			return items;
		}
		
		public Vector list() {
			Vector items = new Vector();
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				conn = DB.dbConn();
				String sql = "select * from emp";
				System.out.println(sql);
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Vector row = new Vector();
					row.add(rs.getInt("empno"));
					row.add(rs.getString("ename"));
					row.add(rs.getDate("hiredate"));
					row.add(rs.getInt("sal"));
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
					if(conn!=null) conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			return items;
		}
		public EmpDTO viewEmp(String ename) {
			EmpDTO dto=null;
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			try {
				conn=DB.oraConn();
				StringBuilder sb=new StringBuilder();
				sb.append("select * from emp where ename=?");
				pstmt=conn.prepareStatement(sb.toString());
				pstmt.setString(1, ename);
				rs = pstmt.executeQuery();
				if(rs.next()) {//레코드가 한개이기 때문에 if문만 씀
					int empno = rs.getInt("empno");
					Date hiredate=rs.getDate("hiredate");				
					int sal=rs.getInt("sal");
					dto=new EmpDTO(empno, ename, hiredate, sal);
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
			return dto;
		}//viewScore()
}
