package com.cdac.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BasicsJDBC {
	
	public static void executeUpdate(Connection con, String querry, int rollno, String lastname) {
		try {
			PreparedStatement st = con.prepareStatement(querry);
			st.setString(1, lastname);
			st.setInt(2, rollno);
			int count = st.executeUpdate();
			System.out.println(count + "row(s) affected");
		}
		catch(SQLException e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		

	}

}
