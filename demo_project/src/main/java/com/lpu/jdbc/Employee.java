package com.lpu.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class Employee {
	
	static void insertData(int id, String name,Double sal, String email, long phoneno, Statement stm) throws SQLException{
		String query = "INSERT INTO Employee VALUES(" + id + "," + name + "," + sal + "," + email + "," + phoneno + ")";
		
		int inserted = stm.executeUpdate(query);
		
		if(inserted>0) {
			System.out.println("Data Inserted");
		}
		else {
			System.out.println("Data Not Inserted");
		}
		
	}
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/LPU";
		String username = "postgres";
		String password = "root";
		
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			Statement stm = con.createStatement();
			
			String query = "CREATE TABLE IF NOT EXISTS Employee(id INTEGER PRIMARY KEY, name VARCHAR(100), sal DOUBLE PRECISION, emailid VARCHAR(100), phoneno BIGINT)";
			
			stm.executeUpdate(query);
			System.out.println("Table Created");
				
			insertData(1,"Abhishek",456000.98,"xyz@gmail.com",9876543084L,stm);
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
