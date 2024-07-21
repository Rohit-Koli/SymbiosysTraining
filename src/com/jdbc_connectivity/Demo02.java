package com.jdbc_connectivity;

import java.sql.*;

public class Demo02 {
	public static void main(String[] args) throws SQLException {
		String dbUrl="jdbc:mysql://localhost:3306/demo_db";
		String uname="root";
		String pass="Pass123";
		
		Connection con=DriverManager.getConnection(dbUrl,uname,pass);
		String q="insert into stud(rno,name,marks) values (?,?,?)";
		PreparedStatement ps =con.prepareStatement(q);
		//Index, Value
		ps.setInt(1, 2);
		ps.setString(2, "Mayur");
		ps.setInt(3, 89);
		ps.execute();
		ResultSet rs =ps.executeQuery("select * from stud");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		ps.setInt(1, 3);
		ps.setString(2, "Mayur Anandrao Koli ");
		ps.setInt(3, 88);
		ps.executeUpdate();
		con.close();
	}
}
