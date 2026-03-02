package com.lpu.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class JdbcPostgresExample{
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/LPU";
		String username = "postgres";
		String password = "root";
		
		try {
			Class.forName("org.postgresql.Driver");   // Fully Qualified ClassName -> means class name with full package name along
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			Statement stm = con.createStatement();
			
//			boolean flag = stm.execute("Insert into public.\"Student\" values (10,'ABC',0987654,98.0)");
//			
//			if(!flag)
			
			String query = "Select * from public.\"Student\"";
			
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("Id->" + rs.getInt(1) + ", Name->" + rs.getString(2) + ", PhoneNo->" + rs.getLong(3) + ", Marks->" + rs.getDouble(4));
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}