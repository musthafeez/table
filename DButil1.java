package com.example.minilogin.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil1 {
	
private static Connection connection1 = null;
private static Connection connection2= null;
private static Connection connection3= null;
private static Connection connection4= null;

	public static Connection getConnection() {
		if (connection1 != null)
			return connection1;
		else {

			try {
				String driver="com.mysql.cj.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306/shoppingcart?useSSL=false";
				String user="root";
				String password="1234";
				Class.forName(driver);
				connection1=DriverManager.getConnection(url,user,password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			return connection1;
		}
	
		
		
}

	public static Connection getConnection1() {
		if (connection2 != null)
			return connection2;
		else {

			try {
				String driver="com.mysql.cj.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306/shoppingcart?useSSL=false";
				String user="root";
				String password="1234";
				Class.forName(driver);
				connection2=DriverManager.getConnection(url,user,password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			return connection2;
		}
	}
		public static Connection getConnection2() {
			if (connection3 != null)
				return connection3;
			else {

				try {
					String driver="com.mysql.cj.jdbc.Driver";
					String url="jdbc:mysql://localhost:3306/shoppingcart?useSSL=false";
					String user="root";
					String password="1234";
					Class.forName(driver);
					connection3=DriverManager.getConnection(url,user,password);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} 
				return connection3;
			}
	
}


		public static Connection getConnection3() {
			if (connection4 != null)
				return connection4;
			else {

				try {
					String driver="com.mysql.cj.jdbc.Driver";
					String url="jdbc:mysql://localhost:3306/shoppingcart?useSSL=false";
					String user="root";
					String password="1234";
					Class.forName(driver);
					connection4=DriverManager.getConnection(url,user,password);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} 
				return connection4;
			}
	
}
}