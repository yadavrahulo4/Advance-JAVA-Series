package yadavrahuhlo4.javaSeries.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Demo {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:MySQL://localhost:8888/test";
		Connection connection = null;

		int rollno = 1;
		String name = "John";
		int age = 20;
		String sql = "insert into student(rollno, name, age) + " + "values(" + rollno + ")";
		try {
			connection = DriverManager.getConnection(url, "postgres", "postgres");
			Statement st = connection.createStatement();
			int m = st.executeUpdate(sql);
			if (m == 1)
				System.out.println("inserted successfully:" + sql);
			else {
				System.out.println("insertion failed:" + sql);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
		finally {
			connection.close();
		}

	}

}
