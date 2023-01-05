package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost";
		final String usuario = "root";
		final String senha = "@JNL12345silva";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		conexao.close();
	}
	
}
