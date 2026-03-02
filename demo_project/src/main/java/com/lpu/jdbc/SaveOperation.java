package com.lpu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveOperation {
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/LPU";
		String user = "postgres";
		String password = "root";
		try {
			//1st Step Load Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
			
			//Create Connection
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println(con);
			
			//Create Statement
			Statement stm = con.createStatement();
			
			//ExecuteQuery
//			boolean inserted = stm.execute("insert into public.\"Student\" values(6,'PQR',999,66.6)");
//			if(!inserted) System.out.println("Inserted");  // false returned by .execute() for insert/update/delete operations
//			else System.out.println("Not Inserted");
//			
//			boolean updated = stm.execute("update public.\"Student\" set marks=78.9 where id=5");
//			if(!updated) System.out.println("Updated");
//			else System.out.println("Not updated");
			
			
			// 1) executeQuery returns ResultSet --> Most Important
			// 2) executeUpdate returns int  --> Most Important
			// 3) execute returns true for select and false for insert,update and delete  --> Most Important
			
			// ResultSet Interface for fetching data from table
			ResultSet fetched = stm.executeQuery("Select * from public.\"Student\"");
			
			// We can use both column name or numbering like 1,2,3... for getting columns data like we did in loop
			while(fetched.next()) {
				// System.out.println(fetched.getInt("id") + " " + fetched.getString("name") + " " + fetched.getLong("phoneno") + " " + fetched.getDouble("marks"));
				//    OR
				System.out.println(fetched.getInt(1) + " " + fetched.getString(2) + " " + fetched.getLong(3) + " " + fetched.getDouble(4));
			}
			//Close Connection
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
