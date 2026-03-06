package Dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static String url = "jdbc:";
	public static String user = "";
	public static String password = "";
	public static String driver = "";
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}
	public static void main(String[] args) {
		try {
			Connection conn = getConnection();
			if(conn != null) {
				System.out.println("Connect thành công!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
