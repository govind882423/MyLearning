package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DBmanager {

	private String url = "jdbc:mysql://localhost:3306/dbtest";
	private String user_id = "root";
	private String password = "govind";

	public boolean RecordsManipulation(String query) {

		boolean flag = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user_id, password);
			Statement stmt = con.createStatement();
			flag = stmt.executeUpdate(query) > 0 ? true : false;
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return flag;

	}
}