package com.zensar.training.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Main2 {

	public static void main(String[] args) {
		// step 1
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded .....");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		// step 2
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/TrainingDB";
		String username = "root";
		String password = "root";

		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("DB Connection established");
		} catch (SQLException e) {

			e.printStackTrace();
		}

		// step 3
		Statement statement = null;
		try {
			statement = connection.createStatement();
			System.out.println("statement created");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String SQL = "select * from temployees";

		ResultSet rs = null;

		try {
			rs = statement.executeQuery(SQL);
		} catch (SQLException e) {

			e.printStackTrace();
		}

		try {
			while (rs.next()) {
				System.out.print(rs.getInt(1) + ",");
				System.out.print(rs.getString(2) + ",");

				java.sql.Date doj = rs.getDate(3);
				long ms = doj.getTime();
				java.util.Date udoj = new java.util.Date(ms);

				System.out.print(udoj + ",");

				System.out.print(rs.getString(4).charAt(0) + ",");
				System.out.print(rs.getDouble(5)+",");
				System.out.println(rs.getString(6).charAt(0));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		// step 4
		try {
			statement.close();
			rs.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
