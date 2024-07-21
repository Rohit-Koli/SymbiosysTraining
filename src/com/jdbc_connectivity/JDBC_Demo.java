package com.jdbc_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//import java.sql.Connection;
//import java.sql.DriverManager;

public class JDBC_Demo{
	public static void main(String[] args) {
		/* 1)Driver Load (Optional)
		 * 2)Establish Connection
		 * 3)Create Statement
		 * 4)Execute query
		 * 5)Close the connection 
		 */
		try {
			//         DbAPI:DbName://addressOfServer/DatabaseName
			String url="jdbc:mysql://localhost:3306/demo_db";
			String uname="root";
			String pass="Pass123";
			
			Connection con =DriverManager.getConnection(url,uname,pass);
			Statement st =con.createStatement();
			st.execute("insert into stud values (2,'Sachin',89)");
			ResultSet rs =st.executeQuery("select * from stud");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			con.close();
			
		}catch (Exception e) {
			e.getMessage();
		}finally{
			
		}
	}
}
