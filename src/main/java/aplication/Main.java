package aplication;

import java.sql.Connection;

import dao.JPAUtil; // 
import data.DB;

public class Main {
//	MAIN	---------------------------------------------------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		//testeHibernate();
		Connection conn = DB.getConnection();
		
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	private static void testeHibernate() {
		System.out.println("--- Iniciando teste de conexao Hibernate ---");
		try {
			// Esta linha força o Hibernate a ler o persistence.xml
			// e gerar as tabelas (devido ao hbm2ddl.auto="update")
			JPAUtil.getEntityManagerFactory();

			System.out.println(">>> SUCESSO! Conexao estabelecida.");
			System.out.println(">>> Verifique seu MySQL Workbench para ver as tabelas criadas.");
		}
		catch (Exception e) {
			System.err.println(">>> FALHA! Erro ao iniciar o Hibernate.");
			e.printStackTrace();
		}
		finally {
			// Fecha a fábrica de conexões
			JPAUtil.close();
		}
	}
}
