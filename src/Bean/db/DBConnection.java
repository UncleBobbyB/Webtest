package Bean.db;

import java.sql.*;

public class DBConnection {
	private static final String Driver = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/product?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	private Connection conn = null;
	
	public DBConnection() throws Exception {
		try {
			Class.forName(Driver);
			this.conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Connection getConnection() {
		return this.conn;
	}
	
	public void close() throws Exception {
		if (this.conn != null) {
			try {
				this.conn.close();
			} catch (Exception e) {
				throw e;
			}
		}
	}
}
