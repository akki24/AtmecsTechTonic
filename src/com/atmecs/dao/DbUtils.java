package com.atmecs.dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtils {

	public static Connection getConnection() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/atmecstechtalk",
				"root", "root");
	}
}
