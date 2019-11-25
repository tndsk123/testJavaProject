package project3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import ch21_jdbc.DB;
import project2.CustomerDTO;

public class InvenDAO {
	
	public Vector list() {
		Vector items = new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select * from inventory";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector rows=new Vector();
				rows.add(rs.getString("product"));
				rows.add(rs.getString("name"));
				rows.add(rs.getString("size"));
				rows.add(rs.getString("company"));
				rows.add(rs.getString("made"));
				rows.add(rs.getString("date"));
				rows.add(rs.getInt("price"));
				rows.add(rs.getInt("amount"));
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
	
	public int insert(InvenDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="insert into inventory values(?,?,?,?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getProduct());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getSize());
			pstmt.setString(4, dto.getCompany());
			pstmt.setString(5, dto.getMade());
			pstmt.setString(6, dto.getDate());
			pstmt.setInt(7, dto.getPrice());
			pstmt.setInt(8, dto.getAmount());
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
	
	public int update(InvenDTO dto) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="update inventory set product=?, size=?, company=?, made=?, date=?, price=?, amount=? where name=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getProduct());
			pstmt.setString(2, dto.getSize());
			pstmt.setString(3, dto.getCompany());
			pstmt.setString(4, dto.getMade());
			pstmt.setString(5, dto.getDate());
			pstmt.setInt(6, dto.getPrice());
			pstmt.setInt(7, dto.getAmount());
			pstmt.setString(8, dto.getName());
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
	
	public int delete(String name) {
		int result=0;
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=DB.dbConn();
			String sql="delete from inventory where name=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
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
	
	public InvenDTO A(String name) {
		InvenDTO dto=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select * from inventory where name=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				String product=rs.getString("product");
				String size=rs.getString("size");
				String company=rs.getString("company");
				String made=rs.getString("made");
				String date=rs.getString("date");
				int price=rs.getInt("price");
				int amount=rs.getInt("amount");
				dto=new InvenDTO(product, name, size, company, made, date, price, amount);
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
	public Vector view() {
		Vector items = new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select * from inventory where product='Outer'";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector rows=new Vector();
				rows.add(rs.getString("product"));
				rows.add(rs.getString("name"));
				rows.add(rs.getString("size"));
				rows.add(rs.getString("company"));
				rows.add(rs.getString("made"));
				rows.add(rs.getString("date"));
				rows.add(rs.getInt("price"));
				rows.add(rs.getInt("amount"));
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
	public Vector view2() {
		Vector items = new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select * from inventory where product='Top'";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector rows=new Vector();
				rows.add(rs.getString("product"));
				rows.add(rs.getString("name"));
				rows.add(rs.getString("size"));
				rows.add(rs.getString("company"));
				rows.add(rs.getString("made"));
				rows.add(rs.getString("date"));
				rows.add(rs.getInt("price"));
				rows.add(rs.getInt("amount"));
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
	public Vector view3() {
		Vector items = new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select * from inventory where product='Bottom'";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector rows=new Vector();
				rows.add(rs.getString("product"));
				rows.add(rs.getString("name"));
				rows.add(rs.getString("size"));
				rows.add(rs.getString("company"));
				rows.add(rs.getString("made"));
				rows.add(rs.getString("date"));
				rows.add(rs.getInt("price"));
				rows.add(rs.getInt("amount"));
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
	public Vector view4() {
		Vector items = new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select * from inventory where product='Shoes'";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector rows=new Vector();
				rows.add(rs.getString("product"));
				rows.add(rs.getString("name"));
				rows.add(rs.getString("size"));
				rows.add(rs.getString("company"));
				rows.add(rs.getString("made"));
				rows.add(rs.getString("date"));
				rows.add(rs.getInt("price"));
				rows.add(rs.getInt("amount"));
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
	public Vector view5() {
		Vector items = new Vector();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DB.dbConn();
			String sql="select * from inventory where product='Accessory'";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Vector rows=new Vector();
				rows.add(rs.getString("product"));
				rows.add(rs.getString("name"));
				rows.add(rs.getString("size"));
				rows.add(rs.getString("company"));
				rows.add(rs.getString("made"));
				rows.add(rs.getString("date"));
				rows.add(rs.getInt("price"));
				rows.add(rs.getInt("amount"));
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
