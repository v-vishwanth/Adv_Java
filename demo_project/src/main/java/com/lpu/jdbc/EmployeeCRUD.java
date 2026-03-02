package com.lpu.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.PreparedStatement;;

public class EmployeeCRUD {
	private static String url="jdbc:postgresql://localhost:5432/LPU";
	private static String user="postgres";
	private static String pass="root";
	private static Connection con;
	
	static {
		try {
			//Driver Load
			Class.forName("org.postgresql.Driver"); //Fully qualified class
			
			//Creating Connection 
			con = DriverManager.getConnection(url,user,pass);
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception{
		saveEmployee();
		
		insertEmployee();
		
		System.out.println();
		
//		fetchData();
		
//		fetchDataById(2);
		
//		preparedStatementInsert();
		
		fetchData();
		
		System.out.println();

		deleteEmployees(4);
		
		System.out.println();
		
		fetchData();
		
		
	}
	
	public static void saveEmployee() throws SQLException{
		Statement stm = con.createStatement();
		
		String query =
				"CREATE TABLE IF NOT EXISTS employees(" +
				"id INTEGER PRIMARY KEY," +
				"name VARCHAR(100)," +
				"sal DOUBLE PRECISION," +
				"email VARCHAR(100)," +
				"phoneno BIGINT)";
		
		stm.executeUpdate(query);
	}
	
	public static void insertEmployee() throws SQLException{
		Scanner sc = new Scanner(System.in);
		
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
		
		Statement stm = con.createStatement();
		
		String query = "insert into employees values (" + id + ",'" + name + "'," + sal + ",'" + email + "'," + phoneno + ")";
		
		int inserted = stm.executeUpdate(query);
		
		if(inserted>0) {
			System.out.println("Inserted Row");
		}
		else {
			System.out.println("Not Inserted");
		}
	}
	
	public static void updateEmployees() throws SQLException{
		
	}
	
	public static void deleteEmployees(int id) throws SQLException{
		Statement stm = con.createStatement();
		
		String query = "delete from employees where id=" + id;
		
		ResultSet rs = stm.executeQuery("select * from employees where id=" + id);
		while(rs.next()) {
			System.out.println("Id->" + rs.getInt(1) + ", Name->" + rs.getString(2) + ", Salary->" + rs.getDouble(3) + ", Email->" + rs.getString(4) + ", phoneno->" + rs.getLong(5) + " is Deleted");
		}
		stm.executeUpdate(query);
			
	}
	
	public static void fetchDataById(int id) throws SQLException{
		Statement stm = con.createStatement();
		
		String query = "Select * from employees where id=" + id;
		
		ResultSet rs = stm.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Id->" + rs.getInt(1) + ", Name->" + rs.getString(2) + ", Salary->" + rs.getDouble(3) + ", Email->" + rs.getString(4) + ", phoneno->" + rs.getLong(5));
		}
	}
	
	public static void fetchData() throws SQLException{
		Statement stm = con.createStatement();
		
		String query = "Select * from employees";
		
		ResultSet rs = stm.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Id->" + rs.getInt(1) + ", Name->" + rs.getString(2) + ", Salary->" + rs.getDouble(3) + ", Email->" + rs.getString(4) + ", phoneno->" + rs.getLong(5));
		}
	}
	
	public static void preparedStatementInsert() throws SQLException{
		PreparedStatement ps = con.prepareStatement("insert into employees values(?,?,?,?,?)");
		
		Scanner sc = new Scanner(System.in);
		
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
		
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setDouble(3, sal);
		ps.setString(4, email);
		ps.setLong(5, phoneno);
		
		int rowsInserted = ps.executeUpdate();
		System.out.println(rowsInserted + " rows inserted");
	}
}
