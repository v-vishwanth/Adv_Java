package com.lpu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeCRUD {
	
	private static String url  = "jdbc:postgresql://localhost:5432/lpu";
	private static String username = "postgres";
	private static String  password = "12345";
	private static Connection conn;
	private static Scanner sc = new Scanner(System.in);
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void StaticInsertData() throws SQLException {
		Statement stm = conn.createStatement();
		stm.execute("insert into \"Employee\" values(102,'Vishwanth',120000,'vishwanth@gmail.com',9392347822)");
	}
	
	public static void DynamicInsertData() throws SQLException {
		PreparedStatement ps = conn.prepareStatement("insert into \"Employee\" values(?,?,?,?,?)");
		ps.setInt(1, 108);
		ps.setString(2, "wrbcruabw");
		ps.setDouble(3, 23456);
		ps.setString(4,"@gmail.com");
		ps.setDouble(5, 565983456);
		
		ps.execute();
		System.out.println("Inserted");
	}
	
	public static void ScannerSave() throws SQLException {
		PreparedStatement ps = conn.prepareStatement("insert into \"Employee\" values(?,?,?,?,?)");
		
		System.out.println("Enter the id");
		ps.setInt(1, sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the name");
		ps.setString(2,sc.nextLine());
		System.out.println("Enetr the Salary");
		ps.setDouble(3, sc.nextDouble());
		sc.nextLine();
		System.out.println("Enetr the Email");
		ps.setString(4, sc.nextLine());
		System.out.println("Eneter the phone no");
		ps.setDouble(5, sc.nextDouble());
		
		ps.execute();
		System.out.print("Data Inserted");
		
	}
	
	public static void ScannerUpdate() throws SQLException {
		PreparedStatement ps = conn.prepareStatement("update \"Employee\" set name = ? where id = ?");
		
		System.out.println("Enetr update name");
		ps.setString(1, sc.nextLine());
		System.out.println("Enetr the id where to update");
		ps.setInt(2d, sc.nextInt());
		
		ps.execute();
		System.out.println("Data Updated");
	}
	
	public static void fetchData() throws SQLException {
		Statement stm = conn.createStatement();
		stm.execute("SELECT * FROM \"Employee\"");
		
		ResultSet res = stm.getResultSet();
		while(res.next()) {
			System.out.print(res.getInt("id")+"  ");
			System.out.print(res.getString("name")+"  ");
			System.out.print(res.getDouble("sal")+"  ");
			System.out.print(res.getString("email")+"  ");
			System.out.print(res.getDouble("phone")+"  ");
		}
	}
	
	
}
