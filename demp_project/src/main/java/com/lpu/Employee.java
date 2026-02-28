package com.lpu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
//	
//	String url = "jdbc:postgresql://localhost:5432/lpu";
//	String user = "postgres";
//	String password = "12345";

	public static void main(String[] args){
		
//		new Employee().insertData();
		
//		try {
//			EmployeeCRUD.DynamicInsertData();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		try {
//			EmployeeCRUD.ScannerSave();;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		try {
			EmployeeCRUD.ScannerUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public void insertData() {
//		try {
//			Class.forName("org.postgresql.Driver");
//			System.out.println("Driver loaded");
//			
//			Connection conn = DriverManager.getConnection(url, user, password);
//			System.out.println(conn);
//			
//			Statement stm = conn.createStatement();
//			
//			stm.execute("insert into \"Employee\" values(101,'Vishwanth',120000,'vishwanth@gmail.com',9392347822)");
//			System.out.println("Inserted");
//			
//			stm.close();
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
