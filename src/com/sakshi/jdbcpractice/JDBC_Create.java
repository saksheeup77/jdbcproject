package com.sakshi.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Create {

	public static void main(String[] args) throws SQLException {
		//create table
//		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test", "root", "root");
//		Statement st = c.createStatement();
//		boolean rs = st.execute("create table student (rollNo integer , studName varchar(100) , studAddress varchar(100))");
//		System.out.println("Table created");
//		c.close();
//		
		
//		//insert data into table
//		Connection coi=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test", "root", "root");
//		Statement stm = coi.createStatement();
//		boolean rs1 = stm.execute("insert into employees values(2,'Ram','gurgaon')");
//		System.out.println("Table created");
//		coi.close();
//		
//		
//		//select data from table
		Connection cs=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test", "root", "root");
		Statement sts = cs.createStatement();
		ResultSet rss = sts.executeQuery("select * from employees");
		while(rss.next()) {
			System.out.println("ID:- " + rss.getInt("empid"));
			System.out.println("Name:- " + rss.getString("empName"));
			System.out.println("Address:- " + rss.getString("empAddress"));
		}
		//System.out.println("Table created");
		cs.close();
//
//		//Update data into table
//		
//		Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test", "root", "root");
//		Statement stm3 = co.createStatement();
//		int rs2 = stm3.executeUpdate("update employees set empName='Shruti' where empid=1");
//		System.out.println("row updated" + rs2);
//		co.close();
//		
//		
//		//delete data from the table
//		Connection cod=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test", "root", "root");
//		Statement stm1 = cod.createStatement();
//		int rs3 = stm1.executeUpdate("delete from employees where empid=2");
//		System.out.println("row updated" + rs2);
//		cod.close();
	
	}

}
