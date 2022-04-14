package com.zensar.training.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {

	public static void main(String[] args) {
		
		//step 1
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded .....");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		//step 2
		Connection connection=null;
		String url="jdbc:mysql://localhost:3306/TrainingDB";
		String username="root";
		String password="root";
		
		try {
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("DB Connection established");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		//step 3 (Run Queries)
		
		//String SQL="insert into TEMPLOYEES(name,doj,grade,basic_salary,gender) values('Jeya','2021-08-14','C',12000.00,'F')";
		//String SQL="update temployees set basic_salary=50000.00 where id=2";
		String SQL="delete from temployees where id=2";
		
		Statement statement=null;
		try {
			statement=connection.createStatement();
			System.out.println("Statement created");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int count;
		try {
			count = statement.executeUpdate(SQL);
			System.out.println(count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//step 4 Closing the resources
		
		try {
			statement.close();
			connection.close();
			System.out.println("Connection Closed");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
