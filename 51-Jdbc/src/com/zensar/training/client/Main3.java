package com.zensar.training.client;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main3 {

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
		
	
		
		String name;
		LocalDate doj;
		char grade;
		double basic;
		char gender;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter name : ");
		name=scanner.next();
		
		System.out.print("Enter DOJ dd-MMM-yyyy : ");
		String temp=scanner.next();
		doj=LocalDate.parse(temp, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
		
		System.out.print("Enter Grade ");
		grade=scanner.next().charAt(0);
		
		System.out.print("Enter Basic : ");
		basic=scanner.nextDouble();
		
		System.out.print("Enter Gender M-Male F-Female : ");
		gender=scanner.next().charAt(0);
		
		String SQL="insert into TEMPLOYEES(name,doj,grade,basic_salary,gender) values(?,?,?,?,?)";
		
		PreparedStatement statement=null;
		
		try {
			statement=connection.prepareStatement(SQL);
			System.out.println("Statement Created ");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		try {
			statement.setString(1, name);
			Date date=Date.valueOf(doj);
			statement.setDate(2, date);
			statement.setString(3, grade+"");
			statement.setDouble(4, basic);
			statement.setString(5, gender+"");
			
			int count=statement.executeUpdate();
			System.out.println(count);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		try {
			statement.close();
			connection.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
