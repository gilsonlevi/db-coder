package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserirDados {
	public static void main(String[] args) throws SQLException {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa: ");
		String nome = teclado.nextLine();
	
		Connection conexao = FabricaDeConexao.getConexao(); 
		
		String sql = "insert into pessoa (nome) values (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		
		int up = stmt.executeUpdate();
		
		if(up == 1) {
			System.out.println("Pessoa adicionada com sucesso!!");
		}
		
		teclado.close();
	}
}
