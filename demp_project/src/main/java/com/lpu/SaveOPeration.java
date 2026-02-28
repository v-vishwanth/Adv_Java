package com.lpu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveOPeration {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/lpu";
		String user = "postgres";
		String password = "12345";
		// TODO Auto-generated method stub
		
		try {
			// 1st step load driver
			
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
			
			//2nd step Create Connection
			Connection conn = DriverManager.getConnection(url, user,password);
			System.out.println(conn);
			
			//3rd step create Statement
			Statement stm = conn.createStatement();
			
			//4th step execute query
			stm.execute("insert into student values(11,'xyz',46874239074,43.54)");
			System.out.println("Inserted");
			
			//5th sept
			stm.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
