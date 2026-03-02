package com.lpu.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.PreparedStatement;;

public class EmpInput {
	private static String url="jdbc:postgresql://localhost:5432/LPU";
	private static String user="postgres";
	private static String pass="root";
	private static Connection con;
	private static Scanner sc;
	
	static {
		try {
			//Driver Load
			Class.forName("org.postgresql.Driver"); //Fully qualified classname
			
			//Creating Connection 
			con = DriverManager.getConnection(url,user,pass);
			
			sc = new Scanner(System.in);
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception{
		createTable();
		System.out.println();
		
		insertData();
		System.out.println();
		
		fetchData();
		System.out.println();
		
		insertData();
		System.out.println();
		
		insertData();
		System.out.println();
		
		fetchDataById();
		System.out.println();
		
		updateData();
		System.out.println();
		
		deleteData();
		System.out.println();
		
		fetchData();
	}
	
	public static void createTable() throws SQLException{
		String query = "create table if not exists Emp (id Integer,name varchar(100),sal double precision,email varchar(100),phoneno bigint)";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.executeUpdate();
	}
	
	
	public static void insertData() throws SQLException{
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter salary: ");
		double sal = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Enter email: ");
		String email = sc.nextLine();
		
		System.out.print("Enter phoneno: ");
		long phoneno = sc.nextLong();
		
		PreparedStatement ps = con.prepareStatement("insert into Emp values(?,?,?,?,?)");
		
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setDouble(3, sal);
		ps.setString(4, email);
		ps.setLong(5, phoneno);
		
		int rows = ps.executeUpdate();
		System.out.println(rows + " rows inserted");
	}
	
	public static void updateData() throws SQLException{
		sc.nextLine();
		System.out.print("Name you want to set: ");
		String name = sc.nextLine();
		
		System.out.print("Id number to update: ");
		int id = sc.nextInt();
		
		PreparedStatement ps = con.prepareStatement("update Emp set name=? where id=?");
		ps.setString(1, name);
		ps.setInt(2,id);
		
		int rows = ps.executeUpdate();
		System.out.println(rows + " updated successfully");
	}
	
	public static void deleteData() throws SQLException{
		System.out.println("Enter row id to delete: ");
		int id = sc.nextInt();
		
		PreparedStatement ps = con.prepareStatement("delete from Emp where id=?");
		ps.setInt(1,id);
		
		int rows = ps.executeUpdate();
		System.out.println(rows + " deleted successfully");
	}
	
	
	public static void fetchDataById() throws SQLException{
		System.out.print("Enter the row id you want to fetch: ");
		int id = sc.nextInt();
		
		String query = "Select * from Emp where id=" + id;
		PreparedStatement ps = con.prepareStatement(query);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("Id->" + rs.getInt(1) + ", Name->" + rs.getString(2) + ", Salary->" + rs.getDouble(3) + ", Email->" + rs.getString(4) + ", phoneno->" + rs.getLong(5));
		}
	}
	
	public static void fetchData() throws SQLException{
		String query = "Select * from Emp";
		PreparedStatement ps = con.prepareStatement(query);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("Id->" + rs.getInt(1) + ", Name->" + rs.getString(2) + ", Salary->" + rs.getDouble(3) + ", Email->" + rs.getString(4) + ", phoneno->" + rs.getLong(5));
		}
	}
}
