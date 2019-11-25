package ch21_jdbc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class PropertyEx2 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			FileInputStream fis = new FileInputStream("d:\\db2.prop");
			Properties prop = new Properties();
			prop.load(fis);
			
			String driver = prop.getProperty("driver");
			String id = prop.getProperty("id");
			String password = prop.getProperty("password");
			System.out.println("driver:"+driver);
			System.out.println("id:"+id);
			System.out.println("password:"+password);
			
			prop.setProperty("dbName", "mySQL");
			FileOutputStream fos = new FileOutputStream("d:\\db2.prop");
			prop.store(fos, "propTest");
			System.out.println("저장완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
