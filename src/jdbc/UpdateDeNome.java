package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDeNome {
	public static void main(String[] args) throws SQLException {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o codigo da pessoa");
		int id = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Digite o novo nome: ");
		String nome = teclado.nextLine();
		
		Connection conexao = FabricaDeConexao.getConexao();
		
		PreparedStatement stmt = conexao.prepareStatement("update pessoa set nome = ? where id = ?");
		stmt.setString(1, nome);
		stmt.setInt(2, id);
		
		int update = stmt.executeUpdate();
		
		if(update == 1) {
			System.out.println("Nome alterado com sucesso!!");
		}
		
		teclado.close();
		conexao.close();
		
	}
}
