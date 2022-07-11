package com.simplilearn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private String url = "jdbc:mysql://localhost:3306/Business";
	private String userId = "root";
	private String password = "Linda@1995";
	
	private Connection connection;
	
	public DBConnection() {

		try {
			// Step 1: Register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Step 2: Get Connection Object
			this.connection = DriverManager.getConnection(url, userId, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public Connection getConnection() {
		return this.connection;
	}
}
