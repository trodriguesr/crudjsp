package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	private static String database = "jdbc:postgresql://db:5432/db_jsp?autoReconnect=true";
	private static String user = "postgres";
	private static String password = "123";
	private static Connection connection = null;
	
	static {
		connectingDatabase();
	}
	
	private SingletonConnection() {
		
		connectingDatabase();
	}
	
	private static void connectingDatabase() {
		try {
			if(connection == null) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(database, user, password);
				connection.setAutoCommit(false);
			}
			
		} catch (Exception e) {
			throw new RuntimeException("Erro ao conectar banco de dados.");
			
		}
	}
	

}
