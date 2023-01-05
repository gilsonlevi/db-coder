package dao;

public class DAOTeste {
	public static void main(String[] args) {
		DAO dao = new DAO();
		String sql = "insert into pessoa (nome) values (?)";
		System.out.println(dao.incluir(sql, "Julia Tavares"));
		System.out.println(dao.incluir(sql, "Maria Eduarda"));
		System.out.println(dao.incluir(sql, "Felipe Fernandes"));
		
		dao.close();
		
	}
}
