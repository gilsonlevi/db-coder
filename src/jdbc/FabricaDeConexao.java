package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {
	
	public static Connection getConexao() {
		try {
			final String url = "jdbc:mysql://localhost/banco";
			final String usuario = "root";
			final String senha = "@JNL12345silva";
			
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}
}
