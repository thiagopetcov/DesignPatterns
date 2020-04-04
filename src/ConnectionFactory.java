

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Getting connection from the database

public class ConnectionFactory {
	
	public static Connection getConnection() {
		
		String url_path = "jdbc:mysql://52.50.23.197/world?useSSL=false";
		
		String username_database = "cctstudent";
		
		String password = "Pass1234!";
		
		try {
			return DriverManager.getConnection(url_path, username_database, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
