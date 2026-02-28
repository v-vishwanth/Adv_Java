package com.lpu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		String url = "jdbc:postgresql://localhost:5432/lpu";
		String user = "postgres";
		String password = "12345";
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
			
			Connection c = DriverManager.getConnection(url, user, password);
			System.out.println(c);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
