package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma parte do nome: ");
		String nome = teclado.nextLine();
		
		Connection conexao = FabricaDeConexao.getConexao();
		
		PreparedStatement stmt = conexao.prepareStatement("select * from pessoa where nome like (?)");
		stmt.setString(1, "%" + nome + "%");
		
		ResultSet rs = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(rs.next()) {
			int id = rs.getInt("id");
		    nome = rs.getString("nome");
		    
		    pessoas.add(new Pessoa(id, nome));
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println("ID: " + pessoa.getCodigo());
			System.out.println("Nome: " + pessoa.getNome());
		}
		
		teclado.close();
		
	}
}	
